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
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment1 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.StartTag;
        java.lang.Class<?> wildcardClass1 = tokenType0.getClass();
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag1 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element1);
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
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String[] strArray0 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "ol", "ul" });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character1 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = htmlTreeBuilder0.parseFragment("hi!", element3, "", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element1, element2);
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
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token2 = doctype1.reset();
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilderState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.StartTag startTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.insertForm(startTag3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertEmpty(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = xmlTreeBuilder0.insert(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment(" hi!=\"\"", element2, " hi!=\"\"", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.onStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        org.jsoup.parser.Token token5 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", element2, "hi!", parser4);
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
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token8 = doctype7.reset();
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        boolean boolean10 = doctype7.isForceQuirks();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype7, htmlTreeBuilderState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment(" hi!=\"\"", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = htmlTreeBuilder0.isSpecial(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        boolean boolean8 = comment7.bogus;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes2.asList();
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes5 = attributes2.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inSelectScope("");
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
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.Character character3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader1, "<!---->", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String[] strArray0 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "applet", "caption", "html", "marquee", "object", "table", "td", "th" });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        boolean boolean11 = endTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment("<!---->", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse(reader1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment(" hi!=\"\"", "Doctype", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        org.jsoup.parser.Token token5 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = token5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = token1.isCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!=\"\"", element2, "", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.onStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "a", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inScope("", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "a", "" });
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.selfClosing = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int0 = org.jsoup.parser.HtmlTreeBuilder.MaxScopeSearchDepth;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = attributes8.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.processStartTag("hi!", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment("<!---->", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope(" hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, false);
        boolean boolean3 = parseSettings2.preserveTagCase();
        java.lang.Class<?> wildcardClass4 = parseSettings2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.removeFromStack(element3);
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
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element1, element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertEmpty(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        boolean boolean12 = attributes4.hasKeyIgnoreCase("hi!=\"\"");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.String str10 = doctype0.getPubSysKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        org.jsoup.parser.Token.TokenType tokenType10 = org.jsoup.parser.Token.TokenType.Character;
        doctype0.type = tokenType10;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inScope(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!=\"\"", element2, "Doctype", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.isSpecial(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.isSpecial(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.onStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        boolean boolean7 = endTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, false);
        java.lang.String str4 = parseSettings2.normalizeTag("hi!=\"\"");
        java.lang.String str6 = parseSettings2.normalizeTag(" hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        boolean boolean7 = endTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        int int4 = attributes0.size();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        boolean boolean11 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = xmlTreeBuilder0.insert(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeTag("EOF");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eof" + "'", str2, "eof");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character11 = cData9.data("hi!=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(character11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(" hi!=\"\"");
        java.lang.String str9 = endTag6.normalName;
        endTag6.setEmptyAttributeValue();
        endTag6.appendTagName('a');
        java.lang.String str13 = endTag6.name();
        endTag6.setEmptyAttributeValue();
        boolean boolean15 = endTag6.isDoctype();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6, htmlTreeBuilderState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore(" hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        java.lang.String str8 = comment7.getData();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        boolean boolean4 = tag3.selfClosing;
        java.lang.String str5 = tag3.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = tag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.Comment comment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inButtonScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment("eof", "Doctype", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = token1.isCData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = startTag7.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.Parser parser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = htmlTreeBuilder0.parseFragment("EOF", element9, "<!---->", parser11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        java.lang.Class<?> wildcardClass4 = tag1.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.aboveOnStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.onStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.removeFromStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse(reader2, "hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token6 = doctype5.reset();
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype5.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token8 = comment7.reset();
        java.lang.String str9 = comment7.getData();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader1, "a ", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "applet", "caption", "html", "marquee", "object", "table", "td", "th" });
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inTableScope("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(" hi!=\"\"");
        java.lang.String str10 = endTag7.normalName;
        endTag7.setEmptyAttributeValue();
        endTag7.appendTagName('a');
        char[] charArray19 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag7.appendAttributeValue(charArray19);
        java.lang.String str21 = endTag7.name();
        endTag7.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character12 = cData10.data("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = xmlTreeBuilder0.insert(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment("hi!=\"\"", "EOF", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<![CDATA[hi!=\"\"]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader1, "eof", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inListItemScope("a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes9 = attributes6.put("a ", "hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.onStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("<![CDATA[Doctype]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        java.lang.String str2 = endTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse(reader2, " hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("<![CDATA[Doctype]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str2 = parseSettings0.normalizeTag("");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.onStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(formElement4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        java.lang.String str4 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        boolean boolean9 = attributes5.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("hi!", "");
        attributes5.addAll(attributes10);
        org.jsoup.nodes.Attributes attributes17 = attributes10.put("hi!", true);
        endTag0.attributes = attributes10;
        endTag0.appendTagName("EOF");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = startTag7.getAttributes();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.lang.String str11 = attributes10.toString();
        org.jsoup.parser.Token.StartTag startTag12 = startTag7.nameAttr("EOF", attributes10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        java.io.Reader reader5 = null;
        org.jsoup.parser.Parser parser7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "hi!=\"\"", parser7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.removeFromStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(formElement4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inTableScope("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isInActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token8 = doctype7.reset();
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        boolean boolean10 = doctype7.isForceQuirks();
        boolean boolean11 = doctype7.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader2, "", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "button" });
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("<a   hi!=\"\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isInActiveFormattingElements(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("<![CDATA[Doctype]]>", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "applet", "caption", "html", "marquee", "object", "table", "td", "th" });
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("eof", element3, "<![CDATA[null]]>", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.String str9 = comment8.getData();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        boolean boolean16 = attributes14.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag17 = startTag8.nameAttr("a ", attributes14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = htmlTreeBuilder0.insertEmpty(startTag17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "dd", "dt", "li", "optgroup", "option", "p", "rp", "rt" });
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inButtonScope(" hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(" hi!=\"\"");
        java.lang.String str11 = endTag8.normalName;
        endTag8.setEmptyAttributeValue();
        endTag8.appendTagName('a');
        java.lang.String str15 = endTag8.name();
        endTag8.selfClosing = false;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag8, htmlTreeBuilderState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[<!---->]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.bogus;
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document10, (org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Parser parser12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = htmlTreeBuilder0.parseFragment("<EOF>", (org.jsoup.nodes.Element) document10, "a", parser12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder4);
        org.jsoup.parser.Token.reset(stringBuilder4);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.setEmptyAttributeValue();
        endTag10.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        attributes14.removeIgnoreCase("Doctype");
        endTag10.attributes = attributes14;
        java.lang.String str22 = attributes14.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes25 = attributes23.clone();
        boolean boolean27 = attributes23.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = attributes28.put("hi!", "");
        attributes23.addAll(attributes28);
        attributes14.addAll(attributes28);
        tag9.attributes = attributes14;
        boolean boolean35 = tag9.isCharacter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.appendAttributeValue("hi!");
        boolean boolean4 = endTag1.isEndTag();
        boolean boolean5 = endTag1.isEndTag();
        char[] charArray8 = new char[] { 'a', ' ' };
        endTag1.appendAttributeValue(charArray8);
        endTag0.appendAttributeValue(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "applet", "caption", "html", "marquee", "object", "table", "td", "th" });
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token6 = doctype5.reset();
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        boolean boolean8 = doctype5.isForceQuirks();
        boolean boolean9 = doctype5.forceQuirks;
        java.lang.String str10 = doctype5.tokenType();
        java.lang.String str11 = doctype5.getSystemIdentifier();
        boolean boolean12 = doctype5.isForceQuirks();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5, htmlTreeBuilderState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inButtonScope("<![CDATA[Doctype]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(formElement4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character3 = cData1.data("hi!=\"\"");
        java.lang.String str4 = cData1.toString();
        org.jsoup.parser.Token.Character character6 = cData1.data("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = character6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str4, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<EOF>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder8.defaultSettings();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder8.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.lang.String str4 = attributes3.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.nameAttr("EOF", attributes3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        java.io.Reader reader8 = null;
        org.jsoup.parser.Parser parser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader8, "EOF", parser10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character3 = cData1.data("hi!=\"\"");
        java.lang.String str4 = cData1.toString();
        org.jsoup.parser.Token.Character character6 = cData1.data("a");
        boolean boolean7 = character6.isCData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = character6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str4, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "button" });
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inTableScope("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document14, element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes12 = attributes4.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.Token.CData cData4 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str5 = cData4.toString();
        java.lang.String str6 = cData4.toString();
        java.lang.String str7 = cData4.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.process((org.jsoup.parser.Token) cData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<![CDATA[<!---->]]>" + "'", str5, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<![CDATA[<!---->]]>" + "'", str6, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<![CDATA[<!---->]]>" + "'", str7, "<![CDATA[<!---->]]>");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        java.lang.Class<?> wildcardClass11 = tag10.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.bogus;
        java.lang.String str2 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str11 = cData10.toString();
        java.lang.String str12 = cData10.toString();
        java.lang.String str13 = cData10.toString();
        java.lang.String str14 = cData10.toString();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.process((org.jsoup.parser.Token) cData10, htmlTreeBuilderState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<![CDATA[<!---->]]>" + "'", str11, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<![CDATA[<!---->]]>" + "'", str12, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<![CDATA[<!---->]]>" + "'", str13, "<![CDATA[<!---->]]>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<![CDATA[<!---->]]>" + "'", str14, "<![CDATA[<!---->]]>");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        comment3.bogus = true;
        org.jsoup.parser.Token token6 = comment3.reset();
        boolean boolean7 = comment3.bogus;
        boolean boolean8 = comment3.bogus;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean10 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.newPendingTableCharacters();
        htmlTreeBuilder9.framesetOk(false);
        htmlTreeBuilder9.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder15.setFosterInserts(false);
        org.jsoup.nodes.Document document18 = htmlTreeBuilder15.getDocument();
        org.jsoup.nodes.FormElement formElement19 = htmlTreeBuilder15.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder20.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document24);
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document24);
        org.jsoup.parser.Parser parser28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList29 = htmlTreeBuilder0.parseFragment("EOF", (org.jsoup.nodes.Element) document24, "hi!", parser28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNull(formElement19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(document24);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        java.lang.String str12 = endTag0.tagName;
        endTag0.appendTagName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader56 = null;
        org.jsoup.parser.Parser parser58 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader56, "a", parser58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader4 = null;
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader4, "<EOF>", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attributes3.put(" hi!=\"\"", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes3.asList();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder4.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder9.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder9.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean20 = htmlTreeBuilder19.isFragmentParsing();
        htmlTreeBuilder19.newPendingTableCharacters();
        htmlTreeBuilder19.framesetOk(false);
        htmlTreeBuilder19.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder25.setFosterInserts(false);
        org.jsoup.nodes.Document document28 = htmlTreeBuilder25.getDocument();
        org.jsoup.nodes.FormElement formElement29 = htmlTreeBuilder25.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder30.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        htmlTreeBuilder19.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean38 = htmlTreeBuilder37.isFragmentParsing();
        htmlTreeBuilder37.newPendingTableCharacters();
        htmlTreeBuilder37.framesetOk(false);
        htmlTreeBuilder37.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder43.setFosterInserts(false);
        org.jsoup.nodes.Document document46 = htmlTreeBuilder43.getDocument();
        org.jsoup.nodes.FormElement formElement47 = htmlTreeBuilder43.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder48.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder43.maybeSetBaseUri((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder37.maybeSetBaseUri((org.jsoup.nodes.Element) document52);
        boolean boolean55 = htmlTreeBuilder19.isSpecial((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document52);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNull(formElement29);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertNull(formElement47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.String str10 = doctype0.getPubSysKey();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getName();
        doctype0.pubSysKey = "<![CDATA[null]]>";
        boolean boolean15 = doctype0.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        attributes2.normalize();
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes5 = attributes2.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean8 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.newPendingTableCharacters();
        htmlTreeBuilder7.framesetOk(false);
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.nodes.Document document16 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder13.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean26 = htmlTreeBuilder25.isFragmentParsing();
        htmlTreeBuilder25.newPendingTableCharacters();
        htmlTreeBuilder25.framesetOk(false);
        htmlTreeBuilder25.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder31.setFosterInserts(false);
        org.jsoup.nodes.Document document34 = htmlTreeBuilder31.getDocument();
        org.jsoup.nodes.FormElement formElement35 = htmlTreeBuilder31.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder36.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder31.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean44 = htmlTreeBuilder43.isFragmentParsing();
        htmlTreeBuilder43.newPendingTableCharacters();
        htmlTreeBuilder43.framesetOk(false);
        htmlTreeBuilder43.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder49.setFosterInserts(false);
        org.jsoup.nodes.Document document52 = htmlTreeBuilder49.getDocument();
        org.jsoup.nodes.FormElement formElement53 = htmlTreeBuilder49.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.nodes.Document document58 = xmlTreeBuilder54.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder49.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder43.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        boolean boolean61 = htmlTreeBuilder25.isSpecial((org.jsoup.nodes.Element) document58);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document22, (org.jsoup.nodes.Element) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(formElement17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNull(formElement35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document52);
        org.junit.Assert.assertNull(formElement53);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("hi!", "");
        boolean boolean15 = attributes13.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag16 = startTag7.nameAttr("a ", attributes13);
        java.lang.String str17 = startTag7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement19 = htmlTreeBuilder0.insertForm(startTag7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<a   hi!=\"\">" + "'", str17, "<a   hi!=\"\">");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isDoctype();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        java.lang.Class<?> wildcardClass12 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(formElement11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse(reader1, "eof");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.normalName = "EndTag";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        boolean boolean8 = comment7.bogus;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.insertForm(startTag8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = token2.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = token2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader8 = null;
        org.jsoup.parser.Parser parser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader8, " hi!=\"\"", parser10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        tag11.appendTagName('4');
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag11, htmlTreeBuilderState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.insertForm(startTag6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes12 = attributes5.put("hi!", true);
        boolean boolean14 = attributes12.hasKeyIgnoreCase(" hi!=\"\"");
        int int15 = attributes12.size();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        endTag0.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag16 = endTag0.asEndTag();
        boolean boolean17 = endTag0.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertNotNull(endTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes9 = attributes7.clone();
        attributes7.remove("Doctype");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes14 = attributes12.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes14.asList();
        boolean boolean16 = attributes7.equals((java.lang.Object) attributes14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.processStartTag("EOF", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        attributes0.remove("Doctype");
        java.lang.String str6 = attributes0.getIgnoreCase("Doctype");
        java.lang.String str8 = attributes0.get("<!---->");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character12 = cData10.data("hi!=\"\"");
        org.jsoup.parser.Token token13 = cData10.reset();
        boolean boolean14 = attributes0.equals((java.lang.Object) token13);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Document document11 = htmlTreeBuilder8.getDocument();
        org.jsoup.nodes.FormElement formElement12 = htmlTreeBuilder8.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder13.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder8.maybeSetBaseUri((org.jsoup.nodes.Element) document17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(formElement12);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token8 = doctype7.reset();
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        boolean boolean10 = doctype7.isForceQuirks();
        boolean boolean11 = doctype7.forceQuirks;
        org.jsoup.parser.Token token12 = doctype7.reset();
        java.lang.String str13 = doctype7.tokenType();
        boolean boolean14 = doctype7.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype15 = doctype7.asDoctype();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype7, htmlTreeBuilderState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doctype15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag11 = endTag8.name("");
        tag11.normalName = " hi!=\"\"";
        org.jsoup.nodes.Attributes attributes14 = tag11.getAttributes();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag11, htmlTreeBuilderState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        org.jsoup.parser.Token.Tag tag4 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(" hi!=\"\"");
        java.lang.String str8 = endTag5.normalName;
        endTag5.selfClosing = true;
        boolean boolean11 = attributes0.equals((java.lang.Object) endTag5);
        boolean boolean12 = endTag5.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = endTag5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Parser parser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = htmlTreeBuilder0.parseFragment("<EOF>", (org.jsoup.nodes.Element) document9, "", parser11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        attributes6.remove(" hi!=\"\"");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes10 = attributes8.clone();
        attributes8.remove("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.processStartTag("<!---->", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean10 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.newPendingTableCharacters();
        htmlTreeBuilder9.framesetOk(false);
        htmlTreeBuilder9.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder15.setFosterInserts(false);
        org.jsoup.nodes.Document document18 = htmlTreeBuilder15.getDocument();
        org.jsoup.nodes.FormElement formElement19 = htmlTreeBuilder15.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder20.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document24);
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document24);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean28 = htmlTreeBuilder27.isFragmentParsing();
        htmlTreeBuilder27.newPendingTableCharacters();
        htmlTreeBuilder27.framesetOk(false);
        htmlTreeBuilder27.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder33.setFosterInserts(false);
        org.jsoup.nodes.Document document36 = htmlTreeBuilder33.getDocument();
        org.jsoup.nodes.FormElement formElement37 = htmlTreeBuilder33.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder38.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder33.maybeSetBaseUri((org.jsoup.nodes.Element) document42);
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document42);
        boolean boolean45 = htmlTreeBuilder9.isSpecial((org.jsoup.nodes.Element) document42);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNull(formElement19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNull(formElement37);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder11.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean22 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.newPendingTableCharacters();
        htmlTreeBuilder21.framesetOk(false);
        htmlTreeBuilder21.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder27.setFosterInserts(false);
        org.jsoup.nodes.Document document30 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.FormElement formElement31 = htmlTreeBuilder27.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder32.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean40 = htmlTreeBuilder39.isFragmentParsing();
        htmlTreeBuilder39.newPendingTableCharacters();
        htmlTreeBuilder39.framesetOk(false);
        htmlTreeBuilder39.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder45.setFosterInserts(false);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder45.getDocument();
        org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder45.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder50.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder45.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder39.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        boolean boolean57 = htmlTreeBuilder21.isSpecial((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document54);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean60 = htmlTreeBuilder59.isFragmentParsing();
        htmlTreeBuilder59.newPendingTableCharacters();
        htmlTreeBuilder59.framesetOk(false);
        htmlTreeBuilder59.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder65.setFosterInserts(false);
        org.jsoup.nodes.Document document68 = htmlTreeBuilder65.getDocument();
        org.jsoup.nodes.FormElement formElement69 = htmlTreeBuilder65.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder70.defaultSettings();
        org.jsoup.nodes.Document document74 = xmlTreeBuilder70.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder65.maybeSetBaseUri((org.jsoup.nodes.Element) document74);
        htmlTreeBuilder59.maybeSetBaseUri((org.jsoup.nodes.Element) document74);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder77 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean78 = htmlTreeBuilder77.isFragmentParsing();
        htmlTreeBuilder77.newPendingTableCharacters();
        htmlTreeBuilder77.framesetOk(false);
        htmlTreeBuilder77.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder83 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder83.setFosterInserts(false);
        org.jsoup.nodes.Document document86 = htmlTreeBuilder83.getDocument();
        org.jsoup.nodes.FormElement formElement87 = htmlTreeBuilder83.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder88 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder88.defaultSettings();
        org.jsoup.nodes.Document document92 = xmlTreeBuilder88.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder83.maybeSetBaseUri((org.jsoup.nodes.Element) document92);
        htmlTreeBuilder77.maybeSetBaseUri((org.jsoup.nodes.Element) document92);
        boolean boolean95 = htmlTreeBuilder59.isSpecial((org.jsoup.nodes.Element) document92);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document54, (org.jsoup.nodes.Element) document92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNull(formElement31);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertNull(formElement49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(document68);
        org.junit.Assert.assertNull(formElement69);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(document86);
        org.junit.Assert.assertNull(formElement87);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope(" hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder4.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder4.state();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder4.newPendingTableCharacters();
        java.lang.String str13 = htmlTreeBuilder4.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder4.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.FormElement formElement17 = null;
        htmlTreeBuilder15.setFormElement(formElement17);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder15.state();
        java.util.List<java.lang.String> strList20 = htmlTreeBuilder15.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder15.state();
        htmlTreeBuilder15.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder15.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean26 = htmlTreeBuilder25.isFragmentParsing();
        htmlTreeBuilder25.newPendingTableCharacters();
        htmlTreeBuilder25.framesetOk(false);
        htmlTreeBuilder25.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder31.setFosterInserts(false);
        org.jsoup.nodes.Document document34 = htmlTreeBuilder31.getDocument();
        org.jsoup.nodes.FormElement formElement35 = htmlTreeBuilder31.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder36.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder31.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean44 = htmlTreeBuilder43.isFragmentParsing();
        htmlTreeBuilder43.newPendingTableCharacters();
        htmlTreeBuilder43.framesetOk(false);
        htmlTreeBuilder43.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder49.setFosterInserts(false);
        org.jsoup.nodes.Document document52 = htmlTreeBuilder49.getDocument();
        org.jsoup.nodes.FormElement formElement53 = htmlTreeBuilder49.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.nodes.Document document58 = xmlTreeBuilder54.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder49.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder43.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        boolean boolean61 = htmlTreeBuilder25.isSpecial((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder15.setHeadElement((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNull(formElement35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document52);
        org.junit.Assert.assertNull(formElement53);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insertStartTag("eof");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder4.setFosterInserts(false);
        org.jsoup.nodes.Document document7 = htmlTreeBuilder4.getDocument();
        boolean boolean8 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder4.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder16.state();
        java.util.List<java.lang.String> strList21 = htmlTreeBuilder16.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder16.state();
        htmlTreeBuilder16.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder16.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean27 = htmlTreeBuilder26.isFragmentParsing();
        htmlTreeBuilder26.newPendingTableCharacters();
        htmlTreeBuilder26.framesetOk(false);
        htmlTreeBuilder26.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder32.setFosterInserts(false);
        org.jsoup.nodes.Document document35 = htmlTreeBuilder32.getDocument();
        org.jsoup.nodes.FormElement formElement36 = htmlTreeBuilder32.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder37.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder32.maybeSetBaseUri((org.jsoup.nodes.Element) document41);
        htmlTreeBuilder26.maybeSetBaseUri((org.jsoup.nodes.Element) document41);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean45 = htmlTreeBuilder44.isFragmentParsing();
        htmlTreeBuilder44.newPendingTableCharacters();
        htmlTreeBuilder44.framesetOk(false);
        htmlTreeBuilder44.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder50.setFosterInserts(false);
        org.jsoup.nodes.Document document53 = htmlTreeBuilder50.getDocument();
        org.jsoup.nodes.FormElement formElement54 = htmlTreeBuilder50.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.nodes.Document document59 = xmlTreeBuilder55.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder50.maybeSetBaseUri((org.jsoup.nodes.Element) document59);
        htmlTreeBuilder44.maybeSetBaseUri((org.jsoup.nodes.Element) document59);
        boolean boolean62 = htmlTreeBuilder26.isSpecial((org.jsoup.nodes.Element) document59);
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document59);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document14, (org.jsoup.nodes.Element) document59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNull(formElement36);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNull(formElement54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = attributes13.put("hi!", "");
        boolean boolean18 = attributes16.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag19 = startTag10.nameAttr("a ", attributes16);
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        org.jsoup.nodes.Attributes attributes23 = attributes21.clone();
        boolean boolean25 = attributes21.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes29 = attributes26.put("hi!", "");
        attributes21.addAll(attributes26);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        org.jsoup.nodes.Attributes attributes33 = attributes31.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes33.asList();
        attributes21.addAll(attributes33);
        org.jsoup.parser.Token.StartTag startTag36 = startTag19.nameAttr("a", attributes21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = htmlTreeBuilder0.insertEmpty(startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertNotNull(startTag36);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        comment5.bogus = true;
        org.jsoup.parser.Token token8 = comment5.reset();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.aboveOnStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        org.jsoup.parser.Token.Tag tag4 = tag1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = tag4.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        java.io.Reader reader55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document57 = xmlTreeBuilder0.parse(reader55, " hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.setEmptyAttributeValue();
        endTag57.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        attributes61.removeIgnoreCase("Doctype");
        endTag57.attributes = attributes61;
        java.lang.String str69 = attributes61.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        attributes70.normalize();
        org.jsoup.nodes.Attributes attributes72 = attributes70.clone();
        boolean boolean74 = attributes70.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes75 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes78 = attributes75.put("hi!", "");
        attributes70.addAll(attributes75);
        attributes61.addAll(attributes75);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = attributes61.dataset();
        boolean boolean82 = xmlTreeBuilder0.processStartTag("EOF", attributes61);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder84 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder84.setFosterInserts(false);
        org.jsoup.nodes.Document document87 = htmlTreeBuilder84.getDocument();
        boolean boolean88 = htmlTreeBuilder84.isFragmentParsing();
        org.jsoup.nodes.Element element89 = htmlTreeBuilder84.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder90 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings91 = xmlTreeBuilder90.defaultSettings();
        org.jsoup.nodes.Document document94 = xmlTreeBuilder90.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder84.setHeadElement((org.jsoup.nodes.Element) document94);
        org.jsoup.parser.Parser parser97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList98 = xmlTreeBuilder0.parseFragment(" hi!=\"\"", (org.jsoup.nodes.Element) document94, "Doctype", parser97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(document87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(element89);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(document94);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String[] strArray0 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "html", "table" });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean8 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.newPendingTableCharacters();
        htmlTreeBuilder7.framesetOk(false);
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.nodes.Document document16 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder13.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        java.util.List<java.lang.String> strList30 = htmlTreeBuilder25.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder25.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean36 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.newPendingTableCharacters();
        htmlTreeBuilder35.framesetOk(false);
        htmlTreeBuilder35.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder41.setFosterInserts(false);
        org.jsoup.nodes.Document document44 = htmlTreeBuilder41.getDocument();
        org.jsoup.nodes.FormElement formElement45 = htmlTreeBuilder41.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder46.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder41.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        htmlTreeBuilder35.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean54 = htmlTreeBuilder53.isFragmentParsing();
        htmlTreeBuilder53.newPendingTableCharacters();
        htmlTreeBuilder53.framesetOk(false);
        htmlTreeBuilder53.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder59.setFosterInserts(false);
        org.jsoup.nodes.Document document62 = htmlTreeBuilder59.getDocument();
        org.jsoup.nodes.FormElement formElement63 = htmlTreeBuilder59.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder64.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder59.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder53.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        boolean boolean71 = htmlTreeBuilder35.isSpecial((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder25.setHeadElement((org.jsoup.nodes.Element) document68);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document22, (org.jsoup.nodes.Element) document68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(formElement17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNull(formElement45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNull(formElement63);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        boolean boolean10 = doctype0.isCData();
        boolean boolean11 = doctype0.isEndTag();
        boolean boolean12 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        boolean boolean14 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        java.util.List<java.lang.String> strList10 = htmlTreeBuilder5.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder5.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean16 = htmlTreeBuilder15.isFragmentParsing();
        htmlTreeBuilder15.newPendingTableCharacters();
        htmlTreeBuilder15.framesetOk(false);
        htmlTreeBuilder15.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder21.setFosterInserts(false);
        org.jsoup.nodes.Document document24 = htmlTreeBuilder21.getDocument();
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder21.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder26.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document30);
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document30);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean34 = htmlTreeBuilder33.isFragmentParsing();
        htmlTreeBuilder33.newPendingTableCharacters();
        htmlTreeBuilder33.framesetOk(false);
        htmlTreeBuilder33.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder39.setFosterInserts(false);
        org.jsoup.nodes.Document document42 = htmlTreeBuilder39.getDocument();
        org.jsoup.nodes.FormElement formElement43 = htmlTreeBuilder39.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder44.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder39.maybeSetBaseUri((org.jsoup.nodes.Element) document48);
        htmlTreeBuilder33.maybeSetBaseUri((org.jsoup.nodes.Element) document48);
        boolean boolean51 = htmlTreeBuilder15.isSpecial((org.jsoup.nodes.Element) document48);
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document48);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder53.setFosterInserts(false);
        org.jsoup.nodes.Document document56 = htmlTreeBuilder53.getDocument();
        boolean boolean57 = htmlTreeBuilder53.isFragmentParsing();
        org.jsoup.nodes.Element element58 = htmlTreeBuilder53.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        org.jsoup.nodes.Document document63 = xmlTreeBuilder59.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder53.setHeadElement((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document48, (org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNull(formElement43);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(document56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(element58);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        boolean boolean7 = endTag0.isEndTag();
        boolean boolean8 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.normalName = "hi!=\"\"";
        endTag0.appendAttributeName("a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag4 = endTag0.name("a ");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = attributes8.put(" hi!=\"\"", false);
        int int12 = attributes8.size();
        endTag0.attributes = attributes8;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        tag14.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype17 = tag14.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.StringBuilder stringBuilder0 = null;
        org.jsoup.parser.Token.reset(stringBuilder0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Parser parser15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder0.parseFragment("EOF", (org.jsoup.nodes.Element) document13, "a", parser15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Parser parser15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("", "doctype", parser15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        boolean boolean12 = tag10.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder11.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean22 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.newPendingTableCharacters();
        htmlTreeBuilder21.framesetOk(false);
        htmlTreeBuilder21.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder27.setFosterInserts(false);
        org.jsoup.nodes.Document document30 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.FormElement formElement31 = htmlTreeBuilder27.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder32.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean40 = htmlTreeBuilder39.isFragmentParsing();
        htmlTreeBuilder39.newPendingTableCharacters();
        htmlTreeBuilder39.framesetOk(false);
        htmlTreeBuilder39.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder45.setFosterInserts(false);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder45.getDocument();
        org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder45.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder50.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder45.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder39.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        boolean boolean57 = htmlTreeBuilder21.isSpecial((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = htmlTreeBuilder0.inButtonScope("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNull(formElement31);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertNull(formElement49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        java.lang.String str4 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        boolean boolean9 = attributes5.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("hi!", "");
        attributes5.addAll(attributes10);
        org.jsoup.nodes.Attributes attributes17 = attributes10.put("hi!", true);
        endTag0.attributes = attributes10;
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        char[] charArray31 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag19.appendAttributeValue(charArray31);
        endTag0.appendAttributeValue(charArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ', '#', ' ', 'a' });
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(" hi!=\"\"");
        java.lang.String str8 = endTag5.normalName;
        endTag5.selfClosing = true;
        boolean boolean11 = attributes0.equals((java.lang.Object) endTag5);
        endTag5.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes14 = endTag5.attributes;
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = tag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = tag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        attributes0.remove("Doctype");
        java.lang.String str6 = attributes0.getIgnoreCase("Doctype");
        java.lang.String str8 = attributes0.get("<!---->");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes11 = attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inTableScope("eof");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.selfClosing = false;
        boolean boolean10 = endTag0.selfClosing;
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        attributes14.removeIgnoreCase("Doctype");
        endTag11.attributes = attributes14;
        endTag11.selfClosing = false;
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes26 = attributes23.put("hi!", "");
        endTag11.attributes = attributes26;
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes26.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = htmlTreeBuilder0.processStartTag("EOF", attributes26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeList28);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder11.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean22 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.newPendingTableCharacters();
        htmlTreeBuilder21.framesetOk(false);
        htmlTreeBuilder21.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder27.setFosterInserts(false);
        org.jsoup.nodes.Document document30 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.FormElement formElement31 = htmlTreeBuilder27.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder32.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean40 = htmlTreeBuilder39.isFragmentParsing();
        htmlTreeBuilder39.newPendingTableCharacters();
        htmlTreeBuilder39.framesetOk(false);
        htmlTreeBuilder39.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder45.setFosterInserts(false);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder45.getDocument();
        org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder45.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder50.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder45.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder39.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        boolean boolean57 = htmlTreeBuilder21.isSpecial((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document54);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNull(formElement31);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertNull(formElement49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray10 = new java.lang.String[] { "EndTag", "a " };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope("<![CDATA[hi!=\"\"]]>", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "EndTag", "a " });
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean7 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.newPendingTableCharacters();
        htmlTreeBuilder6.framesetOk(false);
        htmlTreeBuilder6.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder12.setFosterInserts(false);
        org.jsoup.nodes.Document document15 = htmlTreeBuilder12.getDocument();
        org.jsoup.nodes.FormElement formElement16 = htmlTreeBuilder12.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder17.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder12.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNull(formElement16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.ParseSettings parseSettings6 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str8 = parseSettings6.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes12 = parseSettings6.normalizeAttributes(attributes11);
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("", false);
        org.jsoup.nodes.Attributes attributes20 = attributes14.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("a ", "hi!=\"\"");
        attributes12.addAll(attributes20);
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        boolean boolean27 = attributes12.equals((java.lang.Object) " hi!=\"\"");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        org.jsoup.nodes.Attributes attributes30 = attributes28.clone();
        attributes12.addAll(attributes28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = xmlTreeBuilder0.processStartTag("", attributes28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isDoctype();
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.Class<?> wildcardClass13 = doctype0.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder6.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag10 = endTag6.name("a ");
        boolean boolean11 = tag10.isStartTag();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag10, htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        boolean boolean10 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element11 = htmlTreeBuilder6.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document16);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag4.reset();
        startTag4.normalName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertEmpty(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseSettings parseSettings13 = new org.jsoup.parser.ParseSettings(false, true);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        int int16 = attributes14.size();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        org.jsoup.nodes.Attributes attributes19 = attributes17.clone();
        attributes17.remove("Doctype");
        java.lang.String str23 = attributes17.getIgnoreCase("Doctype");
        attributes14.addAll(attributes17);
        org.jsoup.nodes.Attributes attributes25 = parseSettings13.normalizeAttributes(attributes17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.processStartTag("doctype", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        attributes2.addAll(attributes5);
        boolean boolean8 = attributes5.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes10 = attributes5.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.setEmptyAttributeValue();
        endTag57.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        attributes61.removeIgnoreCase("Doctype");
        endTag57.attributes = attributes61;
        java.lang.String str69 = attributes61.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        attributes70.normalize();
        org.jsoup.nodes.Attributes attributes72 = attributes70.clone();
        boolean boolean74 = attributes70.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes75 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes78 = attributes75.put("hi!", "");
        attributes70.addAll(attributes75);
        attributes61.addAll(attributes75);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = attributes61.dataset();
        boolean boolean82 = xmlTreeBuilder0.processStartTag("EOF", attributes61);
        java.io.Reader reader83 = null;
        org.jsoup.parser.Parser parser85 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader83, "EndTag", parser85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        boolean boolean8 = comment7.bogus;
        java.lang.String str9 = comment7.getData();
        java.lang.String str10 = comment7.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("<![CDATA[hi!=\"\"]]>", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inListItemScope("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder6.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean19 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.newPendingTableCharacters();
        htmlTreeBuilder18.framesetOk(false);
        htmlTreeBuilder18.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder24.setFosterInserts(false);
        org.jsoup.nodes.Document document27 = htmlTreeBuilder24.getDocument();
        org.jsoup.nodes.FormElement formElement28 = htmlTreeBuilder24.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder29.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder24.maybeSetBaseUri((org.jsoup.nodes.Element) document33);
        htmlTreeBuilder18.maybeSetBaseUri((org.jsoup.nodes.Element) document33);
        boolean boolean36 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document33);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = htmlTreeBuilder37.defaultSettings();
        org.jsoup.nodes.FormElement formElement39 = null;
        htmlTreeBuilder37.setFormElement(formElement39);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder37.state();
        java.util.List<java.lang.String> strList42 = htmlTreeBuilder37.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState43 = htmlTreeBuilder37.state();
        java.util.List<java.lang.String> strList44 = htmlTreeBuilder37.getPendingTableCharacters();
        htmlTreeBuilder37.newPendingTableCharacters();
        java.lang.String str46 = htmlTreeBuilder37.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = htmlTreeBuilder37.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.FormElement formElement50 = null;
        htmlTreeBuilder48.setFormElement(formElement50);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState52 = htmlTreeBuilder48.state();
        java.util.List<java.lang.String> strList53 = htmlTreeBuilder48.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState54 = htmlTreeBuilder48.state();
        htmlTreeBuilder48.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState57 = htmlTreeBuilder48.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder58 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean59 = htmlTreeBuilder58.isFragmentParsing();
        htmlTreeBuilder58.newPendingTableCharacters();
        htmlTreeBuilder58.framesetOk(false);
        htmlTreeBuilder58.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder64 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder64.setFosterInserts(false);
        org.jsoup.nodes.Document document67 = htmlTreeBuilder64.getDocument();
        org.jsoup.nodes.FormElement formElement68 = htmlTreeBuilder64.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.nodes.Document document73 = xmlTreeBuilder69.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder64.maybeSetBaseUri((org.jsoup.nodes.Element) document73);
        htmlTreeBuilder58.maybeSetBaseUri((org.jsoup.nodes.Element) document73);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder76 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean77 = htmlTreeBuilder76.isFragmentParsing();
        htmlTreeBuilder76.newPendingTableCharacters();
        htmlTreeBuilder76.framesetOk(false);
        htmlTreeBuilder76.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder82 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder82.setFosterInserts(false);
        org.jsoup.nodes.Document document85 = htmlTreeBuilder82.getDocument();
        org.jsoup.nodes.FormElement formElement86 = htmlTreeBuilder82.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder87 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder87.defaultSettings();
        org.jsoup.nodes.Document document91 = xmlTreeBuilder87.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder82.maybeSetBaseUri((org.jsoup.nodes.Element) document91);
        htmlTreeBuilder76.maybeSetBaseUri((org.jsoup.nodes.Element) document91);
        boolean boolean94 = htmlTreeBuilder58.isSpecial((org.jsoup.nodes.Element) document91);
        htmlTreeBuilder48.setHeadElement((org.jsoup.nodes.Element) document91);
        htmlTreeBuilder37.maybeSetBaseUri((org.jsoup.nodes.Element) document91);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element97 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(formElement10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNull(formElement28);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNull(strList42);
        org.junit.Assert.assertNull(htmlTreeBuilderState43);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(htmlTreeBuilderState47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNull(htmlTreeBuilderState52);
        org.junit.Assert.assertNull(strList53);
        org.junit.Assert.assertNull(htmlTreeBuilderState54);
        org.junit.Assert.assertNull(htmlTreeBuilderState57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(document67);
        org.junit.Assert.assertNull(formElement68);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(document85);
        org.junit.Assert.assertNull(formElement86);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(document91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("hi!", "");
        boolean boolean16 = attributes14.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag17 = startTag8.nameAttr("a ", attributes14);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes19.clone();
        boolean boolean23 = attributes19.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes27 = attributes24.put("hi!", "");
        attributes19.addAll(attributes24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        attributes29.normalize();
        org.jsoup.nodes.Attributes attributes31 = attributes29.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes31.asList();
        attributes19.addAll(attributes31);
        org.jsoup.parser.Token.StartTag startTag34 = startTag17.nameAttr("a", attributes19);
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        endTag35.appendAttributeValue(" hi!=\"\"");
        java.lang.String str38 = endTag35.normalName;
        endTag35.setEmptyAttributeValue();
        endTag35.appendTagName('a');
        char[] charArray47 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag35.appendAttributeValue(charArray47);
        startTag34.appendAttributeValue(charArray47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = htmlTreeBuilder0.insertEmpty(startTag34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributeList32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', ' ', '#', ' ', 'a' });
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        org.jsoup.parser.Token.Tag tag4 = tag1.reset();
        java.lang.String str5 = tag4.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = tag4.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isDoctype();
        java.lang.String str12 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData58 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character60 = cData58.data("hi!=\"\"");
        org.jsoup.parser.Token token61 = cData58.reset();
        java.lang.String str62 = cData58.toString();
        java.lang.String str63 = cData58.toString();
        java.lang.String str64 = cData58.toString();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData58);
        java.io.Reader reader66 = null;
        org.jsoup.parser.Parser parser68 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader66, "<![CDATA[<!---->]]>", parser68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(character60);
        org.junit.Assert.assertNotNull(token61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<![CDATA[null]]>" + "'", str62, "<![CDATA[null]]>");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<![CDATA[null]]>" + "'", str63, "<![CDATA[null]]>");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<![CDATA[null]]>" + "'", str64, "<![CDATA[null]]>");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Document document13 = htmlTreeBuilder10.getDocument();
        org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder10.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        org.jsoup.parser.Parser parser22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder0.parseFragment("eof", (org.jsoup.nodes.Element) document19, "<![CDATA[hi!=\"\"]]>", parser22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(formElement14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        endTag0.newAttribute();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isSelfClosing();
        endTag0.normalName = "<![CDATA[hi!=\"\"]]>";
        endTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.finaliseTag();
        java.lang.String str8 = startTag6.normalName();
        org.jsoup.nodes.Attributes attributes9 = startTag6.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insert(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        comment5.bogus = true;
        org.jsoup.parser.Token token8 = comment5.reset();
        xmlTreeBuilder0.insert(comment5);
        java.io.Reader reader10 = null;
        org.jsoup.parser.Parser parser12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader10, "", parser12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean8 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.newPendingTableCharacters();
        htmlTreeBuilder7.framesetOk(false);
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.nodes.Document document16 = htmlTreeBuilder13.getDocument();
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder13.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder18.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        java.util.List<java.lang.String> strList30 = htmlTreeBuilder25.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder25.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean36 = htmlTreeBuilder35.isFragmentParsing();
        htmlTreeBuilder35.newPendingTableCharacters();
        htmlTreeBuilder35.framesetOk(false);
        htmlTreeBuilder35.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder41.setFosterInserts(false);
        org.jsoup.nodes.Document document44 = htmlTreeBuilder41.getDocument();
        org.jsoup.nodes.FormElement formElement45 = htmlTreeBuilder41.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder46.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder41.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        htmlTreeBuilder35.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean54 = htmlTreeBuilder53.isFragmentParsing();
        htmlTreeBuilder53.newPendingTableCharacters();
        htmlTreeBuilder53.framesetOk(false);
        htmlTreeBuilder53.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder59.setFosterInserts(false);
        org.jsoup.nodes.Document document62 = htmlTreeBuilder59.getDocument();
        org.jsoup.nodes.FormElement formElement63 = htmlTreeBuilder59.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder64.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder59.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder53.maybeSetBaseUri((org.jsoup.nodes.Element) document68);
        boolean boolean71 = htmlTreeBuilder35.isSpecial((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder25.setHeadElement((org.jsoup.nodes.Element) document68);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document22, (org.jsoup.nodes.Element) document68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(formElement17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNull(htmlTreeBuilderState31);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNull(formElement45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNull(formElement63);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType3;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        attributes0.normalize();
        boolean boolean12 = attributes0.hasKey("doctype");
        org.jsoup.nodes.Attributes attributes13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.addAll(attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = endTag6.name("");
        boolean boolean10 = tag9.selfClosing;
        java.lang.String str11 = tag9.normalName;
        boolean boolean12 = tag9.isComment();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag9, htmlTreeBuilderState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder6.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean19 = htmlTreeBuilder18.isFragmentParsing();
        htmlTreeBuilder18.newPendingTableCharacters();
        htmlTreeBuilder18.framesetOk(false);
        htmlTreeBuilder18.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder24.setFosterInserts(false);
        org.jsoup.nodes.Document document27 = htmlTreeBuilder24.getDocument();
        org.jsoup.nodes.FormElement formElement28 = htmlTreeBuilder24.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder29.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder24.maybeSetBaseUri((org.jsoup.nodes.Element) document33);
        htmlTreeBuilder18.maybeSetBaseUri((org.jsoup.nodes.Element) document33);
        boolean boolean36 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document33);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = startTag37.getAttributes();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = htmlTreeBuilder0.insert(startTag37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(formElement10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNull(formElement28);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        boolean boolean8 = attributes6.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.nameAttr("a ", attributes6);
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = tag10.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = tag10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder6.newPendingTableCharacters();
        java.lang.String str15 = htmlTreeBuilder6.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder6.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder17.defaultSettings();
        org.jsoup.nodes.FormElement formElement19 = null;
        htmlTreeBuilder17.setFormElement(formElement19);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder17.state();
        java.util.List<java.lang.String> strList22 = htmlTreeBuilder17.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder17.state();
        htmlTreeBuilder17.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder17.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean28 = htmlTreeBuilder27.isFragmentParsing();
        htmlTreeBuilder27.newPendingTableCharacters();
        htmlTreeBuilder27.framesetOk(false);
        htmlTreeBuilder27.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder33.setFosterInserts(false);
        org.jsoup.nodes.Document document36 = htmlTreeBuilder33.getDocument();
        org.jsoup.nodes.FormElement formElement37 = htmlTreeBuilder33.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder38.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder33.maybeSetBaseUri((org.jsoup.nodes.Element) document42);
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document42);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean46 = htmlTreeBuilder45.isFragmentParsing();
        htmlTreeBuilder45.newPendingTableCharacters();
        htmlTreeBuilder45.framesetOk(false);
        htmlTreeBuilder45.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder51 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder51.setFosterInserts(false);
        org.jsoup.nodes.Document document54 = htmlTreeBuilder51.getDocument();
        org.jsoup.nodes.FormElement formElement55 = htmlTreeBuilder51.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder56.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder51.maybeSetBaseUri((org.jsoup.nodes.Element) document60);
        htmlTreeBuilder45.maybeSetBaseUri((org.jsoup.nodes.Element) document60);
        boolean boolean63 = htmlTreeBuilder27.isSpecial((org.jsoup.nodes.Element) document60);
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document60);
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document60);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNull(formElement37);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(document54);
        org.junit.Assert.assertNull(formElement55);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader4 = null;
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader4, "", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData15);
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character20 = cData18.data("Doctype");
        java.lang.String str21 = cData18.getData();
        java.lang.String str22 = cData18.getData();
        boolean boolean23 = xmlTreeBuilder9.process((org.jsoup.parser.Token) cData18);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Doctype" + "'", str21, "Doctype");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Doctype" + "'", str22, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.Parser parser19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("doctype", (org.jsoup.nodes.Element) document17, "", parser19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder8.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder8.state();
        java.util.List<java.lang.String> strList15 = htmlTreeBuilder8.getPendingTableCharacters();
        htmlTreeBuilder8.newPendingTableCharacters();
        java.lang.String str17 = htmlTreeBuilder8.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder8.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.FormElement formElement21 = null;
        htmlTreeBuilder19.setFormElement(formElement21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder19.state();
        java.util.List<java.lang.String> strList24 = htmlTreeBuilder19.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder19.state();
        htmlTreeBuilder19.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder19.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean30 = htmlTreeBuilder29.isFragmentParsing();
        htmlTreeBuilder29.newPendingTableCharacters();
        htmlTreeBuilder29.framesetOk(false);
        htmlTreeBuilder29.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder35.setFosterInserts(false);
        org.jsoup.nodes.Document document38 = htmlTreeBuilder35.getDocument();
        org.jsoup.nodes.FormElement formElement39 = htmlTreeBuilder35.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder40.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder35.maybeSetBaseUri((org.jsoup.nodes.Element) document44);
        htmlTreeBuilder29.maybeSetBaseUri((org.jsoup.nodes.Element) document44);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean48 = htmlTreeBuilder47.isFragmentParsing();
        htmlTreeBuilder47.newPendingTableCharacters();
        htmlTreeBuilder47.framesetOk(false);
        htmlTreeBuilder47.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder53.setFosterInserts(false);
        org.jsoup.nodes.Document document56 = htmlTreeBuilder53.getDocument();
        org.jsoup.nodes.FormElement formElement57 = htmlTreeBuilder53.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder58.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder58.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder53.maybeSetBaseUri((org.jsoup.nodes.Element) document62);
        htmlTreeBuilder47.maybeSetBaseUri((org.jsoup.nodes.Element) document62);
        boolean boolean65 = htmlTreeBuilder29.isSpecial((org.jsoup.nodes.Element) document62);
        htmlTreeBuilder19.setHeadElement((org.jsoup.nodes.Element) document62);
        htmlTreeBuilder8.maybeSetBaseUri((org.jsoup.nodes.Element) document62);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element68 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNull(formElement39);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(document56);
        org.junit.Assert.assertNull(formElement57);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes10 = tag9.getAttributes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.io.Reader reader9 = null;
        org.jsoup.parser.Parser parser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader9, "<![CDATA[hi!=\"\"]]>", parser11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Document document13 = htmlTreeBuilder10.getDocument();
        org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder10.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(formElement14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag13 = endTag10.name("");
        boolean boolean14 = tag13.selfClosing;
        java.lang.String str15 = tag13.normalName;
        boolean boolean16 = tag13.isComment();
        boolean boolean17 = attributes5.equals((java.lang.Object) tag13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes5.asList();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeList18);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str2 = cData1.getData();
        org.jsoup.parser.Token.Character character4 = cData1.data("<![CDATA[hi!=\"\"]]>");
        java.lang.String str5 = character4.getData();
        org.jsoup.parser.Token token6 = character4.reset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str5, "<![CDATA[hi!=\"\"]]>");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = token5.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertEmpty(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.setFosterInserts(false);
        boolean boolean8 = htmlTreeBuilder5.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder9.parse("EndTag", "EOF");
        boolean boolean20 = htmlTreeBuilder5.isSpecial((org.jsoup.nodes.Element) document19);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[<!---->]]>", "");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder12.setFormElement(formElement13);
        java.lang.String str15 = htmlTreeBuilder12.getBaseUri();
        org.jsoup.nodes.Element element16 = null;
        htmlTreeBuilder12.setHeadElement(element16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder18.defaultSettings();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        java.util.List<java.lang.String> strList23 = htmlTreeBuilder18.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder18.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean29 = htmlTreeBuilder28.isFragmentParsing();
        htmlTreeBuilder28.newPendingTableCharacters();
        htmlTreeBuilder28.framesetOk(false);
        htmlTreeBuilder28.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder34.setFosterInserts(false);
        org.jsoup.nodes.Document document37 = htmlTreeBuilder34.getDocument();
        org.jsoup.nodes.FormElement formElement38 = htmlTreeBuilder34.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder39.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder34.maybeSetBaseUri((org.jsoup.nodes.Element) document43);
        htmlTreeBuilder28.maybeSetBaseUri((org.jsoup.nodes.Element) document43);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean47 = htmlTreeBuilder46.isFragmentParsing();
        htmlTreeBuilder46.newPendingTableCharacters();
        htmlTreeBuilder46.framesetOk(false);
        htmlTreeBuilder46.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder52.setFosterInserts(false);
        org.jsoup.nodes.Document document55 = htmlTreeBuilder52.getDocument();
        org.jsoup.nodes.FormElement formElement56 = htmlTreeBuilder52.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder57.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder52.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder46.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        boolean boolean64 = htmlTreeBuilder28.isSpecial((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder12.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertNull(formElement38);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertNull(formElement56);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character3 = cData1.data("Doctype");
        java.lang.String str4 = cData1.getData();
        java.lang.String str5 = cData1.tokenType();
        java.lang.String str6 = cData1.toString();
        java.lang.String str7 = cData1.getData();
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CData" + "'", str5, "CData");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<![CDATA[Doctype]]>" + "'", str6, "<![CDATA[Doctype]]>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("a", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        java.lang.String str7 = endTag0.name();
        endTag0.setEmptyAttributeValue();
        boolean boolean9 = endTag0.isDoctype();
        endTag0.appendTagName("<!---->");
        java.lang.String str12 = endTag0.normalName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a<!---->" + "'", str12, "a<!---->");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean8 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder7.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder11.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData17 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder11.insert((org.jsoup.parser.Token.Character) cData17);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder11.parse("EndTag", "EOF");
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = startTag10.getAttributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.lang.String str14 = attributes13.toString();
        org.jsoup.parser.Token.StartTag startTag15 = startTag10.nameAttr("EOF", attributes13);
        java.lang.String str16 = startTag10.toString();
        org.jsoup.parser.Token.Tag tag17 = startTag10.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = htmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<EOF>" + "'", str16, "<EOF>");
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, true);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attributes6.put(" hi!=\"\"", false);
        boolean boolean11 = attributes9.hasKeyIgnoreCase("Doctype");
        int int12 = attributes9.size();
        org.jsoup.nodes.Attributes attributes13 = parseSettings2.normalizeAttributes(attributes9);
        java.lang.String str14 = attributes9.html();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!=\"\"" + "'", str14, " hi!=\"\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(" hi!=\"\"");
        java.lang.String str8 = endTag5.normalName;
        endTag5.selfClosing = true;
        boolean boolean11 = attributes0.equals((java.lang.Object) endTag5);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("hi!", "");
        org.jsoup.nodes.Attributes attributes18 = attributes15.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes15.iterator();
        endTag5.attributes = attributes15;
        endTag5.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character22 = endTag5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeItor19);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag57 = startTag56.reset();
        startTag56.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag60 = startTag56.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element61 = xmlTreeBuilder0.insert(startTag56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag60);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = endTag0.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("hi!", "");
        org.jsoup.nodes.Attributes attributes16 = attributes13.put(" hi!=\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.processStartTag("EndTag", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue("hi!");
        boolean boolean15 = endTag12.isEndTag();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(" hi!=\"\"");
        java.lang.String str19 = endTag16.normalName;
        endTag16.setEmptyAttributeValue();
        endTag16.appendTagName('a');
        char[] charArray28 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag16.appendAttributeValue(charArray28);
        endTag12.appendAttributeValue(charArray28);
        endTag0.appendAttributeValue(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ', '#', ' ', 'a' });
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str2 = parseSettings0.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes6 = parseSettings0.normalizeAttributes(attributes5);
        attributes5.remove("CData");
        java.lang.String str9 = attributes5.html();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder6.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean17 = htmlTreeBuilder16.isFragmentParsing();
        htmlTreeBuilder16.newPendingTableCharacters();
        htmlTreeBuilder16.framesetOk(false);
        htmlTreeBuilder16.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder22.setFosterInserts(false);
        org.jsoup.nodes.Document document25 = htmlTreeBuilder22.getDocument();
        org.jsoup.nodes.FormElement formElement26 = htmlTreeBuilder22.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder27.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder22.maybeSetBaseUri((org.jsoup.nodes.Element) document31);
        htmlTreeBuilder16.maybeSetBaseUri((org.jsoup.nodes.Element) document31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean35 = htmlTreeBuilder34.isFragmentParsing();
        htmlTreeBuilder34.newPendingTableCharacters();
        htmlTreeBuilder34.framesetOk(false);
        htmlTreeBuilder34.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder40.setFosterInserts(false);
        org.jsoup.nodes.Document document43 = htmlTreeBuilder40.getDocument();
        org.jsoup.nodes.FormElement formElement44 = htmlTreeBuilder40.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.nodes.Document document49 = xmlTreeBuilder45.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder40.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder34.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        boolean boolean52 = htmlTreeBuilder16.isSpecial((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document49);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document49);
        java.lang.String[] strArray55 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(formElement26);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertNull(formElement44);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray11 = new java.lang.String[] { "<EOF>", "", "EOF" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "<EOF>", "", "EOF" });
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        char[] charArray12 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag0.appendAttributeValue(charArray12);
        java.lang.String str14 = endTag0.name();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("<a   hi!=\"\">");
        java.lang.String str20 = endTag0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</<a   hi!=\"\">>" + "'", str20, "</<a   hi!=\"\">>");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList8 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getActiveFormattingElement("a<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(elementList8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        java.lang.String str12 = attributes4.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes15 = attributes13.clone();
        boolean boolean17 = attributes13.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = attributes18.put("hi!", "");
        attributes13.addAll(attributes18);
        attributes4.addAll(attributes18);
        java.lang.Class<?> wildcardClass24 = attributes18.getClass();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder3.setFosterInserts(false);
        org.jsoup.nodes.Document document6 = htmlTreeBuilder3.getDocument();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder3.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder8.defaultSettings();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder8.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder3.maybeSetBaseUri((org.jsoup.nodes.Element) document12);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "<!---->";
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        org.jsoup.parser.Token.Tag tag4 = tag1.reset();
        tag4.appendAttributeValue("EOF");
        boolean boolean7 = tag4.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("EndTag");
        java.lang.String str2 = cData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<![CDATA[EndTag]]>" + "'", str2, "<![CDATA[EndTag]]>");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder7.setFormElement(formElement8);
        java.lang.String str10 = htmlTreeBuilder7.getBaseUri();
        org.jsoup.nodes.Element element11 = null;
        htmlTreeBuilder7.setHeadElement(element11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder13.state();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder13.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder13.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean24 = htmlTreeBuilder23.isFragmentParsing();
        htmlTreeBuilder23.newPendingTableCharacters();
        htmlTreeBuilder23.framesetOk(false);
        htmlTreeBuilder23.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder29.setFosterInserts(false);
        org.jsoup.nodes.Document document32 = htmlTreeBuilder29.getDocument();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder29.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder34.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder29.maybeSetBaseUri((org.jsoup.nodes.Element) document38);
        htmlTreeBuilder23.maybeSetBaseUri((org.jsoup.nodes.Element) document38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean42 = htmlTreeBuilder41.isFragmentParsing();
        htmlTreeBuilder41.newPendingTableCharacters();
        htmlTreeBuilder41.framesetOk(false);
        htmlTreeBuilder41.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder47.setFosterInserts(false);
        org.jsoup.nodes.Document document50 = htmlTreeBuilder47.getDocument();
        org.jsoup.nodes.FormElement formElement51 = htmlTreeBuilder47.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        org.jsoup.nodes.Document document56 = xmlTreeBuilder52.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder47.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder41.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        boolean boolean59 = htmlTreeBuilder23.isSpecial((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertNull(formElement51);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.StartTag startTag10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(" hi!=\"\"");
        java.lang.String str10 = endTag7.normalName;
        endTag7.setEmptyAttributeValue();
        endTag7.appendTagName('a');
        char[] charArray19 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag7.appendAttributeValue(charArray19);
        endTag7.appendTagName(' ');
        endTag7.tagName = "hi!";
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = attributes28.put("hi!", "");
        boolean boolean33 = attributes31.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag34 = startTag25.nameAttr("a ", attributes31);
        java.lang.String str35 = startTag25.toString();
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        endTag37.appendAttributeValue(" hi!=\"\"");
        org.jsoup.parser.Token.Tag tag41 = endTag37.name("a ");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes45 = attributes42.put("hi!", "");
        org.jsoup.nodes.Attributes attributes48 = attributes45.put(" hi!=\"\"", false);
        int int49 = attributes45.size();
        endTag37.attributes = attributes45;
        attributes45.normalize();
        org.jsoup.parser.Token.StartTag startTag52 = startTag25.nameAttr("<!---->", attributes45);
        endTag7.attributes = attributes45;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag7, htmlTreeBuilderState54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<a   hi!=\"\">" + "'", str35, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue("hi!");
        boolean boolean15 = endTag12.isEndTag();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(" hi!=\"\"");
        java.lang.String str19 = endTag16.normalName;
        endTag16.setEmptyAttributeValue();
        endTag16.appendTagName('a');
        char[] charArray28 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag16.appendAttributeValue(charArray28);
        endTag12.appendAttributeValue(charArray28);
        endTag0.appendAttributeValue(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag32 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ', '#', ' ', 'a' });
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("CData");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "dd", "dt", "li", "optgroup", "option", "p", "rp", "rt" });
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean5 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.newPendingTableCharacters();
        htmlTreeBuilder4.framesetOk(false);
        htmlTreeBuilder4.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Document document13 = htmlTreeBuilder10.getDocument();
        org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder10.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean23 = htmlTreeBuilder22.isFragmentParsing();
        htmlTreeBuilder22.newPendingTableCharacters();
        htmlTreeBuilder22.framesetOk(false);
        htmlTreeBuilder22.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder28.setFosterInserts(false);
        org.jsoup.nodes.Document document31 = htmlTreeBuilder28.getDocument();
        org.jsoup.nodes.FormElement formElement32 = htmlTreeBuilder28.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder33.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder28.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        htmlTreeBuilder22.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        boolean boolean40 = htmlTreeBuilder4.isSpecial((org.jsoup.nodes.Element) document37);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(formElement14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNull(formElement32);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.bogus;
        org.jsoup.parser.Token token2 = comment0.reset();
        boolean boolean3 = comment0.isEndTag();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes12 = attributes5.put("hi!", true);
        java.lang.String str14 = attributes5.get("hi!=\"\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes5.iterator();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[<!---->]]>", "");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[<!---->]]>", "");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope("Doctype", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "button" });
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token11 = doctype10.reset();
        java.lang.StringBuilder stringBuilder12 = doctype10.systemIdentifier;
        boolean boolean13 = doctype10.isForceQuirks();
        java.lang.String str14 = doctype10.getSystemIdentifier();
        boolean boolean15 = doctype10.isForceQuirks();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype10, htmlTreeBuilderState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader3 = null;
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader3, "hi!", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        org.jsoup.nodes.Attributes attributes12 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes12.asList();
        attributes0.addAll(attributes12);
        attributes0.remove("a<!---->");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeList13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        java.lang.String str7 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        java.lang.String str59 = startTag57.normalName();
        int[] intArray60 = new int[] {};
        startTag57.appendAttributeValue(intArray60);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element62 = xmlTreeBuilder0.insert(startTag57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] {});
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("<![CDATA[EndTag]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean5 = htmlTreeBuilder4.isFragmentParsing();
        htmlTreeBuilder4.newPendingTableCharacters();
        htmlTreeBuilder4.framesetOk(false);
        htmlTreeBuilder4.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Document document13 = htmlTreeBuilder10.getDocument();
        org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder10.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder15.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document19);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean23 = htmlTreeBuilder22.isFragmentParsing();
        htmlTreeBuilder22.newPendingTableCharacters();
        htmlTreeBuilder22.framesetOk(false);
        htmlTreeBuilder22.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder28.setFosterInserts(false);
        org.jsoup.nodes.Document document31 = htmlTreeBuilder28.getDocument();
        org.jsoup.nodes.FormElement formElement32 = htmlTreeBuilder28.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder33.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder28.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        htmlTreeBuilder22.maybeSetBaseUri((org.jsoup.nodes.Element) document37);
        boolean boolean40 = htmlTreeBuilder4.isSpecial((org.jsoup.nodes.Element) document37);
        org.jsoup.parser.Parser parser42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment(" hi!=\"hi!=&quot;&quot;\" a =\"hi!=&quot;&quot;\"", (org.jsoup.nodes.Element) document37, "hi!", parser42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(formElement14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNull(formElement32);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token token2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.process(token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder11.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder11.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean22 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.newPendingTableCharacters();
        htmlTreeBuilder21.framesetOk(false);
        htmlTreeBuilder21.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder27.setFosterInserts(false);
        org.jsoup.nodes.Document document30 = htmlTreeBuilder27.getDocument();
        org.jsoup.nodes.FormElement formElement31 = htmlTreeBuilder27.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder32.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder21.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean40 = htmlTreeBuilder39.isFragmentParsing();
        htmlTreeBuilder39.newPendingTableCharacters();
        htmlTreeBuilder39.framesetOk(false);
        htmlTreeBuilder39.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder45.setFosterInserts(false);
        org.jsoup.nodes.Document document48 = htmlTreeBuilder45.getDocument();
        org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder45.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder50.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder45.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder39.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        boolean boolean57 = htmlTreeBuilder21.isSpecial((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document54);
        org.jsoup.parser.Token.Comment comment60 = new org.jsoup.parser.Token.Comment();
        boolean boolean61 = comment60.bogus;
        org.jsoup.parser.Token token62 = comment60.reset();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNull(formElement31);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertNull(formElement49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(token62);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("<!---->");
        java.lang.String str8 = cData7.getData();
        org.jsoup.parser.Token.Character character10 = cData7.data("<![CDATA[hi!=\"\"]]>");
        org.jsoup.parser.Token token11 = cData7.reset();
        org.jsoup.parser.Token.Character character13 = cData7.data("");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        endTag0.newAttribute();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isSelfClosing();
        endTag0.normalName = "<![CDATA[hi!=\"\"]]>";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        boolean boolean3 = attributes0.hasKeyIgnoreCase(" hi!=\"\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("<![CDATA[<!---->]]>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = startTag0.normalName();
        java.lang.String str3 = startTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str4 = parseSettings2.normalizeTag("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes8 = parseSettings2.normalizeAttributes(attributes7);
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = attributes10.put("", false);
        org.jsoup.nodes.Attributes attributes16 = attributes10.put("hi!", "hi!=\"\"");
        org.jsoup.nodes.Attributes attributes19 = attributes16.put("a ", "hi!=\"\"");
        attributes8.addAll(attributes16);
        org.jsoup.nodes.Attributes attributes21 = parseSettings1.normalizeAttributes(attributes16);
        java.lang.String str23 = parseSettings1.normalizeTag("a ");
        java.lang.String str25 = parseSettings1.normalizeTag("a ");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope("<![CDATA[Doctype]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attributes3.put(" hi!=\"\"", false);
        org.jsoup.nodes.Attributes attributes9 = attributes3.put("eof", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.setEmptyAttributeValue();
        endTag6.appendAttributeName('#');
        endTag6.newAttribute();
        boolean boolean11 = endTag6.isSelfClosing();
        endTag6.appendAttributeValue("<EOF>");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6, htmlTreeBuilderState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("eof");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder8.defaultSettings();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder8.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder9.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder9.state();
        java.util.List<java.lang.String> strList16 = htmlTreeBuilder9.getPendingTableCharacters();
        htmlTreeBuilder9.newPendingTableCharacters();
        java.lang.String str18 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder9.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = htmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.FormElement formElement22 = null;
        htmlTreeBuilder20.setFormElement(formElement22);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder20.state();
        java.util.List<java.lang.String> strList25 = htmlTreeBuilder20.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder20.state();
        htmlTreeBuilder20.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder20.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean31 = htmlTreeBuilder30.isFragmentParsing();
        htmlTreeBuilder30.newPendingTableCharacters();
        htmlTreeBuilder30.framesetOk(false);
        htmlTreeBuilder30.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder36.setFosterInserts(false);
        org.jsoup.nodes.Document document39 = htmlTreeBuilder36.getDocument();
        org.jsoup.nodes.FormElement formElement40 = htmlTreeBuilder36.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.nodes.Document document45 = xmlTreeBuilder41.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder36.maybeSetBaseUri((org.jsoup.nodes.Element) document45);
        htmlTreeBuilder30.maybeSetBaseUri((org.jsoup.nodes.Element) document45);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean49 = htmlTreeBuilder48.isFragmentParsing();
        htmlTreeBuilder48.newPendingTableCharacters();
        htmlTreeBuilder48.framesetOk(false);
        htmlTreeBuilder48.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder54 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder54.setFosterInserts(false);
        org.jsoup.nodes.Document document57 = htmlTreeBuilder54.getDocument();
        org.jsoup.nodes.FormElement formElement58 = htmlTreeBuilder54.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        org.jsoup.nodes.Document document63 = xmlTreeBuilder59.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder54.maybeSetBaseUri((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder48.maybeSetBaseUri((org.jsoup.nodes.Element) document63);
        boolean boolean66 = htmlTreeBuilder30.isSpecial((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document63);
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document63);
        org.jsoup.parser.Parser parser70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList71 = htmlTreeBuilder0.parseFragment("<![CDATA[hi!=\"\"]]>", (org.jsoup.nodes.Element) document63, "</a>", parser70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNull(formElement40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(document57);
        org.junit.Assert.assertNull(formElement58);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("hi!", "");
        endTag0.attributes = attributes15;
        endTag0.appendAttributeValue("EOF");
        boolean boolean19 = endTag0.isSelfClosing();
        boolean boolean20 = endTag0.isSelfClosing();
        int[] intArray27 = new int[] { ' ', (byte) -1, (byte) 100, (short) -1, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, (-1), 100, (-1), 100, 100 });
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.bogus;
        org.jsoup.parser.Token token7 = comment5.reset();
        boolean boolean8 = comment5.isEndTag();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        boolean boolean11 = comment10.bogus;
        java.lang.String str12 = comment10.getData();
        org.jsoup.parser.Token.Comment comment13 = comment10.asComment();
        xmlTreeBuilder0.insert(comment10);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse(reader15, "hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comment13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray11 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope("hi!", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "dd", "dt", "li", "optgroup", "option", "p", "rp", "rt" });
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inListItemScope("aEOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.String str10 = doctype0.getPubSysKey();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getName();
        doctype0.pubSysKey = "<![CDATA[null]]>";
        boolean boolean15 = doctype0.isCharacter();
        boolean boolean16 = doctype0.isCData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes12 = attributes5.put("<![CDATA[<!---->]]>", true);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.getAttributes();
        attributes5.addAll(attributes14);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        boolean boolean19 = attributes16.hasKeyIgnoreCase(" hi!=\"\"");
        java.lang.String str21 = attributes16.getIgnoreCase(" hi!=\"\"");
        int int22 = attributes16.size();
        attributes5.addAll(attributes16);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes25 = attributes5.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("hi!", "");
        attributes3.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes3;
        endTag0.appendAttributeName('a');
        boolean boolean12 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isCData();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(" hi!=\"\"");
        java.lang.String str11 = endTag8.normalName;
        endTag8.setEmptyAttributeValue();
        endTag8.appendTagName('a');
        char[] charArray20 = new char[] { ' ', ' ', '#', ' ', 'a' };
        endTag8.appendAttributeValue(charArray20);
        endTag8.appendTagName(' ');
        java.lang.String str24 = endTag8.name();
        org.jsoup.parser.Token token25 = endTag8.reset();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag8, htmlTreeBuilderState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', ' ', '#', ' ', 'a' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a " + "'", str24, "a ");
        org.junit.Assert.assertNotNull(token25);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("hi!", "");
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes12 = attributes5.put("hi!", true);
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes14 = attributes5.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder9.setFormElement(formElement10);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Element element13 = null;
        htmlTreeBuilder9.setHeadElement(element13);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.FormElement formElement17 = null;
        htmlTreeBuilder15.setFormElement(formElement17);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder15.state();
        java.util.List<java.lang.String> strList20 = htmlTreeBuilder15.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder15.state();
        htmlTreeBuilder15.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder15.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean26 = htmlTreeBuilder25.isFragmentParsing();
        htmlTreeBuilder25.newPendingTableCharacters();
        htmlTreeBuilder25.framesetOk(false);
        htmlTreeBuilder25.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder31.setFosterInserts(false);
        org.jsoup.nodes.Document document34 = htmlTreeBuilder31.getDocument();
        org.jsoup.nodes.FormElement formElement35 = htmlTreeBuilder31.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder36.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder31.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document40);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean44 = htmlTreeBuilder43.isFragmentParsing();
        htmlTreeBuilder43.newPendingTableCharacters();
        htmlTreeBuilder43.framesetOk(false);
        htmlTreeBuilder43.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder49.setFosterInserts(false);
        org.jsoup.nodes.Document document52 = htmlTreeBuilder49.getDocument();
        org.jsoup.nodes.FormElement formElement53 = htmlTreeBuilder49.getFormElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.nodes.Document document58 = xmlTreeBuilder54.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder49.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder43.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        boolean boolean61 = htmlTreeBuilder25.isSpecial((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder15.setHeadElement((org.jsoup.nodes.Element) document58);
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNull(formElement35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document52);
        org.junit.Assert.assertNull(formElement53);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder6.getDocument();
        boolean boolean10 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.nodes.Element element11 = htmlTreeBuilder6.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder12.parse("a ", "<![CDATA[<!---->]]>");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document16);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        java.io.Reader reader55 = null;
        org.jsoup.parser.Parser parser57 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader55, "<![CDATA[hi!=\"\"]]>", parser57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag1 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        java.lang.String str11 = comment8.toString();
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("a", true);
        boolean boolean18 = xmlTreeBuilder0.processStartTag("eof", attributes17);
        attributes17.normalize();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder9.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[<!---->]]>", "");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = startTag0.normalName();
        int[] intArray3 = new int[] {};
        startTag0.appendAttributeValue(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder9.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData15 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData15);
        org.jsoup.parser.Token.CData cData18 = new org.jsoup.parser.Token.CData("<!---->");
        org.jsoup.parser.Token.Character character20 = cData18.data("Doctype");
        java.lang.String str21 = cData18.getData();
        java.lang.String str22 = cData18.getData();
        boolean boolean23 = xmlTreeBuilder9.process((org.jsoup.parser.Token) cData18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = htmlTreeBuilder0.process((org.jsoup.parser.Token) cData18, htmlTreeBuilderState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Doctype" + "'", str21, "Doctype");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Doctype" + "'", str22, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.setEmptyAttributeValue();
        endTag10.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("hi!", "");
        attributes14.removeIgnoreCase("Doctype");
        endTag10.attributes = attributes14;
        java.lang.String str22 = attributes14.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes25 = attributes23.clone();
        boolean boolean27 = attributes23.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = attributes28.put("hi!", "");
        attributes23.addAll(attributes28);
        attributes14.addAll(attributes28);
        tag9.attributes = attributes14;
        boolean boolean36 = attributes14.hasKeyIgnoreCase("hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator37 = attributes14.spliterator();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator37);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inSelectScope("aEOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder10.state();
        java.util.List<java.lang.String> strList15 = htmlTreeBuilder10.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder10.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder20.setFosterInserts(false);
        boolean boolean23 = htmlTreeBuilder20.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder24.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData30 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData30);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder24.parse("EndTag", "EOF");
        boolean boolean35 = htmlTreeBuilder20.isSpecial((org.jsoup.nodes.Element) document34);
        boolean boolean36 = htmlTreeBuilder10.isSpecial((org.jsoup.nodes.Element) document34);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "");
        attributes4.removeIgnoreCase("Doctype");
        endTag0.attributes = attributes4;
        java.lang.String str12 = attributes4.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes15 = attributes13.clone();
        boolean boolean17 = attributes13.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = attributes18.put("hi!", "");
        attributes13.addAll(attributes18);
        attributes4.addAll(attributes18);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes4.dataset();
        java.lang.String str25 = attributes4.html();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " hi!=\"\"" + "'", str25, " hi!=\"\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.Token.Doctype doctype55 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token56 = doctype55.reset();
        java.lang.StringBuilder stringBuilder57 = doctype55.systemIdentifier;
        boolean boolean58 = doctype55.isForceQuirks();
        doctype55.forceQuirks = false;
        boolean boolean61 = doctype55.isEOF();
        boolean boolean62 = doctype55.isStartTag();
        xmlTreeBuilder0.insert(doctype55);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings66 = htmlTreeBuilder65.defaultSettings();
        org.jsoup.nodes.FormElement formElement67 = null;
        htmlTreeBuilder65.setFormElement(formElement67);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState69 = htmlTreeBuilder65.state();
        org.jsoup.nodes.FormElement formElement70 = null;
        htmlTreeBuilder65.setFormElement(formElement70);
        htmlTreeBuilder65.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder73 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean74 = htmlTreeBuilder73.isFragmentParsing();
        htmlTreeBuilder73.newPendingTableCharacters();
        org.jsoup.nodes.Document document76 = htmlTreeBuilder73.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder77.defaultSettings();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder77.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData83 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder77.insert((org.jsoup.parser.Token.Character) cData83);
        org.jsoup.nodes.Document document87 = xmlTreeBuilder77.parse("EndTag", "EOF");
        htmlTreeBuilder73.maybeSetBaseUri((org.jsoup.nodes.Element) document87);
        htmlTreeBuilder65.setHeadElement((org.jsoup.nodes.Element) document87);
        org.jsoup.parser.Parser parser91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList92 = xmlTreeBuilder0.parseFragment("<EOF>", (org.jsoup.nodes.Element) document87, "hi!=\"\"", parser91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(token56);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNull(htmlTreeBuilderState69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(document76);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(document87);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.String str10 = doctype0.getPubSysKey();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inSelectScope("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(formElement4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "button" });
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertEmpty(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder10.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder10.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes24 = attributes21.put("hi!", "");
        boolean boolean26 = attributes24.hasKey(" hi!=\"\"");
        org.jsoup.parser.Token.StartTag startTag27 = startTag18.nameAttr("a ", attributes24);
        java.lang.String str28 = startTag18.toString();
        org.jsoup.nodes.Element element29 = xmlTreeBuilder10.insert(startTag18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = htmlTreeBuilder0.onStack(element29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<a   hi!=\"\">" + "'", str28, "<a   hi!=\"\">");
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(" hi!=\"\"");
        java.lang.String str3 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = endTag0.attributes;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        endTag0.type = tokenType9;
        java.lang.String str11 = endTag0.toString();
        java.lang.String str12 = endTag0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</a>" + "'", str11, "</a>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</a>" + "'", str12, "</a>");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder0.setFormElement(formElement7);
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getFromStack("<<!---->>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype57 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token58 = doctype57.reset();
        java.lang.StringBuilder stringBuilder59 = doctype57.systemIdentifier;
        java.lang.StringBuilder stringBuilder60 = doctype57.systemIdentifier;
        java.lang.StringBuilder stringBuilder61 = doctype57.publicIdentifier;
        doctype57.forceQuirks = false;
        java.lang.String str64 = doctype57.getPublicIdentifier();
        xmlTreeBuilder0.insert(doctype57);
        org.jsoup.parser.Parser parser68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder0.parseFragment("a<!---->", "", parser68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder7.parse("a ", "<![CDATA[<!---->]]>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype57 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token58 = doctype57.reset();
        java.lang.StringBuilder stringBuilder59 = doctype57.systemIdentifier;
        java.lang.StringBuilder stringBuilder60 = doctype57.systemIdentifier;
        java.lang.StringBuilder stringBuilder61 = doctype57.publicIdentifier;
        doctype57.forceQuirks = false;
        java.lang.String str64 = doctype57.getPublicIdentifier();
        xmlTreeBuilder0.insert(doctype57);
        java.io.Reader reader66 = null;
        org.jsoup.parser.Parser parser68 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader66, "<![CDATA[hi!=\"\"]]>", parser68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("");
        tag3.normalName = " hi!=\"\"";
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        boolean boolean7 = tag3.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData(" hi!=\"\"");
        org.jsoup.parser.Token.Character character3 = cData1.data("hi!=\"\"");
        java.lang.String str4 = cData1.toString();
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<![CDATA[hi!=\"\"]]>" + "'", str4, "<![CDATA[hi!=\"\"]]>");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("a ", "<![CDATA[<!---->]]>");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("<!---->");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attributes12.put(" hi!=\"\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        boolean boolean17 = xmlTreeBuilder0.processStartTag("EOF", attributes12);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(" hi!=\"\"");
        java.lang.String str22 = endTag19.normalName;
        endTag19.setEmptyAttributeValue();
        endTag19.appendTagName('a');
        endTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes27 = endTag19.attributes;
        org.jsoup.parser.Token.Tag tag28 = endTag19.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.setEmptyAttributeValue();
        endTag29.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = attributes33.put("hi!", "");
        attributes33.removeIgnoreCase("Doctype");
        endTag29.attributes = attributes33;
        java.lang.String str41 = attributes33.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes42.clone();
        boolean boolean46 = attributes42.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = attributes47.put("hi!", "");
        attributes42.addAll(attributes47);
        attributes33.addAll(attributes47);
        tag28.attributes = attributes33;
        boolean boolean54 = xmlTreeBuilder0.processStartTag("Doctype", attributes33);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.setEmptyAttributeValue();
        endTag57.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes64 = attributes61.put("hi!", "");
        attributes61.removeIgnoreCase("Doctype");
        endTag57.attributes = attributes61;
        java.lang.String str69 = attributes61.get(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        attributes70.normalize();
        org.jsoup.nodes.Attributes attributes72 = attributes70.clone();
        boolean boolean74 = attributes70.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes75 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes78 = attributes75.put("hi!", "");
        attributes70.addAll(attributes75);
        attributes61.addAll(attributes75);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = attributes61.dataset();
        boolean boolean82 = xmlTreeBuilder0.processStartTag("EOF", attributes61);
        java.io.Reader reader83 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document85 = xmlTreeBuilder0.parse(reader83, "EndTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inTableScope(" hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "";
        java.lang.String str10 = doctype0.getPubSysKey();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getName();
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token14 = doctype0.reset();
        java.lang.String str15 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

