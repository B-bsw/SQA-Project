package org.apache.commons.lang;

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
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeHtml(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeXml(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeJava(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeJava("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeXml(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeXml(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeJava(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeXml(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeHtml(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeXml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeCsv(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeXml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeCsv(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeJavaScript("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeJavaScript("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeSql("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.lang.StringEscapeUtils stringEscapeUtils0 = new org.apache.commons.lang.StringEscapeUtils();
        java.lang.Class<?> wildcardClass1 = stringEscapeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.String str1 = org.apache.commons.lang.StringEscapeUtils.escapeSql("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeHtml(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeJava(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(writer0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.escapeCsv(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.StringEscapeUtils.unescapeHtml(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

