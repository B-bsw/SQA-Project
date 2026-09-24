package org.jsoup.helper;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = org.jsoup.helper.DataUtil.mimeBoundary();
// flaky "1) test01(org.jsoup.helper.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2" + "'", str0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.DataUtil.crossStreams(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = org.jsoup.helper.DataUtil.bufferSize;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str0 = org.jsoup.helper.DataUtil.defaultCharset;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = org.jsoup.helper.DataUtil.boundaryLength;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = org.jsoup.helper.DataUtil.readFileToByteBuffer(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = org.jsoup.helper.DataUtil.getCharsetFromContentType("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = org.jsoup.helper.DataUtil.getCharsetFromContentType("UTF-8");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "hi!", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str1 = org.jsoup.helper.DataUtil.getCharsetFromContentType("_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str1 = org.jsoup.helper.DataUtil.getCharsetFromContentType("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "hi!");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.nio.ByteBuffer byteBuffer0 = org.jsoup.helper.DataUtil.emptyByteBuffer();
        java.lang.Class<?> wildcardClass1 = byteBuffer0.getClass();
        org.junit.Assert.assertNotNull(byteBuffer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "UTF-8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "hi!", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "UTF-8", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 32768);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "UTF-8", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "UTF-8");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "UTF-8", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "UTF-8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "hi!");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "UTF-8", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "UTF-8");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "UTF-8", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "UTF-8");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "hi!", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "hi!");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "UTF-8");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer2 = org.jsoup.helper.DataUtil.readToByteBuffer(inputStream0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxSize must be 0 (unlimited) or larger");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "hi!", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "UTF-8", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.parseInputStream(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "UTF-8", "UTF-8", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "hi!", parser3);
        java.lang.Class<?> wildcardClass5 = document4.getClass();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "_QAQIFlV8FtptfotqZLUirvHgvw1PSt2", "");
        java.lang.Class<?> wildcardClass4 = document3.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}
