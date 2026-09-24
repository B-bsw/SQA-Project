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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader1, "", parseErrorList3, parseSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.Token token3 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.process(token3, htmlTreeBuilderState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertEmpty(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = htmlTreeBuilder0.insertEmpty(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.Token.StartTag startTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.insertForm(startTag3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertEmpty(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Attributes attributes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.processStartTag("hi!", attributes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.io.Reader reader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, "", parseErrorList8, parseSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.isSpecial(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.Class<?> wildcardClass1 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.processStartTag("", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.removeFromStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token token5 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.process(token5, htmlTreeBuilderState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.Character character4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.removeFromStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.onStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = htmlTreeBuilder0.removeFromStack(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.inScope("", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.isInActiveFormattingElements(element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insert(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.removeFromStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        java.io.Reader reader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder8.setHeadElement(element9);
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder8.setHeadElement(element12);
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "hi!", parseErrorList7, parseSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseSettings14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isInActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token token7 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.process(token7, htmlTreeBuilderState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.processStartTag("", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.Comment comment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = strList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.processStartTag("hi!", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.Character character12 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.aboveOnStack(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.Token.Character character6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.insertForm(startTag8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isInActiveFormattingElements(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement15 = htmlTreeBuilder0.insertForm(startTag13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.onStack(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token token4 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.process(token4, htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.Comment comment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.removeFromStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertEmpty(startTag11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        java.lang.Class<?> wildcardClass12 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        org.jsoup.parser.Token token8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.process(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.insertForm(startTag10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = htmlTreeBuilder0.insertEmpty(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.insertForm(startTag8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement15 = htmlTreeBuilder0.insertForm(startTag13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertEmpty(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.insertForm(startTag5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.removeFromStack(element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!", "" });
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertEmpty(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.onStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isSpecial(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder17.setHeadElement(element21);
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder0.parseFragment("", element14, "hi!", parseErrorList16, parseSettings23);
        org.jsoup.nodes.Element element25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.isSpecial(element25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        java.lang.Class<?> wildcardClass8 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token token10 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process(token10, htmlTreeBuilderState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.processStartTag("hi!", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.Token token6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.process(token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isSpecial(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilder0.removeFromStack(element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.Comment comment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.removeFromStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inScope("hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.onStack(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element15, element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder13.getHeadElement();
        boolean boolean18 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder19.setHeadElement(element23);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        htmlTreeBuilder19.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder13.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.removeFromStack(element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.isInActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.Character character5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.isInActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.StartTag startTag10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.insertForm(startTag10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.generateImpliedEndTags();
        boolean boolean15 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder10.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader7, "hi!", parseErrorList9, parseSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder0.insertForm(startTag12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertEmpty(startTag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder13.getHeadElement();
        boolean boolean18 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder19.setHeadElement(element23);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        htmlTreeBuilder19.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder13.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        org.jsoup.nodes.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token token9 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.process(token9, htmlTreeBuilderState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.aboveOnStack(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insert(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = htmlTreeBuilderState3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean8 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.inScope("", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "", "" });
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.aboveOnStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        java.io.Reader reader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder11.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder11.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList18 = htmlTreeBuilder11.getStack();
        htmlTreeBuilder11.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder11.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader8, "", parseErrorList10, parseSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNotNull(parseSettings20);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.Class<?> wildcardClass21 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        java.lang.Class<?> wildcardClass20 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inScope(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = element10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        org.jsoup.parser.Token.StartTag startTag15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.insert(startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.aboveOnStack(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        boolean boolean12 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token token12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process(token12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope("hi!", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insert(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        java.lang.Class<?> wildcardClass8 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.framesetOk(false);
        boolean boolean12 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder6.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder15.setHeadElement(element16);
        boolean boolean18 = htmlTreeBuilder15.isFragmentParsing();
        htmlTreeBuilder15.framesetOk(false);
        boolean boolean21 = htmlTreeBuilder15.isFosterInserts();
        org.jsoup.nodes.Document document22 = htmlTreeBuilder15.getDocument();
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder27.setHeadElement(element28);
        boolean boolean30 = htmlTreeBuilder27.isFragmentParsing();
        org.jsoup.nodes.Element element31 = null;
        htmlTreeBuilder27.setHeadElement(element31);
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder27.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList34 = htmlTreeBuilder27.getStack();
        htmlTreeBuilder27.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings36 = htmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder15.parseFragment("hi!", element24, "", parseErrorList26, parseSettings36);
        org.jsoup.nodes.Document document38 = htmlTreeBuilder15.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element42 = null;
        htmlTreeBuilder41.setHeadElement(element42);
        boolean boolean44 = htmlTreeBuilder41.isFragmentParsing();
        org.jsoup.nodes.Element element45 = null;
        htmlTreeBuilder41.setHeadElement(element45);
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder41.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList48 = htmlTreeBuilder41.getStack();
        htmlTreeBuilder41.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings50 = htmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = htmlTreeBuilder6.parseFragment("", (org.jsoup.nodes.Element) document38, "hi!", parseErrorList40, parseSettings50);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        htmlTreeBuilder52.framesetOk(false);
        boolean boolean58 = htmlTreeBuilder52.isFosterInserts();
        org.jsoup.nodes.Document document59 = htmlTreeBuilder52.getDocument();
        org.jsoup.nodes.Element element61 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder64 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element65 = null;
        htmlTreeBuilder64.setHeadElement(element65);
        boolean boolean67 = htmlTreeBuilder64.isFragmentParsing();
        org.jsoup.nodes.Element element68 = null;
        htmlTreeBuilder64.setHeadElement(element68);
        org.jsoup.parser.ParseSettings parseSettings70 = htmlTreeBuilder64.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList71 = htmlTreeBuilder64.getStack();
        htmlTreeBuilder64.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings73 = htmlTreeBuilder64.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = htmlTreeBuilder52.parseFragment("hi!", element61, "", parseErrorList63, parseSettings73);
        org.jsoup.nodes.Document document75 = htmlTreeBuilder52.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document38, (org.jsoup.nodes.Element) document75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNull(elementList34);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNull(elementList48);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(document59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNull(elementList71);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(document75);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        java.lang.Class<?> wildcardClass7 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder4.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.framesetOk(false);
        boolean boolean10 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder4.getDocument();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder16.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder16.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList23 = htmlTreeBuilder16.getStack();
        htmlTreeBuilder16.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = htmlTreeBuilder4.parseFragment("hi!", element13, "", parseErrorList15, parseSettings25);
        org.jsoup.nodes.Document document27 = htmlTreeBuilder4.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNull(elementList23);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.framesetOk(false);
        boolean boolean22 = htmlTreeBuilder16.isFosterInserts();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder16.getDocument();
        org.jsoup.nodes.Element element25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder28.setHeadElement(element32);
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder28.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList35 = htmlTreeBuilder28.getStack();
        htmlTreeBuilder28.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = htmlTreeBuilder16.parseFragment("hi!", element25, "", parseErrorList27, parseSettings37);
        org.jsoup.nodes.Document document39 = htmlTreeBuilder16.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder42.setHeadElement(element43);
        boolean boolean45 = htmlTreeBuilder42.isFragmentParsing();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder42.setHeadElement(element46);
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder42.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList49 = htmlTreeBuilder42.getStack();
        htmlTreeBuilder42.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings51 = htmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = htmlTreeBuilder7.parseFragment("", (org.jsoup.nodes.Element) document39, "hi!", parseErrorList41, parseSettings51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element53 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNull(elementList35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNull(elementList49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder8.setHeadElement(element9);
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.framesetOk(false);
        boolean boolean14 = htmlTreeBuilder8.isFosterInserts();
        org.jsoup.nodes.Document document15 = htmlTreeBuilder8.getDocument();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder20.setHeadElement(element24);
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder20.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList27 = htmlTreeBuilder20.getStack();
        htmlTreeBuilder20.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings29 = htmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = htmlTreeBuilder8.parseFragment("hi!", element17, "", parseErrorList19, parseSettings29);
        org.jsoup.nodes.Document document31 = htmlTreeBuilder8.getDocument();
        org.jsoup.nodes.Element element32 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document31, element32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(elementList27);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder23.setHeadElement(element24);
        boolean boolean26 = htmlTreeBuilder23.isFragmentParsing();
        htmlTreeBuilder23.framesetOk(false);
        boolean boolean29 = htmlTreeBuilder23.isFosterInserts();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder23.getDocument();
        org.jsoup.nodes.Element element32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder35.setHeadElement(element39);
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder35.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList42 = htmlTreeBuilder35.getStack();
        htmlTreeBuilder35.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings44 = htmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = htmlTreeBuilder23.parseFragment("hi!", element32, "", parseErrorList34, parseSettings44);
        org.jsoup.nodes.Document document46 = htmlTreeBuilder23.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = htmlTreeBuilder47.getStack();
        htmlTreeBuilder47.markInsertionMode();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder47.setHeadElement(element56);
        org.jsoup.nodes.Element element58 = htmlTreeBuilder47.getHeadElement();
        org.jsoup.nodes.FormElement formElement59 = htmlTreeBuilder47.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder61 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element62 = null;
        htmlTreeBuilder61.setHeadElement(element62);
        boolean boolean64 = htmlTreeBuilder61.isFragmentParsing();
        htmlTreeBuilder61.framesetOk(false);
        boolean boolean67 = htmlTreeBuilder61.isFosterInserts();
        org.jsoup.nodes.Document document68 = htmlTreeBuilder61.getDocument();
        org.jsoup.nodes.Element element70 = null;
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder73 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element74 = null;
        htmlTreeBuilder73.setHeadElement(element74);
        boolean boolean76 = htmlTreeBuilder73.isFragmentParsing();
        org.jsoup.nodes.Element element77 = null;
        htmlTreeBuilder73.setHeadElement(element77);
        org.jsoup.parser.ParseSettings parseSettings79 = htmlTreeBuilder73.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList80 = htmlTreeBuilder73.getStack();
        htmlTreeBuilder73.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings82 = htmlTreeBuilder73.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = htmlTreeBuilder61.parseFragment("hi!", element70, "", parseErrorList72, parseSettings82);
        org.jsoup.nodes.Document document84 = htmlTreeBuilder61.getDocument();
        htmlTreeBuilder47.maybeSetBaseUri((org.jsoup.nodes.Element) document84);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document46, (org.jsoup.nodes.Element) document84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNull(elementList42);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNull(elementList54);
        org.junit.Assert.assertNull(element58);
        org.junit.Assert.assertNull(formElement59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(document68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNull(elementList80);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(document84);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Character character12 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        htmlTreeBuilder12.framesetOk(false);
        boolean boolean18 = htmlTreeBuilder12.isFosterInserts();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder12.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.framesetOk(false);
        boolean boolean27 = htmlTreeBuilder21.isFosterInserts();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder21.getDocument();
        org.jsoup.nodes.Element element30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder33.setHeadElement(element34);
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder33.setHeadElement(element37);
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder33.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList40 = htmlTreeBuilder33.getStack();
        htmlTreeBuilder33.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings42 = htmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = htmlTreeBuilder21.parseFragment("hi!", element30, "", parseErrorList32, parseSettings42);
        org.jsoup.nodes.Document document44 = htmlTreeBuilder21.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = htmlTreeBuilder47.getStack();
        htmlTreeBuilder47.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder12.parseFragment("", (org.jsoup.nodes.Element) document44, "hi!", parseErrorList46, parseSettings56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element58 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNull(elementList40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNull(elementList54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.Character character6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder11.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder11.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList18 = htmlTreeBuilder11.getStack();
        htmlTreeBuilder11.markInsertionMode();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder11.setHeadElement(element20);
        org.jsoup.nodes.Element element22 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.nodes.FormElement formElement23 = htmlTreeBuilder11.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        htmlTreeBuilder25.framesetOk(false);
        boolean boolean31 = htmlTreeBuilder25.isFosterInserts();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder25.getDocument();
        org.jsoup.nodes.Element element34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element38 = null;
        htmlTreeBuilder37.setHeadElement(element38);
        boolean boolean40 = htmlTreeBuilder37.isFragmentParsing();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder37.setHeadElement(element41);
        org.jsoup.parser.ParseSettings parseSettings43 = htmlTreeBuilder37.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList44 = htmlTreeBuilder37.getStack();
        htmlTreeBuilder37.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = htmlTreeBuilder25.parseFragment("hi!", element34, "", parseErrorList36, parseSettings46);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder25.getDocument();
        htmlTreeBuilder11.maybeSetBaseUri((org.jsoup.nodes.Element) document48);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder50.setHeadElement(element51);
        boolean boolean53 = htmlTreeBuilder50.isFragmentParsing();
        htmlTreeBuilder50.framesetOk(false);
        boolean boolean56 = htmlTreeBuilder50.isFosterInserts();
        org.jsoup.nodes.Document document57 = htmlTreeBuilder50.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder59.setHeadElement(element60);
        boolean boolean62 = htmlTreeBuilder59.isFragmentParsing();
        htmlTreeBuilder59.framesetOk(false);
        boolean boolean65 = htmlTreeBuilder59.isFosterInserts();
        org.jsoup.nodes.Document document66 = htmlTreeBuilder59.getDocument();
        org.jsoup.nodes.Element element68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element72 = null;
        htmlTreeBuilder71.setHeadElement(element72);
        boolean boolean74 = htmlTreeBuilder71.isFragmentParsing();
        org.jsoup.nodes.Element element75 = null;
        htmlTreeBuilder71.setHeadElement(element75);
        org.jsoup.parser.ParseSettings parseSettings77 = htmlTreeBuilder71.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList78 = htmlTreeBuilder71.getStack();
        htmlTreeBuilder71.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings80 = htmlTreeBuilder71.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = htmlTreeBuilder59.parseFragment("hi!", element68, "", parseErrorList70, parseSettings80);
        org.jsoup.nodes.Document document82 = htmlTreeBuilder59.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder85 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element86 = null;
        htmlTreeBuilder85.setHeadElement(element86);
        boolean boolean88 = htmlTreeBuilder85.isFragmentParsing();
        org.jsoup.nodes.Element element89 = null;
        htmlTreeBuilder85.setHeadElement(element89);
        org.jsoup.parser.ParseSettings parseSettings91 = htmlTreeBuilder85.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList92 = htmlTreeBuilder85.getStack();
        htmlTreeBuilder85.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings94 = htmlTreeBuilder85.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList95 = htmlTreeBuilder50.parseFragment("", (org.jsoup.nodes.Element) document82, "hi!", parseErrorList84, parseSettings94);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document48, (org.jsoup.nodes.Element) document82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(formElement23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNull(elementList44);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(document57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(document66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNull(elementList78);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(document82);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNull(elementList92);
        org.junit.Assert.assertNotNull(parseSettings94);
        org.junit.Assert.assertNotNull(nodeList95);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.framesetOk(false);
        boolean boolean22 = htmlTreeBuilder16.isFosterInserts();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder16.getDocument();
        org.jsoup.nodes.Element element25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder28.setHeadElement(element32);
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder28.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList35 = htmlTreeBuilder28.getStack();
        htmlTreeBuilder28.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = htmlTreeBuilder16.parseFragment("hi!", element25, "", parseErrorList27, parseSettings37);
        org.jsoup.nodes.Document document39 = htmlTreeBuilder16.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder42.setHeadElement(element43);
        boolean boolean45 = htmlTreeBuilder42.isFragmentParsing();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder42.setHeadElement(element46);
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder42.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList49 = htmlTreeBuilder42.getStack();
        htmlTreeBuilder42.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings51 = htmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = htmlTreeBuilder7.parseFragment("", (org.jsoup.nodes.Element) document39, "hi!", parseErrorList41, parseSettings51);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNull(elementList35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNull(elementList49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder8.setHeadElement(element9);
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.framesetOk(false);
        boolean boolean14 = htmlTreeBuilder8.isFosterInserts();
        org.jsoup.nodes.Document document15 = htmlTreeBuilder8.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        htmlTreeBuilder17.framesetOk(false);
        boolean boolean23 = htmlTreeBuilder17.isFosterInserts();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder17.getDocument();
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList36 = htmlTreeBuilder29.getStack();
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder17.parseFragment("hi!", element26, "", parseErrorList28, parseSettings38);
        org.jsoup.nodes.Document document40 = htmlTreeBuilder17.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder43.setHeadElement(element44);
        boolean boolean46 = htmlTreeBuilder43.isFragmentParsing();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder43.setHeadElement(element47);
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder43.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList50 = htmlTreeBuilder43.getStack();
        htmlTreeBuilder43.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings52 = htmlTreeBuilder43.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder8.parseFragment("", (org.jsoup.nodes.Element) document40, "hi!", parseErrorList42, parseSettings52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNull(elementList36);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNull(elementList50);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder10.transition(htmlTreeBuilderState11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder10.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.framesetOk(false);
        boolean boolean20 = htmlTreeBuilder14.isFosterInserts();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder14.getDocument();
        java.lang.String str22 = htmlTreeBuilder14.getBaseUri();
        boolean boolean23 = htmlTreeBuilder14.framesetOk();
        org.jsoup.nodes.Element element25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder28.setHeadElement(element32);
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder28.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList35 = htmlTreeBuilder28.getStack();
        htmlTreeBuilder28.markInsertionMode();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder28.setHeadElement(element37);
        org.jsoup.nodes.Element element39 = htmlTreeBuilder28.getHeadElement();
        org.jsoup.nodes.FormElement formElement40 = htmlTreeBuilder28.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = htmlTreeBuilder14.parseFragment("hi!", element25, "", parseErrorList27, parseSettings41);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder43.setHeadElement(element44);
        boolean boolean46 = htmlTreeBuilder43.isFragmentParsing();
        htmlTreeBuilder43.framesetOk(false);
        boolean boolean49 = htmlTreeBuilder43.isFosterInserts();
        org.jsoup.nodes.Document document50 = htmlTreeBuilder43.getDocument();
        org.jsoup.nodes.Element element52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder55 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder55.setHeadElement(element56);
        boolean boolean58 = htmlTreeBuilder55.isFragmentParsing();
        org.jsoup.nodes.Element element59 = null;
        htmlTreeBuilder55.setHeadElement(element59);
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder55.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList62 = htmlTreeBuilder55.getStack();
        htmlTreeBuilder55.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings64 = htmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = htmlTreeBuilder43.parseFragment("hi!", element52, "", parseErrorList54, parseSettings64);
        org.jsoup.nodes.Document document66 = htmlTreeBuilder43.getDocument();
        htmlTreeBuilder14.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document66);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document66);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNull(elementList35);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertNull(formElement40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNull(elementList62);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document66);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.processStartTag("", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.framesetOk(false);
        boolean boolean12 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder6.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder15.setHeadElement(element16);
        boolean boolean18 = htmlTreeBuilder15.isFragmentParsing();
        htmlTreeBuilder15.framesetOk(false);
        boolean boolean21 = htmlTreeBuilder15.isFosterInserts();
        org.jsoup.nodes.Document document22 = htmlTreeBuilder15.getDocument();
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder27.setHeadElement(element28);
        boolean boolean30 = htmlTreeBuilder27.isFragmentParsing();
        org.jsoup.nodes.Element element31 = null;
        htmlTreeBuilder27.setHeadElement(element31);
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder27.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList34 = htmlTreeBuilder27.getStack();
        htmlTreeBuilder27.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings36 = htmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder15.parseFragment("hi!", element24, "", parseErrorList26, parseSettings36);
        org.jsoup.nodes.Document document38 = htmlTreeBuilder15.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element42 = null;
        htmlTreeBuilder41.setHeadElement(element42);
        boolean boolean44 = htmlTreeBuilder41.isFragmentParsing();
        org.jsoup.nodes.Element element45 = null;
        htmlTreeBuilder41.setHeadElement(element45);
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder41.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList48 = htmlTreeBuilder41.getStack();
        htmlTreeBuilder41.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings50 = htmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = htmlTreeBuilder6.parseFragment("", (org.jsoup.nodes.Element) document38, "hi!", parseErrorList40, parseSettings50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNull(elementList34);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNull(elementList48);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder12.setHeadElement(element16);
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder12.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList19 = htmlTreeBuilder12.getStack();
        htmlTreeBuilder12.markInsertionMode();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder12.setHeadElement(element21);
        org.jsoup.nodes.Element element23 = htmlTreeBuilder12.getHeadElement();
        org.jsoup.nodes.FormElement formElement24 = htmlTreeBuilder12.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        htmlTreeBuilder26.framesetOk(false);
        boolean boolean32 = htmlTreeBuilder26.isFosterInserts();
        org.jsoup.nodes.Document document33 = htmlTreeBuilder26.getDocument();
        org.jsoup.nodes.Element element35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder38.setHeadElement(element39);
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        org.jsoup.nodes.Element element42 = null;
        htmlTreeBuilder38.setHeadElement(element42);
        org.jsoup.parser.ParseSettings parseSettings44 = htmlTreeBuilder38.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList45 = htmlTreeBuilder38.getStack();
        htmlTreeBuilder38.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = htmlTreeBuilder26.parseFragment("hi!", element35, "", parseErrorList37, parseSettings47);
        org.jsoup.nodes.Document document49 = htmlTreeBuilder26.getDocument();
        htmlTreeBuilder12.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNull(elementList19);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNull(formElement24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNull(elementList45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(document49);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token token11 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process(token11, htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertEmpty(startTag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder7.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder7.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        htmlTreeBuilder11.framesetOk(false);
        boolean boolean17 = htmlTreeBuilder11.isFosterInserts();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder11.getDocument();
        java.lang.String str19 = htmlTreeBuilder11.getBaseUri();
        boolean boolean20 = htmlTreeBuilder11.framesetOk();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder25.setHeadElement(element29);
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder25.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList32 = htmlTreeBuilder25.getStack();
        htmlTreeBuilder25.markInsertionMode();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder25.setHeadElement(element34);
        org.jsoup.nodes.Element element36 = htmlTreeBuilder25.getHeadElement();
        org.jsoup.nodes.FormElement formElement37 = htmlTreeBuilder25.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder11.parseFragment("hi!", element22, "", parseErrorList24, parseSettings38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        htmlTreeBuilder40.framesetOk(false);
        boolean boolean46 = htmlTreeBuilder40.isFosterInserts();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder52.getStack();
        htmlTreeBuilder52.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = htmlTreeBuilder40.parseFragment("hi!", element49, "", parseErrorList51, parseSettings61);
        org.jsoup.nodes.Document document63 = htmlTreeBuilder40.getDocument();
        htmlTreeBuilder11.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element66 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNull(elementList32);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNull(formElement37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNull(elementList59);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        java.lang.String str15 = htmlTreeBuilder7.getBaseUri();
        boolean boolean16 = htmlTreeBuilder7.framesetOk();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder21.setHeadElement(element30);
        org.jsoup.nodes.Element element32 = htmlTreeBuilder21.getHeadElement();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder21.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = htmlTreeBuilder7.parseFragment("hi!", element18, "", parseErrorList20, parseSettings34);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder36.setHeadElement(element37);
        boolean boolean39 = htmlTreeBuilder36.isFragmentParsing();
        htmlTreeBuilder36.framesetOk(false);
        boolean boolean42 = htmlTreeBuilder36.isFosterInserts();
        org.jsoup.nodes.Document document43 = htmlTreeBuilder36.getDocument();
        org.jsoup.nodes.Element element45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element49 = null;
        htmlTreeBuilder48.setHeadElement(element49);
        boolean boolean51 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.nodes.Element element52 = null;
        htmlTreeBuilder48.setHeadElement(element52);
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder48.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList55 = htmlTreeBuilder48.getStack();
        htmlTreeBuilder48.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings57 = htmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = htmlTreeBuilder36.parseFragment("hi!", element45, "", parseErrorList47, parseSettings57);
        org.jsoup.nodes.Document document59 = htmlTreeBuilder36.getDocument();
        htmlTreeBuilder7.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document59);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNull(elementList55);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document59);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.framesetOk(false);
        boolean boolean12 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder6.getDocument();
        java.lang.String str14 = htmlTreeBuilder6.getBaseUri();
        boolean boolean15 = htmlTreeBuilder6.framesetOk();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder20.setHeadElement(element24);
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder20.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList27 = htmlTreeBuilder20.getStack();
        htmlTreeBuilder20.markInsertionMode();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder20.setHeadElement(element29);
        org.jsoup.nodes.Element element31 = htmlTreeBuilder20.getHeadElement();
        org.jsoup.nodes.FormElement formElement32 = htmlTreeBuilder20.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder6.parseFragment("hi!", element17, "", parseErrorList19, parseSettings33);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.framesetOk(false);
        boolean boolean41 = htmlTreeBuilder35.isFosterInserts();
        org.jsoup.nodes.Document document42 = htmlTreeBuilder35.getDocument();
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = htmlTreeBuilder47.getStack();
        htmlTreeBuilder47.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder35.parseFragment("hi!", element44, "", parseErrorList46, parseSettings56);
        org.jsoup.nodes.Document document58 = htmlTreeBuilder35.getDocument();
        htmlTreeBuilder6.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document58);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(elementList27);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNull(formElement32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNull(elementList54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document58);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.framesetOk(false);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.Document document16 = htmlTreeBuilder9.getDocument();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder9.parseFragment("hi!", element18, "", parseErrorList20, parseSettings30);
        org.jsoup.nodes.Document document32 = htmlTreeBuilder9.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(elementList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document32);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.setFosterInserts(false);
        java.io.Reader reader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.framesetOk(false);
        boolean boolean22 = htmlTreeBuilder16.isFosterInserts();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder16.setFormElement(formElement23);
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList36 = htmlTreeBuilder29.getStack();
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder16.parseFragment("", element26, "hi!", parseErrorList28, parseSettings38);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader13, "", parseErrorList15, parseSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNull(elementList36);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.StartTag startTag10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.framesetOk(false);
        boolean boolean12 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder6.getDocument();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder18.setHeadElement(element22);
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder18.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList25 = htmlTreeBuilder18.getStack();
        htmlTreeBuilder18.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = htmlTreeBuilder6.parseFragment("hi!", element15, "", parseErrorList17, parseSettings27);
        org.jsoup.nodes.Document document29 = htmlTreeBuilder6.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNull(elementList25);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertEmpty(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        boolean boolean22 = htmlTreeBuilder19.isFragmentParsing();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder19.setHeadElement(element23);
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder19.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = htmlTreeBuilder19.getStack();
        htmlTreeBuilder19.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings28 = htmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = htmlTreeBuilder7.parseFragment("hi!", element16, "", parseErrorList18, parseSettings28);
        org.jsoup.nodes.Document document30 = htmlTreeBuilder7.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNull(elementList26);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder13.setHeadElement(element17);
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder13.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList20 = htmlTreeBuilder13.getStack();
        htmlTreeBuilder13.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder0.parseFragment("", element10, "hi!", parseErrorList12, parseSettings22);
        org.jsoup.parser.Token token24 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.process(token24, htmlTreeBuilderState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(elementList20);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder8.setHeadElement(element9);
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.framesetOk(false);
        boolean boolean14 = htmlTreeBuilder8.isFosterInserts();
        org.jsoup.nodes.Document document15 = htmlTreeBuilder8.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        htmlTreeBuilder17.framesetOk(false);
        boolean boolean23 = htmlTreeBuilder17.isFosterInserts();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder17.getDocument();
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList36 = htmlTreeBuilder29.getStack();
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder17.parseFragment("hi!", element26, "", parseErrorList28, parseSettings38);
        org.jsoup.nodes.Document document40 = htmlTreeBuilder17.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder43.setHeadElement(element44);
        boolean boolean46 = htmlTreeBuilder43.isFragmentParsing();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder43.setHeadElement(element47);
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder43.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList50 = htmlTreeBuilder43.getStack();
        htmlTreeBuilder43.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings52 = htmlTreeBuilder43.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = htmlTreeBuilder8.parseFragment("", (org.jsoup.nodes.Element) document40, "hi!", parseErrorList42, parseSettings52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNull(elementList36);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNull(elementList50);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        java.io.Reader reader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder9.setHeadElement(element13);
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, "hi!", parseErrorList8, parseSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseSettings15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.insertForm(startTag7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = htmlTreeBuilder0.insertEmpty(startTag21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        boolean boolean13 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        boolean boolean20 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token token7 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.process(token7, htmlTreeBuilderState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        boolean boolean13 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.framesetOk(false);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.Document document16 = htmlTreeBuilder9.getDocument();
        java.lang.String str17 = htmlTreeBuilder9.getBaseUri();
        boolean boolean18 = htmlTreeBuilder9.framesetOk();
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder23.setHeadElement(element24);
        boolean boolean26 = htmlTreeBuilder23.isFragmentParsing();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder23.setHeadElement(element27);
        org.jsoup.parser.ParseSettings parseSettings29 = htmlTreeBuilder23.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList30 = htmlTreeBuilder23.getStack();
        htmlTreeBuilder23.markInsertionMode();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder23.setHeadElement(element32);
        org.jsoup.nodes.Element element34 = htmlTreeBuilder23.getHeadElement();
        org.jsoup.nodes.FormElement formElement35 = htmlTreeBuilder23.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings36 = htmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder9.parseFragment("hi!", element20, "", parseErrorList22, parseSettings36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder38.setHeadElement(element39);
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        htmlTreeBuilder38.framesetOk(false);
        boolean boolean44 = htmlTreeBuilder38.isFosterInserts();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder38.getDocument();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder50.setHeadElement(element51);
        boolean boolean53 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.nodes.Element element54 = null;
        htmlTreeBuilder50.setHeadElement(element54);
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder50.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList57 = htmlTreeBuilder50.getStack();
        htmlTreeBuilder50.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings59 = htmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder38.parseFragment("hi!", element47, "", parseErrorList49, parseSettings59);
        org.jsoup.nodes.Document document61 = htmlTreeBuilder38.getDocument();
        htmlTreeBuilder9.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNull(elementList30);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNull(formElement35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNull(elementList57);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document61);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token token8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.process(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder7.setHeadElement(element11);
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList14 = htmlTreeBuilder7.getStack();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder7.setHeadElement(element16);
        org.jsoup.nodes.Element element18 = htmlTreeBuilder7.getHeadElement();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder7.getPendingTableCharacters();
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder24.setHeadElement(element25);
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder24.setHeadElement(element28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder7.parseFragment("", element21, "hi!", parseErrorList23, parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder7.defaultSettings();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        boolean boolean36 = htmlTreeBuilder7.inScope("", strArray35);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNull(elementList14);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.inScope(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        org.jsoup.parser.Token.StartTag startTag12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder0.insertForm(startTag12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder0.setHeadElement(element11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder4.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.framesetOk(false);
        boolean boolean10 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder4.getDocument();
        java.lang.String str12 = htmlTreeBuilder4.getBaseUri();
        boolean boolean13 = htmlTreeBuilder4.framesetOk();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder18.setHeadElement(element22);
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder18.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList25 = htmlTreeBuilder18.getStack();
        htmlTreeBuilder18.markInsertionMode();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder18.setHeadElement(element27);
        org.jsoup.nodes.Element element29 = htmlTreeBuilder18.getHeadElement();
        org.jsoup.nodes.FormElement formElement30 = htmlTreeBuilder18.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = htmlTreeBuilder4.parseFragment("hi!", element15, "", parseErrorList17, parseSettings31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder33.setHeadElement(element34);
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        htmlTreeBuilder33.framesetOk(false);
        boolean boolean39 = htmlTreeBuilder33.isFosterInserts();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder33.getDocument();
        org.jsoup.nodes.Element element42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder45.setHeadElement(element46);
        boolean boolean48 = htmlTreeBuilder45.isFragmentParsing();
        org.jsoup.nodes.Element element49 = null;
        htmlTreeBuilder45.setHeadElement(element49);
        org.jsoup.parser.ParseSettings parseSettings51 = htmlTreeBuilder45.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList52 = htmlTreeBuilder45.getStack();
        htmlTreeBuilder45.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = htmlTreeBuilder33.parseFragment("hi!", element42, "", parseErrorList44, parseSettings54);
        org.jsoup.nodes.Document document56 = htmlTreeBuilder33.getDocument();
        htmlTreeBuilder4.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document56);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNull(elementList25);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(formElement30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNull(elementList52);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(document56);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        java.lang.String str15 = htmlTreeBuilder7.getBaseUri();
        boolean boolean16 = htmlTreeBuilder7.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = null;
        htmlTreeBuilder17.transition(htmlTreeBuilderState18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder17.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder21.setHeadElement(element30);
        org.jsoup.nodes.Element element32 = htmlTreeBuilder21.getHeadElement();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder21.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.framesetOk(false);
        boolean boolean41 = htmlTreeBuilder35.isFosterInserts();
        org.jsoup.nodes.Document document42 = htmlTreeBuilder35.getDocument();
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = htmlTreeBuilder47.getStack();
        htmlTreeBuilder47.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder35.parseFragment("hi!", element44, "", parseErrorList46, parseSettings56);
        org.jsoup.nodes.Document document58 = htmlTreeBuilder35.getDocument();
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document58);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNull(elementList54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document58);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.insertForm(startTag6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder20.setHeadElement(element24);
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder20.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList27 = htmlTreeBuilder20.getStack();
        htmlTreeBuilder20.markInsertionMode();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder20.setHeadElement(element29);
        org.jsoup.nodes.Element element31 = htmlTreeBuilder20.getHeadElement();
        org.jsoup.nodes.FormElement formElement32 = htmlTreeBuilder20.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder20.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder34.setHeadElement(element35);
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        htmlTreeBuilder34.framesetOk(false);
        boolean boolean40 = htmlTreeBuilder34.isFosterInserts();
        org.jsoup.nodes.Document document41 = htmlTreeBuilder34.getDocument();
        org.jsoup.nodes.Element element43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder46.setHeadElement(element47);
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        org.jsoup.nodes.Element element50 = null;
        htmlTreeBuilder46.setHeadElement(element50);
        org.jsoup.parser.ParseSettings parseSettings52 = htmlTreeBuilder46.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList53 = htmlTreeBuilder46.getStack();
        htmlTreeBuilder46.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings55 = htmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = htmlTreeBuilder34.parseFragment("hi!", element43, "", parseErrorList45, parseSettings55);
        org.jsoup.nodes.Document document57 = htmlTreeBuilder34.getDocument();
        htmlTreeBuilder20.maybeSetBaseUri((org.jsoup.nodes.Element) document57);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder59.setHeadElement(element60);
        boolean boolean62 = htmlTreeBuilder59.isFragmentParsing();
        htmlTreeBuilder59.framesetOk(false);
        boolean boolean65 = htmlTreeBuilder59.isFosterInserts();
        org.jsoup.nodes.Document document66 = htmlTreeBuilder59.getDocument();
        org.jsoup.nodes.Element element68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element72 = null;
        htmlTreeBuilder71.setHeadElement(element72);
        boolean boolean74 = htmlTreeBuilder71.isFragmentParsing();
        org.jsoup.nodes.Element element75 = null;
        htmlTreeBuilder71.setHeadElement(element75);
        org.jsoup.parser.ParseSettings parseSettings77 = htmlTreeBuilder71.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList78 = htmlTreeBuilder71.getStack();
        htmlTreeBuilder71.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings80 = htmlTreeBuilder71.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = htmlTreeBuilder59.parseFragment("hi!", element68, "", parseErrorList70, parseSettings80);
        org.jsoup.nodes.Document document82 = htmlTreeBuilder59.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document57, (org.jsoup.nodes.Element) document82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(elementList27);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNull(formElement32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNull(elementList53);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(document66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNull(elementList78);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(document82);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.framesetOk(false);
        boolean boolean20 = htmlTreeBuilder14.isFosterInserts();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder14.getDocument();
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder26.setHeadElement(element30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder26.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder26.getStack();
        htmlTreeBuilder26.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder14.parseFragment("hi!", element23, "", parseErrorList25, parseSettings35);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder14.getDocument();
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        java.lang.String[] strArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = htmlTreeBuilder0.inScope(strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(elementList33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document37);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token token9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.process(token9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        java.lang.Class<?> wildcardClass9 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean23 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = null;
        htmlTreeBuilder24.transition(htmlTreeBuilderState25);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder24.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder28.getDocument();
        java.lang.String str36 = htmlTreeBuilder28.getBaseUri();
        boolean boolean37 = htmlTreeBuilder28.framesetOk();
        org.jsoup.nodes.Element element39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder42.setHeadElement(element43);
        boolean boolean45 = htmlTreeBuilder42.isFragmentParsing();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder42.setHeadElement(element46);
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder42.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList49 = htmlTreeBuilder42.getStack();
        htmlTreeBuilder42.markInsertionMode();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder42.setHeadElement(element51);
        org.jsoup.nodes.Element element53 = htmlTreeBuilder42.getHeadElement();
        org.jsoup.nodes.FormElement formElement54 = htmlTreeBuilder42.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings55 = htmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = htmlTreeBuilder28.parseFragment("hi!", element39, "", parseErrorList41, parseSettings55);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder57 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element58 = null;
        htmlTreeBuilder57.setHeadElement(element58);
        boolean boolean60 = htmlTreeBuilder57.isFragmentParsing();
        htmlTreeBuilder57.framesetOk(false);
        boolean boolean63 = htmlTreeBuilder57.isFosterInserts();
        org.jsoup.nodes.Document document64 = htmlTreeBuilder57.getDocument();
        org.jsoup.nodes.Element element66 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder69 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element70 = null;
        htmlTreeBuilder69.setHeadElement(element70);
        boolean boolean72 = htmlTreeBuilder69.isFragmentParsing();
        org.jsoup.nodes.Element element73 = null;
        htmlTreeBuilder69.setHeadElement(element73);
        org.jsoup.parser.ParseSettings parseSettings75 = htmlTreeBuilder69.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList76 = htmlTreeBuilder69.getStack();
        htmlTreeBuilder69.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings78 = htmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = htmlTreeBuilder57.parseFragment("hi!", element66, "", parseErrorList68, parseSettings78);
        org.jsoup.nodes.Document document80 = htmlTreeBuilder57.getDocument();
        htmlTreeBuilder28.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document80);
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document80);
        boolean boolean83 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document80);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNull(elementList49);
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNull(formElement54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(document64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNull(elementList76);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        org.jsoup.nodes.Attributes attributes16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.processStartTag("hi!", attributes16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder13.setHeadElement(element17);
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder13.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList20 = htmlTreeBuilder13.getStack();
        htmlTreeBuilder13.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder0.parseFragment("", element10, "hi!", parseErrorList12, parseSettings22);
        org.jsoup.nodes.FormElement formElement24 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token token25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.process(token25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(elementList20);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(formElement24);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        java.lang.String str15 = htmlTreeBuilder7.getBaseUri();
        boolean boolean16 = htmlTreeBuilder7.framesetOk();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder21.setHeadElement(element30);
        org.jsoup.nodes.Element element32 = htmlTreeBuilder21.getHeadElement();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder21.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = htmlTreeBuilder7.parseFragment("hi!", element18, "", parseErrorList20, parseSettings34);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder36.setHeadElement(element37);
        boolean boolean39 = htmlTreeBuilder36.isFragmentParsing();
        htmlTreeBuilder36.framesetOk(false);
        boolean boolean42 = htmlTreeBuilder36.isFosterInserts();
        org.jsoup.nodes.Document document43 = htmlTreeBuilder36.getDocument();
        org.jsoup.nodes.Element element45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element49 = null;
        htmlTreeBuilder48.setHeadElement(element49);
        boolean boolean51 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.nodes.Element element52 = null;
        htmlTreeBuilder48.setHeadElement(element52);
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder48.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList55 = htmlTreeBuilder48.getStack();
        htmlTreeBuilder48.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings57 = htmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = htmlTreeBuilder36.parseFragment("hi!", element45, "", parseErrorList47, parseSettings57);
        org.jsoup.nodes.Document document59 = htmlTreeBuilder36.getDocument();
        htmlTreeBuilder7.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document59);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNull(elementList55);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document59);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder7.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder7.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        htmlTreeBuilder11.framesetOk(false);
        boolean boolean17 = htmlTreeBuilder11.isFosterInserts();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder11.getDocument();
        java.lang.String str19 = htmlTreeBuilder11.getBaseUri();
        boolean boolean20 = htmlTreeBuilder11.framesetOk();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder25.setHeadElement(element29);
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder25.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList32 = htmlTreeBuilder25.getStack();
        htmlTreeBuilder25.markInsertionMode();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder25.setHeadElement(element34);
        org.jsoup.nodes.Element element36 = htmlTreeBuilder25.getHeadElement();
        org.jsoup.nodes.FormElement formElement37 = htmlTreeBuilder25.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder11.parseFragment("hi!", element22, "", parseErrorList24, parseSettings38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        htmlTreeBuilder40.framesetOk(false);
        boolean boolean46 = htmlTreeBuilder40.isFosterInserts();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder52.getStack();
        htmlTreeBuilder52.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = htmlTreeBuilder40.parseFragment("hi!", element49, "", parseErrorList51, parseSettings61);
        org.jsoup.nodes.Document document63 = htmlTreeBuilder40.getDocument();
        htmlTreeBuilder11.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element66 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNull(elementList32);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNull(formElement37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNull(elementList59);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.io.Reader reader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.generateImpliedEndTags();
        boolean boolean15 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder10.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader7, "", parseErrorList9, parseSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.Token token6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.process(token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.nodes.Attributes attributes10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.processStartTag("", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token token20 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = htmlTreeBuilder0.process(token20, htmlTreeBuilderState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inScope("hi!", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder17.setHeadElement(element21);
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder0.parseFragment("", element14, "hi!", parseErrorList16, parseSettings23);
        java.lang.String str25 = htmlTreeBuilder0.toString();
        org.jsoup.parser.Token token26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = htmlTreeBuilder0.process(token26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder5.setHeadElement(element6);
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder5.setHeadElement(element9);
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList12 = htmlTreeBuilder5.getStack();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder5.setHeadElement(element14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder5.getHeadElement();
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder5.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        boolean boolean22 = htmlTreeBuilder19.isFragmentParsing();
        htmlTreeBuilder19.framesetOk(false);
        boolean boolean25 = htmlTreeBuilder19.isFosterInserts();
        org.jsoup.nodes.Document document26 = htmlTreeBuilder19.getDocument();
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder31.setHeadElement(element32);
        boolean boolean34 = htmlTreeBuilder31.isFragmentParsing();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder31.setHeadElement(element35);
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder31.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList38 = htmlTreeBuilder31.getStack();
        htmlTreeBuilder31.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings40 = htmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = htmlTreeBuilder19.parseFragment("hi!", element28, "", parseErrorList30, parseSettings40);
        org.jsoup.nodes.Document document42 = htmlTreeBuilder19.getDocument();
        htmlTreeBuilder5.maybeSetBaseUri((org.jsoup.nodes.Element) document42);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNull(elementList12);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(formElement17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(elementList38);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document42);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean11 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder10.transition(htmlTreeBuilderState11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder10.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder14.setHeadElement(element18);
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder14.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList21 = htmlTreeBuilder14.getStack();
        htmlTreeBuilder14.markInsertionMode();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder14.setHeadElement(element23);
        org.jsoup.nodes.Element element25 = htmlTreeBuilder14.getHeadElement();
        org.jsoup.nodes.FormElement formElement26 = htmlTreeBuilder14.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder28.getDocument();
        org.jsoup.nodes.Element element37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder40.setHeadElement(element44);
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder40.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList47 = htmlTreeBuilder40.getStack();
        htmlTreeBuilder40.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder28.parseFragment("hi!", element37, "", parseErrorList39, parseSettings49);
        org.jsoup.nodes.Document document51 = htmlTreeBuilder28.getDocument();
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document51);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNull(elementList21);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNull(formElement26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNull(elementList47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder5.setHeadElement(element6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder5.getHeadElement();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder5.getHeadElement();
        boolean boolean10 = htmlTreeBuilder5.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder5.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        htmlTreeBuilder12.framesetOk(false);
        boolean boolean18 = htmlTreeBuilder12.isFosterInserts();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder12.getDocument();
        java.lang.String str20 = htmlTreeBuilder12.getBaseUri();
        boolean boolean21 = htmlTreeBuilder12.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = null;
        htmlTreeBuilder22.transition(htmlTreeBuilderState23);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder22.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder26.setHeadElement(element30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder26.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder26.getStack();
        htmlTreeBuilder26.markInsertionMode();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder26.setHeadElement(element35);
        org.jsoup.nodes.Element element37 = htmlTreeBuilder26.getHeadElement();
        org.jsoup.nodes.FormElement formElement38 = htmlTreeBuilder26.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        htmlTreeBuilder40.framesetOk(false);
        boolean boolean46 = htmlTreeBuilder40.isFosterInserts();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder52.getStack();
        htmlTreeBuilder52.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = htmlTreeBuilder40.parseFragment("hi!", element49, "", parseErrorList51, parseSettings61);
        org.jsoup.nodes.Document document63 = htmlTreeBuilder40.getDocument();
        htmlTreeBuilder26.maybeSetBaseUri((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder22.setHeadElement((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder12.setHeadElement((org.jsoup.nodes.Element) document63);
        boolean boolean67 = htmlTreeBuilder5.isSpecial((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(elementList33);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNull(formElement38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNull(elementList59);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder4.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.framesetOk(false);
        boolean boolean10 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder4.setFormElement(formElement11);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder17.setHeadElement(element21);
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder17.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList24 = htmlTreeBuilder17.getStack();
        htmlTreeBuilder17.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = htmlTreeBuilder4.parseFragment("", element14, "hi!", parseErrorList16, parseSettings26);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder28.getDocument();
        org.jsoup.nodes.Element element37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder40.setHeadElement(element44);
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder40.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList47 = htmlTreeBuilder40.getStack();
        htmlTreeBuilder40.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder28.parseFragment("hi!", element37, "", parseErrorList39, parseSettings49);
        org.jsoup.nodes.Document document51 = htmlTreeBuilder28.getDocument();
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document51);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNull(elementList24);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNull(elementList47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.framesetOk(false);
        boolean boolean16 = htmlTreeBuilder10.isFosterInserts();
        org.jsoup.nodes.FormElement formElement17 = null;
        htmlTreeBuilder10.setFormElement(formElement17);
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder23.setHeadElement(element24);
        boolean boolean26 = htmlTreeBuilder23.isFragmentParsing();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder23.setHeadElement(element27);
        org.jsoup.parser.ParseSettings parseSettings29 = htmlTreeBuilder23.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList30 = htmlTreeBuilder23.getStack();
        htmlTreeBuilder23.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = htmlTreeBuilder10.parseFragment("", element20, "hi!", parseErrorList22, parseSettings32);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder34.setHeadElement(element35);
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        org.jsoup.nodes.Element element38 = null;
        htmlTreeBuilder34.setHeadElement(element38);
        org.jsoup.parser.ParseSettings parseSettings40 = htmlTreeBuilder34.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList41 = htmlTreeBuilder34.getStack();
        htmlTreeBuilder34.markInsertionMode();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder34.setHeadElement(element43);
        org.jsoup.nodes.Element element45 = htmlTreeBuilder34.getHeadElement();
        java.util.List<java.lang.String> strList46 = htmlTreeBuilder34.getPendingTableCharacters();
        org.jsoup.nodes.Element element48 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder51 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element52 = null;
        htmlTreeBuilder51.setHeadElement(element52);
        boolean boolean54 = htmlTreeBuilder51.isFragmentParsing();
        org.jsoup.nodes.Element element55 = null;
        htmlTreeBuilder51.setHeadElement(element55);
        org.jsoup.parser.ParseSettings parseSettings57 = htmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = htmlTreeBuilder34.parseFragment("", element48, "hi!", parseErrorList50, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = htmlTreeBuilder34.defaultSettings();
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        boolean boolean63 = htmlTreeBuilder34.inScope("", strArray62);
        boolean boolean64 = htmlTreeBuilder10.inScope(strArray62);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = htmlTreeBuilder0.inScope(strArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(elementList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNull(elementList30);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNull(elementList41);
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertNull(strList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder14.setHeadElement(element18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        htmlTreeBuilder14.setPendingTableCharacters((java.util.List<java.lang.String>) strList23);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList23);
        org.jsoup.parser.Token token27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = htmlTreeBuilder0.process(token27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.framesetOk(false);
        boolean boolean12 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder6.setFormElement(formElement13);
        org.jsoup.nodes.Element element16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        boolean boolean22 = htmlTreeBuilder19.isFragmentParsing();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder19.setHeadElement(element23);
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder19.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = htmlTreeBuilder19.getStack();
        htmlTreeBuilder19.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings28 = htmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = htmlTreeBuilder6.parseFragment("", element16, "hi!", parseErrorList18, parseSettings28);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        htmlTreeBuilder30.setHeadElement(element31);
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder30.setHeadElement(element34);
        org.jsoup.parser.ParseSettings parseSettings36 = htmlTreeBuilder30.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList37 = htmlTreeBuilder30.getStack();
        htmlTreeBuilder30.markInsertionMode();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder30.setHeadElement(element39);
        org.jsoup.nodes.Element element41 = htmlTreeBuilder30.getHeadElement();
        java.util.List<java.lang.String> strList42 = htmlTreeBuilder30.getPendingTableCharacters();
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = htmlTreeBuilder30.parseFragment("", element44, "hi!", parseErrorList46, parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = htmlTreeBuilder30.defaultSettings();
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        boolean boolean59 = htmlTreeBuilder30.inScope("", strArray58);
        boolean boolean60 = htmlTreeBuilder6.inScope(strArray58);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = htmlTreeBuilder0.inScope(strArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNull(elementList26);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNull(elementList37);
        org.junit.Assert.assertNull(element41);
        org.junit.Assert.assertNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.Character character8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.framesetOk(false);
        boolean boolean20 = htmlTreeBuilder14.isFosterInserts();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder14.getDocument();
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder26.setHeadElement(element30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder26.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder26.getStack();
        htmlTreeBuilder26.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder14.parseFragment("hi!", element23, "", parseErrorList25, parseSettings35);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder14.getDocument();
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element40 = null;
        htmlTreeBuilder39.setHeadElement(element40);
        boolean boolean42 = htmlTreeBuilder39.isFragmentParsing();
        htmlTreeBuilder39.framesetOk(false);
        boolean boolean45 = htmlTreeBuilder39.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder46.setHeadElement(element47);
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        htmlTreeBuilder46.framesetOk(false);
        boolean boolean52 = htmlTreeBuilder46.isFosterInserts();
        org.jsoup.nodes.FormElement formElement53 = null;
        htmlTreeBuilder46.setFormElement(formElement53);
        org.jsoup.nodes.Element element56 = null;
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder59.setHeadElement(element60);
        boolean boolean62 = htmlTreeBuilder59.isFragmentParsing();
        org.jsoup.nodes.Element element63 = null;
        htmlTreeBuilder59.setHeadElement(element63);
        org.jsoup.parser.ParseSettings parseSettings65 = htmlTreeBuilder59.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList66 = htmlTreeBuilder59.getStack();
        htmlTreeBuilder59.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings68 = htmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = htmlTreeBuilder46.parseFragment("", element56, "hi!", parseErrorList58, parseSettings68);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder70 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element71 = null;
        htmlTreeBuilder70.setHeadElement(element71);
        boolean boolean73 = htmlTreeBuilder70.isFragmentParsing();
        htmlTreeBuilder70.framesetOk(false);
        boolean boolean76 = htmlTreeBuilder70.isFosterInserts();
        org.jsoup.nodes.Document document77 = htmlTreeBuilder70.getDocument();
        org.jsoup.nodes.Element element79 = null;
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder82 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element83 = null;
        htmlTreeBuilder82.setHeadElement(element83);
        boolean boolean85 = htmlTreeBuilder82.isFragmentParsing();
        org.jsoup.nodes.Element element86 = null;
        htmlTreeBuilder82.setHeadElement(element86);
        org.jsoup.parser.ParseSettings parseSettings88 = htmlTreeBuilder82.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList89 = htmlTreeBuilder82.getStack();
        htmlTreeBuilder82.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings91 = htmlTreeBuilder82.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList92 = htmlTreeBuilder70.parseFragment("hi!", element79, "", parseErrorList81, parseSettings91);
        org.jsoup.nodes.Document document93 = htmlTreeBuilder70.getDocument();
        htmlTreeBuilder46.setHeadElement((org.jsoup.nodes.Element) document93);
        htmlTreeBuilder39.setHeadElement((org.jsoup.nodes.Element) document93);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(elementList33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNull(elementList66);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(document77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNull(elementList89);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(nodeList92);
        org.junit.Assert.assertNotNull(document93);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        htmlTreeBuilder11.framesetOk(false);
        boolean boolean17 = htmlTreeBuilder11.isFosterInserts();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder11.setFormElement(formElement18);
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder24.setHeadElement(element25);
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder24.setHeadElement(element28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList31 = htmlTreeBuilder24.getStack();
        htmlTreeBuilder24.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = htmlTreeBuilder11.parseFragment("", element21, "hi!", parseErrorList23, parseSettings33);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder35.setHeadElement(element39);
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder35.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList42 = htmlTreeBuilder35.getStack();
        htmlTreeBuilder35.markInsertionMode();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder35.setHeadElement(element44);
        org.jsoup.nodes.Element element46 = htmlTreeBuilder35.getHeadElement();
        java.util.List<java.lang.String> strList47 = htmlTreeBuilder35.getPendingTableCharacters();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = htmlTreeBuilder35.parseFragment("", element49, "hi!", parseErrorList51, parseSettings58);
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder35.defaultSettings();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        boolean boolean64 = htmlTreeBuilder35.inScope("", strArray63);
        boolean boolean65 = htmlTreeBuilder11.inScope(strArray63);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = htmlTreeBuilder0.inScope("hi!", strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNull(elementList31);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNull(elementList42);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertEmpty(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.processStartTag("hi!", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder13.setHeadElement(element17);
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder13.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList20 = htmlTreeBuilder13.getStack();
        htmlTreeBuilder13.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder0.parseFragment("", element10, "hi!", parseErrorList12, parseSettings22);
        org.jsoup.nodes.FormElement formElement24 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Attributes attributes26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = htmlTreeBuilder0.processStartTag("", attributes26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(elementList20);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(formElement24);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder5.setHeadElement(element6);
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        htmlTreeBuilder5.framesetOk(false);
        boolean boolean11 = htmlTreeBuilder5.isFosterInserts();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder5.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.framesetOk(false);
        boolean boolean20 = htmlTreeBuilder14.isFosterInserts();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder14.getDocument();
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder26.setHeadElement(element30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder26.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder26.getStack();
        htmlTreeBuilder26.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder14.parseFragment("hi!", element23, "", parseErrorList25, parseSettings35);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder14.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder40.setHeadElement(element44);
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder40.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList47 = htmlTreeBuilder40.getStack();
        htmlTreeBuilder40.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder5.parseFragment("", (org.jsoup.nodes.Element) document37, "hi!", parseErrorList39, parseSettings49);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(elementList33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNull(elementList47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.framesetOk(false);
        boolean boolean20 = htmlTreeBuilder14.isFosterInserts();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder14.getDocument();
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder26.setHeadElement(element30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder26.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder26.getStack();
        htmlTreeBuilder26.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder14.parseFragment("hi!", element23, "", parseErrorList25, parseSettings35);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder14.getDocument();
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        java.lang.Class<?> wildcardClass39 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNull(elementList33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.insertForm(startTag8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        boolean boolean12 = htmlTreeBuilder0.isFosterInserts();
        java.io.Reader reader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder16.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder16.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList23 = htmlTreeBuilder16.getStack();
        htmlTreeBuilder16.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder16.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader13, "", parseErrorList15, parseSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNull(elementList23);
        org.junit.Assert.assertNotNull(parseSettings25);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token token9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.process(token9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(elementList8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.insertForm(startTag2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        boolean boolean20 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        org.jsoup.nodes.Element element24 = htmlTreeBuilder21.getHeadElement();
        org.jsoup.nodes.Element element25 = htmlTreeBuilder21.getHeadElement();
        boolean boolean26 = htmlTreeBuilder21.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder21.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder28.getDocument();
        java.lang.String str36 = htmlTreeBuilder28.getBaseUri();
        boolean boolean37 = htmlTreeBuilder28.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState39 = null;
        htmlTreeBuilder38.transition(htmlTreeBuilderState39);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder38.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder42.setHeadElement(element43);
        boolean boolean45 = htmlTreeBuilder42.isFragmentParsing();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder42.setHeadElement(element46);
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder42.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList49 = htmlTreeBuilder42.getStack();
        htmlTreeBuilder42.markInsertionMode();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder42.setHeadElement(element51);
        org.jsoup.nodes.Element element53 = htmlTreeBuilder42.getHeadElement();
        org.jsoup.nodes.FormElement formElement54 = htmlTreeBuilder42.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings55 = htmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder56 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element57 = null;
        htmlTreeBuilder56.setHeadElement(element57);
        boolean boolean59 = htmlTreeBuilder56.isFragmentParsing();
        htmlTreeBuilder56.framesetOk(false);
        boolean boolean62 = htmlTreeBuilder56.isFosterInserts();
        org.jsoup.nodes.Document document63 = htmlTreeBuilder56.getDocument();
        org.jsoup.nodes.Element element65 = null;
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder68 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element69 = null;
        htmlTreeBuilder68.setHeadElement(element69);
        boolean boolean71 = htmlTreeBuilder68.isFragmentParsing();
        org.jsoup.nodes.Element element72 = null;
        htmlTreeBuilder68.setHeadElement(element72);
        org.jsoup.parser.ParseSettings parseSettings74 = htmlTreeBuilder68.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList75 = htmlTreeBuilder68.getStack();
        htmlTreeBuilder68.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings77 = htmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = htmlTreeBuilder56.parseFragment("hi!", element65, "", parseErrorList67, parseSettings77);
        org.jsoup.nodes.Document document79 = htmlTreeBuilder56.getDocument();
        htmlTreeBuilder42.maybeSetBaseUri((org.jsoup.nodes.Element) document79);
        htmlTreeBuilder38.setHeadElement((org.jsoup.nodes.Element) document79);
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document79);
        boolean boolean83 = htmlTreeBuilder21.isSpecial((org.jsoup.nodes.Element) document79);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNull(elementList49);
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNull(formElement54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(document63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNull(elementList75);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder12.setHeadElement(element16);
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder12.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList19 = htmlTreeBuilder12.getStack();
        htmlTreeBuilder12.markInsertionMode();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder12.setHeadElement(element21);
        org.jsoup.nodes.Element element23 = htmlTreeBuilder12.getHeadElement();
        java.util.List<java.lang.String> strList24 = htmlTreeBuilder12.getPendingTableCharacters();
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder12.parseFragment("", element26, "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder12.defaultSettings();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        boolean boolean41 = htmlTreeBuilder12.inScope("", strArray40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = htmlTreeBuilder0.inScope(strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNull(elementList19);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.nodes.Element element15 = htmlTreeBuilder11.getHeadElement();
        boolean boolean16 = htmlTreeBuilder11.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.framesetOk(false);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder18.getDocument();
        java.lang.String str26 = htmlTreeBuilder18.getBaseUri();
        boolean boolean27 = htmlTreeBuilder18.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = null;
        htmlTreeBuilder28.transition(htmlTreeBuilderState29);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder28.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder32.setHeadElement(element33);
        boolean boolean35 = htmlTreeBuilder32.isFragmentParsing();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder32.setHeadElement(element36);
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder32.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = htmlTreeBuilder32.getStack();
        htmlTreeBuilder32.markInsertionMode();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder32.setHeadElement(element41);
        org.jsoup.nodes.Element element43 = htmlTreeBuilder32.getHeadElement();
        org.jsoup.nodes.FormElement formElement44 = htmlTreeBuilder32.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder46.setHeadElement(element47);
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        htmlTreeBuilder46.framesetOk(false);
        boolean boolean52 = htmlTreeBuilder46.isFosterInserts();
        org.jsoup.nodes.Document document53 = htmlTreeBuilder46.getDocument();
        org.jsoup.nodes.Element element55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder58 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element59 = null;
        htmlTreeBuilder58.setHeadElement(element59);
        boolean boolean61 = htmlTreeBuilder58.isFragmentParsing();
        org.jsoup.nodes.Element element62 = null;
        htmlTreeBuilder58.setHeadElement(element62);
        org.jsoup.parser.ParseSettings parseSettings64 = htmlTreeBuilder58.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList65 = htmlTreeBuilder58.getStack();
        htmlTreeBuilder58.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings67 = htmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = htmlTreeBuilder46.parseFragment("hi!", element55, "", parseErrorList57, parseSettings67);
        org.jsoup.nodes.Document document69 = htmlTreeBuilder46.getDocument();
        htmlTreeBuilder32.maybeSetBaseUri((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document69);
        boolean boolean73 = htmlTreeBuilder11.isSpecial((org.jsoup.nodes.Element) document69);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNull(elementList39);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNull(formElement44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNull(elementList65);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        htmlTreeBuilder20.framesetOk(false);
        boolean boolean26 = htmlTreeBuilder20.isFosterInserts();
        org.jsoup.nodes.Document document27 = htmlTreeBuilder20.getDocument();
        org.jsoup.nodes.Element element29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder32.setHeadElement(element33);
        boolean boolean35 = htmlTreeBuilder32.isFragmentParsing();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder32.setHeadElement(element36);
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder32.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = htmlTreeBuilder32.getStack();
        htmlTreeBuilder32.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder32.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = htmlTreeBuilder20.parseFragment("hi!", element29, "", parseErrorList31, parseSettings41);
        org.jsoup.nodes.Document document43 = htmlTreeBuilder20.getDocument();
        org.jsoup.nodes.Element element44 = htmlTreeBuilder20.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = htmlTreeBuilder0.aboveOnStack(element44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNull(elementList39);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        htmlTreeBuilder13.framesetOk(false);
        boolean boolean19 = htmlTreeBuilder13.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        htmlTreeBuilder20.framesetOk(false);
        boolean boolean26 = htmlTreeBuilder20.isFosterInserts();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder20.setFormElement(formElement27);
        org.jsoup.nodes.Element element30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder33.setHeadElement(element34);
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder33.setHeadElement(element37);
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder33.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList40 = htmlTreeBuilder33.getStack();
        htmlTreeBuilder33.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings42 = htmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = htmlTreeBuilder20.parseFragment("", element30, "hi!", parseErrorList32, parseSettings42);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element45 = null;
        htmlTreeBuilder44.setHeadElement(element45);
        boolean boolean47 = htmlTreeBuilder44.isFragmentParsing();
        htmlTreeBuilder44.framesetOk(false);
        boolean boolean50 = htmlTreeBuilder44.isFosterInserts();
        org.jsoup.nodes.Document document51 = htmlTreeBuilder44.getDocument();
        org.jsoup.nodes.Element element53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder56 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element57 = null;
        htmlTreeBuilder56.setHeadElement(element57);
        boolean boolean59 = htmlTreeBuilder56.isFragmentParsing();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder56.setHeadElement(element60);
        org.jsoup.parser.ParseSettings parseSettings62 = htmlTreeBuilder56.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList63 = htmlTreeBuilder56.getStack();
        htmlTreeBuilder56.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings65 = htmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList66 = htmlTreeBuilder44.parseFragment("hi!", element53, "", parseErrorList55, parseSettings65);
        org.jsoup.nodes.Document document67 = htmlTreeBuilder44.getDocument();
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document67);
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document67);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNull(elementList40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNull(elementList63);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(document67);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        java.io.Reader reader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder12.setHeadElement(element16);
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder12.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList19 = htmlTreeBuilder12.getStack();
        htmlTreeBuilder12.markInsertionMode();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder12.setHeadElement(element21);
        org.jsoup.nodes.Element element23 = htmlTreeBuilder12.getHeadElement();
        java.util.List<java.lang.String> strList24 = htmlTreeBuilder12.getPendingTableCharacters();
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = htmlTreeBuilder12.parseFragment("", element26, "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder12.defaultSettings();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        boolean boolean41 = htmlTreeBuilder12.inScope("", strArray40);
        org.jsoup.parser.ParseSettings parseSettings42 = htmlTreeBuilder12.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader9, "", parseErrorList11, parseSettings42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNull(elementList19);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(parseSettings42);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder4.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder4.setHeadElement(element8);
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder4.getStack();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder4.setHeadElement(element13);
        org.jsoup.nodes.Element element15 = htmlTreeBuilder4.getHeadElement();
        org.jsoup.nodes.FormElement formElement16 = htmlTreeBuilder4.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.framesetOk(false);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder18.getDocument();
        org.jsoup.nodes.Element element27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        htmlTreeBuilder30.setHeadElement(element31);
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder30.setHeadElement(element34);
        org.jsoup.parser.ParseSettings parseSettings36 = htmlTreeBuilder30.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList37 = htmlTreeBuilder30.getStack();
        htmlTreeBuilder30.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = htmlTreeBuilder18.parseFragment("hi!", element27, "", parseErrorList29, parseSettings39);
        org.jsoup.nodes.Document document41 = htmlTreeBuilder18.getDocument();
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document41);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document41);
        org.jsoup.parser.Token.StartTag startTag44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element45 = htmlTreeBuilder0.insert(startTag44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(elementList11);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNull(formElement16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNull(elementList37);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document41);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token token9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.process(token9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.nodes.FormElement formElement19 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.Comment comment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(formElement19);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        boolean boolean20 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.framesetOk(false);
        boolean boolean27 = htmlTreeBuilder21.isFosterInserts();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder21.getDocument();
        java.lang.String str29 = htmlTreeBuilder21.getBaseUri();
        boolean boolean30 = htmlTreeBuilder21.framesetOk();
        org.jsoup.nodes.Element element32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder35.setHeadElement(element39);
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder35.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList42 = htmlTreeBuilder35.getStack();
        htmlTreeBuilder35.markInsertionMode();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder35.setHeadElement(element44);
        org.jsoup.nodes.Element element46 = htmlTreeBuilder35.getHeadElement();
        org.jsoup.nodes.FormElement formElement47 = htmlTreeBuilder35.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = htmlTreeBuilder21.parseFragment("hi!", element32, "", parseErrorList34, parseSettings48);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder51 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element52 = null;
        htmlTreeBuilder51.setHeadElement(element52);
        boolean boolean54 = htmlTreeBuilder51.isFragmentParsing();
        org.jsoup.nodes.Element element55 = null;
        htmlTreeBuilder51.setHeadElement(element55);
        org.jsoup.parser.ParseSettings parseSettings57 = htmlTreeBuilder51.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList58 = htmlTreeBuilder51.getStack();
        htmlTreeBuilder51.markInsertionMode();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder51.setHeadElement(element60);
        org.jsoup.nodes.Element element62 = htmlTreeBuilder51.getHeadElement();
        java.util.List<java.lang.String> strList63 = htmlTreeBuilder51.getPendingTableCharacters();
        org.jsoup.nodes.Element element65 = null;
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder68 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element69 = null;
        htmlTreeBuilder68.setHeadElement(element69);
        boolean boolean71 = htmlTreeBuilder68.isFragmentParsing();
        org.jsoup.nodes.Element element72 = null;
        htmlTreeBuilder68.setHeadElement(element72);
        org.jsoup.parser.ParseSettings parseSettings74 = htmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList75 = htmlTreeBuilder51.parseFragment("", element65, "hi!", parseErrorList67, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings76 = htmlTreeBuilder51.defaultSettings();
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        boolean boolean80 = htmlTreeBuilder51.inScope("", strArray79);
        boolean boolean81 = htmlTreeBuilder21.inScope("hi!", strArray79);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = htmlTreeBuilder0.inScope(strArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNull(elementList42);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertNull(formElement47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNull(elementList58);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        boolean boolean13 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.StartTag startTag16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement18 = htmlTreeBuilder0.insertForm(startTag16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.framesetOk(false);
        boolean boolean13 = htmlTreeBuilder7.isFosterInserts();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder7.getDocument();
        java.lang.String str15 = htmlTreeBuilder7.getBaseUri();
        boolean boolean16 = htmlTreeBuilder7.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = null;
        htmlTreeBuilder17.transition(htmlTreeBuilderState18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder17.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder21.setHeadElement(element30);
        org.jsoup.nodes.Element element32 = htmlTreeBuilder21.getHeadElement();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder21.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.framesetOk(false);
        boolean boolean41 = htmlTreeBuilder35.isFosterInserts();
        org.jsoup.nodes.Document document42 = htmlTreeBuilder35.getDocument();
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element48 = null;
        htmlTreeBuilder47.setHeadElement(element48);
        boolean boolean50 = htmlTreeBuilder47.isFragmentParsing();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder47.setHeadElement(element51);
        org.jsoup.parser.ParseSettings parseSettings53 = htmlTreeBuilder47.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = htmlTreeBuilder47.getStack();
        htmlTreeBuilder47.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder35.parseFragment("hi!", element44, "", parseErrorList46, parseSettings56);
        org.jsoup.nodes.Document document58 = htmlTreeBuilder35.getDocument();
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document58);
        boolean boolean62 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Attributes attributes64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = htmlTreeBuilder0.processStartTag("hi!", attributes64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNull(elementList54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(elementList9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.framesetOk(false);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder9.setFormElement(formElement16);
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder22.setHeadElement(element23);
        boolean boolean25 = htmlTreeBuilder22.isFragmentParsing();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder22.setHeadElement(element26);
        org.jsoup.parser.ParseSettings parseSettings28 = htmlTreeBuilder22.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList29 = htmlTreeBuilder22.getStack();
        htmlTreeBuilder22.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = htmlTreeBuilder9.parseFragment("", element19, "hi!", parseErrorList21, parseSettings31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder33.setHeadElement(element34);
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.nodes.Element element37 = null;
        htmlTreeBuilder33.setHeadElement(element37);
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder33.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList40 = htmlTreeBuilder33.getStack();
        htmlTreeBuilder33.markInsertionMode();
        org.jsoup.nodes.Element element42 = null;
        htmlTreeBuilder33.setHeadElement(element42);
        org.jsoup.nodes.Element element44 = htmlTreeBuilder33.getHeadElement();
        java.util.List<java.lang.String> strList45 = htmlTreeBuilder33.getPendingTableCharacters();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder50.setHeadElement(element51);
        boolean boolean53 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.nodes.Element element54 = null;
        htmlTreeBuilder50.setHeadElement(element54);
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = htmlTreeBuilder33.parseFragment("", element47, "hi!", parseErrorList49, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder33.defaultSettings();
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        boolean boolean62 = htmlTreeBuilder33.inScope("", strArray61);
        boolean boolean63 = htmlTreeBuilder9.inScope(strArray61);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNull(elementList29);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNull(elementList40);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder11.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder11.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList18 = htmlTreeBuilder11.getStack();
        htmlTreeBuilder11.markInsertionMode();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder11.setHeadElement(element20);
        org.jsoup.nodes.Element element22 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.nodes.FormElement formElement23 = htmlTreeBuilder11.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        htmlTreeBuilder25.framesetOk(false);
        boolean boolean31 = htmlTreeBuilder25.isFosterInserts();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder25.getDocument();
        org.jsoup.nodes.Element element34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element38 = null;
        htmlTreeBuilder37.setHeadElement(element38);
        boolean boolean40 = htmlTreeBuilder37.isFragmentParsing();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder37.setHeadElement(element41);
        org.jsoup.parser.ParseSettings parseSettings43 = htmlTreeBuilder37.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList44 = htmlTreeBuilder37.getStack();
        htmlTreeBuilder37.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = htmlTreeBuilder25.parseFragment("hi!", element34, "", parseErrorList36, parseSettings46);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder25.getDocument();
        htmlTreeBuilder11.maybeSetBaseUri((org.jsoup.nodes.Element) document48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(formElement23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNull(elementList44);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document48);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder10.transition(htmlTreeBuilderState11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder10.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder14.setHeadElement(element18);
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder14.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList21 = htmlTreeBuilder14.getStack();
        htmlTreeBuilder14.markInsertionMode();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder14.setHeadElement(element23);
        org.jsoup.nodes.Element element25 = htmlTreeBuilder14.getHeadElement();
        org.jsoup.nodes.FormElement formElement26 = htmlTreeBuilder14.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder28.setHeadElement(element29);
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.framesetOk(false);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder28.getDocument();
        org.jsoup.nodes.Element element37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        org.jsoup.nodes.Element element44 = null;
        htmlTreeBuilder40.setHeadElement(element44);
        org.jsoup.parser.ParseSettings parseSettings46 = htmlTreeBuilder40.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList47 = htmlTreeBuilder40.getStack();
        htmlTreeBuilder40.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = htmlTreeBuilder28.parseFragment("hi!", element37, "", parseErrorList39, parseSettings49);
        org.jsoup.nodes.Document document51 = htmlTreeBuilder28.getDocument();
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document51);
        org.jsoup.parser.Token.StartTag startTag55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = htmlTreeBuilder0.insert(startTag55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNull(elementList21);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNull(formElement26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNull(elementList47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.framesetOk(false);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.framesetOk(false);
        boolean boolean22 = htmlTreeBuilder16.isFosterInserts();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder16.setFormElement(formElement23);
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element30 = null;
        htmlTreeBuilder29.setHeadElement(element30);
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder29.setHeadElement(element33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList36 = htmlTreeBuilder29.getStack();
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder16.parseFragment("", element26, "hi!", parseErrorList28, parseSettings38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder40.setHeadElement(element41);
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        htmlTreeBuilder40.framesetOk(false);
        boolean boolean46 = htmlTreeBuilder40.isFosterInserts();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder52.getStack();
        htmlTreeBuilder52.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = htmlTreeBuilder40.parseFragment("hi!", element49, "", parseErrorList51, parseSettings61);
        org.jsoup.nodes.Document document63 = htmlTreeBuilder40.getDocument();
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNull(elementList36);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNull(elementList59);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        org.jsoup.parser.Token.Character character15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder17.setHeadElement(element21);
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder0.parseFragment("", element14, "hi!", parseErrorList16, parseSettings23);
        java.lang.String str25 = htmlTreeBuilder0.toString();
        org.jsoup.parser.Token.StartTag startTag26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = htmlTreeBuilder0.insert(startTag26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element15 = null;
        htmlTreeBuilder14.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder14.isFragmentParsing();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder14.setHeadElement(element18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        htmlTreeBuilder14.setPendingTableCharacters((java.util.List<java.lang.String>) strList23);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder27.setHeadElement(element28);
        org.jsoup.nodes.Element element30 = htmlTreeBuilder27.getHeadElement();
        org.jsoup.nodes.Element element31 = htmlTreeBuilder27.getHeadElement();
        boolean boolean32 = htmlTreeBuilder27.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = htmlTreeBuilder27.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder34.setHeadElement(element35);
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        htmlTreeBuilder34.framesetOk(false);
        boolean boolean40 = htmlTreeBuilder34.isFosterInserts();
        org.jsoup.nodes.Document document41 = htmlTreeBuilder34.getDocument();
        java.lang.String str42 = htmlTreeBuilder34.getBaseUri();
        boolean boolean43 = htmlTreeBuilder34.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState45 = null;
        htmlTreeBuilder44.transition(htmlTreeBuilderState45);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = htmlTreeBuilder44.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element49 = null;
        htmlTreeBuilder48.setHeadElement(element49);
        boolean boolean51 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.nodes.Element element52 = null;
        htmlTreeBuilder48.setHeadElement(element52);
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder48.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList55 = htmlTreeBuilder48.getStack();
        htmlTreeBuilder48.markInsertionMode();
        org.jsoup.nodes.Element element57 = null;
        htmlTreeBuilder48.setHeadElement(element57);
        org.jsoup.nodes.Element element59 = htmlTreeBuilder48.getHeadElement();
        org.jsoup.nodes.FormElement formElement60 = htmlTreeBuilder48.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings61 = htmlTreeBuilder48.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder62 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element63 = null;
        htmlTreeBuilder62.setHeadElement(element63);
        boolean boolean65 = htmlTreeBuilder62.isFragmentParsing();
        htmlTreeBuilder62.framesetOk(false);
        boolean boolean68 = htmlTreeBuilder62.isFosterInserts();
        org.jsoup.nodes.Document document69 = htmlTreeBuilder62.getDocument();
        org.jsoup.nodes.Element element71 = null;
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element75 = null;
        htmlTreeBuilder74.setHeadElement(element75);
        boolean boolean77 = htmlTreeBuilder74.isFragmentParsing();
        org.jsoup.nodes.Element element78 = null;
        htmlTreeBuilder74.setHeadElement(element78);
        org.jsoup.parser.ParseSettings parseSettings80 = htmlTreeBuilder74.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList81 = htmlTreeBuilder74.getStack();
        htmlTreeBuilder74.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings83 = htmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList84 = htmlTreeBuilder62.parseFragment("hi!", element71, "", parseErrorList73, parseSettings83);
        org.jsoup.nodes.Document document85 = htmlTreeBuilder62.getDocument();
        htmlTreeBuilder48.maybeSetBaseUri((org.jsoup.nodes.Element) document85);
        htmlTreeBuilder44.setHeadElement((org.jsoup.nodes.Element) document85);
        htmlTreeBuilder34.setHeadElement((org.jsoup.nodes.Element) document85);
        boolean boolean89 = htmlTreeBuilder27.isSpecial((org.jsoup.nodes.Element) document85);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNull(elementList55);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNull(formElement60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(document69);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNull(elementList81);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.nodes.Element element15 = htmlTreeBuilder11.getHeadElement();
        boolean boolean16 = htmlTreeBuilder11.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.framesetOk(false);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder18.getDocument();
        java.lang.String str26 = htmlTreeBuilder18.getBaseUri();
        boolean boolean27 = htmlTreeBuilder18.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = null;
        htmlTreeBuilder28.transition(htmlTreeBuilderState29);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder28.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder32.setHeadElement(element33);
        boolean boolean35 = htmlTreeBuilder32.isFragmentParsing();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder32.setHeadElement(element36);
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder32.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = htmlTreeBuilder32.getStack();
        htmlTreeBuilder32.markInsertionMode();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder32.setHeadElement(element41);
        org.jsoup.nodes.Element element43 = htmlTreeBuilder32.getHeadElement();
        org.jsoup.nodes.FormElement formElement44 = htmlTreeBuilder32.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder46.setHeadElement(element47);
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        htmlTreeBuilder46.framesetOk(false);
        boolean boolean52 = htmlTreeBuilder46.isFosterInserts();
        org.jsoup.nodes.Document document53 = htmlTreeBuilder46.getDocument();
        org.jsoup.nodes.Element element55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder58 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element59 = null;
        htmlTreeBuilder58.setHeadElement(element59);
        boolean boolean61 = htmlTreeBuilder58.isFragmentParsing();
        org.jsoup.nodes.Element element62 = null;
        htmlTreeBuilder58.setHeadElement(element62);
        org.jsoup.parser.ParseSettings parseSettings64 = htmlTreeBuilder58.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList65 = htmlTreeBuilder58.getStack();
        htmlTreeBuilder58.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings67 = htmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = htmlTreeBuilder46.parseFragment("hi!", element55, "", parseErrorList57, parseSettings67);
        org.jsoup.nodes.Document document69 = htmlTreeBuilder46.getDocument();
        htmlTreeBuilder32.maybeSetBaseUri((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document69);
        boolean boolean73 = htmlTreeBuilder11.isSpecial((org.jsoup.nodes.Element) document69);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNull(elementList39);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNull(formElement44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNull(elementList65);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insertEmpty(startTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder9.setHeadElement(element10);
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.framesetOk(false);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.nodes.Document document16 = htmlTreeBuilder9.getDocument();
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder21.setHeadElement(element22);
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder21.setHeadElement(element25);
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder21.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder21.getStack();
        htmlTreeBuilder21.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder9.parseFragment("hi!", element18, "", parseErrorList20, parseSettings30);
        org.jsoup.nodes.Document document32 = htmlTreeBuilder9.getDocument();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder35.setHeadElement(element36);
        boolean boolean38 = htmlTreeBuilder35.isFragmentParsing();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder35.setHeadElement(element39);
        org.jsoup.parser.ParseSettings parseSettings41 = htmlTreeBuilder35.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList42 = htmlTreeBuilder35.getStack();
        htmlTreeBuilder35.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings44 = htmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = htmlTreeBuilder0.parseFragment("", (org.jsoup.nodes.Element) document32, "hi!", parseErrorList34, parseSettings44);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.Comment comment47 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNull(elementList42);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder0.setHeadElement(element11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        htmlTreeBuilder13.framesetOk(false);
        boolean boolean19 = htmlTreeBuilder13.isFosterInserts();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder25.setHeadElement(element29);
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder25.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList32 = htmlTreeBuilder25.getStack();
        htmlTreeBuilder25.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = htmlTreeBuilder13.parseFragment("hi!", element22, "", parseErrorList24, parseSettings34);
        org.jsoup.nodes.Document document36 = htmlTreeBuilder13.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNull(elementList32);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document36);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.getFromStack("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.Class<?> wildcardClass11 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        boolean boolean12 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder4.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.framesetOk(false);
        boolean boolean10 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder4.getDocument();
        java.lang.String str12 = htmlTreeBuilder4.getBaseUri();
        boolean boolean13 = htmlTreeBuilder4.framesetOk();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder18.setHeadElement(element22);
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder18.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList25 = htmlTreeBuilder18.getStack();
        htmlTreeBuilder18.markInsertionMode();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder18.setHeadElement(element27);
        org.jsoup.nodes.Element element29 = htmlTreeBuilder18.getHeadElement();
        org.jsoup.nodes.FormElement formElement30 = htmlTreeBuilder18.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = htmlTreeBuilder4.parseFragment("hi!", element15, "", parseErrorList17, parseSettings31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder33.setHeadElement(element34);
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        htmlTreeBuilder33.framesetOk(false);
        boolean boolean39 = htmlTreeBuilder33.isFosterInserts();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder33.getDocument();
        org.jsoup.nodes.Element element42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element46 = null;
        htmlTreeBuilder45.setHeadElement(element46);
        boolean boolean48 = htmlTreeBuilder45.isFragmentParsing();
        org.jsoup.nodes.Element element49 = null;
        htmlTreeBuilder45.setHeadElement(element49);
        org.jsoup.parser.ParseSettings parseSettings51 = htmlTreeBuilder45.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList52 = htmlTreeBuilder45.getStack();
        htmlTreeBuilder45.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = htmlTreeBuilder33.parseFragment("hi!", element42, "", parseErrorList44, parseSettings54);
        org.jsoup.nodes.Document document56 = htmlTreeBuilder33.getDocument();
        htmlTreeBuilder4.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document56);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element60 = null;
        htmlTreeBuilder59.setHeadElement(element60);
        boolean boolean62 = htmlTreeBuilder59.isFragmentParsing();
        org.jsoup.nodes.Element element63 = null;
        htmlTreeBuilder59.setHeadElement(element63);
        org.jsoup.parser.ParseSettings parseSettings65 = htmlTreeBuilder59.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList66 = htmlTreeBuilder59.getStack();
        htmlTreeBuilder59.markInsertionMode();
        org.jsoup.nodes.Element element68 = null;
        htmlTreeBuilder59.setHeadElement(element68);
        org.jsoup.nodes.Element element70 = htmlTreeBuilder59.getHeadElement();
        java.util.List<java.lang.String> strList71 = htmlTreeBuilder59.getPendingTableCharacters();
        org.jsoup.nodes.Element element73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder76 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element77 = null;
        htmlTreeBuilder76.setHeadElement(element77);
        boolean boolean79 = htmlTreeBuilder76.isFragmentParsing();
        org.jsoup.nodes.Element element80 = null;
        htmlTreeBuilder76.setHeadElement(element80);
        org.jsoup.parser.ParseSettings parseSettings82 = htmlTreeBuilder76.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = htmlTreeBuilder59.parseFragment("", element73, "hi!", parseErrorList75, parseSettings82);
        org.jsoup.parser.ParseSettings parseSettings84 = htmlTreeBuilder59.defaultSettings();
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        boolean boolean88 = htmlTreeBuilder59.inScope("", strArray87);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNull(elementList25);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(formElement30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNull(elementList52);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNull(elementList66);
        org.junit.Assert.assertNull(element70);
        org.junit.Assert.assertNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.framesetOk(false);
        boolean boolean16 = htmlTreeBuilder10.isFosterInserts();
        org.jsoup.nodes.Document document17 = htmlTreeBuilder10.getDocument();
        java.lang.String str18 = htmlTreeBuilder10.getBaseUri();
        boolean boolean19 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = null;
        htmlTreeBuilder20.transition(htmlTreeBuilderState21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder20.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder24.setHeadElement(element25);
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder24.setHeadElement(element28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList31 = htmlTreeBuilder24.getStack();
        htmlTreeBuilder24.markInsertionMode();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder24.setHeadElement(element33);
        org.jsoup.nodes.Element element35 = htmlTreeBuilder24.getHeadElement();
        org.jsoup.nodes.FormElement formElement36 = htmlTreeBuilder24.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder38.setHeadElement(element39);
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        htmlTreeBuilder38.framesetOk(false);
        boolean boolean44 = htmlTreeBuilder38.isFosterInserts();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder38.getDocument();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder50.setHeadElement(element51);
        boolean boolean53 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.nodes.Element element54 = null;
        htmlTreeBuilder50.setHeadElement(element54);
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder50.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList57 = htmlTreeBuilder50.getStack();
        htmlTreeBuilder50.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings59 = htmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder38.parseFragment("hi!", element47, "", parseErrorList49, parseSettings59);
        org.jsoup.nodes.Document document61 = htmlTreeBuilder38.getDocument();
        htmlTreeBuilder24.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document61);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element66 = null;
        htmlTreeBuilder65.setHeadElement(element66);
        boolean boolean68 = htmlTreeBuilder65.isFragmentParsing();
        htmlTreeBuilder65.framesetOk(false);
        boolean boolean71 = htmlTreeBuilder65.isFosterInserts();
        org.jsoup.nodes.Document document72 = htmlTreeBuilder65.getDocument();
        org.jsoup.nodes.Element element74 = null;
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder77 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element78 = null;
        htmlTreeBuilder77.setHeadElement(element78);
        boolean boolean80 = htmlTreeBuilder77.isFragmentParsing();
        org.jsoup.nodes.Element element81 = null;
        htmlTreeBuilder77.setHeadElement(element81);
        org.jsoup.parser.ParseSettings parseSettings83 = htmlTreeBuilder77.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList84 = htmlTreeBuilder77.getStack();
        htmlTreeBuilder77.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings86 = htmlTreeBuilder77.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList87 = htmlTreeBuilder65.parseFragment("hi!", element74, "", parseErrorList76, parseSettings86);
        org.jsoup.nodes.Document document88 = htmlTreeBuilder65.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document61, (org.jsoup.nodes.Element) document88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(elementList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNull(elementList31);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNull(formElement36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNull(elementList57);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(document72);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNull(elementList84);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(document88);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Attributes attributes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.processStartTag("hi!", attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.processStartTag("hi!", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder8.setHeadElement(element9);
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.framesetOk(false);
        boolean boolean14 = htmlTreeBuilder8.isFosterInserts();
        org.jsoup.nodes.Document document15 = htmlTreeBuilder8.getDocument();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder20.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder20.isFragmentParsing();
        org.jsoup.nodes.Element element24 = null;
        htmlTreeBuilder20.setHeadElement(element24);
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder20.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList27 = htmlTreeBuilder20.getStack();
        htmlTreeBuilder20.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings29 = htmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = htmlTreeBuilder8.parseFragment("hi!", element17, "", parseErrorList19, parseSettings29);
        org.jsoup.nodes.Document document31 = htmlTreeBuilder8.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(elementList27);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.framesetOk(false);
        boolean boolean16 = htmlTreeBuilder10.isFosterInserts();
        org.jsoup.nodes.Document document17 = htmlTreeBuilder10.getDocument();
        java.lang.String str18 = htmlTreeBuilder10.getBaseUri();
        boolean boolean19 = htmlTreeBuilder10.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = null;
        htmlTreeBuilder20.transition(htmlTreeBuilderState21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder20.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder24.setHeadElement(element25);
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder24.setHeadElement(element28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList31 = htmlTreeBuilder24.getStack();
        htmlTreeBuilder24.markInsertionMode();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder24.setHeadElement(element33);
        org.jsoup.nodes.Element element35 = htmlTreeBuilder24.getHeadElement();
        org.jsoup.nodes.FormElement formElement36 = htmlTreeBuilder24.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder38.setHeadElement(element39);
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        htmlTreeBuilder38.framesetOk(false);
        boolean boolean44 = htmlTreeBuilder38.isFosterInserts();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder38.getDocument();
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element51 = null;
        htmlTreeBuilder50.setHeadElement(element51);
        boolean boolean53 = htmlTreeBuilder50.isFragmentParsing();
        org.jsoup.nodes.Element element54 = null;
        htmlTreeBuilder50.setHeadElement(element54);
        org.jsoup.parser.ParseSettings parseSettings56 = htmlTreeBuilder50.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList57 = htmlTreeBuilder50.getStack();
        htmlTreeBuilder50.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings59 = htmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = htmlTreeBuilder38.parseFragment("hi!", element47, "", parseErrorList49, parseSettings59);
        org.jsoup.nodes.Document document61 = htmlTreeBuilder38.getDocument();
        htmlTreeBuilder24.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNull(elementList31);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertNull(formElement36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNull(elementList57);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document61);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean23 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Attributes attributes25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.processStartTag("hi!", attributes25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder3.setHeadElement(element4);
        boolean boolean6 = htmlTreeBuilder3.isFragmentParsing();
        htmlTreeBuilder3.framesetOk(false);
        boolean boolean9 = htmlTreeBuilder3.isFosterInserts();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder3.setFormElement(formElement10);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder16.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder16.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList23 = htmlTreeBuilder16.getStack();
        htmlTreeBuilder16.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = htmlTreeBuilder3.parseFragment("", element13, "hi!", parseErrorList15, parseSettings25);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder27.setHeadElement(element28);
        boolean boolean30 = htmlTreeBuilder27.isFragmentParsing();
        htmlTreeBuilder27.framesetOk(false);
        boolean boolean33 = htmlTreeBuilder27.isFosterInserts();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.Element element36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element40 = null;
        htmlTreeBuilder39.setHeadElement(element40);
        boolean boolean42 = htmlTreeBuilder39.isFragmentParsing();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder39.setHeadElement(element43);
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder39.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList46 = htmlTreeBuilder39.getStack();
        htmlTreeBuilder39.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = htmlTreeBuilder27.parseFragment("hi!", element36, "", parseErrorList38, parseSettings48);
        org.jsoup.nodes.Document document50 = htmlTreeBuilder27.getDocument();
        htmlTreeBuilder3.setHeadElement((org.jsoup.nodes.Element) document50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNull(elementList23);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNull(elementList46);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(document50);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.parser.Token token11 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process(token11, htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean10 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element18 = null;
        htmlTreeBuilder17.setHeadElement(element18);
        boolean boolean20 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element21 = null;
        htmlTreeBuilder17.setHeadElement(element21);
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder0.parseFragment("", element14, "hi!", parseErrorList16, parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        boolean boolean29 = htmlTreeBuilder0.inScope("", strArray28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder0.defaultSettings();
        boolean boolean31 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.Comment comment32 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder11.getHeadElement();
        org.jsoup.nodes.Element element15 = htmlTreeBuilder11.getHeadElement();
        boolean boolean16 = htmlTreeBuilder11.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.framesetOk(false);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder18.getDocument();
        java.lang.String str26 = htmlTreeBuilder18.getBaseUri();
        boolean boolean27 = htmlTreeBuilder18.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = null;
        htmlTreeBuilder28.transition(htmlTreeBuilderState29);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder28.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element33 = null;
        htmlTreeBuilder32.setHeadElement(element33);
        boolean boolean35 = htmlTreeBuilder32.isFragmentParsing();
        org.jsoup.nodes.Element element36 = null;
        htmlTreeBuilder32.setHeadElement(element36);
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder32.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = htmlTreeBuilder32.getStack();
        htmlTreeBuilder32.markInsertionMode();
        org.jsoup.nodes.Element element41 = null;
        htmlTreeBuilder32.setHeadElement(element41);
        org.jsoup.nodes.Element element43 = htmlTreeBuilder32.getHeadElement();
        org.jsoup.nodes.FormElement formElement44 = htmlTreeBuilder32.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element47 = null;
        htmlTreeBuilder46.setHeadElement(element47);
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        htmlTreeBuilder46.framesetOk(false);
        boolean boolean52 = htmlTreeBuilder46.isFosterInserts();
        org.jsoup.nodes.Document document53 = htmlTreeBuilder46.getDocument();
        org.jsoup.nodes.Element element55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder58 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element59 = null;
        htmlTreeBuilder58.setHeadElement(element59);
        boolean boolean61 = htmlTreeBuilder58.isFragmentParsing();
        org.jsoup.nodes.Element element62 = null;
        htmlTreeBuilder58.setHeadElement(element62);
        org.jsoup.parser.ParseSettings parseSettings64 = htmlTreeBuilder58.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList65 = htmlTreeBuilder58.getStack();
        htmlTreeBuilder58.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings67 = htmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = htmlTreeBuilder46.parseFragment("hi!", element55, "", parseErrorList57, parseSettings67);
        org.jsoup.nodes.Document document69 = htmlTreeBuilder46.getDocument();
        htmlTreeBuilder32.maybeSetBaseUri((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document69);
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document69);
        boolean boolean73 = htmlTreeBuilder11.isSpecial((org.jsoup.nodes.Element) document69);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNull(elementList39);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNull(formElement44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNull(elementList65);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.Character character2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder13.getHeadElement();
        boolean boolean18 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder19.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Element element23 = null;
        htmlTreeBuilder19.setHeadElement(element23);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        htmlTreeBuilder19.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder13.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList28);
        org.jsoup.parser.Token.StartTag startTag33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = htmlTreeBuilder0.insert(startTag33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.insertForm(startTag5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder9.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder13.setHeadElement(element17);
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder13.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList20 = htmlTreeBuilder13.getStack();
        htmlTreeBuilder13.markInsertionMode();
        org.jsoup.nodes.Element element22 = null;
        htmlTreeBuilder13.setHeadElement(element22);
        org.jsoup.nodes.Element element24 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder13.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder27.setHeadElement(element28);
        boolean boolean30 = htmlTreeBuilder27.isFragmentParsing();
        htmlTreeBuilder27.framesetOk(false);
        boolean boolean33 = htmlTreeBuilder27.isFosterInserts();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.Element element36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element40 = null;
        htmlTreeBuilder39.setHeadElement(element40);
        boolean boolean42 = htmlTreeBuilder39.isFragmentParsing();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder39.setHeadElement(element43);
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder39.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList46 = htmlTreeBuilder39.getStack();
        htmlTreeBuilder39.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings48 = htmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = htmlTreeBuilder27.parseFragment("hi!", element36, "", parseErrorList38, parseSettings48);
        org.jsoup.nodes.Document document50 = htmlTreeBuilder27.getDocument();
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document50);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(elementList20);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNull(elementList46);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(document50);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insert(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder12.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder12.setHeadElement(element16);
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder12.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList19 = htmlTreeBuilder12.getStack();
        htmlTreeBuilder12.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings21 = htmlTreeBuilder12.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = htmlTreeBuilder0.parseFragment("hi!", element9, "", parseErrorList11, parseSettings21);
        java.io.Reader reader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder26.setHeadElement(element27);
        boolean boolean29 = htmlTreeBuilder26.isFragmentParsing();
        htmlTreeBuilder26.framesetOk(false);
        boolean boolean32 = htmlTreeBuilder26.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = htmlTreeBuilder26.state();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder26.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader23, "hi!", parseErrorList25, parseSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNull(elementList19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState33);
        org.junit.Assert.assertNotNull(parseSettings34);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        htmlTreeBuilder6.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder13.setHeadElement(element14);
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        htmlTreeBuilder13.framesetOk(false);
        boolean boolean19 = htmlTreeBuilder13.isFosterInserts();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.Element element22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element26 = null;
        htmlTreeBuilder25.setHeadElement(element26);
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.nodes.Element element29 = null;
        htmlTreeBuilder25.setHeadElement(element29);
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder25.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList32 = htmlTreeBuilder25.getStack();
        htmlTreeBuilder25.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings34 = htmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = htmlTreeBuilder13.parseFragment("hi!", element22, "", parseErrorList24, parseSettings34);
        org.jsoup.nodes.Document document36 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.Element element37 = htmlTreeBuilder13.getHeadElement();
        boolean boolean38 = htmlTreeBuilder6.isSpecial(element37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = htmlTreeBuilder0.onStack(element37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(formElement5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNull(elementList32);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder6.setHeadElement(element7);
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder6.setHeadElement(element10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        boolean boolean19 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean23 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token token24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = htmlTreeBuilder0.process(token24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder0.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder0.setHeadElement(element13);
        boolean boolean15 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder16.setHeadElement(element20);
        org.jsoup.parser.ParseSettings parseSettings22 = htmlTreeBuilder16.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList23 = htmlTreeBuilder16.getStack();
        htmlTreeBuilder16.markInsertionMode();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder16.setHeadElement(element25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder16.getHeadElement();
        org.jsoup.nodes.FormElement formElement28 = htmlTreeBuilder16.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings29 = htmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element31 = null;
        htmlTreeBuilder30.setHeadElement(element31);
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.nodes.Element element34 = null;
        htmlTreeBuilder30.setHeadElement(element34);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        htmlTreeBuilder30.setPendingTableCharacters((java.util.List<java.lang.String>) strList39);
        htmlTreeBuilder16.setPendingTableCharacters((java.util.List<java.lang.String>) strList39);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNull(elementList23);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNull(formElement28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder11.setHeadElement(element12);
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        htmlTreeBuilder11.framesetOk(false);
        boolean boolean17 = htmlTreeBuilder11.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element19 = null;
        htmlTreeBuilder18.setHeadElement(element19);
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.framesetOk(false);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.FormElement formElement25 = null;
        htmlTreeBuilder18.setFormElement(formElement25);
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element32 = null;
        htmlTreeBuilder31.setHeadElement(element32);
        boolean boolean34 = htmlTreeBuilder31.isFragmentParsing();
        org.jsoup.nodes.Element element35 = null;
        htmlTreeBuilder31.setHeadElement(element35);
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder31.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList38 = htmlTreeBuilder31.getStack();
        htmlTreeBuilder31.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings40 = htmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = htmlTreeBuilder18.parseFragment("", element28, "hi!", parseErrorList30, parseSettings40);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element43 = null;
        htmlTreeBuilder42.setHeadElement(element43);
        boolean boolean45 = htmlTreeBuilder42.isFragmentParsing();
        htmlTreeBuilder42.framesetOk(false);
        boolean boolean48 = htmlTreeBuilder42.isFosterInserts();
        org.jsoup.nodes.Document document49 = htmlTreeBuilder42.getDocument();
        org.jsoup.nodes.Element element51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder54 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element55 = null;
        htmlTreeBuilder54.setHeadElement(element55);
        boolean boolean57 = htmlTreeBuilder54.isFragmentParsing();
        org.jsoup.nodes.Element element58 = null;
        htmlTreeBuilder54.setHeadElement(element58);
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder54.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList61 = htmlTreeBuilder54.getStack();
        htmlTreeBuilder54.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings63 = htmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = htmlTreeBuilder42.parseFragment("hi!", element51, "", parseErrorList53, parseSettings63);
        org.jsoup.nodes.Document document65 = htmlTreeBuilder42.getDocument();
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document65);
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document65);
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document65);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(elementList38);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNull(elementList61);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(document65);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder7.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder7.setHeadElement(element11);
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList14 = htmlTreeBuilder7.getStack();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder7.setHeadElement(element16);
        org.jsoup.nodes.Element element18 = htmlTreeBuilder7.getHeadElement();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder7.getPendingTableCharacters();
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element25 = null;
        htmlTreeBuilder24.setHeadElement(element25);
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.nodes.Element element28 = null;
        htmlTreeBuilder24.setHeadElement(element28);
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = htmlTreeBuilder7.parseFragment("", element21, "hi!", parseErrorList23, parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = htmlTreeBuilder7.defaultSettings();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        boolean boolean36 = htmlTreeBuilder7.inScope("", strArray35);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNull(elementList14);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        htmlTreeBuilder0.setHeadElement(element1);
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder10.setHeadElement(element11);
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder10.setHeadElement(element14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element17 = null;
        htmlTreeBuilder16.setHeadElement(element17);
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.nodes.Element element20 = null;
        htmlTreeBuilder16.setHeadElement(element20);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        htmlTreeBuilder16.setPendingTableCharacters((java.util.List<java.lang.String>) strList25);
        htmlTreeBuilder10.setPendingTableCharacters((java.util.List<java.lang.String>) strList25);
        boolean boolean29 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.newPendingTableCharacters();
        htmlTreeBuilder10.setFosterInserts(false);
        boolean boolean33 = htmlTreeBuilder10.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = null;
        htmlTreeBuilder34.transition(htmlTreeBuilderState35);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder34.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element39 = null;
        htmlTreeBuilder38.setHeadElement(element39);
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        htmlTreeBuilder38.framesetOk(false);
        boolean boolean44 = htmlTreeBuilder38.isFosterInserts();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder38.getDocument();
        java.lang.String str46 = htmlTreeBuilder38.getBaseUri();
        boolean boolean47 = htmlTreeBuilder38.framesetOk();
        org.jsoup.nodes.Element element49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element53 = null;
        htmlTreeBuilder52.setHeadElement(element53);
        boolean boolean55 = htmlTreeBuilder52.isFragmentParsing();
        org.jsoup.nodes.Element element56 = null;
        htmlTreeBuilder52.setHeadElement(element56);
        org.jsoup.parser.ParseSettings parseSettings58 = htmlTreeBuilder52.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder52.getStack();
        htmlTreeBuilder52.markInsertionMode();
        org.jsoup.nodes.Element element61 = null;
        htmlTreeBuilder52.setHeadElement(element61);
        org.jsoup.nodes.Element element63 = htmlTreeBuilder52.getHeadElement();
        org.jsoup.nodes.FormElement formElement64 = htmlTreeBuilder52.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings65 = htmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList66 = htmlTreeBuilder38.parseFragment("hi!", element49, "", parseErrorList51, parseSettings65);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder67 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element68 = null;
        htmlTreeBuilder67.setHeadElement(element68);
        boolean boolean70 = htmlTreeBuilder67.isFragmentParsing();
        htmlTreeBuilder67.framesetOk(false);
        boolean boolean73 = htmlTreeBuilder67.isFosterInserts();
        org.jsoup.nodes.Document document74 = htmlTreeBuilder67.getDocument();
        org.jsoup.nodes.Element element76 = null;
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder79 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element80 = null;
        htmlTreeBuilder79.setHeadElement(element80);
        boolean boolean82 = htmlTreeBuilder79.isFragmentParsing();
        org.jsoup.nodes.Element element83 = null;
        htmlTreeBuilder79.setHeadElement(element83);
        org.jsoup.parser.ParseSettings parseSettings85 = htmlTreeBuilder79.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList86 = htmlTreeBuilder79.getStack();
        htmlTreeBuilder79.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings88 = htmlTreeBuilder79.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = htmlTreeBuilder67.parseFragment("hi!", element76, "", parseErrorList78, parseSettings88);
        org.jsoup.nodes.Document document90 = htmlTreeBuilder67.getDocument();
        htmlTreeBuilder38.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document90);
        htmlTreeBuilder34.setHeadElement((org.jsoup.nodes.Element) document90);
        boolean boolean93 = htmlTreeBuilder10.isSpecial((org.jsoup.nodes.Element) document90);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNull(elementList59);
        org.junit.Assert.assertNull(element63);
        org.junit.Assert.assertNull(formElement64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(document74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNull(elementList86);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }
}

