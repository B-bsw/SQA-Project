package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.charset();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!==Content-Encoding=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding");
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.statusMessage();
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map12 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Method method14 = response0.method();
        int int15 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=Content-Encoding", "hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.value("hi!");
        boolean boolean11 = keyVal10.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base9 = response6.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean11 = response6.hasHeader("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.cookies();
        java.lang.String str16 = response13.header("");
        java.util.Map map17 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.util.Map map22 = response18.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.String str27 = response0.contentType();
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.lang.String str12 = response0.cookie("hi!==");
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean16 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str18 = response0.statusMessage();
        java.util.Map map19 = response0.headers();
        java.lang.String str20 = response0.charset();
        org.jsoup.Connection.Method method21 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        boolean boolean5 = response0.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==Content-Encoding");
        int int13 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.value("hi!");
        boolean boolean12 = keyVal11.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal11.value("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal11.inputStream(inputStream15);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.cookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=", "hi!==hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.util.Map map2 = response0.headers();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base6 = response0.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        boolean boolean7 = keyVal3.hasInputStream();
        java.lang.String str8 = keyVal3.value();
        java.io.InputStream inputStream9 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("hi!==hi!===hi!", "hi!=hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str7 = response0.header("hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!", "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!=hi!==hi!=Content-Encoding=hi!==hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("");
        java.lang.String str9 = keyVal6.toString();
        java.lang.String str10 = keyVal6.key();
        boolean boolean11 = keyVal6.hasInputStream();
        java.io.InputStream inputStream12 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=Content-Encoding");
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        boolean boolean11 = keyVal10.hasInputStream();
        java.io.InputStream inputStream12 = keyVal10.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!=");
        java.util.Map map7 = response0.cookies();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=hi!==hi!==", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.cookies();
        java.lang.String str15 = response12.header("");
        java.util.Map map16 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.util.Map map21 = response17.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.net.URL uRL24 = response11.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.cookies();
        java.lang.String str28 = response25.header("Content-Encoding");
        java.util.Map map29 = response25.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.String str31 = response11.statusMessage();
        java.lang.String str33 = response11.cookie("hi!=");
        boolean boolean35 = response11.hasCookie("hi!=");
        org.jsoup.Connection.Base base37 = response11.removeCookie("hi!");
        org.jsoup.Connection.Base base39 = response11.removeHeader("hi!=Content-Encoding");
        java.net.URL uRL40 = response11.url();
        org.jsoup.Connection.Base base42 = response11.removeCookie("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base46 = response43.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean48 = response43.hasHeader("Content-Encoding");
        java.lang.String str49 = response43.charset();
        java.util.Map map50 = response43.cookies();
        java.lang.String str51 = response43.statusMessage();
        java.lang.String str52 = response43.contentType();
        boolean boolean54 = response43.hasHeader("hi!===hi!==");
        java.util.Map map55 = response43.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNotNull(base42);
        org.junit.Assert.assertNotNull(base46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.util.Map map13 = response0.cookies();
        boolean boolean15 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str17 = response0.cookie("hi!=");
        int int18 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=Content-Encoding", "hi!=hi!==Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!==");
        java.lang.String str3 = keyVal2.value();
        boolean boolean4 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==" + "'", str3, "hi!==");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!==");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        boolean boolean11 = response0.hasCookie("hi!==Content-Encoding");
        boolean boolean13 = response0.hasCookie("hi!");
        boolean boolean15 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!==hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!=", "");
        org.jsoup.Connection.Base base14 = response0.header("hi!===hi!=", "hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        int int3 = response0.statusCode();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!===hi!=Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!==Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        boolean boolean5 = keyVal3.hasInputStream();
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str21 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("Content-Encoding");
        java.lang.String str19 = keyVal18.value();
        java.lang.String str20 = keyVal18.toString();
        java.lang.String str21 = keyVal18.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Content-Encoding" + "'", str19, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!==Content-Encoding" + "'", str20, "hi!==Content-Encoding");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=" + "'", str21, "hi!=");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=hi!==Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        boolean boolean18 = response10.hasCookie("hi!=");
        java.util.Map map19 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str21 = response0.statusMessage();
        org.jsoup.Connection.Method method22 = response0.method();
        java.lang.String str23 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!==");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.Connection.Base base15 = response10.removeHeader("hi!");
        java.lang.String str16 = response10.contentType();
        boolean boolean18 = response10.hasCookie("Content-Encoding");
        int int19 = response10.statusCode();
        boolean boolean21 = response10.hasCookie("hi!==");
        java.lang.String str22 = response10.contentType();
        boolean boolean24 = response10.hasHeader("hi!===hi!==");
        java.util.Map map25 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        boolean boolean28 = response0.hasHeader("hi!=");
        java.net.URL uRL29 = response0.url();
        org.jsoup.Connection.Base base32 = response0.cookie("hi!===hi!===Content-Encoding", "hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNotNull(base32);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        boolean boolean7 = response0.hasHeaderWithValue("hi!==hi!", "hi!==hi!");
        boolean boolean9 = response0.hasCookie("hi!=hi!=hi!=hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=hi!===hi!==");
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        boolean boolean13 = response0.hasCookie("hi!");
        java.net.URL uRL14 = response0.url();
        java.net.URL uRL15 = response0.url();
        boolean boolean17 = response0.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.header("");
        java.util.Map map22 = response18.headers();
        boolean boolean25 = response18.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str26 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        java.lang.String str30 = response27.header("Content-Encoding");
        java.lang.String str31 = response27.contentType();
        java.util.Map map32 = response27.headers();
        java.util.Map map33 = response27.headers();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL35 = response34.url();
        java.lang.String str37 = response34.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map39 = response38.cookies();
        response34.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.util.Map map41 = response34.cookies();
        java.util.Map map42 = response34.headers();
        boolean boolean44 = response34.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base48 = response45.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean50 = response45.hasHeader("Content-Encoding");
        java.lang.String str52 = response45.header("");
        java.lang.String str54 = response45.header("hi!");
        java.util.Map map55 = response45.headers();
        response34.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        java.net.URL uRL60 = response0.url();
        org.jsoup.Connection.Base base63 = response0.header("hi!==hi!===hi!==", "Content-Encoding=hi!");
        java.util.Map map64 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(base48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(uRL60);
        org.junit.Assert.assertNotNull(base63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean5 = response0.hasHeaderWithValue("hi!==", "Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str8 = response0.header("hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!", "hi!=");
        boolean boolean13 = response0.hasCookie("hi!==hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Method method14 = response0.method();
        boolean boolean16 = response0.hasHeader("hi!=hi!");
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.value("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        java.lang.String str21 = keyVal18.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=hi!=" + "'", str21, "hi!=hi!=");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.header("hi!=Content-Encoding=hi!");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding=hi!=hi!==hi!=hi!==Content-Encoding", "hi!==hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!==hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding", "hi!==Content-Encoding");
        java.util.Map map17 = response0.cookies();
        java.util.Map map18 = response0.cookies();
        java.util.Map map19 = response0.headers();
        org.jsoup.Connection.Base base21 = response0.removeCookie("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("hi!==Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!=hi!==Content-Encoding=Content-Encoding");
        java.lang.String str10 = response0.cookie("Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        java.lang.String str12 = response0.header("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str8 = response0.contentType();
        boolean boolean11 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding=hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding=hi!==", "Content-Encoding=Content-Encoding=hi!===hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.inputStream(inputStream17);
        boolean boolean19 = keyVal14.hasInputStream();
        java.io.InputStream inputStream20 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal14.inputStream(inputStream20);
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal14.key("Content-Encoding");
        java.io.InputStream inputStream24 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal23.inputStream(inputStream24);
        java.lang.Class<?> wildcardClass26 = keyVal23.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding=hi!", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!=hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        org.jsoup.Connection.Base base7 = response1.header("hi!=", "hi!=");
        java.net.URL uRL8 = response1.url();
        int int9 = response1.statusCode();
        org.jsoup.Connection.Base base12 = response1.header("Content-Encoding=hi!==Content-Encoding", "hi!==hi!=Content-Encoding");
        int int13 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.cookies();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.util.Map map13 = response0.headers();
        boolean boolean15 = response0.hasHeader("hi!=hi!==Content-Encoding=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!==hi!==hi!=Content-Encoding");
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.net.URL uRL7 = response1.url();
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.util.Map map14 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map19 = response15.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Base base23 = response1.removeHeader("Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str15 = response0.header("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.key();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.Class<?> wildcardClass8 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.key("hi!=");
        boolean boolean17 = keyVal13.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal13.value("hi!==");
        java.io.InputStream inputStream20 = keyVal13.inputStream();
        java.lang.String str21 = keyVal13.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal13.key("hi!=Content-Encoding=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!==Content-Encoding" + "'", str14, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=" + "'", str21, "hi!=");
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        boolean boolean6 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!==hi!===hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.lang.String str12 = response0.cookie("hi!==");
        java.lang.String str14 = response0.cookie("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.cookie("Content-Encoding", "hi!==Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        boolean boolean10 = keyVal5.hasInputStream();
        java.io.InputStream inputStream11 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=hi!=hi!==hi!=Content-Encoding");
        java.lang.String str14 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=hi!=hi!==hi!=Content-Encoding" + "'", str14, "hi!=hi!=hi!==hi!=Content-Encoding");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str22 = response0.cookie("hi!=");
        boolean boolean24 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base26 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base28 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base31 = response0.header("Content-Encoding", "hi!=");
        java.net.URL uRL32 = response0.url();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(uRL32);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        boolean boolean7 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "Content-Encoding=hi!");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.cookie("hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.net.URL uRL9 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=");
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!");
        java.lang.String str12 = response0.statusMessage();
        boolean boolean14 = response0.hasHeader("hi!==Content-Encoding=");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Base base18 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding", "hi!=hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str22 = response0.cookie("hi!=");
        boolean boolean24 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base26 = response0.removeCookie("hi!");
        java.net.URL uRL27 = response0.url();
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base29 = response0.url(uRL28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNull(uRL27);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Base base13 = response0.header("hi!=", "hi!=");
        java.lang.String str14 = response0.statusMessage();
        java.util.Map map15 = response0.headers();
        java.net.URL uRL16 = response0.url();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        boolean boolean12 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=", "hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!==hi!", "hi!=");
        boolean boolean21 = response0.hasHeaderWithValue("hi!===hi!==", "hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean23 = response0.hasHeader("hi!===hi!=hi!");
        java.net.URL uRL24 = response0.url();
        org.jsoup.Connection.Base base27 = response0.header("hi!===hi!==", "hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean30 = response0.hasHeaderWithValue("hi!===hi!=hi!=hi!=hi!==Content-Encoding", "hi!===hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("hi!==");
        java.net.URL uRL11 = response0.url();
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.header("hi!=Content-Encoding");
        java.util.Map map15 = response0.cookies();
        java.util.Map map16 = response0.cookies();
        java.util.Map map17 = response0.headers();
        java.lang.String str18 = response0.statusMessage();
        java.lang.String str20 = response0.header("hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean23 = response0.hasHeaderWithValue("Content-Encoding=hi!=Content-Encoding=hi!=hi!=", "");
        int int24 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str6 = keyVal3.toString();
        java.lang.String str7 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str6, "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str7, "Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "hi!=hi!==hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!==" + "'", str3, "hi!=hi!==");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!==");
        boolean boolean3 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=Content-Encoding=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding=Content-Encoding=hi!===hi!==");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response0.cookies();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base25 = response0.header("Content-Encoding", "hi!");
        java.net.URL uRL26 = response0.url();
        java.lang.String str27 = response0.charset();
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(base29);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.util.Map map2 = response0.headers();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!==Content-Encoding");
        boolean boolean7 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!==hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str16 = response14.statusMessage();
        java.util.Map map17 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.contentType();
        java.net.URL uRL20 = response0.url();
        boolean boolean22 = response0.hasHeader("hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean24 = response0.hasHeader("hi!=hi!=");
        org.jsoup.Connection.Base base27 = response0.header("Content-Encoding=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map28 = response0.headers();
        java.util.Map map29 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!==hi!");
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        int int7 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        boolean boolean9 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.headers();
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!=Content-Encoding");
        java.util.Map map17 = response0.cookies();
        java.util.Map map18 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        boolean boolean13 = response0.hasHeader("hi!");
        boolean boolean15 = response0.hasCookie("hi!=hi!=");
        java.lang.String str17 = response0.header("hi!==Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.util.Map map17 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean23 = response18.hasHeader("Content-Encoding");
        java.lang.String str25 = response18.header("");
        java.lang.String str27 = response18.header("hi!");
        java.util.Map map28 = response18.headers();
        boolean boolean31 = response18.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str35 = response32.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map37 = response36.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.util.Map map39 = response32.cookies();
        java.util.Map map40 = response32.cookies();
        java.lang.String str42 = response32.header("Content-Encoding");
        java.net.URL uRL43 = response32.url();
        java.util.Map map44 = response32.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        java.util.Map map47 = response0.headers();
        java.lang.Class<?> wildcardClass48 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=hi!==Content-Encoding", "Content-Encoding=hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        org.jsoup.Connection.Base base10 = response0.header("hi!=", "hi!=");
        boolean boolean13 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=hi!=");
        boolean boolean16 = response0.hasHeaderWithValue("hi!===hi!=hi!", "hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.lang.String str21 = response17.contentType();
        java.util.Map map22 = response17.headers();
        int int23 = response17.statusCode();
        org.jsoup.Connection.Base base25 = response17.removeCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.util.Map map26 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.cookies();
        java.lang.String str32 = response29.header("");
        java.util.Map map33 = response29.headers();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map35 = response34.cookies();
        java.lang.String str37 = response34.header("Content-Encoding");
        java.util.Map map38 = response34.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.net.URL uRL41 = response28.url();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.cookies();
        java.lang.String str45 = response42.header("Content-Encoding");
        java.util.Map map46 = response42.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        java.util.Map map48 = response28.cookies();
        java.lang.String str50 = response28.header("");
        org.jsoup.Connection.Method method51 = response28.method();
        java.util.Map map52 = response28.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        java.lang.String str54 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.statusMessage();
        boolean boolean6 = response0.hasCookie("hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!==hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!==hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str15 = response0.header("hi!===hi!==");
        int int16 = response0.statusCode();
        java.lang.String str18 = response0.cookie("hi!=Content-Encoding=hi!=hi!==hi!==");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        boolean boolean13 = response0.hasCookie("hi!");
        java.net.URL uRL14 = response0.url();
        java.net.URL uRL15 = response0.url();
        boolean boolean17 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base22 = response0.cookie("hi!==hi!", "Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!", "Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!===hi!===hi!=hi!=hi!=", "Content-Encoding=Content-Encoding");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!==Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.cookie("Content-Encoding=hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding", "hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!==Content-Encoding");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response13.cookies();
        java.util.Map map21 = response13.cookies();
        java.lang.String str23 = response13.header("hi!==");
        java.net.URL uRL24 = response13.url();
        int int25 = response13.statusCode();
        boolean boolean28 = response13.hasHeaderWithValue("hi!===hi!==", "hi!==hi!=Content-Encoding");
        java.lang.String str29 = response13.contentType();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL31 = response30.url();
        java.lang.String str33 = response30.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map35 = response34.cookies();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.util.Map map37 = response30.cookies();
        java.util.Map map38 = response30.cookies();
        java.lang.String str40 = response30.header("hi!==");
        java.net.URL uRL41 = response30.url();
        java.util.Map map42 = response30.cookies();
        java.lang.String str44 = response30.header("hi!=Content-Encoding");
        java.util.Map map45 = response30.cookies();
        java.util.Map map46 = response30.cookies();
        java.util.Map map47 = response30.headers();
        java.util.Map map48 = response30.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        java.lang.Class<?> wildcardClass51 = map48.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base14 = response0.header("hi!=Content-Encoding=Content-Encoding=hi!==Content-Encoding", "hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.headers();
        boolean boolean15 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=hi!==");
        org.jsoup.Connection.Base base21 = response0.cookie("hi!==Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!", "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==", "Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!==" + "'", str4, "hi!=hi!==");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str6 = response0.statusMessage();
        java.net.URL uRL7 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        boolean boolean18 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL19 = response0.url();
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str22 = response0.cookie("hi!===hi!=Content-Encoding=Content-Encoding=hi!=");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base24 = response0.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        int int8 = response0.statusCode();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("Content-Encoding");
        org.jsoup.Connection.Base base16 = response11.removeHeader("hi!");
        java.lang.String str17 = response11.contentType();
        boolean boolean19 = response11.hasCookie("Content-Encoding");
        int int20 = response11.statusCode();
        boolean boolean22 = response11.hasCookie("hi!==");
        java.lang.String str23 = response11.contentType();
        boolean boolean25 = response11.hasHeader("hi!===hi!==");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base29 = response26.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map30 = response26.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        boolean boolean18 = response0.hasHeader("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("Content-Encoding");
        java.util.Map map21 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!=Content-Encoding", "hi!==");
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.header("hi!=");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!==Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        java.lang.String str6 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==Content-Encoding" + "'", str5, "hi!==Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!==Content-Encoding=hi!==Content-Encoding" + "'", str6, "hi!==Content-Encoding=hi!==Content-Encoding");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.value("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str17 = keyVal16.toString();
        java.lang.String str18 = keyVal16.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding" + "'", str17, "hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding" + "'", str18, "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!==hi!=Content-Encoding=hi!=", "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Base base6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.statusCode();
        boolean boolean10 = response1.hasHeader("hi!==");
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Base base14 = response1.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!==hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=Content-Encoding=hi!==hi!=Content-Encoding" + "'", str3, "hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=Content-Encoding=hi!==hi!=Content-Encoding" + "'", str4, "hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!", "hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!==hi!", "hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!=hi!==hi!=Content-Encoding", "hi!==Content-Encoding=");
        java.util.Map map16 = response0.headers();
        int int17 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.key("hi!");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!==Content-Encoding");
        boolean boolean9 = response0.hasHeader("hi!===hi!=hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=hi!", "hi!==Content-Encoding=");
        boolean boolean14 = response0.hasHeader("Content-Encoding=hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map3 = response2.cookies();
        java.lang.String str5 = response2.header("Content-Encoding");
        java.util.Map map6 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response7.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map11 = response7.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str13 = response2.statusMessage();
        java.util.Map map14 = response2.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        java.lang.String str18 = response0.header("hi!=hi!=hi!=hi!=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!==", "");
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasCookie("hi!=hi!=Content-Encoding");
        boolean boolean14 = response0.hasHeader("hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding==hi!", "hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==Content-Encoding==hi!=hi!=Content-Encoding=Content-Encoding=Content-Encoding=" + "'", str3, "hi!==Content-Encoding==hi!=hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.cookies();
        java.lang.String str15 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("hi!");
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=");
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasHeader("hi!=hi!=");
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.cookie("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Method method17 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("hi!===hi!==");
        org.jsoup.Connection.Method method14 = response0.method();
        org.jsoup.Connection.Base base17 = response0.cookie("hi!==hi!==hi!", "hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=hi!==Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=Content-Encoding=hi!=hi!==hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.lang.String str5 = keyVal3.toString();
        java.lang.String str6 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===hi!=Content-Encoding=Content-Encoding" + "'", str5, "hi!===hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str6, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==", "hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        boolean boolean6 = keyVal4.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        boolean boolean13 = response0.hasCookie("hi!");
        java.net.URL uRL14 = response0.url();
        java.net.URL uRL15 = response0.url();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==Content-Encoding", "hi!");
        org.jsoup.Connection.Base base21 = response0.header("hi!=hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base23 = response0.removeCookie("hi!=");
        org.jsoup.Connection.Method method24 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str9 = response6.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str14 = response0.statusMessage();
        boolean boolean17 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!", "Content-Encoding=hi!");
        org.jsoup.Connection.Base base19 = response0.removeHeader("Content-Encoding=hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.io.InputStream inputStream5 = keyVal3.inputStream();
        java.lang.String str6 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("hi!==hi!=Content-Encoding=hi!===hi!==");
        boolean boolean9 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=hi!=" + "'", str6, "hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Base base9 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.header("hi!=hi!", "hi!==Content-Encoding=");
        boolean boolean14 = response0.hasHeader("Content-Encoding=hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.cookies();
        java.lang.String str22 = response19.header("hi!");
        java.util.Map map23 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        java.lang.String str8 = response0.contentType();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.contentType();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!==hi!==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        boolean boolean14 = response0.hasHeaderWithValue("hi!==", "hi!=hi!=");
        boolean boolean16 = response0.hasHeader("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=hi!=");
        boolean boolean20 = response0.hasCookie("hi!==hi!==hi!=Content-Encoding");
        java.util.Map map21 = response0.headers();
        java.lang.String str22 = response0.statusMessage();
        boolean boolean25 = response0.hasHeaderWithValue("hi!===hi!===hi!=hi!=hi!=", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.cookie("hi!=Content-Encoding", "hi!=hi!");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.header("hi!==hi!==hi!=Content-Encoding=hi!=");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!=", "hi!===hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Base base12 = response0.header("hi!=", "");
        java.lang.String str14 = response0.header("hi!=hi!==");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal20.key("hi!=hi!");
        java.io.InputStream inputStream23 = keyVal22.inputStream();
        java.io.InputStream inputStream24 = keyVal22.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(inputStream24);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=hi!==Content-Encoding", "hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding");
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.value("hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding" + "'", str3, "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding" + "'", str8, "Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.removeCookie("hi!=hi!==Content-Encoding");
        java.net.URL uRL10 = response0.url();
        java.lang.String str12 = response0.header("hi!=hi!=hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response13.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean18 = response13.hasHeader("Content-Encoding");
        java.lang.String str20 = response13.header("");
        java.lang.String str22 = response13.header("hi!");
        org.jsoup.Connection.Base base24 = response13.removeCookie("Content-Encoding");
        java.lang.String str26 = response13.header("hi!");
        org.jsoup.Connection.Base base28 = response13.removeHeader("hi!");
        org.jsoup.Connection.Base base31 = response13.header("hi!", "hi!");
        java.lang.String str32 = response13.statusMessage();
        boolean boolean34 = response13.hasCookie("hi!==");
        org.jsoup.Connection.Base base36 = response13.removeCookie("Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map39 = response38.cookies();
        java.lang.String str41 = response38.header("");
        java.util.Map map42 = response38.headers();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map44 = response43.cookies();
        java.lang.String str46 = response43.header("Content-Encoding");
        java.util.Map map47 = response43.headers();
        response38.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.jsoup.Connection.Base base52 = response37.header("hi!=Content-Encoding", "hi!==");
        java.util.Map map53 = response37.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(base52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding==hi!", "hi!=hi!==hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==Content-Encoding==hi!" + "'", str3, "hi!==Content-Encoding==hi!");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str15 = response10.cookie("Content-Encoding");
        org.jsoup.Connection.Method method16 = response10.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.lang.String str22 = response17.cookie("Content-Encoding");
        java.util.Map map23 = response17.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        boolean boolean27 = response0.hasHeader("hi!=hi!=");
        boolean boolean29 = response0.hasHeader("hi!=hi!=");
        java.lang.String str30 = response0.charset();
        org.jsoup.Connection.Base base33 = response0.header("hi!=hi!==", "");
        java.lang.String str34 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.toString();
        java.lang.String str6 = keyVal3.value();
        java.lang.String str7 = keyVal3.toString();
        java.lang.String str8 = keyVal3.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("hi!===hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding");
        java.lang.String str9 = response0.cookie("hi!=");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding");
        java.lang.String str13 = response0.header("hi!=hi!");
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!==Content-Encoding", "hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!===hi!===hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!===hi!===hi!=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.key("hi!=Content-Encoding");
        java.lang.String str21 = keyVal20.toString();
        java.lang.String str22 = keyVal20.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal20.key("hi!=hi!==Content-Encoding");
        java.lang.String str25 = keyVal20.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str21, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=Content-Encoding" + "'", str22, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=hi!==Content-Encoding" + "'", str25, "hi!=hi!==Content-Encoding");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL15 = response0.url();
        org.jsoup.Connection.Method method16 = response0.method();
        boolean boolean18 = response0.hasHeader("hi!===hi!==");
        boolean boolean20 = response0.hasCookie("Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        boolean boolean22 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!===hi!==");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.inputStream(inputStream17);
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal14.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal14.key("hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal14.key("Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal14.value("hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(keyVal26);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base12 = response0.header("hi!===hi!=Content-Encoding=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str14 = response0.header("hi!==hi!");
        boolean boolean17 = response0.hasHeaderWithValue("hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", "hi!");
        java.util.Map map18 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map3 = response2.cookies();
        java.lang.String str5 = response2.header("Content-Encoding");
        java.util.Map map6 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base10 = response7.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map11 = response7.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.lang.String str13 = response2.statusMessage();
        java.util.Map map14 = response2.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL16 = response0.url();
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!==Content-Encoding");
        java.util.Map map16 = response0.cookies();
        boolean boolean19 = response0.hasHeaderWithValue("hi!=Content-Encoding=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean22 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.cookies();
        java.lang.String str26 = response23.header("hi!");
        org.jsoup.Connection.Base base28 = response23.removeHeader("hi!");
        java.util.Map map29 = response23.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.Connection.Method method31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base32 = response0.method(method31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response14.cookies();
        java.util.Map map22 = response14.cookies();
        java.lang.String str24 = response14.header("Content-Encoding");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!");
        java.lang.String str31 = response0.header("hi!===hi!==");
        java.lang.String str32 = response0.statusMessage();
        java.util.Map map33 = response0.headers();
        org.jsoup.Connection.Method method34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base35 = response0.method(method34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Base base13 = response0.cookie("hi!=hi!=", "hi!=");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!==hi!=Content-Encoding=hi!==Content-Encoding", "hi!=hi!=hi!=");
        java.lang.String str17 = response0.contentType();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str9 = response6.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Base base15 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeHeader("hi!=");
        boolean boolean19 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.util.Map map20 = response0.cookies();
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Base base23 = response0.removeHeader("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map24 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.cookie("hi!");
        org.jsoup.Connection.Base base9 = response1.removeCookie("hi!=Content-Encoding");
        java.util.Map map10 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!=hi!");
        boolean boolean22 = response0.hasCookie("hi!");
        java.net.URL uRL23 = response0.url();
        int int24 = response0.statusCode();
        org.jsoup.Connection.Base base27 = response0.header("hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(base27);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=", "hi!=");
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Base base16 = response0.header("hi!==Content-Encoding", "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.header("");
        java.util.Map map22 = response18.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.cookies();
        java.lang.String str26 = response23.header("Content-Encoding");
        java.util.Map map27 = response23.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        boolean boolean31 = response17.hasHeader("hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map34 = response33.cookies();
        java.lang.String str36 = response33.header("");
        java.util.Map map37 = response33.headers();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map39 = response38.cookies();
        java.lang.String str41 = response38.header("Content-Encoding");
        java.util.Map map42 = response38.headers();
        response33.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        java.net.URL uRL45 = response32.url();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map47 = response46.cookies();
        java.lang.String str49 = response46.header("Content-Encoding");
        java.util.Map map50 = response46.headers();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.util.Map map52 = response32.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        java.util.Map map54 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        java.lang.String str56 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(uRL45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!==hi!=Content-Encoding");
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.header("hi!===hi!===Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean6 = response1.hasHeader("Content-Encoding");
        java.lang.String str7 = response1.charset();
        java.util.Map map8 = response1.cookies();
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Base base12 = response1.removeCookie("hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str14 = response1.cookie("hi!==hi!");
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.key("hi!=");
        java.lang.String str17 = keyVal16.key();
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.inputStream(inputStream18);
        java.io.InputStream inputStream20 = keyVal16.inputStream();
        java.lang.String str21 = keyVal16.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal16.key("hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!==Content-Encoding" + "'", str14, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=" + "'", str17, "hi!=");
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!==Content-Encoding" + "'", str21, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.inputStream(inputStream17);
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal14.value("hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal14.key("hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal14.key("Content-Encoding=Content-Encoding");
        java.lang.String str25 = keyVal24.value();
        boolean boolean26 = keyVal24.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!==" + "'", str25, "hi!==");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!==hi!===hi!==");
        boolean boolean15 = response0.hasCookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        boolean boolean14 = response0.hasHeaderWithValue("hi!==", "hi!=hi!=");
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map17 = response0.headers();
        java.util.Map map18 = response0.headers();
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!===", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str5 = keyVal4.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===hi!===" + "'", str5, "hi!===hi!===");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        java.lang.String str14 = keyVal12.value();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.inputStream(inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.value("hi!==Content-Encoding");
        java.lang.String str19 = keyVal12.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal12.value("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        boolean boolean22 = keyVal21.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=hi!==Content-Encoding" + "'", str19, "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.contentType();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.header("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=hi!==");
        boolean boolean16 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding=hi!=Content-Encoding", "hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.header("hi!=hi!", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(base19);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.contentType();
        java.lang.String str14 = response0.charset();
        boolean boolean16 = response0.hasHeader("hi!==hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.removeHeader("hi!=Content-Encoding");
        int int10 = response0.statusCode();
        java.net.URL uRL11 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response14.cookies();
        java.util.Map map22 = response14.cookies();
        java.lang.String str24 = response14.header("Content-Encoding");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean31 = response0.hasCookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base34 = response0.header("hi!==hi!=", "hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(base34);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!===hi!===Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!===hi!===Content-Encoding");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!==hi!");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.inputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal16.inputStream(inputStream19);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("hi!=");
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.header("hi!=");
        java.lang.String str16 = response0.statusMessage();
        java.lang.Class<?> wildcardClass17 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!==Content-Encoding");
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("hi!===hi!=hi!", "hi!=hi!==");
        java.lang.String str12 = response0.header("hi!=hi!=hi!=hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!==hi!=hi!==", "hi!=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=hi!==Content-Encoding=Content-Encoding=hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.cookies();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.headers();
        boolean boolean14 = response0.hasHeaderWithValue("hi!=hi!=hi!=hi!=", "hi!=hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!==hi!==", "hi!=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        java.lang.String str10 = keyVal9.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!==Content-Encoding" + "'", str3, "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Base base9 = response0.cookie("hi!=Content-Encoding", "hi!==");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!==hi!==hi!=Content-Encoding", "hi!=");
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!==");
        java.lang.String str5 = keyVal4.toString();
        boolean boolean6 = keyVal4.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal4.value("hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===hi!==" + "'", str5, "hi!===hi!==");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding=Content-Encoding=", "hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal13.key("hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map12 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str16 = response0.cookie("hi!");
        java.net.URL uRL17 = response0.url();
        java.util.Map map18 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal19.key("hi!===hi!=Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream22 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal19.inputStream(inputStream22);
        java.lang.String str24 = keyVal19.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!===hi!=Content-Encoding=Content-Encoding" + "'", str24, "hi!===hi!=Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("hi!");
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        java.lang.String str8 = response5.header("Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str12 = response0.header("hi!==hi!=Content-Encoding");
        boolean boolean15 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=", "hi!===hi!===");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.cookie("hi!");
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map map9 = response1.cookies();
        java.util.Map map10 = response1.headers();
        java.lang.String str11 = response1.contentType();
        java.util.Map map12 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.key("Content-Encoding");
        java.lang.String str14 = keyVal13.toString();
        java.lang.String str15 = keyVal13.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str14, "Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding=Content-Encoding" + "'", str15, "Content-Encoding=Content-Encoding");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        java.util.Map map8 = response0.headers();
        boolean boolean10 = response0.hasCookie("hi!");
        boolean boolean12 = response0.hasCookie("hi!==hi!");
        java.net.URL uRL13 = response0.url();
        java.lang.String str15 = response0.cookie("hi!==");
        org.jsoup.Connection.Base base17 = response0.removeHeader("hi!==hi!==hi!");
        java.net.URL uRL18 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("hi!=");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Method method14 = response0.method();
        java.util.Map map15 = response0.cookies();
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        java.lang.String str11 = response0.cookie("hi!==hi!=Content-Encoding");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding", "Content-Encoding=hi!==hi!==hi!=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal15.value("hi!=Content-Encoding");
        java.lang.String str20 = keyVal19.toString();
        java.io.InputStream inputStream21 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal19.inputStream(inputStream21);
        java.lang.String str23 = keyVal22.key();
        java.lang.String str24 = keyVal22.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal22.value("hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal28 = keyVal26.value("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!==hi!=Content-Encoding" + "'", str20, "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=" + "'", str23, "hi!=");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=Content-Encoding" + "'", str24, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(keyVal28);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding", "Content-Encoding=Content-Encoding");
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.Connection.Base base17 = response0.header("hi!===hi!===hi!=hi!=hi!=", "hi!==hi!===hi!==");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str8 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasHeader("hi!==");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!=hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==hi!==hi!=Content-Encoding=");
        boolean boolean18 = response0.hasHeader("hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding=Content-Encoding=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding=Content-Encoding=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.cookies();
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasHeader("hi!==");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "hi!==Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!==Content-Encoding", "hi!==hi!");
        boolean boolean13 = response0.hasHeader("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!===hi!==", "hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str17 = response0.contentType();
        java.lang.String str18 = response0.statusMessage();
        boolean boolean20 = response0.hasCookie("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!=hi!=", "hi!==hi!===hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.header("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==");
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        java.util.Map map10 = response0.cookies();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        boolean boolean13 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding");
        java.net.URL uRL16 = response0.url();
        java.lang.String str18 = response0.cookie("Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        int int19 = response0.statusCode();
        java.util.Map map20 = response0.cookies();
        java.net.URL uRL21 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        int int3 = response0.statusCode();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.cookie("Content-Encoding", "");
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==", "Content-Encoding=hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!==Content-Encoding");
        java.lang.String str12 = response0.header("hi!=Content-Encoding=Content-Encoding");
        boolean boolean14 = response0.hasHeader("Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.net.URL uRL13 = response0.url();
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Method method15 = response0.method();
        java.util.Map map16 = response0.headers();
        java.util.Map map17 = response0.cookies();
        org.jsoup.Connection.Base base20 = response0.cookie("hi!=Content-Encoding=hi!", "hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.lang.String str4 = response0.statusMessage();
        java.lang.String str6 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!", "Content-Encoding=hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!==hi!" + "'", str4, "hi!==hi!");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str16 = response0.header("hi!=hi!=");
        org.jsoup.Connection.Base base19 = response0.header("Content-Encoding=hi!=hi!", "hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        boolean boolean21 = response0.hasCookie("Content-Encoding=Content-Encoding");
        java.lang.String str22 = response0.statusMessage();
        java.lang.String str24 = response0.cookie("hi!==hi!=hi!==Content-Encoding");
        boolean boolean26 = response0.hasCookie("hi!=hi!==Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!=hi!");
        boolean boolean22 = response0.hasCookie("hi!");
        java.lang.String str23 = response0.contentType();
        java.lang.String str25 = response0.cookie("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding");
        java.lang.String str26 = response0.charset();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Base base11 = response0.cookie("Content-Encoding=hi!==Content-Encoding", "hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.cookies();
        java.lang.String str15 = response12.header("Content-Encoding");
        java.util.Map map16 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base20 = response17.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map21 = response17.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response12.statusMessage();
        java.util.Map map24 = response12.cookies();
        java.net.URL uRL25 = response12.url();
        java.util.Map map26 = response12.headers();
        org.jsoup.Connection.Method method27 = response12.method();
        java.util.Map map28 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Method method30 = response0.method();
        java.lang.String str31 = response0.contentType();
        boolean boolean33 = response0.hasCookie("hi!==Content-Encoding==hi!=hi!===hi!===hi!=hi!=hi!=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding==hi!", "hi!===hi!===hi!=hi!=hi!=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        java.lang.String str5 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("hi!==hi!==hi!=Content-Encoding");
        java.lang.String str8 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==Content-Encoding==hi!=hi!===hi!===hi!=hi!=hi!=" + "'", str5, "hi!==Content-Encoding==hi!=hi!===hi!===hi!=hi!=hi!=");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!===hi!===hi!=hi!=hi!=" + "'", str8, "hi!===hi!===hi!=hi!=hi!=");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding", "hi!==Content-Encoding");
        java.util.Map map17 = response0.cookies();
        java.util.Map map18 = response0.cookies();
        java.util.Map map19 = response0.headers();
        org.jsoup.Connection.Base base22 = response0.header("hi!=Content-Encoding=hi!=Content-Encoding", "hi!==");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!", "Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=hi!==Content-Encoding");
        java.lang.String str12 = response0.header("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!===hi!==", "hi!===hi!===");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        boolean boolean9 = response0.hasHeader("Content-Encoding");
        java.lang.String str10 = response0.charset();
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("");
        java.util.Map map18 = response14.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.cookies();
        java.lang.String str22 = response19.header("Content-Encoding");
        java.util.Map map23 = response19.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.net.URL uRL26 = response13.url();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map28 = response27.cookies();
        java.lang.String str30 = response27.header("Content-Encoding");
        java.util.Map map31 = response27.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.Connection.Base base36 = response0.cookie("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base38 = response0.removeHeader("hi!=hi!=hi!=hi!=Content-Encoding");
        java.lang.String str39 = response0.charset();
        int int40 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.lang.String str13 = response0.header("hi!");
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        int int16 = response0.statusCode();
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Method method19 = response0.method();
        java.lang.String str20 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        boolean boolean10 = response0.hasHeaderWithValue("hi!=", "hi!=Content-Encoding");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Base base14 = response0.cookie("hi!===hi!=Content-Encoding=Content-Encoding", "hi!==hi!=Content-Encoding=hi!===hi!==");
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!=hi!=hi!=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.headers();
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.cookie("Content-Encoding", "hi!==hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.cookie("Content-Encoding=hi!==hi!==hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        java.lang.String str10 = response0.cookie("hi!=hi!");
        org.jsoup.Connection.Base base13 = response0.header("hi!=hi!==", "Content-Encoding=hi!");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.value("hi!=Content-Encoding");
        java.lang.String str13 = keyVal8.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=Content-Encoding" + "'", str13, "hi!=Content-Encoding");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str7 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.cookie("Content-Encoding=hi!", "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.net.URL uRL11 = response0.url();
        java.net.URL uRL12 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!", "hi!=Content-Encoding");
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str19 = response0.cookie("hi!");
        java.util.Map map20 = response0.cookies();
        org.jsoup.Connection.Method method21 = response0.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.cookies();
        java.lang.String str26 = response23.header("");
        java.util.Map map27 = response23.headers();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.cookies();
        java.lang.String str31 = response28.header("Content-Encoding");
        java.util.Map map32 = response28.headers();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.net.URL uRL35 = response22.url();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map37 = response36.cookies();
        java.lang.String str39 = response36.header("Content-Encoding");
        java.util.Map map40 = response36.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.lang.String str42 = response22.statusMessage();
        java.util.Map map43 = response22.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        org.jsoup.Connection.Base base47 = response0.header("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=Content-Encoding" + "'", str19, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(base47);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=hi!=hi!=", "hi!==hi!==hi!=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        org.jsoup.Connection.Base base10 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response13.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean18 = response13.hasHeader("Content-Encoding");
        java.lang.String str20 = response13.header("");
        java.lang.String str22 = response13.header("hi!");
        java.util.Map map23 = response13.headers();
        boolean boolean26 = response13.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map28 = response27.cookies();
        java.lang.String str29 = response27.statusMessage();
        java.util.Map map30 = response27.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str34 = response0.header("hi!==hi!==hi!=Content-Encoding=hi!=");
        java.lang.String str35 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str7 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.header("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response10.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean15 = response10.hasHeader("Content-Encoding");
        java.lang.String str17 = response10.header("");
        java.lang.String str19 = response10.header("hi!");
        java.lang.String str20 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.cookies();
        java.lang.String str24 = response21.header("");
        java.util.Map map25 = response21.headers();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map27 = response26.cookies();
        java.lang.String str29 = response26.header("Content-Encoding");
        java.util.Map map30 = response26.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.util.Map map34 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str17 = response0.contentType();
        java.lang.String str18 = response0.statusMessage();
        boolean boolean20 = response0.hasCookie("hi!==Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        java.net.URL uRL21 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!==Content-Encoding");
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        java.lang.String str7 = keyVal3.toString();
        java.lang.Class<?> wildcardClass8 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!==Content-Encoding=" + "'", str7, "hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        int int8 = response0.statusCode();
        int int9 = response0.statusCode();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.cookie("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean15 = response0.hasHeaderWithValue("hi!=", "hi!=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeCookie("hi!=hi!=hi!=hi!=Content-Encoding");
        java.util.Map map18 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!", "Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==Content-Encoding=");
        java.lang.String str13 = response0.contentType();
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!==Content-Encoding", "Content-Encoding=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Encoding=hi!=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        boolean boolean13 = response0.hasCookie("hi!");
        java.net.URL uRL14 = response0.url();
        java.net.URL uRL15 = response0.url();
        boolean boolean17 = response0.hasCookie("Content-Encoding");
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=Content-Encoding=hi!=Content-Encoding");
        boolean boolean21 = response0.hasCookie("hi!==hi!=Content-Encoding=");
        java.util.Map map22 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        java.net.URL uRL17 = response0.url();
        java.lang.String str18 = response0.statusMessage();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.header("Content-Encoding", "Content-Encoding=hi!=hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!=hi!", "hi!==hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=Content-Encoding=Content-Encoding=Content-Encoding=", "Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.lang.String str6 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!", "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base21 = response0.removeCookie("hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str21 = response0.statusMessage();
        java.lang.String str23 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.lang.String str13 = response0.contentType();
        org.jsoup.Connection.Base base15 = response0.removeCookie("hi!==hi!==hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean13 = response8.hasHeader("Content-Encoding");
        java.lang.String str15 = response8.header("");
        java.lang.String str16 = response8.contentType();
        java.util.Map map17 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        boolean boolean20 = response0.hasHeader("hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str22 = response0.header("hi!=Content-Encoding=hi!=hi!=");
        java.net.URL uRL23 = response0.url();
        org.jsoup.Connection.Method method24 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base7 = response0.removeHeader("Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.cookie("Content-Encoding");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasHeader("hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.Connection.Method method5 = response1.method();
        boolean boolean8 = response1.hasHeaderWithValue("hi!=hi!==Content-Encoding", "Content-Encoding=hi!");
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.lang.String str14 = response0.header("hi!=");
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!==hi!=Content-Encoding");
        boolean boolean19 = response0.hasHeaderWithValue("hi!=Content-Encoding", "hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal8.key();
        java.io.InputStream inputStream10 = keyVal8.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.headers();
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!", "hi!==");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!=Content-Encoding", "hi!==");
        boolean boolean15 = response0.hasCookie("Content-Encoding=Content-Encoding");
        boolean boolean18 = response0.hasHeaderWithValue("hi!==", "hi!");
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.headers();
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Base base10 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base13 = response0.cookie("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding", "Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=hi!=", "hi!=hi!==Content-Encoding");
        java.util.Map map16 = response0.headers();
        boolean boolean19 = response0.hasHeaderWithValue("hi!==Content-Encoding=hi!=Content-Encoding", "hi!==hi!");
        java.lang.String str21 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str22 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==Content-Encoding");
        boolean boolean3 = keyVal2.hasInputStream();
        java.lang.String str4 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        java.lang.String str7 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response0.cookies();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base25 = response0.header("Content-Encoding", "hi!");
        java.net.URL uRL26 = response0.url();
        java.lang.String str28 = response0.header("hi!=hi!==");
        boolean boolean31 = response0.hasHeaderWithValue("Content-Encoding=Content-Encoding", "hi!=hi!==hi!=Content-Encoding");
        java.util.Map map32 = response0.headers();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        java.lang.String str11 = keyVal10.value();
        java.lang.String str12 = keyVal10.toString();
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal10.inputStream(inputStream13);
        java.lang.String str15 = keyVal10.key();
        java.lang.String str16 = keyVal10.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=hi!" + "'", str12, "hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=hi!" + "'", str16, "hi!=hi!");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=hi!", "hi!=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        int int12 = response0.statusCode();
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str16 = response0.charset();
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.Connection.Base base20 = response0.header("hi!===hi!===Content-Encoding", "hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base23 = response0.cookie("hi!==hi!=Content-Encoding=", "Content-Encoding=hi!==");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base23);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.headers();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base9 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!==Content-Encoding");
        java.net.URL uRL10 = response0.url();
        java.lang.String str11 = response0.contentType();
        int int12 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!=hi!");
        java.lang.String str21 = response0.contentType();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!==Content-Encoding");
        int int7 = response0.statusCode();
        boolean boolean10 = response0.hasHeaderWithValue("hi!===hi!=hi!", "hi!=hi!==");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("hi!");
        java.io.InputStream inputStream19 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal18.inputStream(inputStream19);
        java.lang.String str21 = keyVal20.key();
        boolean boolean22 = keyVal20.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=" + "'", str21, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        boolean boolean11 = response0.hasHeader("hi!==");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.headers();
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.cookies();
        java.lang.String str11 = response8.header("Content-Encoding");
        java.util.Map map12 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base16 = response13.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map17 = response13.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response8.statusMessage();
        java.net.URL uRL20 = response8.url();
        java.util.Map map21 = response8.headers();
        boolean boolean23 = response8.hasCookie("hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Method method24 = response8.method();
        java.util.Map map25 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.statusMessage();
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Method method7 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("hi!==Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!=hi!==Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=", "hi!==Content-Encoding==hi!=hi!=Content-Encoding=Content-Encoding=Content-Encoding=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        boolean boolean17 = keyVal16.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.key("hi!==hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        boolean boolean11 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean6 = response1.hasHeader("Content-Encoding");
        java.lang.String str8 = response1.header("");
        java.lang.String str10 = response1.header("hi!");
        org.jsoup.Connection.Base base12 = response1.removeCookie("Content-Encoding");
        java.lang.String str14 = response1.header("hi!");
        org.jsoup.Connection.Base base16 = response1.removeHeader("hi!==Content-Encoding");
        java.util.Map map17 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!==hi!==hi!=Content-Encoding", "Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding");
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean15 = response0.hasHeader("hi!==hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean13 = response8.hasHeader("Content-Encoding");
        java.lang.String str15 = response8.header("");
        java.lang.String str16 = response8.contentType();
        java.util.Map map17 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.contentType();
        java.lang.String str21 = response0.header("hi!=hi!==");
        java.lang.String str22 = response0.charset();
        java.lang.Class<?> wildcardClass23 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map12 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Base base17 = response0.cookie("hi!==Content-Encoding=", "hi!==Content-Encoding=");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean23 = response18.hasHeader("Content-Encoding");
        java.lang.String str25 = response18.header("");
        java.lang.String str27 = response18.header("hi!");
        java.util.Map map28 = response18.headers();
        boolean boolean31 = response18.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.Connection.Base base34 = response18.cookie("hi!", "hi!=Content-Encoding");
        org.jsoup.Connection.Method method35 = response18.method();
        java.lang.String str37 = response18.cookie("hi!");
        java.util.Map map38 = response18.cookies();
        org.jsoup.Connection.Method method39 = response18.method();
        java.util.Map map40 = response18.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.jsoup.Connection.Base base44 = response0.cookie("hi!=hi!=", "hi!==hi!==");
        boolean boolean47 = response0.hasHeaderWithValue("hi!===hi!===hi!=hi!=hi!=", "");
        org.jsoup.Connection.Base base50 = response0.cookie("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=", "hi!=hi!=hi!=hi!=Content-Encoding");
        java.lang.String str51 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!=Content-Encoding" + "'", str37, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(base44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(base50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!");
        boolean boolean12 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=hi!=Content-Encoding=", "hi!=hi!=hi!=hi!=Content-Encoding");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        java.lang.String str14 = keyVal13.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.value("hi!=hi!");
        java.lang.String str19 = keyVal18.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!==Content-Encoding" + "'", str14, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=hi!" + "'", str19, "hi!=hi!");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.cookies();
        java.lang.String str14 = response12.statusMessage();
        boolean boolean17 = response12.hasHeaderWithValue("hi!==", "Content-Encoding");
        java.util.Map map18 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Base base21 = response0.removeCookie("hi!===hi!=Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base21);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        org.jsoup.Connection.Base base10 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding");
        java.lang.String str13 = response0.charset();
        java.lang.String str15 = response0.cookie("hi!=hi!==hi!=Content-Encoding");
        boolean boolean17 = response0.hasHeader("hi!=hi!=");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!==");
        java.util.Map map10 = response0.cookies();
        int int11 = response0.statusCode();
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=hi!==hi!=Content-Encoding");
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!=", "hi!===hi!=Content-Encoding=Content-Encoding");
        int int16 = response0.statusCode();
        int int17 = response0.statusCode();
        java.util.Map map18 = response0.headers();
        java.util.Map map19 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!", "Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.util.Map map12 = response0.cookies();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str16 = response14.statusMessage();
        java.util.Map map17 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.contentType();
        java.net.URL uRL20 = response0.url();
        org.jsoup.Connection.Base base23 = response0.cookie("hi!=hi!==Content-Encoding=Content-Encoding", "hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map24 = response0.headers();
        java.lang.String str25 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(base23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasCookie("hi!==hi!=Content-Encoding");
        java.util.Map map17 = response0.headers();
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.contentType();
        java.util.Map map20 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean6 = response1.hasHeader("Content-Encoding");
        java.lang.String str8 = response1.header("");
        java.lang.String str10 = response1.header("hi!===hi!==");
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding", "hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        boolean boolean13 = response0.hasHeader("hi!");
        int int14 = response0.statusCode();
        java.net.URL uRL15 = response0.url();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        java.lang.String str14 = keyVal13.key();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.inputStream(inputStream15);
        java.lang.String str17 = keyVal16.key();
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal16.inputStream(inputStream18);
        java.lang.String str20 = keyVal16.value();
        java.lang.Class<?> wildcardClass21 = keyVal16.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=" + "'", str14, "hi!=");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=" + "'", str17, "hi!=");
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Content-Encoding" + "'", str20, "Content-Encoding");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!");
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!");
        java.lang.String str10 = keyVal9.value();
        java.lang.String str11 = keyVal9.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=");
        java.lang.String str13 = response0.header("Content-Encoding=hi!=hi!");
        java.lang.String str14 = response0.contentType();
        int int15 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        java.util.Map map12 = response0.cookies();
        java.lang.String str13 = response0.contentType();
        org.jsoup.Connection.Base base16 = response0.header("hi!==Content-Encoding", "hi!===hi!===hi!=hi!=hi!=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        boolean boolean12 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.cookie("Content-Encoding=hi!");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding", "Content-Encoding");
        int int19 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        java.lang.String str14 = keyVal12.value();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.inputStream(inputStream15);
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal12.value("hi!==Content-Encoding");
        java.lang.String str19 = keyVal12.toString();
        java.io.InputStream inputStream20 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal12.inputStream(inputStream20);
        java.lang.String str22 = keyVal12.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal12.value("hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=hi!==Content-Encoding" + "'", str19, "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!==Content-Encoding" + "'", str22, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal24);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!", "hi!=hi!", inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!=Content-Encoding=hi!=Content-Encoding");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("hi!===hi!=Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=hi!==hi!=Content-Encoding", "hi!===hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.contentType();
        boolean boolean15 = response0.hasHeader("Content-Encoding=hi!=hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!===hi!==", "hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.cookies();
        java.lang.String str15 = response12.header("");
        java.util.Map map16 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.util.Map map21 = response17.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.net.URL uRL24 = response11.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.cookies();
        java.lang.String str28 = response25.header("Content-Encoding");
        java.util.Map map29 = response25.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.String str31 = response11.statusMessage();
        java.lang.String str33 = response11.cookie("hi!=");
        java.util.Map map34 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.util.Map map36 = response0.headers();
        java.net.URL uRL37 = response0.url();
        org.jsoup.Connection.Base base39 = response0.removeHeader("hi!===hi!=hi!");
        java.lang.String str41 = response0.cookie("Content-Encoding");
        java.lang.String str42 = response0.statusMessage();
        boolean boolean45 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!===hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.toString();
        java.lang.String str6 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==hi!=Content-Encoding=hi!=Content-Encoding" + "'", str5, "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!==hi!=Content-Encoding=hi!=Content-Encoding" + "'", str6, "hi!==hi!=Content-Encoding=hi!=Content-Encoding");
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.header("hi!=Content-Encoding", "hi!");
        org.jsoup.Connection.Base base10 = response0.cookie("hi!===hi!==", "Content-Encoding=hi!");
        boolean boolean13 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.contentType();
        java.lang.String str13 = response0.header("hi!=hi!");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Method method15 = response0.method();
        boolean boolean18 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=hi!=hi!=hi!=", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.headers();
        java.lang.String str15 = response0.cookie("hi!=hi!=");
        java.lang.String str17 = response0.header("hi!=");
        org.jsoup.Connection.Base base19 = response0.removeCookie("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean22 = response0.hasHeaderWithValue("hi!==Content-Encoding=hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=hi!==Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!==Content-Encoding", "hi!==hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        java.lang.String str8 = response5.header("Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.cookies();
        java.lang.String str16 = response13.header("");
        java.util.Map map17 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.util.Map map22 = response18.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.net.URL uRL25 = response12.url();
        org.jsoup.Connection.Base base28 = response12.header("Content-Encoding", "hi!==Content-Encoding");
        java.util.Map map29 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        int int31 = response0.statusCode();
        org.jsoup.Connection.Base base34 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Base base36 = response0.removeCookie("hi!=hi!===hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertNotNull(base36);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str21 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.header("");
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasCookie("hi!=");
        java.lang.String str13 = response0.contentType();
        boolean boolean15 = response0.hasCookie("hi!=hi!=hi!=hi!=Content-Encoding");
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!===hi!===Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.cookie("hi!==hi!==hi!=Content-Encoding");
        java.util.Map map18 = response0.headers();
        org.jsoup.Connection.Base base20 = response0.removeHeader("Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str22 = response0.header("hi!=hi!==Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.lang.String str4 = response0.statusMessage();
        java.lang.String str6 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("hi!==Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
        int int14 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Method method18 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("hi!=Content-Encoding");
        int int13 = response0.statusCode();
        int int14 = response0.statusCode();
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.inputStream(inputStream12);
        java.lang.String str14 = keyVal5.value();
        java.lang.String str15 = keyVal5.value();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal5.inputStream(inputStream16);
        java.lang.String str18 = keyVal5.toString();
        boolean boolean19 = keyVal5.hasInputStream();
        boolean boolean20 = keyVal5.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding" + "'", str15, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!==Content-Encoding" + "'", str18, "hi!==Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=hi!==");
        org.jsoup.Connection.Base base10 = response0.removeHeader("hi!==hi!");
        java.lang.String str12 = response0.cookie("hi!==Content-Encoding==hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.headers();
        boolean boolean9 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!", "hi!==");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding=hi!==Content-Encoding", "hi!=Content-Encoding=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!=hi!");
        java.util.Map map7 = response0.headers();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        boolean boolean18 = response10.hasCookie("hi!=");
        java.util.Map map19 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        int int21 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        java.lang.String str5 = keyVal3.toString();
        boolean boolean6 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("hi!=hi!");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.cookie("hi!", "");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Base base11 = response0.removeHeader("hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Base base12 = response0.removeCookie("Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=hi!==hi!=Content-Encoding", "hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        boolean boolean13 = response0.hasHeader("hi!");
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasCookie("hi!==");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!=hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!===hi!==");
        java.lang.String str6 = keyVal3.value();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.toString();
        boolean boolean10 = keyVal8.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!===hi!==" + "'", str6, "hi!===hi!==");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding=Content-Encoding=hi!===hi!==" + "'", str9, "Content-Encoding=Content-Encoding=hi!===hi!==");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=hi!", "Content-Encoding=Content-Encoding=hi!===hi!==", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!");
        java.lang.String str6 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=hi!==Content-Encoding" + "'", str3, "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.contentType();
        boolean boolean10 = response0.hasHeaderWithValue("hi!==hi!==hi!", "");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!==Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!=hi!==hi!=Content-Encoding", "hi!=hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!===hi!=Content-Encoding=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response0.hasHeaderWithValue("", "hi!=hi!=Content-Encoding=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.value("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str11 = keyVal10.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=hi!==hi!=Content-Encoding=hi!=Content-Encoding" + "'", str11, "hi!=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=hi!==hi!=Content-Encoding=hi!=hi!=");
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean10 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!===hi!==");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        boolean boolean16 = response0.hasCookie("hi!==hi!=Content-Encoding");
        boolean boolean18 = response0.hasHeader("Content-Encoding=hi!=hi!");
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        boolean boolean7 = keyVal3.hasInputStream();
        java.lang.String str8 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal3.key("hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.key("hi!=hi!==Content-Encoding=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("hi!==");
        int int12 = response0.statusCode();
        java.lang.String str14 = response0.cookie("hi!=hi!=hi!=");
        boolean boolean17 = response0.hasHeaderWithValue("hi!==Content-Encoding=hi!=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Method method18 = response0.method();
        java.lang.String str20 = response0.header("hi!=hi!=Content-Encoding=hi!==hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==Content-Encoding", "hi!=hi!==hi!=Content-Encoding");
        java.lang.String str3 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==Content-Encoding=hi!=hi!==hi!=Content-Encoding" + "'", str3, "hi!==Content-Encoding=hi!=hi!==hi!=Content-Encoding");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.header("hi!=hi!=", "hi!===hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        boolean boolean18 = response0.hasHeader("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.net.URL uRL13 = response0.url();
        java.util.Map map14 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base17 = response0.header("", "hi!=Content-Encoding=hi!=Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map12 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Method method14 = response0.method();
        org.jsoup.Connection.Base base17 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=hi!==Content-Encoding");
        boolean boolean19 = response0.hasHeader("hi!==");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.cookies();
        java.lang.String str23 = response20.header("");
        java.util.Map map24 = response20.headers();
        boolean boolean27 = response20.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str29 = response20.header("");
        org.jsoup.Connection.Method method30 = response20.method();
        boolean boolean32 = response20.hasCookie("hi!=");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base36 = response33.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean38 = response33.hasHeader("Content-Encoding");
        java.lang.String str40 = response33.header("");
        java.lang.String str42 = response33.header("hi!");
        org.jsoup.Connection.Base base44 = response33.removeCookie("Content-Encoding");
        java.lang.String str46 = response33.header("hi!");
        java.lang.String str47 = response33.statusMessage();
        java.util.Map map48 = response33.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        org.jsoup.Connection.Method method51 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(base36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(base44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(method51);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!===hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str12 = keyVal11.toString();
        java.lang.String str13 = keyVal11.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!==hi!=Content-Encoding=hi!=Content-Encoding=" + "'", str12, "hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!==hi!=Content-Encoding=hi!=Content-Encoding=" + "'", str13, "hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.header("hi!==Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!=");
        boolean boolean15 = response0.hasCookie("hi!==");
        org.jsoup.Connection.Method method16 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!==", "hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!==hi!", "hi!=hi!=hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Base base9 = response0.removeCookie("Content-Encoding=hi!");
        org.jsoup.Connection.Base base12 = response0.cookie("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding", "hi!==Content-Encoding==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("hi!=hi!");
        boolean boolean13 = response0.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str14 = response0.contentType();
        boolean boolean16 = response0.hasHeader("hi!==hi!");
        int int17 = response0.statusCode();
        org.jsoup.Connection.Base base19 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        boolean boolean21 = response0.hasHeader("Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(base19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!==hi!==hi!=Content-Encoding");
        java.lang.String str15 = response0.header("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean17 = response0.hasCookie("hi!=hi!=Content-Encoding=hi!=hi!==Content-Encoding");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding", "hi!=hi!==", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.cookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=", "hi!==hi!=");
        boolean boolean20 = response0.hasHeaderWithValue("hi!==Content-Encoding==hi!", "hi!===hi!==");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("Content-Encoding");
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.header("Content-Encoding=hi!=hi!");
        java.lang.String str16 = response0.contentType();
        java.lang.String str17 = response0.contentType();
        java.net.URL uRL18 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!==hi!=Content-Encoding", "hi!=Content-Encoding=hi!=hi!=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.value("hi!=hi!=");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        java.lang.String str8 = keyVal7.key();
        java.io.InputStream inputStream9 = keyVal7.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==Content-Encoding" + "'", str3, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!==hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("hi!===hi!==");
        java.lang.String str5 = keyVal2.toString();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!===hi!===hi!==hi!=Content-Encoding" + "'", str5, "hi!===hi!===hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("");
        java.util.Map map14 = response10.headers();
        boolean boolean17 = response10.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map22 = response18.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.util.Map map24 = response10.headers();
        org.jsoup.Connection.Base base27 = response10.cookie("hi!==Content-Encoding=", "hi!==Content-Encoding=");
        java.lang.String str28 = response10.charset();
        boolean boolean30 = response10.hasHeader("hi!==hi!");
        java.util.Map map31 = response10.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!==Content-Encoding");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=Content-Encoding=hi!==hi!=Content-Encoding");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response13.cookies();
        java.util.Map map21 = response13.cookies();
        java.lang.String str23 = response13.header("hi!==");
        java.net.URL uRL24 = response13.url();
        int int25 = response13.statusCode();
        boolean boolean28 = response13.hasHeaderWithValue("hi!===hi!==", "hi!==hi!=Content-Encoding");
        java.lang.String str29 = response13.contentType();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL31 = response30.url();
        java.lang.String str33 = response30.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map35 = response34.cookies();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.util.Map map37 = response30.cookies();
        java.util.Map map38 = response30.cookies();
        java.lang.String str40 = response30.header("hi!==");
        java.net.URL uRL41 = response30.url();
        java.util.Map map42 = response30.cookies();
        java.lang.String str44 = response30.header("hi!=Content-Encoding");
        java.util.Map map45 = response30.cookies();
        java.util.Map map46 = response30.cookies();
        java.util.Map map47 = response30.headers();
        java.util.Map map48 = response30.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        java.util.Map map51 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base11 = response0.removeHeader("Content-Encoding");
        boolean boolean13 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("Content-Encoding");
        java.net.URL uRL16 = response0.url();
        java.lang.String str18 = response0.cookie("Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.cookie("hi!==hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!==Content-Encoding");
        java.lang.String str12 = response0.header("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=hi!");
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        org.jsoup.Connection.Base base10 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base12 = response0.removeHeader("Content-Encoding");
        java.util.Map map13 = response0.cookies();
        int int14 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base16 = response0.header("Content-Encoding", "hi!==Content-Encoding");
        java.lang.String str18 = response0.header("hi!=");
        int int19 = response0.statusCode();
        java.lang.String str21 = response0.cookie("hi!===hi!===Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base23 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        org.jsoup.Connection.Base base15 = response0.header("hi!=Content-Encoding", "hi!==");
        boolean boolean18 = response0.hasHeaderWithValue("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str20 = response0.header("hi!==hi!=Content-Encoding");
        java.net.URL uRL21 = response0.url();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str6 = response0.statusMessage();
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.charset();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base12 = response0.header("hi!==hi!=hi!==Content-Encoding", "hi!===hi!==");
        java.net.URL uRL13 = response0.url();
        int int14 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.cookies();
        java.lang.String str19 = response16.header("");
        java.util.Map map20 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.cookies();
        java.lang.String str24 = response21.header("Content-Encoding");
        java.util.Map map25 = response21.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.net.URL uRL28 = response15.url();
        java.lang.String str29 = response15.charset();
        java.util.Map map30 = response15.cookies();
        boolean boolean33 = response15.hasHeaderWithValue("hi!=hi!==Content-Encoding", "");
        java.util.Map map34 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.Connection.Method method36 = response0.method();
        org.jsoup.Connection.Method method37 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method37);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        java.lang.String str22 = response0.cookie("hi!=");
        boolean boolean24 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Base base26 = response0.removeCookie("hi!");
        org.jsoup.Connection.Base base28 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base31 = response0.header("Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base33 = response0.removeCookie("hi!==");
        int int34 = response0.statusCode();
        java.lang.String str35 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.contentType();
        boolean boolean10 = response0.hasCookie("hi!==");
        java.net.URL uRL11 = response0.url();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.contentType();
        org.jsoup.Connection.Base base17 = response0.header("hi!=hi!=Content-Encoding", "hi!=hi!=hi!=");
        java.lang.String str19 = response0.cookie("hi!==Content-Encoding");
        java.lang.String str21 = response0.header("hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!=hi!=");
        java.util.Map map7 = response0.headers();
        boolean boolean10 = response0.hasHeaderWithValue("hi!==hi!==hi!=Content-Encoding=", "hi!==hi!==hi!");
        java.util.Map map11 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!==");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!==Content-Encoding==hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=hi!==Content-Encoding=Content-Encoding", "Content-Encoding=hi!=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base12 = response0.header("hi!=Content-Encoding", "");
        org.jsoup.Connection.Base base14 = response0.removeCookie("hi!");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.cookie("hi!==hi!==hi!=Content-Encoding");
        java.util.Map map18 = response0.headers();
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!===hi!=Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(base20);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        org.jsoup.Connection.Base base7 = response0.header("hi!==Content-Encoding", "hi!");
        boolean boolean9 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!");
        boolean boolean13 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.cookie("hi!=Content-Encoding=hi!=hi!==hi!==", "hi!==hi!=Content-Encoding");
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Method method14 = response0.method();
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str16 = response0.contentType();
        java.lang.String str17 = response0.statusMessage();
        java.net.URL uRL18 = response0.url();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.cookie("hi!==", "hi!=");
        org.jsoup.Connection.Base base11 = response0.header("hi!=", "hi!=");
        java.util.Map map12 = response0.headers();
        java.lang.String str14 = response0.cookie("hi!==");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=" + "'", str14, "hi!=");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal13.value("hi!=Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream23 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal22.inputStream(inputStream23);
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal24.value("Content-Encoding=hi!");
        java.io.InputStream inputStream27 = keyVal24.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = keyVal24.value("Content-Encoding=Content-Encoding");
        java.io.InputStream inputStream30 = keyVal24.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNull(inputStream30);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=hi!==Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==hi!=Content-Encoding");
        boolean boolean16 = response0.hasHeader("hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Base base13 = response0.header("hi!=", "hi!=");
        java.lang.String str15 = response0.cookie("hi!==Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        boolean boolean10 = response0.hasHeaderWithValue("hi!", "hi!");
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.cookie("hi!==Content-Encoding=hi!=Content-Encoding");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Base base16 = response0.removeHeader("hi!=hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.util.Map map21 = response17.headers();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base25 = response22.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map26 = response22.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Method method28 = response17.method();
        org.jsoup.Connection.Base base30 = response17.removeCookie("hi!=Content-Encoding");
        java.net.URL uRL31 = response17.url();
        java.util.Map map32 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(base30);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        java.lang.String str14 = keyVal12.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.key("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str17 = keyVal12.value();
        java.lang.String str18 = keyVal12.toString();
        java.lang.String str19 = keyVal12.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal12.key("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        boolean boolean22 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=Content-Encoding" + "'", str14, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Content-Encoding" + "'", str17, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=Content-Encoding=Content-Encoding=Content-Encoding" + "'", str18, "hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=Content-Encoding=Content-Encoding" + "'", str19, "hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        boolean boolean14 = response0.hasHeaderWithValue("hi!==", "hi!=hi!=");
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str16 = response0.statusMessage();
        java.lang.String str17 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        boolean boolean11 = response0.hasCookie("hi!=");
        int int12 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.cookies();
        java.lang.String str16 = response13.header("Content-Encoding");
        java.util.Map map17 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map22 = response18.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Method method24 = response13.method();
        java.util.Map map25 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.lang.String str27 = response0.charset();
        java.lang.String str29 = response0.cookie("hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=Content-Encoding=hi!=hi!=", "hi!=hi!==Content-Encoding=Content-Encoding=hi!", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!===hi!=Content-Encoding=Content-Encoding=hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=hi!==Content-Encoding=Content-Encoding=hi!" + "'", str4, "hi!=hi!==Content-Encoding=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.cookie("hi!=hi!", "Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.header("hi!==Content-Encoding=hi!=Content-Encoding", "hi!=hi!==Content-Encoding");
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.util.Map map14 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base18 = response15.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map19 = response15.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.cookies();
        java.lang.String str25 = response22.header("");
        java.util.Map map26 = response22.headers();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map28 = response27.cookies();
        java.lang.String str30 = response27.header("Content-Encoding");
        java.util.Map map31 = response27.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.net.URL uRL34 = response21.url();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map36 = response35.cookies();
        java.lang.String str38 = response35.header("Content-Encoding");
        java.util.Map map39 = response35.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.lang.String str41 = response21.statusMessage();
        java.lang.String str43 = response21.cookie("hi!=");
        java.util.Map map44 = response21.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        java.util.Map map46 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.jsoup.Connection.Base base49 = response0.removeHeader("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.lang.String str51 = response0.header("hi!=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(base49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str15 = response10.cookie("Content-Encoding");
        org.jsoup.Connection.Method method16 = response10.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.lang.String str22 = response17.cookie("Content-Encoding");
        java.util.Map map23 = response17.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map map26 = response0.headers();
        java.lang.String str28 = response0.header("hi!==Content-Encoding");
        java.lang.String str29 = response0.statusMessage();
        org.jsoup.Connection.Base base32 = response0.header("hi!===hi!=Content-Encoding=Content-Encoding=hi!=", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(base32);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        int int7 = response0.statusCode();
        int int8 = response0.statusCode();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        java.util.Map map6 = response0.headers();
        boolean boolean9 = response0.hasHeaderWithValue("hi!===hi!==", "");
        java.lang.String str11 = response0.cookie("hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!===hi!==");
        java.lang.String str10 = keyVal5.value();
        boolean boolean11 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.value("hi!=hi!==Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.removeCookie("hi!=");
        java.lang.String str9 = response0.cookie("hi!=hi!=hi!==Content-Encoding");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Method method14 = response0.method();
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str16 = response0.contentType();
        boolean boolean18 = response0.hasCookie("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base20 = response0.removeCookie("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.jsoup.Connection.Base base22 = response0.removeCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "hi!", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        boolean boolean5 = keyVal3.hasInputStream();
        java.lang.String str6 = keyVal3.key();
        java.lang.String str7 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.value("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.value("Content-Encoding=hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding" + "'", str6, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Base base11 = response0.removeCookie("hi!=hi!==hi!=Content-Encoding=hi!==hi!==hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response0.cookies();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Base base25 = response0.header("Content-Encoding", "hi!");
        java.net.URL uRL26 = response0.url();
        boolean boolean29 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=hi!==Content-Encoding", "hi!=");
        java.lang.String str30 = response0.statusMessage();
        java.lang.String str31 = response0.contentType();
        java.lang.String str32 = response0.contentType();
        boolean boolean34 = response0.hasCookie("hi!==hi!");
        java.lang.Class<?> wildcardClass35 = response0.getClass();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(base25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!=Content-Encoding=Content-Encoding=hi!=", "hi!===hi!=hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal15.key("hi!=");
        java.io.InputStream inputStream18 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.inputStream(inputStream18);
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal17.value("hi!=");
        java.io.InputStream inputStream22 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal17.inputStream(inputStream22);
        java.io.InputStream inputStream24 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal25 = keyVal23.inputStream(inputStream24);
        boolean boolean26 = keyVal25.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response14.cookies();
        java.util.Map map22 = response14.cookies();
        java.lang.String str24 = response14.header("Content-Encoding");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!");
        java.lang.String str31 = response0.header("hi!===hi!==");
        org.jsoup.Connection.Base base33 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean35 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL36 = response0.url();
        java.lang.String str37 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!===Content-Encoding", "Content-Encoding=Content-Encoding", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!==Content-Encoding=");
        java.util.Map map12 = response0.cookies();
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.cookie("hi!==Content-Encoding=hi!=Content-Encoding");
        boolean boolean17 = response0.hasCookie("hi!==hi!=Content-Encoding=hi!===hi!==");
        boolean boolean19 = response0.hasCookie("hi!===hi!=hi!");
        java.lang.String str20 = response0.contentType();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!=");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.key();
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        java.lang.String str7 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!=hi!=hi!=");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Base base16 = response0.removeHeader("Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.removeHeader("hi!");
        java.lang.String str20 = response0.cookie("hi!===hi!==");
        java.lang.String str21 = response0.statusMessage();
        java.util.Map map22 = response0.cookies();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.value("hi!===hi!===Content-Encoding");
        java.io.InputStream inputStream21 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal20.inputStream(inputStream21);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.String str18 = response0.header("hi!=hi!==Content-Encoding");
        java.net.URL uRL19 = response0.url();
        org.jsoup.Connection.Base base22 = response0.header("hi!==Content-Encoding", "hi!==hi!==hi!=Content-Encoding");
        java.lang.String str23 = response0.contentType();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding", "Content-Encoding=hi!=hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        java.util.Map map15 = response0.headers();
        boolean boolean18 = response0.hasHeaderWithValue("hi!=hi!=hi!=hi!==hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.cookies();
        java.lang.String str23 = response20.header("");
        java.util.Map map24 = response20.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.cookies();
        java.lang.String str28 = response25.header("Content-Encoding");
        java.util.Map map29 = response25.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.net.URL uRL32 = response19.url();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map34 = response33.cookies();
        java.lang.String str36 = response33.header("Content-Encoding");
        java.util.Map map37 = response33.headers();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.lang.String str39 = response19.statusMessage();
        java.lang.String str41 = response19.cookie("hi!=");
        boolean boolean43 = response19.hasCookie("hi!=");
        org.jsoup.Connection.Base base45 = response19.removeCookie("hi!");
        org.jsoup.Connection.Base base47 = response19.removeHeader("hi!=Content-Encoding");
        boolean boolean49 = response19.hasHeader("hi!");
        java.lang.String str50 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL52 = response51.url();
        java.lang.String str54 = response51.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map56 = response55.cookies();
        response51.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        java.util.Map map58 = response51.cookies();
        int int59 = response51.statusCode();
        java.util.Map map60 = response51.headers();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        int int63 = response0.statusCode();
        java.net.URL uRL64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base65 = response0.url(uRL64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(base45);
        org.junit.Assert.assertNotNull(base47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(uRL52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasHeader("hi!==");
        boolean boolean8 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "hi!==Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!==Content-Encoding", "hi!==hi!");
        org.jsoup.Connection.Base base14 = response0.cookie("hi!=hi!=hi!=hi!=", "hi!=Content-Encoding");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasHeader("hi!==");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=hi!==", "hi!=");
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.headers();
        boolean boolean15 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Base base18 = response0.removeCookie("hi!=hi!==");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str22 = response19.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map24 = response23.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Base base27 = response19.removeCookie("Content-Encoding");
        java.util.Map map28 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Base base31 = response0.removeHeader("Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(base27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(base31);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.value("hi!=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=Content-Encoding" + "'", str5, "hi!=Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=Content-Encoding" + "'", str6, "hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        boolean boolean10 = response0.hasHeader("hi!==Content-Encoding");
        boolean boolean12 = response0.hasCookie("hi!==hi!=hi!==Content-Encoding");
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Base base16 = response0.header("hi!==Content-Encoding==hi!=hi!===hi!===hi!=hi!=hi!=", "hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!==Content-Encoding");
        java.util.Map map11 = response0.headers();
        boolean boolean13 = response0.hasHeader("hi!===hi!==");
        java.lang.String str14 = response0.contentType();
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Base base17 = response0.removeCookie("Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base17);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.header("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("hi!===hi!=hi!");
        java.util.Map map8 = response0.cookies();
        java.util.Map map9 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal14.inputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal14.inputStream(inputStream17);
        boolean boolean19 = keyVal14.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal14.value("hi!=hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal23 = keyVal14.value("hi!=hi!=Content-Encoding=hi!==hi!==hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNotNull(keyVal23);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        boolean boolean12 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!", "hi!=hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeCookie("hi!=hi!=");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        java.lang.String str21 = response18.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map23 = response22.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map map25 = response18.cookies();
        java.util.Map map26 = response18.headers();
        java.lang.String str27 = response18.statusMessage();
        java.util.Map map28 = response18.cookies();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.cookies();
        java.lang.String str32 = response29.header("Content-Encoding");
        java.lang.String str34 = response29.cookie("Content-Encoding");
        org.jsoup.Connection.Base base37 = response29.header("hi!=", "hi!");
        org.jsoup.Connection.Base base39 = response29.removeCookie("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL41 = response40.url();
        java.lang.String str43 = response40.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map45 = response44.cookies();
        response40.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        java.util.Map map47 = response40.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.contentType();
        java.util.Map map5 = response0.headers();
        int int6 = response0.statusCode();
        org.jsoup.Connection.Base base8 = response0.removeCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.headers();
        boolean boolean15 = response0.hasCookie("hi!=");
        org.jsoup.Connection.Method method16 = response0.method();
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("hi!=hi!");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Base base15 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!", "hi!==Content-Encoding==hi!=hi!===hi!===hi!=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(base15);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        java.io.InputStream inputStream7 = keyVal5.inputStream();
        java.lang.String str8 = keyVal5.key();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal5.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("hi!");
        java.lang.String str13 = keyVal5.key();
        boolean boolean14 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal5.key("Content-Encoding=hi!=hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!=hi!=Content-Encoding");
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==hi!=Content-Encoding=hi!=hi!=", "hi!==Content-Encoding=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map11 = response10.cookies();
        java.lang.String str13 = response10.header("Content-Encoding");
        java.lang.String str15 = response10.cookie("Content-Encoding");
        org.jsoup.Connection.Method method16 = response10.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.cookies();
        java.lang.String str20 = response17.header("Content-Encoding");
        java.lang.String str22 = response17.cookie("Content-Encoding");
        java.util.Map map23 = response17.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        boolean boolean27 = response0.hasHeader("hi!=hi!=");
        boolean boolean29 = response0.hasHeader("hi!=hi!=");
        org.jsoup.Connection.Base base31 = response0.removeCookie("hi!==Content-Encoding=");
        org.jsoup.Connection.Method method32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base33 = response0.method(method32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(base31);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=hi!==Content-Encoding");
        java.lang.String str7 = response0.header("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map3 = response2.cookies();
        java.lang.String str5 = response2.header("");
        java.util.Map map6 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map8 = response7.cookies();
        java.lang.String str10 = response7.header("Content-Encoding");
        java.util.Map map11 = response7.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.net.URL uRL14 = response1.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.cookies();
        java.lang.String str18 = response15.header("Content-Encoding");
        java.util.Map map19 = response15.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str22 = response1.header("hi!=hi!==Content-Encoding");
        boolean boolean24 = response1.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        boolean boolean8 = response0.hasHeaderWithValue("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==Content-Encoding");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.key("hi!==");
        java.io.InputStream inputStream12 = keyVal11.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!==Content-Encoding" + "'", str3, "hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base16 = response0.removeCookie("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response0.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean5 = response0.hasHeaderWithValue("hi!==", "Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        boolean boolean8 = response0.hasCookie("hi!==hi!==hi!");
        boolean boolean11 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding", "hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("hi!=hi!");
        boolean boolean13 = response0.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base16 = response0.header("hi!==", "Content-Encoding=hi!");
        java.lang.String str18 = response0.header("hi!=hi!");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=hi!=Content-Encoding=hi!=hi!=", "hi!=hi!=hi!=hi!=", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        boolean boolean6 = keyVal5.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!=");
        java.lang.String str9 = keyVal5.value();
        java.io.InputStream inputStream10 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.value("hi!==hi!===hi!==");
        java.lang.String str13 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base7 = response0.header("hi!=Content-Encoding", "hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean13 = response8.hasHeader("Content-Encoding");
        java.lang.String str15 = response8.header("");
        java.lang.String str17 = response8.header("hi!");
        java.util.Map map18 = response8.headers();
        boolean boolean21 = response8.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.Connection.Base base24 = response8.cookie("hi!", "hi!=Content-Encoding");
        int int25 = response8.statusCode();
        org.jsoup.Connection.Method method26 = response8.method();
        org.jsoup.Connection.Base base28 = response8.removeHeader("hi!==Content-Encoding=hi!=Content-Encoding");
        java.util.Map map29 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(base24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("Content-Encoding=hi!", "hi!==hi!");
        java.util.Map map15 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.header("hi!==Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!=");
        boolean boolean15 = response0.hasCookie("hi!==");
        java.lang.String str17 = response0.cookie("hi!=hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.lang.String str22 = response18.contentType();
        java.util.Map map23 = response18.headers();
        java.util.Map map24 = response18.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.lang.String str28 = response25.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.util.Map map32 = response25.cookies();
        java.util.Map map33 = response25.headers();
        boolean boolean35 = response25.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base39 = response36.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean41 = response36.hasHeader("Content-Encoding");
        java.lang.String str43 = response36.header("");
        java.lang.String str45 = response36.header("hi!");
        java.util.Map map46 = response36.headers();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(base39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!=Content-Encoding");
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.contentType();
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean5 = response0.hasHeaderWithValue("hi!==", "Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str8 = response0.header("hi!=Content-Encoding");
        org.jsoup.Connection.Base base11 = response0.cookie("hi!", "hi!=");
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=hi!=hi!=");
        java.util.Map map16 = response0.headers();
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!==Content-Encoding=");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!==", "Content-Encoding=hi!", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding", "hi!==");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==hi!==Content-Encoding");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        boolean boolean6 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str11 = response0.header("hi!=hi!===hi!==");
        boolean boolean13 = response0.hasHeader("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=Content-Encoding=hi!=hi!=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("hi!==hi!==hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.value("hi!=hi!==hi!=Content-Encoding=hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        boolean boolean12 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        boolean boolean15 = response0.hasHeaderWithValue("Content-Encoding=hi!=hi!", "hi!=hi!==Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base17 = response0.removeCookie("hi!=hi!=");
        java.util.Map map18 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.cookie("hi!");
        boolean boolean9 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Base base14 = response0.header("hi!=hi!", "hi!=hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.cookies();
        java.lang.String str19 = response16.header("");
        java.util.Map map20 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map22 = response21.cookies();
        java.lang.String str24 = response21.header("Content-Encoding");
        java.util.Map map25 = response21.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.net.URL uRL28 = response15.url();
        org.jsoup.Connection.Base base31 = response15.header("Content-Encoding", "hi!==Content-Encoding");
        java.util.Map map32 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.lang.String str34 = response0.statusMessage();
        boolean boolean36 = response0.hasHeader("hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        boolean boolean38 = response0.hasCookie("hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(base31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("Content-Encoding");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        boolean boolean16 = response0.hasHeaderWithValue("hi!=Content-Encoding=Content-Encoding=hi!", "hi!==hi!==hi!=Content-Encoding=hi!=");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        java.net.URL uRL14 = response0.url();
        java.util.Map map15 = response0.headers();
        java.lang.String str17 = response0.cookie("hi!==Content-Encoding=hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!=");
        java.lang.String str3 = keyVal2.value();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.contentType();
        boolean boolean10 = response0.hasCookie("hi!==");
        java.util.Map map11 = response0.cookies();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.header("Content-Encoding");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Base base6 = response0.cookie("hi!==Content-Encoding", "hi!=Content-Encoding=Content-Encoding");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str9 = response0.header("");
        java.lang.String str11 = response0.cookie("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base14 = response0.header("hi!=hi!=", "hi!=hi!=");
        java.net.URL uRL15 = response0.url();
        java.lang.String str16 = response0.contentType();
        boolean boolean19 = response0.hasHeaderWithValue("hi!=hi!=hi!=", "Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!==");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.cookie("hi!==hi!=hi!==Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.util.Map map2 = response0.headers();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!==Content-Encoding");
        boolean boolean7 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!=hi!==hi!=Content-Encoding=hi!=hi!=", "Content-Encoding=hi!==hi!==hi!=Content-Encoding");
        org.jsoup.Connection.Base base13 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=", "Content-Encoding=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base13);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!==Content-Encoding", "hi!==hi!==hi!=Content-Encoding=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal20 = keyVal13.key("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal22 = keyVal20.key("hi!==hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = keyVal20.key("Content-Encoding");
        java.io.InputStream inputStream25 = keyVal24.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(keyVal22);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=hi!=hi!=", "hi!=Content-Encoding=Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding=Content-Encoding=hi!=Content-Encoding=Content-Encoding=Content-Encoding=", "", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        boolean boolean18 = response10.hasCookie("hi!=");
        java.util.Map map19 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str21 = response0.statusMessage();
        org.jsoup.Connection.Base base24 = response0.cookie("hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding", "hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(base24);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.Connection.Method method2 = response0.method();
        int int3 = response0.statusCode();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Base base6 = response0.removeCookie("hi!===hi!=Content-Encoding=Content-Encoding");
        boolean boolean8 = response0.hasHeader("hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str9 = response0.contentType();
        boolean boolean11 = response0.hasHeader("hi!=Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean5 = response0.hasHeaderWithValue("hi!==", "Content-Encoding");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str8 = response0.cookie("hi!==Content-Encoding");
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base7 = response0.header("Content-Encoding", "hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        int int10 = response0.statusCode();
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.cookie("hi!=hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        boolean boolean10 = response0.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!==hi!=Content-Encoding=hi!===hi!==");
        java.lang.String str14 = response0.header("hi!===hi!===hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal5.inputStream(inputStream12);
        java.lang.String str14 = keyVal5.value();
        java.lang.String str15 = keyVal5.value();
        java.io.InputStream inputStream16 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal5.inputStream(inputStream16);
        org.jsoup.helper.HttpConnection.KeyVal keyVal19 = keyVal17.key("hi!===hi!===");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Content-Encoding" + "'", str15, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal17);
        org.junit.Assert.assertNotNull(keyVal19);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.cookie("hi!=hi!");
        java.util.Map map10 = response0.headers();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.charset();
        int int12 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base4 = response1.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean6 = response1.hasHeader("Content-Encoding");
        java.lang.String str8 = response1.header("");
        java.lang.String str9 = response1.contentType();
        boolean boolean11 = response1.hasCookie("hi!==");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str15 = response12.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.util.Map map19 = response12.cookies();
        java.util.Map map20 = response12.headers();
        boolean boolean22 = response12.hasCookie("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base26 = response23.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean28 = response23.hasHeader("Content-Encoding");
        java.lang.String str30 = response23.header("");
        java.lang.String str32 = response23.header("hi!");
        java.util.Map map33 = response23.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response36 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(base26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Base base4 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        boolean boolean6 = response0.hasCookie("hi!=Content-Encoding=Content-Encoding");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Base base11 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "hi!=");
        org.jsoup.Connection.Base base13 = response0.removeHeader("hi!=Content-Encoding");
        java.lang.String str14 = response0.contentType();
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(base4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=Content-Encoding");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Base base17 = response0.header("hi!=hi!=hi!=", "hi!=hi!=");
        java.lang.String str18 = response0.statusMessage();
        java.net.URL uRL19 = response0.url();
        java.lang.String str20 = response0.contentType();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        org.jsoup.Connection.Base base8 = response0.removeCookie("Content-Encoding");
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Base base13 = response0.header("Content-Encoding", "hi!=hi!");
        java.util.Map map14 = response0.headers();
        int int15 = response0.statusCode();
        java.lang.String str17 = response0.cookie("Content-Encoding");
        java.util.Map map18 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        java.lang.String str11 = keyVal10.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("");
        java.lang.String str14 = keyVal10.value();
        java.lang.String str15 = keyVal10.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.lang.String str10 = response0.header("hi!=");
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        boolean boolean2 = response0.hasHeader("Content-Encoding");
        boolean boolean4 = response0.hasHeader("hi!==Content-Encoding");
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Base base7 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        boolean boolean10 = response0.hasHeaderWithValue("hi!=hi!", "hi!==hi!=Content-Encoding");
        java.lang.String str12 = response0.cookie("Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.jsoup.Connection.Base base14 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!", "hi!");
        java.lang.String str19 = response0.charset();
        java.lang.String str21 = response0.header("hi!=Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        java.lang.String str23 = response0.cookie("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!==hi!=Content-Encoding");
        java.lang.String str14 = response0.header("hi!=");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=hi!==Content-Encoding=Content-Encoding", "Content-Encoding=hi!=hi!");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base20 = response0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.net.URL uRL8 = response1.url();
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Base base12 = response1.cookie("Content-Encoding=hi!==Content-Encoding", "hi!=hi!==Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.cookies();
        java.lang.String str16 = response13.header("Content-Encoding");
        java.util.Map map17 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base21 = response18.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map22 = response18.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.String str24 = response13.statusMessage();
        java.util.Map map25 = response13.cookies();
        java.net.URL uRL26 = response13.url();
        java.util.Map map27 = response13.headers();
        org.jsoup.Connection.Method method28 = response13.method();
        java.util.Map map29 = response13.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.Connection.Method method31 = response1.method();
        java.lang.String str32 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response33 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        java.lang.String str8 = response5.header("Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.cookies();
        java.lang.String str16 = response13.header("");
        java.util.Map map17 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.header("Content-Encoding");
        java.util.Map map22 = response18.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.net.URL uRL25 = response12.url();
        org.jsoup.Connection.Base base28 = response12.header("Content-Encoding", "hi!==Content-Encoding");
        java.util.Map map29 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        int int31 = response0.statusCode();
        org.jsoup.Connection.Base base34 = response0.cookie("hi!==Content-Encoding", "hi!=");
        boolean boolean36 = response0.hasCookie("hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str38 = response0.cookie("hi!=hi!==Content-Encoding=Content-Encoding");
        java.lang.String str39 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(base28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(base34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        java.lang.String str11 = response0.header("hi!==Content-Encoding");
        boolean boolean13 = response0.hasHeader("hi!=");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=hi!=Content-Encoding");
        java.lang.String str17 = response0.header("Content-Encoding=hi!=hi!=hi!==");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        java.lang.String str8 = response5.header("Content-Encoding");
        java.util.Map map9 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base13 = response10.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map14 = response10.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.net.URL uRL17 = response0.url();
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=", "hi!=Content-Encoding");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal4.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.value("hi!===hi!=hi!");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=hi!==hi!=Content-Encoding" + "'", str5, "hi!=hi!==hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("hi!=Content-Encoding");
        java.net.URL uRL9 = response0.url();
        boolean boolean12 = response0.hasHeaderWithValue("hi!", "hi!=hi!=");
        org.jsoup.Connection.Base base15 = response0.cookie("hi!=", "hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!==hi!", "hi!=");
        boolean boolean21 = response0.hasHeaderWithValue("hi!===hi!==", "hi!==Content-Encoding=hi!=Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Base base13 = response0.removeCookie("hi!=Content-Encoding");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Base base17 = response0.header("hi!=hi!=hi!=", "hi!=hi!=");
        java.lang.String str18 = response0.statusMessage();
        java.net.URL uRL19 = response0.url();
        java.lang.String str20 = response0.contentType();
        java.lang.Class<?> wildcardClass21 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding", "Content-Encoding=hi!=hi!");
        boolean boolean15 = response0.hasHeaderWithValue("hi!==hi!=hi!==Content-Encoding", "hi!==");
        java.net.URL uRL16 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        org.jsoup.Connection.Base base6 = response0.header("hi!=", "hi!=");
        org.jsoup.Connection.Base base9 = response0.header("hi!==", "hi!");
        org.jsoup.Connection.Base base12 = response0.cookie("hi!=Content-Encoding=Content-Encoding", "");
        int int13 = response0.statusCode();
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(base9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Base base11 = response0.removeCookie("Content-Encoding");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Base base18 = response0.header("hi!", "hi!");
        java.util.Map map19 = response0.headers();
        java.util.Map map20 = response0.cookies();
        boolean boolean22 = response0.hasHeader("hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str23 = response0.charset();
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("hi!=Content-Encoding");
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.cookie("Content-Encoding=Content-Encoding");
        java.lang.String str16 = response0.charset();
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasHeader("hi!==");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!=Content-Encoding");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!=Content-Encoding", "hi!==hi!==hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = response0.url();
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeCookie("Content-Encoding");
        boolean boolean8 = response0.hasHeader("Content-Encoding");
        org.jsoup.Connection.Base base10 = response0.removeCookie("hi!===hi!=hi!");
        org.jsoup.Connection.Base base12 = response0.removeHeader("hi!=Content-Encoding");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Base base16 = response0.header("hi!==hi!=", "hi!===hi!=hi!=hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(base10);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasCookie("Content-Encoding");
        int int9 = response0.statusCode();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Base base13 = response0.header("hi!==hi!=Content-Encoding", "hi!===hi!==");
        boolean boolean15 = response0.hasHeader("hi!==");
        java.lang.String str17 = response0.header("hi!==hi!=Content-Encoding=hi!=Content-Encoding=hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        boolean boolean19 = response0.hasHeader("hi!===hi!=Content-Encoding=Content-Encoding");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(base13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("hi!");
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal3.key("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal3.value("hi!==");
        java.lang.String str12 = keyVal3.key();
        boolean boolean13 = keyVal3.hasInputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = keyVal3.inputStream(inputStream14);
        org.jsoup.helper.HttpConnection.KeyVal keyVal17 = keyVal3.value("hi!==Content-Encoding=hi!==");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNotNull(keyVal17);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!==hi!=Content-Encoding", "hi!==Content-Encoding=hi!=Content-Encoding=hi!=hi!==Content-Encoding=hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.util.Map map4 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base8 = response5.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map9 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.util.Map map13 = response0.cookies();
        boolean boolean15 = response0.hasHeader("hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!==hi!=Content-Encoding", "hi!==Content-Encoding");
        java.lang.String str20 = response0.header("hi!=hi!==Content-Encoding");
        boolean boolean23 = response0.hasHeaderWithValue("hi!==", "hi!=Content-Encoding");
        boolean boolean26 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!==Content-Encoding==hi!=hi!=Content-Encoding=Content-Encoding=Content-Encoding=");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=hi!=Content-Encoding", "hi!=hi!==hi!=hi!==");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Base base11 = response1.cookie("hi!=Content-Encoding", "hi!=hi!");
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean13 = response0.hasHeaderWithValue("hi!==", "hi!==");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map19 = response18.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response14.cookies();
        java.util.Map map22 = response14.cookies();
        java.lang.String str24 = response14.header("Content-Encoding");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Base base29 = response0.removeHeader("Content-Encoding=hi!");
        java.lang.String str31 = response0.header("hi!===hi!==");
        org.jsoup.Connection.Base base33 = response0.removeHeader("Content-Encoding=hi!");
        boolean boolean35 = response0.hasHeader("Content-Encoding");
        java.net.URL uRL36 = response0.url();
        org.jsoup.Connection.Base base38 = response0.removeCookie("hi!=hi!===hi!==hi!=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.Connection.Base base41 = response0.header("hi!=Content-Encoding=hi!=Content-Encoding", "Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(base29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(base33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNotNull(base38);
        org.junit.Assert.assertNotNull(base41);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.cookies();
        java.lang.String str17 = response14.header("Content-Encoding");
        java.util.Map map18 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map map20 = response0.cookies();
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!=Content-Encoding");
        java.util.Map map23 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(base22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.key("hi!=");
        java.lang.String str9 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal5.value("Content-Encoding");
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.inputStream(inputStream12);
        java.lang.String str14 = keyVal13.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal13.value("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("hi!==Content-Encoding=");
        java.lang.String str19 = keyVal16.value();
        java.lang.String str20 = keyVal16.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=" + "'", str9, "hi!=");
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Content-Encoding" + "'", str19, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!==Content-Encoding==Content-Encoding" + "'", str20, "hi!==Content-Encoding==Content-Encoding");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        int int4 = response0.statusCode();
        org.jsoup.Connection.Base base6 = response0.removeHeader("hi!=hi!=");
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Method method8 = response0.method();
        int int9 = response0.statusCode();
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(base6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        java.lang.String str5 = response0.cookie("Content-Encoding");
        org.jsoup.Connection.Base base8 = response0.header("hi!=", "hi!");
        java.lang.String str10 = response0.header("hi!=");
        org.jsoup.Connection.Base base12 = response0.removeCookie("hi!=hi!=");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Base base16 = response0.header("hi!==hi!=", "hi!=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(base16);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.cookies();
        java.lang.String str12 = response9.header("Content-Encoding");
        java.util.Map map13 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base17 = response14.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map18 = response14.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response9.statusMessage();
        java.net.URL uRL21 = response9.url();
        java.util.Map map22 = response9.headers();
        java.net.URL uRL23 = response9.url();
        java.util.Map map24 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str27 = response0.cookie("Content-Encoding=hi!==hi!==hi!=Content-Encoding=hi!==Content-Encoding=hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.cookies();
        int int30 = response28.statusCode();
        java.lang.String str31 = response28.contentType();
        int int32 = response28.statusCode();
        boolean boolean35 = response28.hasHeaderWithValue("Content-Encoding=hi!", "hi!=Content-Encoding=Content-Encoding");
        org.jsoup.Connection.Base base37 = response28.removeCookie("hi!=hi!=Content-Encoding");
        java.util.Map map38 = response28.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.lang.String str40 = response0.charset();
        boolean boolean42 = response0.hasHeader("hi!==hi!=Content-Encoding=hi!==Content-Encoding");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(base17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(base37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        boolean boolean5 = response0.hasHeader("Content-Encoding");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Base base8 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("Content-Encoding");
        org.jsoup.Connection.Base base14 = response9.removeHeader("hi!");
        java.lang.String str15 = response9.contentType();
        boolean boolean17 = response9.hasCookie("Content-Encoding");
        int int18 = response9.statusCode();
        boolean boolean20 = response9.hasCookie("hi!=");
        int int21 = response9.statusCode();
        java.util.Map map22 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Base base25 = response0.removeHeader("hi!=hi!==hi!=Content-Encoding");
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base27 = response0.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(base14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(base25);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=Content-Encoding", "hi!=hi!=Content-Encoding", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=Content-Encoding" + "'", str8, "hi!=Content-Encoding");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base3 = response0.cookie("Content-Encoding", "Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeCookie("hi!=hi!==Content-Encoding");
        java.util.Map map6 = response0.cookies();
        int int7 = response0.statusCode();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("hi!==hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(base3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        java.lang.String str7 = response4.header("Content-Encoding");
        java.util.Map map8 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base12 = response9.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map13 = response9.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.lang.String str15 = response4.contentType();
        java.util.Map map16 = response4.cookies();
        java.util.Map map17 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.jsoup.Connection.Base base20 = response0.removeHeader("hi!=Content-Encoding=Content-Encoding=hi!");
        org.jsoup.Connection.Base base22 = response0.removeHeader("hi!===hi!===Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(base20);
        org.junit.Assert.assertNotNull(base22);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("");
        java.util.Map map4 = response0.headers();
        boolean boolean7 = response0.hasHeaderWithValue("Content-Encoding", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Base base11 = response8.cookie("Content-Encoding", "Content-Encoding");
        java.util.Map map12 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        boolean boolean15 = response0.hasCookie("hi!=hi!==Content-Encoding");
        org.jsoup.Connection.Base base18 = response0.cookie("hi!=hi!=hi!=hi!==hi!==", "hi!=Content-Encoding=hi!=Content-Encoding=hi!=hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(base11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(base18);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!===hi!===", "hi!=Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("hi!==Content-Encoding=hi!=Content-Encoding");
        java.lang.String str5 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==Content-Encoding=hi!=Content-Encoding" + "'", str5, "hi!==Content-Encoding=hi!=Content-Encoding");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("hi!===hi!==");
        java.lang.String str10 = keyVal5.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal5.key("hi!==hi!");
        java.io.InputStream inputStream13 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.inputStream(inputStream13);
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.cookies();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.cookies();
        java.lang.String str9 = response6.header("Content-Encoding");
        java.util.Map map10 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Base base15 = response0.removeHeader("hi!=Content-Encoding");
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.String str18 = response0.header("hi!=hi!==Content-Encoding");
        boolean boolean21 = response0.hasHeaderWithValue("hi!=hi!==Content-Encoding", "hi!=hi!=Content-Encoding");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(base15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        boolean boolean5 = response0.hasCookie("hi!=Content-Encoding");
        java.lang.String str7 = response0.header("hi!=hi!==Content-Encoding");
        boolean boolean9 = response0.hasCookie("hi!==hi!===hi!==");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Base base11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.value("hi!");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("Content-Encoding");
        boolean boolean13 = keyVal12.hasInputStream();
        java.lang.String str14 = keyVal12.value();
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.inputStream(inputStream15);
        boolean boolean17 = keyVal12.hasInputStream();
        java.lang.String str18 = keyVal12.key();
        boolean boolean19 = keyVal12.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Content-Encoding" + "'", str14, "Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Base base12 = response0.header("Content-Encoding", "Content-Encoding=hi!=hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        java.util.Map map15 = response0.headers();
        int int16 = response0.statusCode();
        boolean boolean18 = response0.hasCookie("hi!==hi!===hi!==");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(base12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Base base5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        java.util.Map map9 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(base5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "hi!==");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.value();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!==" + "'", str5, "hi!==");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        java.lang.String str3 = response0.header("Content-Encoding");
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        org.jsoup.Connection.Base base8 = response0.header("hi!===hi!==", "hi!==Content-Encoding");
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(base8);
        org.junit.Assert.assertNull(str9);
    }
}

