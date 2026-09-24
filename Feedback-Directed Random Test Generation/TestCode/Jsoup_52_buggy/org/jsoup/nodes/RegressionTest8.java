package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        int int17 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration11.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration11.attributes();
        java.lang.String str22 = xmlDeclaration11.toString();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        java.lang.String str24 = xmlDeclaration11.name();
        org.jsoup.nodes.Node node27 = xmlDeclaration11.attr("<!hi!>", "<!<!>>");
        org.jsoup.nodes.Node node29 = node27.removeAttr("<!<?<?>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        int int14 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.parent();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node26 = xmlDeclaration18.removeAttr("hi!");
        boolean boolean28 = xmlDeclaration18.hasAttr("hi!");
        boolean boolean30 = xmlDeclaration18.hasAttr("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass16 = nodeList15.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.toString();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        java.lang.String str21 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<?<?hi!>>");
        java.lang.String str25 = xmlDeclaration3.absUrl("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        int int15 = xmlDeclaration3.siblingIndex();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration3.hasAttr("<?hi!>");
        java.lang.String str19 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.clone();
        java.lang.String str20 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.processStartTag("<!>", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) (byte) 1, outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node6.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Attributes attributes33 = xmlDeclaration16.attributes();
        org.jsoup.nodes.Node node34 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node35 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node36 = xmlDeclaration16.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node41 = xmlDeclaration40.parentNode();
        int int42 = xmlDeclaration40.siblingIndex();
        boolean boolean43 = node36.hasSameValue((java.lang.Object) xmlDeclaration40);
        boolean boolean44 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration40);
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        xmlDeclaration3.outerHtmlTail(appendable45, 1, outputSettings47);
        boolean boolean50 = xmlDeclaration3.hasAttr("<!<?<?hi!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.parent();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Node node13 = xmlDeclaration5.removeAttr("hi!");
        org.jsoup.nodes.Node node15 = node13.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration19.outerHtmlTail(appendable24, 100, outputSettings26);
        java.lang.String str28 = xmlDeclaration19.toString();
        xmlDeclaration19.setBaseUri("#declaration");
        boolean boolean31 = node15.hasSameValue((java.lang.Object) xmlDeclaration19);
        org.jsoup.nodes.Attributes attributes32 = node15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xmlTreeBuilder0.processStartTag("<?#declaration>", attributes32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!>", "#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.lang.String str24 = xmlDeclaration21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration21.childNodes();
        java.lang.String str26 = xmlDeclaration21.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        org.jsoup.nodes.Node node33 = xmlDeclaration30.nextSibling();
        xmlDeclaration30.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration30.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration30.childNodes();
        boolean boolean38 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration30);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.lang.String str45 = xmlDeclaration42.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration42.childNodes();
        int int47 = xmlDeclaration42.childNodeSize();
        boolean boolean48 = xmlDeclaration30.hasSameValue((java.lang.Object) xmlDeclaration42);
        java.lang.String str49 = xmlDeclaration30.name();
        java.lang.String str50 = xmlDeclaration30.nodeName();
        boolean boolean51 = node17.hasSameValue((java.lang.Object) str50);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!>" + "'", str45, "<!>");
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#declaration" + "'", str50, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document25 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node26 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node26.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        node10.setBaseUri("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        xmlDeclaration16.setBaseUri("<!>");
        boolean boolean24 = xmlDeclaration16.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str25 = xmlDeclaration16.baseUri();
        java.lang.String str26 = xmlDeclaration16.toString();
        java.lang.String str27 = xmlDeclaration16.outerHtml();
        xmlDeclaration16.setBaseUri("<!>");
        boolean boolean30 = node10.equals((java.lang.Object) "<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.Node node12 = node7.previousSibling();
        org.jsoup.nodes.Node node13 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.attr("<!>", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        boolean boolean21 = node18.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = node18.clone();
        java.lang.String str23 = node22.baseUri();
        boolean boolean24 = xmlDeclaration3.hasSameValue((java.lang.Object) node22);
        boolean boolean26 = node22.hasAttr("<?#declaration>");
        java.lang.String str28 = node22.attr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node13 = node7.attr("<!<!>>", "<!<!>>");
        boolean boolean15 = node7.hasAttr("hi!");
        org.jsoup.nodes.Document document16 = node7.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str22 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration12.attr("<?#declaration>", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?hi!>>", "<?hi!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?#declaration>");
        org.jsoup.nodes.Node node12 = node10.wrap("<!hi!>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str15 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        java.lang.String str25 = xmlDeclaration20.absUrl("<!>");
        org.jsoup.nodes.Document document26 = xmlDeclaration20.ownerDocument();
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration20);
        boolean boolean29 = xmlDeclaration3.hasAttr("<!<?>>");
        boolean boolean31 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        int int38 = xmlDeclaration35.siblingIndex();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.nextSibling();
        java.lang.String str40 = xmlDeclaration35.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration35.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str47 = xmlDeclaration45.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlDeclaration45.childNodes();
        java.lang.String str49 = xmlDeclaration45.getWholeDeclaration();
        java.lang.String str50 = xmlDeclaration45.toString();
        boolean boolean51 = xmlDeclaration35.equals((java.lang.Object) xmlDeclaration45);
        int int52 = xmlDeclaration35.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlDeclaration35.childNodes();
        org.jsoup.nodes.Node node54 = xmlDeclaration35.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlDeclaration35.childNodes();
        xmlDeclaration35.setBaseUri("<!<!>>");
        boolean boolean58 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration35);
        java.lang.String str59 = xmlDeclaration35.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!>" + "'", str50, "<!>");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#declaration" + "'", str59, "#declaration");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        int int27 = xmlDeclaration24.siblingIndex();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.String str29 = xmlDeclaration24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration24.childNodesCopy();
        xmlDeclaration24.setBaseUri("");
        int int33 = xmlDeclaration24.childNodeSize();
        org.jsoup.nodes.Node node34 = xmlDeclaration24.clone();
        org.jsoup.nodes.Node node36 = node34.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node34.childNodesCopy();
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) node34);
        org.jsoup.nodes.Node node39 = node34.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        boolean boolean7 = xmlDeclaration3.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        int int15 = xmlDeclaration3.childNodeSize();
        java.lang.String str17 = xmlDeclaration3.absUrl("#declaration");
        boolean boolean19 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.Document document20 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.lang.String str16 = xmlDeclaration13.outerHtml();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        int int18 = xmlDeclaration13.siblingIndex();
        java.lang.String str19 = xmlDeclaration13.getWholeDeclaration();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, (int) (byte) 1, outputSettings22);
        boolean boolean24 = xmlDeclaration3.hasSameValue((java.lang.Object) outputSettings22);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        org.jsoup.nodes.Node node31 = xmlDeclaration28.nextSibling();
        xmlDeclaration28.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration28.siblingNodes();
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration28.attributes();
        java.lang.String str36 = xmlDeclaration28.nodeName();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration28.outerHtmlTail(appendable37, 1, outputSettings39);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str46 = xmlDeclaration44.attr("");
        int int47 = xmlDeclaration44.siblingIndex();
        org.jsoup.nodes.Node node48 = xmlDeclaration44.nextSibling();
        org.jsoup.nodes.Node node49 = xmlDeclaration44.parentNode();
        org.jsoup.nodes.Node node50 = xmlDeclaration44.clone();
        boolean boolean51 = xmlDeclaration28.equals((java.lang.Object) node50);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        xmlDeclaration3.outerHtmlTail(appendable4, (int) (byte) 100, outputSettings6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.attr("<!>");
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        java.lang.String str17 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<?>");
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.parentNode();
        org.jsoup.nodes.Node node22 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        int int30 = xmlDeclaration27.siblingIndex();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.nextSibling();
        java.lang.String str32 = xmlDeclaration27.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration27.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration37.childNodes();
        java.lang.String str41 = xmlDeclaration37.getWholeDeclaration();
        java.lang.String str42 = xmlDeclaration37.toString();
        boolean boolean43 = xmlDeclaration27.equals((java.lang.Object) xmlDeclaration37);
        int int44 = xmlDeclaration27.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration27.childNodes();
        java.lang.String str46 = xmlDeclaration27.toString();
        java.lang.String str47 = xmlDeclaration27.baseUri();
        java.lang.Appendable appendable48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = null;
        xmlDeclaration27.outerHtmlTail(appendable48, (int) (byte) -1, outputSettings50);
        java.lang.Appendable appendable52 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = null;
        xmlDeclaration27.outerHtmlTail(appendable52, 10, outputSettings54);
        java.lang.String str57 = xmlDeclaration27.absUrl("<!>");
        int int58 = xmlDeclaration27.siblingIndex();
        boolean boolean59 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!>" + "'", str46, "<!>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        int int22 = xmlDeclaration16.childNodeSize();
        int int23 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration16.clone();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration16);
        java.lang.String str27 = xmlDeclaration3.absUrl("<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.attr("<?hi!>", "<?<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        boolean boolean24 = node22.hasAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node22.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        java.lang.String str30 = xmlDeclaration11.nodeName();
        java.lang.String str32 = xmlDeclaration11.absUrl("<!hi!>");
        java.lang.String str34 = xmlDeclaration11.attr("<?<?hi!>>");
        java.lang.Class<?> wildcardClass35 = xmlDeclaration11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = node18.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!<!>>", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration7.childNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration7.nextSibling();
        java.lang.String str12 = xmlDeclaration7.toString();
        java.lang.String str13 = xmlDeclaration7.toString();
        int int14 = xmlDeclaration7.siblingIndex();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration7);
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration24.nextSibling();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str35 = xmlDeclaration24.baseUri();
        org.jsoup.nodes.Node node36 = xmlDeclaration24.previousSibling();
        java.lang.String str37 = xmlDeclaration24.outerHtml();
        org.jsoup.nodes.Node node40 = xmlDeclaration24.attr("<!hi!>", "<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str46 = xmlDeclaration44.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration44.childNodes();
        org.jsoup.nodes.Node node48 = xmlDeclaration44.nextSibling();
        java.lang.Appendable appendable49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        xmlDeclaration44.outerHtmlTail(appendable49, 100, outputSettings51);
        org.jsoup.nodes.Node node53 = xmlDeclaration44.nextSibling();
        org.jsoup.nodes.Node node54 = xmlDeclaration44.clone();
        org.jsoup.nodes.Node node56 = xmlDeclaration44.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node57 = xmlDeclaration44.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration44.childNodesCopy();
        java.lang.String str60 = xmlDeclaration44.absUrl("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            node40.replaceWith((org.jsoup.nodes.Node) xmlDeclaration44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        boolean boolean13 = xmlDeclaration3.hasAttr("hi!");
        boolean boolean15 = xmlDeclaration3.hasAttr("<!<!>>");
        java.lang.String str16 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.attr("<!<?>>", "<!hi!>");
        org.jsoup.nodes.Node node17 = node16.clone();
        int int18 = node17.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parent();
        java.lang.String str18 = xmlDeclaration3.name();
        int int19 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration17.baseUri();
        java.lang.String str20 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        java.lang.String str22 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        org.jsoup.nodes.Node node31 = xmlDeclaration26.parentNode();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.removeAttr("<!>");
        xmlDeclaration26.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration26.siblingNodes();
        boolean boolean37 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration26);
        java.lang.String str38 = xmlDeclaration17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?>" + "'", str22, "<?>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!<!>>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.after("<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?hi!>" + "'", str5, "<?hi!>");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.attr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        int int10 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        int int14 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document17 = node16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = document17.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.attr("", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = node12.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        java.lang.String str29 = xmlDeclaration17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration17.siblingNodes();
        boolean boolean31 = node12.hasSameValue((java.lang.Object) xmlDeclaration17);
        java.lang.Class<?> wildcardClass32 = xmlDeclaration17.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        java.lang.String str30 = xmlDeclaration17.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration17.childNodesCopy();
        boolean boolean33 = xmlDeclaration17.hasAttr("<?>");
        java.lang.String str34 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node36 = xmlDeclaration17.removeAttr("<?<?hi!>>");
        java.lang.String str37 = xmlDeclaration17.getWholeDeclaration();
        java.lang.String str38 = xmlDeclaration17.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str22 = xmlDeclaration12.nodeName();
        java.lang.String str24 = xmlDeclaration12.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?<?>>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.siblingNodes();
        org.jsoup.nodes.Node node6 = node4.nextSibling();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.absUrl("<?hi!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        org.jsoup.nodes.Node node12 = node7.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        boolean boolean21 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) 10, outputSettings25);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.childNodes();
        java.lang.String str28 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<?<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!hi!>", "<!<?<?hi!>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Document document20 = xmlDeclaration3.ownerDocument();
        int int21 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (short) -1, outputSettings14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, (int) (byte) 100, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node11.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        int int24 = xmlDeclaration3.siblingIndex();
        java.lang.String str25 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node26 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.String str18 = xmlDeclaration3.outerHtml();
        java.lang.Class<?> wildcardClass19 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("<!<?<?hi!>>>", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "#declaration");
        java.lang.String str17 = node15.attr("#declaration");
        org.jsoup.nodes.Document document18 = node15.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<?#declaration>", false);
        org.jsoup.nodes.Document document4 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = node16.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        org.jsoup.nodes.Node node23 = node22.parent();
        org.jsoup.nodes.Node node24 = node22.clone();
        java.lang.String str25 = node22.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?<?hi!>>", false);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        java.lang.String str30 = xmlDeclaration11.name();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration11.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.wrap("<!>");
        java.lang.String str10 = node6.baseUri();
        org.jsoup.nodes.Node node13 = node6.attr("<!<?<?>>>", "<!<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes15 = node14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<!>", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<!#declaration>");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node12.childNodeSize();
        org.jsoup.nodes.Node node14 = node12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node12.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str14 = xmlDeclaration3.absUrl("<?<?>>");
        java.lang.String str15 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        java.lang.String str30 = xmlDeclaration17.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        org.jsoup.nodes.Node node37 = xmlDeclaration34.clone();
        java.lang.String str38 = xmlDeclaration34.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        org.jsoup.nodes.Node node45 = xmlDeclaration42.nextSibling();
        xmlDeclaration42.setBaseUri("<!>");
        int int48 = xmlDeclaration42.childNodeSize();
        int int49 = xmlDeclaration42.siblingIndex();
        org.jsoup.nodes.Node node50 = xmlDeclaration42.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlDeclaration42.childNodesCopy();
        boolean boolean52 = xmlDeclaration34.equals((java.lang.Object) nodeList51);
        boolean boolean53 = xmlDeclaration17.equals((java.lang.Object) boolean52);
        org.jsoup.nodes.Document document54 = xmlDeclaration17.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(document54);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        boolean boolean21 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) 10, outputSettings25);
        org.jsoup.nodes.Node node28 = xmlDeclaration3.wrap("<!<!>>");
        java.lang.String str30 = xmlDeclaration3.absUrl("<?<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        int int9 = xmlDeclaration3.siblingIndex();
        boolean boolean11 = xmlDeclaration3.hasAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parent();
        java.lang.String str18 = xmlDeclaration3.name();
        java.lang.String str20 = xmlDeclaration3.attr("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str10 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node21 = xmlDeclaration13.removeAttr("<?<?>>");
        java.lang.String str22 = xmlDeclaration13.getWholeDeclaration();
        org.jsoup.nodes.Document document23 = xmlDeclaration13.ownerDocument();
        java.lang.String str24 = xmlDeclaration13.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        org.jsoup.nodes.Node node23 = node22.parent();
        org.jsoup.nodes.Node node25 = node22.removeAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        org.jsoup.nodes.Node node32 = xmlDeclaration29.nextSibling();
        xmlDeclaration29.setBaseUri("<!>");
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        xmlDeclaration29.outerHtmlTail(appendable35, 100, outputSettings37);
        boolean boolean40 = xmlDeclaration29.hasAttr("#declaration");
        java.lang.String str41 = xmlDeclaration29.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration29.childNodes();
        java.lang.String str43 = xmlDeclaration29.baseUri();
        java.lang.String str44 = xmlDeclaration29.toString();
        java.lang.String str45 = xmlDeclaration29.name();
        boolean boolean46 = node25.equals((java.lang.Object) str45);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!>" + "'", str44, "<!>");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        java.lang.String str14 = node10.baseUri();
        org.jsoup.nodes.Node node16 = node10.wrap("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("");
        java.lang.String str12 = xmlDeclaration3.absUrl("<!<!>>");
        int int13 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<?>");
        java.lang.String str13 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        java.lang.String str47 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration37.attributes();
        boolean boolean49 = node29.hasSameValue((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Attributes attributes50 = node29.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        java.lang.String str57 = xmlDeclaration54.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration54.childNodes();
        java.lang.String str59 = xmlDeclaration54.name();
        org.jsoup.nodes.Node node60 = xmlDeclaration54.parent();
        xmlDeclaration54.setBaseUri("<?hi!>");
        boolean boolean63 = node29.equals((java.lang.Object) "<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList64 = node29.siblingNodes();
        java.lang.String str65 = node29.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!>" + "'", str57, "<!>");
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<!>" + "'", str65, "<!>");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, 10, outputSettings14);
        java.lang.String str16 = xmlDeclaration3.nodeName();
        java.lang.String str17 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        int int16 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodes();
        java.lang.String str34 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration3.attr("<?hi!>", "<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node37.childNodes();
        java.lang.String str40 = node37.attr("<!<!>>");
        org.jsoup.nodes.Node node42 = node37.removeAttr("<!#declaration>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.lang.String str12 = node10.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.lang.String str20 = xmlDeclaration16.getWholeDeclaration();
        int int21 = xmlDeclaration16.siblingIndex();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        int int23 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration16.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration16.siblingNodes();
        boolean boolean27 = node10.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration16.attributes();
        java.lang.String str29 = xmlDeclaration16.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        java.lang.String str16 = xmlDeclaration3.attr("<?#declaration>");
        java.lang.String str18 = xmlDeclaration3.attr("<!<?<?hi!>>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node9 = node8.parentNode();
        java.lang.String str11 = node8.absUrl("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.childNodesCopy();
        org.jsoup.nodes.Node node14 = node8.removeAttr("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node26 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = node26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document7.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.clone();
        org.jsoup.nodes.Node node25 = node22.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node28 = node25.attr("<!>", "hi!");
        org.jsoup.nodes.Node node29 = node25.nextSibling();
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) node29);
        org.jsoup.nodes.Attributes attributes31 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.before("<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        java.lang.String str17 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.siblingNodes();
        org.jsoup.nodes.Document document29 = xmlDeclaration21.ownerDocument();
        java.lang.String str30 = xmlDeclaration21.toString();
        java.lang.String str31 = xmlDeclaration21.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str37 = xmlDeclaration35.attr("");
        int int38 = xmlDeclaration35.siblingIndex();
        org.jsoup.nodes.Node node39 = xmlDeclaration35.nextSibling();
        java.lang.String str40 = xmlDeclaration35.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration35.siblingNodes();
        org.jsoup.nodes.Node node44 = xmlDeclaration35.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes45 = node44.attributes();
        boolean boolean46 = xmlDeclaration21.hasSameValue((java.lang.Object) attributes45);
        int int47 = xmlDeclaration21.childNodeSize();
        boolean boolean48 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration52 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str54 = xmlDeclaration52.attr("");
        int int55 = xmlDeclaration52.siblingIndex();
        xmlDeclaration52.setBaseUri("#declaration");
        boolean boolean58 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration52);
        java.lang.Appendable appendable59 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration21.outerHtmlHead(appendable59, (int) (byte) 1, outputSettings61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<?hi!>", false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.attr("<!<?>>", "<!hi!>");
        org.jsoup.nodes.Node node17 = node16.clone();
        java.lang.String str19 = node17.attr("<!hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?<?>>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes5 = node4.attributes();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", false);
        xmlDeclaration3.setBaseUri("<!<?>>");
        xmlDeclaration3.setBaseUri("<!<!>>");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = node13.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.String str21 = xmlDeclaration14.attr("");
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) "");
        java.lang.String str23 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration3.attr("<!hi!>");
        org.jsoup.nodes.Node node27 = xmlDeclaration3.removeAttr("<?<?hi!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        xmlDeclaration3.outerHtmlTail(appendable4, (int) (byte) 100, outputSettings6);
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str14 = xmlDeclaration13.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str23 = xmlDeclaration18.absUrl("<!>");
        org.jsoup.nodes.Node node24 = xmlDeclaration18.parentNode();
        java.lang.Class<?> wildcardClass25 = xmlDeclaration18.getClass();
        boolean boolean26 = xmlDeclaration13.equals((java.lang.Object) wildcardClass25);
        org.jsoup.nodes.Node node27 = xmlDeclaration13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration13.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration13.clone();
        org.jsoup.nodes.Node node32 = xmlDeclaration13.attr("#declaration", "<?hi!>");
        boolean boolean33 = xmlDeclaration3.equals((java.lang.Object) node32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Attributes attributes30 = node13.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node13.childNodes();
        org.jsoup.nodes.Attributes attributes32 = node13.attributes();
        org.jsoup.nodes.Node node33 = node13.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Document document19 = xmlDeclaration13.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration13.outerHtmlTail(appendable20, 0, outputSettings22);
        org.jsoup.nodes.Node node24 = xmlDeclaration13.parent();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) node24);
        java.lang.String str26 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?hi!>>", "<!<?<?>>>", true);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        int int14 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!>", "");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes19 = node18.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration23.baseUri();
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration23);
        java.lang.String str30 = xmlDeclaration3.attr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration34.childNodes();
        java.lang.String str38 = xmlDeclaration34.nodeName();
        java.lang.Appendable appendable39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        xmlDeclaration34.outerHtmlTail(appendable39, (int) (short) 100, outputSettings41);
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration34.outerHtmlTail(appendable43, (int) '4', outputSettings45);
        org.jsoup.nodes.Node node48 = xmlDeclaration34.removeAttr("<!<?>>");
        boolean boolean50 = xmlDeclaration34.hasAttr("<!hi!>");
        boolean boolean51 = xmlDeclaration3.hasSameValue((java.lang.Object) boolean50);
        java.lang.String str52 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<?>" + "'", str26, "<?>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        java.lang.String str34 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node35 = xmlDeclaration12.clone();
        int int36 = node35.siblingIndex();
        org.jsoup.nodes.Node node37 = node35.parentNode();
        boolean boolean39 = node35.hasAttr("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Document document23 = xmlDeclaration19.ownerDocument();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) document23);
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node26.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            node26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        node10.setBaseUri("<?>");
        org.jsoup.nodes.Node node13 = node10.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = node13.hasAttr("<?<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!<?>>" + "'", str6, "<!<?>>");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        java.lang.String str24 = xmlDeclaration19.absUrl("<!>");
        java.lang.String str25 = xmlDeclaration19.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        java.lang.String str17 = xmlDeclaration3.baseUri();
        java.lang.String str18 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.childNodes();
        java.lang.String str20 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) '4', outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", false);
        java.lang.String str5 = xmlDeclaration3.attr("<!<!>>");
        int int6 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?<!>>" + "'", str10, "<?<!>>");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        int int18 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        org.jsoup.nodes.Node node25 = xmlDeclaration22.clone();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration22.outerHtmlTail(appendable26, 10, outputSettings28);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        org.jsoup.nodes.Node node36 = xmlDeclaration33.nextSibling();
        xmlDeclaration33.setBaseUri("<!>");
        int int39 = xmlDeclaration33.siblingIndex();
        org.jsoup.nodes.Node node42 = xmlDeclaration33.attr("<!>", "<!>");
        boolean boolean43 = xmlDeclaration22.equals((java.lang.Object) "<!>");
        boolean boolean44 = xmlDeclaration12.hasSameValue((java.lang.Object) "<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        boolean boolean9 = xmlDeclaration3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration14.outerHtmlTail(appendable20, 100, outputSettings22);
        boolean boolean25 = xmlDeclaration14.hasAttr("#declaration");
        java.lang.String str26 = xmlDeclaration14.toString();
        org.jsoup.nodes.Document document27 = xmlDeclaration14.ownerDocument();
        java.lang.String str28 = xmlDeclaration14.name();
        boolean boolean29 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Document document30 = xmlDeclaration14.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!<?>>", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str9 = xmlDeclaration8.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration8.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        java.lang.String str29 = xmlDeclaration25.getWholeDeclaration();
        java.lang.String str30 = xmlDeclaration25.toString();
        boolean boolean31 = xmlDeclaration15.equals((java.lang.Object) xmlDeclaration25);
        int int32 = xmlDeclaration15.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration15.childNodes();
        java.lang.String str34 = xmlDeclaration15.toString();
        java.lang.String str35 = xmlDeclaration15.baseUri();
        java.lang.String str36 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean37 = xmlDeclaration8.hasSameValue((java.lang.Object) xmlDeclaration15);
        boolean boolean38 = xmlDeclaration3.equals((java.lang.Object) boolean37);
        org.jsoup.nodes.Node node39 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.lang.String str15 = xmlDeclaration3.absUrl("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        int int12 = xmlDeclaration9.siblingIndex();
        java.lang.String str13 = xmlDeclaration9.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration9.parent();
        java.lang.String str15 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration9.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node17.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration23.outerHtmlTail(appendable28, 100, outputSettings30);
        java.lang.String str32 = xmlDeclaration23.toString();
        xmlDeclaration23.setBaseUri("#declaration");
        boolean boolean35 = node19.hasSameValue((java.lang.Object) xmlDeclaration23);
        boolean boolean36 = node4.equals((java.lang.Object) xmlDeclaration23);
        java.lang.String str37 = xmlDeclaration23.outerHtml();
        java.lang.String str38 = xmlDeclaration23.name();
        org.jsoup.nodes.Node node39 = xmlDeclaration23.parent();
        java.lang.String str40 = xmlDeclaration23.name();
        boolean boolean42 = xmlDeclaration23.hasAttr("<!#declaration>");
        org.jsoup.nodes.Node node45 = xmlDeclaration23.attr("<?<?>>", "<?hi!>");
        java.lang.Class<?> wildcardClass46 = xmlDeclaration23.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        xmlDeclaration5.setBaseUri("<!>");
        int int12 = xmlDeclaration5.siblingIndex();
        java.lang.String str13 = xmlDeclaration5.name();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("<?<!>>", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.Attributes attributes14 = node13.attributes();
        org.jsoup.nodes.Node node15 = node13.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!<?>>");
        org.jsoup.nodes.Node node14 = node9.wrap("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.Document document23 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.Node node24 = xmlDeclaration12.clone();
        boolean boolean26 = xmlDeclaration12.hasAttr("<?<?>>");
        org.jsoup.nodes.Node node27 = xmlDeclaration12.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node14.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        org.jsoup.nodes.Node node23 = node22.parent();
        org.jsoup.nodes.Node node24 = node22.clone();
        java.lang.String str26 = node24.attr("<!hi!>");
        org.jsoup.nodes.Node node27 = node24.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node27.after("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.parent();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration10.removeAttr("hi!");
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration3.outerHtmlTail(appendable21, (int) '#', outputSettings23);
        java.lang.String str25 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration3.childNodesCopy();
        int int24 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node26 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration30.childNodes();
        java.lang.String str34 = xmlDeclaration30.getWholeDeclaration();
        java.lang.String str35 = xmlDeclaration30.toString();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        xmlDeclaration30.outerHtmlTail(appendable36, (int) (short) 10, outputSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration30.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str46 = xmlDeclaration44.attr("");
        int int47 = xmlDeclaration44.siblingIndex();
        org.jsoup.nodes.Node node48 = xmlDeclaration44.nextSibling();
        java.lang.String str49 = xmlDeclaration44.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlDeclaration44.childNodesCopy();
        org.jsoup.nodes.Document document51 = xmlDeclaration44.ownerDocument();
        java.lang.String str53 = xmlDeclaration44.absUrl("<!>");
        java.lang.String str54 = xmlDeclaration44.name();
        boolean boolean55 = xmlDeclaration30.equals((java.lang.Object) xmlDeclaration44);
        java.lang.Appendable appendable56 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = null;
        xmlDeclaration44.outerHtmlTail(appendable56, (int) (short) 100, outputSettings58);
        int int60 = xmlDeclaration44.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#declaration" + "'", str49, "#declaration");
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.absUrl("<?hi!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node15 = node14.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.String str20 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration3.outerHtmlTail(appendable24, (int) (byte) 0, outputSettings26);
        java.lang.String str29 = xmlDeclaration3.attr("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        java.lang.String str24 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.Node node26 = xmlDeclaration15.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node28 = node26.removeAttr("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration17.outerHtmlTail(appendable29, (int) (short) 100, outputSettings31);
        int int33 = xmlDeclaration17.siblingIndex();
        java.lang.String str34 = xmlDeclaration17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration17.childNodesCopy();
        java.lang.String str36 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration17.nextSibling();
        org.jsoup.nodes.Node node40 = xmlDeclaration17.attr("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "#declaration", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!hi!>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.attr("#declaration");
        int int9 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration13.outerHtmlTail(appendable18, (-1), outputSettings20);
        org.jsoup.nodes.Document document22 = xmlDeclaration13.ownerDocument();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration13.after("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.siblingNodes();
        org.jsoup.nodes.Node node17 = node13.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        org.jsoup.nodes.Node node19 = node17.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "hi!", true);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration22.siblingNodes();
        java.lang.String str24 = xmlDeclaration22.toString();
        java.lang.String str25 = xmlDeclaration22.name();
        java.lang.String str26 = xmlDeclaration22.getWholeDeclaration();
        java.lang.String str27 = xmlDeclaration22.toString();
        // The following exception was thrown during execution in test generation
        try {
            node18.replaceWith((org.jsoup.nodes.Node) xmlDeclaration22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<?<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) ' ', outputSettings25);
        int int27 = xmlDeclaration3.childNodeSize();
        int int28 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document29 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<!#declaration>");
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node24 = xmlDeclaration23.parent();
        java.lang.String str25 = xmlDeclaration23.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        java.lang.String str32 = xmlDeclaration29.outerHtml();
        org.jsoup.nodes.Node node33 = xmlDeclaration29.clone();
        boolean boolean34 = xmlDeclaration23.equals((java.lang.Object) node33);
        org.jsoup.nodes.Node node36 = node33.removeAttr("<!>");
        org.jsoup.nodes.Node node39 = node33.attr("<!<!>>", "<?>");
        org.jsoup.nodes.Node node41 = node33.removeAttr("<!<!>>");
        boolean boolean42 = xmlDeclaration17.equals((java.lang.Object) node33);
        org.jsoup.nodes.Node node43 = xmlDeclaration17.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = xmlDeclaration3.after(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str16 = xmlDeclaration3.toString();
        java.lang.String str17 = xmlDeclaration3.nodeName();
        java.lang.String str18 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration3.hasAttr("<?hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!<!>>", "<?<?>>");
        org.jsoup.nodes.Node node19 = node17.removeAttr("<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.attr("<!#declaration>");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document7.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        xmlDeclaration3.outerHtmlTail(appendable5, 0, outputSettings7);
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<?<!>>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        boolean boolean24 = node22.hasAttr("<?<?>>");
        org.jsoup.nodes.Node node25 = node22.clone();
        java.lang.Class<?> wildcardClass26 = node22.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document5 = xmlDeclaration3.ownerDocument();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!#declaration>" + "'", str7, "<!#declaration>");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str22 = xmlDeclaration12.toString();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration12.outerHtmlTail(appendable23, 1, outputSettings25);
        java.lang.String str27 = xmlDeclaration12.nodeName();
        java.lang.String str28 = xmlDeclaration12.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "hi!", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("<?hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration11.childNodes();
        java.lang.String str16 = xmlDeclaration11.name();
        int int17 = xmlDeclaration11.childNodeSize();
        java.lang.String str18 = xmlDeclaration11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.lang.String str21 = xmlDeclaration18.outerHtml();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.clone();
        xmlDeclaration18.setBaseUri("<!>");
        java.lang.String str25 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean27 = xmlDeclaration18.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration18.childNodes();
        java.lang.String str29 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.Node node32 = xmlDeclaration18.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        int int34 = xmlDeclaration12.siblingIndex();
        java.lang.String str36 = xmlDeclaration12.absUrl("<?<?>>");
        org.jsoup.nodes.Attributes attributes37 = xmlDeclaration12.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str42 = xmlDeclaration41.getWholeDeclaration();
        java.lang.String str43 = xmlDeclaration41.baseUri();
        java.lang.String str44 = xmlDeclaration41.outerHtml();
        org.jsoup.nodes.Node node45 = xmlDeclaration41.clone();
        java.lang.String str46 = xmlDeclaration41.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration41.childNodesCopy();
        boolean boolean48 = xmlDeclaration12.equals((java.lang.Object) nodeList47);
        java.lang.String str49 = xmlDeclaration12.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<?>" + "'", str44, "<?>");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<?>" + "'", str46, "<?>");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<!>");
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.nextSibling();
        java.lang.String str19 = xmlDeclaration3.outerHtml();
        java.lang.String str21 = xmlDeclaration3.attr("<?<?>>");
        java.lang.String str23 = xmlDeclaration3.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node13 = node7.attr("<!<!>>", "<!<!>>");
        org.jsoup.nodes.Attributes attributes14 = node7.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.String str23 = xmlDeclaration3.absUrl("#declaration");
        boolean boolean25 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node27 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node28 = xmlDeclaration3.clone();
        int int29 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        java.lang.String str15 = node11.attr("");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<!<!>>");
        int int13 = xmlDeclaration3.childNodeSize();
        java.lang.String str15 = xmlDeclaration3.attr("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.Object obj11 = null;
        boolean boolean12 = xmlDeclaration3.equals(obj11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.parentNode();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.removeAttr("<!>");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration15.attr("", "<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        int int31 = xmlDeclaration28.siblingIndex();
        org.jsoup.nodes.Node node32 = xmlDeclaration28.nextSibling();
        org.jsoup.nodes.Node node33 = xmlDeclaration28.parentNode();
        org.jsoup.nodes.Node node34 = xmlDeclaration28.clone();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.parent();
        org.jsoup.nodes.Node node36 = xmlDeclaration28.parentNode();
        java.lang.String str38 = xmlDeclaration28.attr("<!#declaration>");
        boolean boolean39 = xmlDeclaration3.equals((java.lang.Object) str38);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        int int14 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node20 = xmlDeclaration18.removeAttr("#declaration");
        java.lang.String str22 = node20.absUrl("<!<!>>");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node20.siblingNodes();
        org.jsoup.nodes.Node node24 = node20.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        boolean boolean9 = xmlDeclaration3.hasAttr("<?<?>>");
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!>", true);
        org.jsoup.nodes.Node node18 = xmlDeclaration17.nextSibling();
        java.lang.String str19 = xmlDeclaration17.nodeName();
        boolean boolean21 = xmlDeclaration17.hasAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) -1, outputSettings13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        int int12 = xmlDeclaration9.siblingIndex();
        java.lang.String str13 = xmlDeclaration9.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration9.parent();
        java.lang.String str15 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration9.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node17.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration23.outerHtmlTail(appendable28, 100, outputSettings30);
        java.lang.String str32 = xmlDeclaration23.toString();
        xmlDeclaration23.setBaseUri("#declaration");
        boolean boolean35 = node19.hasSameValue((java.lang.Object) xmlDeclaration23);
        boolean boolean36 = node4.equals((java.lang.Object) xmlDeclaration23);
        java.lang.String str37 = xmlDeclaration23.outerHtml();
        java.lang.String str38 = xmlDeclaration23.name();
        org.jsoup.nodes.Node node39 = xmlDeclaration23.parent();
        java.lang.String str40 = xmlDeclaration23.name();
        boolean boolean42 = xmlDeclaration23.hasAttr("<!#declaration>");
        org.jsoup.nodes.Node node45 = xmlDeclaration23.attr("<?<?>>", "<?hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str50 = xmlDeclaration49.getWholeDeclaration();
        java.lang.String str52 = xmlDeclaration49.attr("");
        org.jsoup.nodes.Node node53 = xmlDeclaration49.clone();
        java.lang.Appendable appendable54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = null;
        xmlDeclaration49.outerHtmlTail(appendable54, 1, outputSettings56);
        org.jsoup.nodes.Node node58 = xmlDeclaration49.clone();
        java.lang.String str59 = xmlDeclaration49.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node45.replaceWith((org.jsoup.nodes.Node) xmlDeclaration49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        int int14 = xmlDeclaration3.childNodeSize();
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        org.jsoup.nodes.Node node26 = xmlDeclaration23.nextSibling();
        xmlDeclaration23.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration23.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration23.childNodes();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration23.outerHtmlTail(appendable31, (int) (short) 0, outputSettings33);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        java.lang.String str10 = node7.outerHtml();
        org.jsoup.nodes.Node node12 = node7.removeAttr("<?>");
        int int13 = node12.childNodeSize();
        org.jsoup.nodes.Node node14 = node12.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<!#declaration>", false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.name();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        xmlDeclaration12.setBaseUri("#declaration");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration12.outerHtmlTail(appendable24, 0, outputSettings26);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration12.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        int int20 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("<?#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        org.jsoup.nodes.Node node15 = node12.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.childNodes();
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.clone();
        java.lang.String str32 = node31.baseUri();
        boolean boolean33 = xmlDeclaration19.equals((java.lang.Object) str32);
        org.jsoup.nodes.Node node36 = xmlDeclaration19.attr("hi!", "#declaration");
        org.jsoup.nodes.Node node38 = node36.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        int int45 = xmlDeclaration42.siblingIndex();
        org.jsoup.nodes.Node node46 = xmlDeclaration42.nextSibling();
        org.jsoup.nodes.Node node47 = xmlDeclaration42.parentNode();
        org.jsoup.nodes.Node node49 = xmlDeclaration42.removeAttr("<!>");
        org.jsoup.nodes.Node node50 = xmlDeclaration42.previousSibling();
        boolean boolean51 = node36.equals((java.lang.Object) xmlDeclaration42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = node15.hasSameValue((java.lang.Object) xmlDeclaration42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.attr("<!>", "<!hi!>");
        int int10 = node9.siblingIndex();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str31 = xmlDeclaration12.nodeName();
        java.lang.String str32 = xmlDeclaration12.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration12.toString();
        int int34 = xmlDeclaration12.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        java.lang.String str14 = xmlDeclaration3.absUrl("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, (int) 'a', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        org.jsoup.nodes.Node node14 = node12.clone();
        org.jsoup.nodes.Node node15 = node12.parent();
        org.jsoup.nodes.Node node17 = node12.removeAttr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration21.outerHtmlTail(appendable26, 100, outputSettings28);
        java.lang.String str30 = xmlDeclaration21.toString();
        xmlDeclaration21.setBaseUri("#declaration");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration21.outerHtmlTail(appendable33, (int) ' ', outputSettings35);
        org.jsoup.nodes.Node node37 = xmlDeclaration21.clone();
        org.jsoup.nodes.Node node38 = node37.clone();
        org.jsoup.nodes.Node node39 = node38.previousSibling();
        boolean boolean40 = node17.hasSameValue((java.lang.Object) node38);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        boolean boolean7 = xmlDeclaration3.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.clone();
        int int20 = xmlDeclaration16.childNodeSize();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        boolean boolean23 = node12.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node20 = xmlDeclaration3.wrap("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        java.lang.String str6 = node5.baseUri();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!hi!>" + "'", str6, "<!hi!>");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.String str22 = xmlDeclaration3.toString();
        java.lang.String str23 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration3.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        java.lang.String str40 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Node node41 = xmlDeclaration37.clone();
        xmlDeclaration37.setBaseUri("<!>");
        int int44 = xmlDeclaration37.siblingIndex();
        java.lang.String str45 = xmlDeclaration37.name();
        int int46 = xmlDeclaration37.childNodeSize();
        int int47 = xmlDeclaration37.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.removeAttr("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str22 = xmlDeclaration12.toString();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration12.outerHtmlTail(appendable23, 1, outputSettings25);
        java.lang.String str27 = xmlDeclaration12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<!>>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.lang.String str14 = xmlDeclaration3.name();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        java.lang.String str14 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        boolean boolean21 = node18.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = node18.clone();
        java.lang.String str23 = node22.baseUri();
        boolean boolean24 = xmlDeclaration3.hasSameValue((java.lang.Object) node22);
        org.jsoup.nodes.Node node25 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration3.outerHtmlTail(appendable26, (int) (byte) 100, outputSettings28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        java.lang.String str13 = node10.absUrl("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node10.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, 0, outputSettings16);
        int int18 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str10 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.lang.String str29 = xmlDeclaration26.outerHtml();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.childNodes();
        boolean boolean33 = node30.hasAttr("hi!");
        org.jsoup.nodes.Node node34 = node30.clone();
        java.lang.String str35 = node34.baseUri();
        boolean boolean36 = xmlDeclaration15.hasSameValue((java.lang.Object) node34);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node34.childNodes();
        boolean boolean38 = node9.equals((java.lang.Object) nodeList37);
        org.jsoup.nodes.Document document39 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = document39.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(document39);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        java.lang.String str29 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document30 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration3.siblingNodes();
        java.lang.String str33 = xmlDeclaration3.absUrl("<!<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.before("<!<?<?hi!>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("<?>", "hi!");
        java.lang.String str24 = node22.attr("<?>");
        java.lang.String str26 = node22.absUrl("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        int int20 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("<?#declaration>");
        org.jsoup.nodes.Node node24 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!<!>>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<?#declaration>", "<!>");
        node10.setBaseUri("<?hi!>");
        org.jsoup.nodes.Document document13 = node10.ownerDocument();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.parentNode();
        java.lang.String str25 = xmlDeclaration3.outerHtml();
        java.lang.String str26 = xmlDeclaration3.outerHtml();
        java.lang.String str28 = xmlDeclaration3.absUrl("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        xmlDeclaration15.setBaseUri("#declaration");
        boolean boolean23 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Document document24 = xmlDeclaration15.ownerDocument();
        org.jsoup.nodes.Node node25 = xmlDeclaration15.clone();
        java.lang.String str27 = node25.attr("<?#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!<!>>", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, (int) (short) 0, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) (short) -1, outputSettings25);
        org.jsoup.nodes.Node node28 = xmlDeclaration3.removeAttr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str34 = xmlDeclaration32.attr("");
        int int35 = xmlDeclaration32.siblingIndex();
        org.jsoup.nodes.Node node36 = xmlDeclaration32.nextSibling();
        java.lang.String str37 = xmlDeclaration32.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration32.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration42.childNodes();
        java.lang.String str46 = xmlDeclaration42.getWholeDeclaration();
        java.lang.String str47 = xmlDeclaration42.toString();
        boolean boolean48 = xmlDeclaration32.equals((java.lang.Object) xmlDeclaration42);
        int int49 = xmlDeclaration32.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlDeclaration32.childNodes();
        java.lang.String str51 = xmlDeclaration32.toString();
        java.lang.String str52 = xmlDeclaration32.baseUri();
        java.lang.Appendable appendable53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = null;
        xmlDeclaration32.outerHtmlTail(appendable53, (int) (byte) -1, outputSettings55);
        java.lang.Appendable appendable57 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = null;
        xmlDeclaration32.outerHtmlTail(appendable57, 10, outputSettings59);
        java.lang.String str62 = xmlDeclaration32.absUrl("<!>");
        int int63 = xmlDeclaration32.siblingIndex();
        org.jsoup.nodes.Document document64 = xmlDeclaration32.ownerDocument();
        boolean boolean65 = node28.hasSameValue((java.lang.Object) document64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = document64.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!>" + "'", str51, "<!>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(document64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?hi!>>", "<!<?<?hi!>>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.String str20 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Document document24 = node23.ownerDocument();
        org.jsoup.nodes.Node node25 = node23.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Document document23 = xmlDeclaration19.ownerDocument();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) document23);
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node27 = node26.clone();
        java.lang.String str28 = node27.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        org.jsoup.nodes.Node node12 = xmlDeclaration9.nextSibling();
        xmlDeclaration9.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration9.siblingNodes();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration9.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.toString();
        boolean boolean26 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration20);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration9);
        org.jsoup.nodes.Node node30 = xmlDeclaration9.attr("<?>", "<!<?>>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration16.childNodes();
        java.lang.String str20 = xmlDeclaration16.nodeName();
        xmlDeclaration16.setBaseUri("");
        java.lang.String str23 = xmlDeclaration16.name();
        java.lang.String str24 = xmlDeclaration16.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?<?>>", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<?hi!>");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        org.jsoup.nodes.Node node29 = xmlDeclaration20.nextSibling();
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        org.jsoup.nodes.Node node33 = xmlDeclaration20.attr("<?<?hi!>>", "<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean42 = xmlDeclaration37.hasSameValue((java.lang.Object) true);
        java.lang.String str43 = xmlDeclaration37.name();
        org.jsoup.nodes.Node node45 = xmlDeclaration37.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node46 = node45.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = xmlDeclaration20.before(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration3.name();
        java.lang.String str21 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str22 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.previousSibling();
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.hasSameValue(obj6);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.Node node16 = node13.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node34 = xmlDeclaration3.parent();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("<!hi!>");
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.lang.String str12 = node11.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str8 = xmlDeclaration3.name();
        int int9 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str20 = xmlDeclaration15.absUrl("<!>");
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration15.clone();
        org.jsoup.nodes.Attributes attributes24 = xmlDeclaration15.attributes();
        org.jsoup.nodes.Node node26 = xmlDeclaration15.wrap("<?<?>>");
        boolean boolean27 = xmlDeclaration3.equals((java.lang.Object) node26);
        int int28 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.attr("<!<!>>", "<!hi!>");
        int int24 = node23.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node23.childNodesCopy();
        org.jsoup.nodes.Node node26 = node23.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "hi!");
        boolean boolean19 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<?<?>>");
        int int22 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable24, (int) '#', outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) (byte) 0, outputSettings15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        int int25 = xmlDeclaration22.siblingIndex();
        java.lang.String str26 = xmlDeclaration22.toString();
        org.jsoup.nodes.Node node27 = xmlDeclaration22.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration22.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration22.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.lang.String str36 = xmlDeclaration33.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node37.childNodes();
        boolean boolean40 = node37.hasAttr("hi!");
        org.jsoup.nodes.Node node41 = node37.clone();
        java.lang.String str42 = node41.baseUri();
        boolean boolean43 = xmlDeclaration22.hasSameValue((java.lang.Object) node41);
        boolean boolean44 = node17.hasSameValue((java.lang.Object) node41);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = node41.childNodesCopy();
        java.lang.Class<?> wildcardClass46 = node41.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node28 = xmlDeclaration27.parentNode();
        int int29 = xmlDeclaration27.siblingIndex();
        boolean boolean30 = node23.hasSameValue((java.lang.Object) xmlDeclaration27);
        boolean boolean32 = xmlDeclaration27.hasAttr("<!<?>>");
        org.jsoup.nodes.Node node33 = xmlDeclaration27.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration14.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean23 = node9.equals((java.lang.Object) xmlDeclaration14);
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration14.outerHtmlTail(appendable24, (int) (byte) 0, outputSettings26);
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration14.outerHtmlTail(appendable28, 0, outputSettings30);
        org.jsoup.nodes.Node node32 = xmlDeclaration14.parent();
        xmlDeclaration14.setBaseUri("<?<?>>");
        org.jsoup.nodes.Node node35 = xmlDeclaration14.clone();
        org.jsoup.nodes.Attributes attributes36 = node35.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = xmlTreeBuilder0.processStartTag("<?>", attributes36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<?hi!>>", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("<?<?>>", "#declaration");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) '4', outputSettings16);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, 100, outputSettings20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration9.parentNode();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration9.attributes();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration9.attributes();
        boolean boolean14 = node4.equals((java.lang.Object) attributes13);
        java.lang.Class<?> wildcardClass15 = node4.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.lang.String str21 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        org.jsoup.nodes.Node node29 = xmlDeclaration26.nextSibling();
        xmlDeclaration26.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.lang.String str39 = xmlDeclaration36.outerHtml();
        java.lang.String str40 = xmlDeclaration36.getWholeDeclaration();
        int int41 = xmlDeclaration36.siblingIndex();
        java.lang.String str42 = xmlDeclaration36.getWholeDeclaration();
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration36.outerHtmlTail(appendable43, (int) (byte) 1, outputSettings45);
        boolean boolean47 = xmlDeclaration26.hasSameValue((java.lang.Object) outputSettings45);
        boolean boolean49 = xmlDeclaration26.hasAttr("<?>");
        java.lang.String str50 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean51 = node22.equals((java.lang.Object) xmlDeclaration26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration12.equals((java.lang.Object) "hi!");
        int int34 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Document document35 = xmlDeclaration12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.parent();
        java.lang.String str18 = xmlDeclaration16.getWholeDeclaration();
        java.lang.String str19 = xmlDeclaration16.getWholeDeclaration();
        java.lang.String str20 = xmlDeclaration16.toString();
        java.lang.String str21 = xmlDeclaration16.toString();
        boolean boolean22 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!>" + "'", str20, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        java.lang.String str9 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, (int) '4', outputSettings13);
        java.lang.String str15 = xmlDeclaration5.nodeName();
        java.lang.String str17 = xmlDeclaration5.attr("<?>");
        org.jsoup.nodes.Node node18 = xmlDeclaration5.parent();
        org.jsoup.nodes.Attributes attributes19 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xmlTreeBuilder0.processStartTag("<?>", attributes19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        int int24 = xmlDeclaration3.siblingIndex();
        java.lang.String str25 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str9 = xmlDeclaration3.absUrl("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        int int14 = xmlDeclaration11.siblingIndex();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration21.toString();
        boolean boolean27 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration21);
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration11.attributes();
        boolean boolean29 = node7.equals((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.Node node31 = node7.wrap("<!>");
        java.lang.String str33 = node7.absUrl("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        int int40 = xmlDeclaration37.siblingIndex();
        org.jsoup.nodes.Node node41 = xmlDeclaration37.nextSibling();
        org.jsoup.nodes.Node node42 = xmlDeclaration37.parentNode();
        java.lang.String str44 = xmlDeclaration37.absUrl("hi!");
        java.lang.String str45 = xmlDeclaration37.getWholeDeclaration();
        org.jsoup.nodes.Node node48 = xmlDeclaration37.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) xmlDeclaration37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        int int11 = xmlDeclaration3.childNodeSize();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.name();
        java.lang.String str7 = xmlDeclaration3.baseUri();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        int int15 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.String str17 = xmlDeclaration12.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.Document document20 = xmlDeclaration12.ownerDocument();
        java.lang.String str21 = xmlDeclaration12.toString();
        java.lang.String str22 = xmlDeclaration12.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        java.lang.String str31 = xmlDeclaration26.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.siblingNodes();
        org.jsoup.nodes.Node node35 = xmlDeclaration26.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes36 = node35.attributes();
        boolean boolean37 = xmlDeclaration12.hasSameValue((java.lang.Object) attributes36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration12.childNodesCopy();
        org.jsoup.nodes.Node node41 = xmlDeclaration12.attr("<!<?>>", "<!<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlDeclaration12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!>" + "'", str21, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        java.lang.String str23 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.getWholeDeclaration();
        java.lang.String str33 = xmlDeclaration28.toString();
        boolean boolean34 = xmlDeclaration18.equals((java.lang.Object) xmlDeclaration28);
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration18.attributes();
        org.jsoup.nodes.Node node36 = xmlDeclaration18.previousSibling();
        org.jsoup.nodes.Node node37 = xmlDeclaration18.previousSibling();
        org.jsoup.nodes.Node node38 = xmlDeclaration18.clone();
        boolean boolean39 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration18);
        java.lang.Appendable appendable40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable40, (int) (short) 0, outputSettings42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration20.siblingNodes();
        boolean boolean31 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        org.jsoup.nodes.Node node34 = xmlDeclaration20.attr("<!<?>>", "<?<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration20.childNodesCopy();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        xmlDeclaration20.outerHtmlTail(appendable36, 0, outputSettings38);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "#declaration", false);
        java.lang.String str5 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.attr("<!#declaration>", "<!>");
        java.lang.String str9 = node8.outerHtml();
        node8.setBaseUri("<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?<?>>" + "'", str9, "<?<?>>");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) ' ', outputSettings25);
        org.jsoup.nodes.Document document27 = xmlDeclaration3.ownerDocument();
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = document27.hasSameValue(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) str16);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        int int27 = xmlDeclaration24.siblingIndex();
        java.lang.String str28 = xmlDeclaration24.toString();
        org.jsoup.nodes.Node node29 = xmlDeclaration24.nextSibling();
        int int30 = xmlDeclaration24.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str36 = xmlDeclaration34.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration34.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration34.siblingNodes();
        org.jsoup.nodes.Attributes attributes39 = xmlDeclaration34.attributes();
        org.jsoup.nodes.Document document40 = xmlDeclaration34.ownerDocument();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        xmlDeclaration34.outerHtmlTail(appendable41, 0, outputSettings43);
        org.jsoup.nodes.Node node45 = xmlDeclaration34.parent();
        boolean boolean46 = xmlDeclaration24.equals((java.lang.Object) node45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlDeclaration24.siblingNodes();
        java.lang.String str48 = xmlDeclaration24.toString();
        boolean boolean49 = node20.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!>" + "'", str48, "<!>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        xmlDeclaration16.setBaseUri("<!>");
        xmlDeclaration16.setBaseUri("hi!");
        java.lang.String str26 = xmlDeclaration16.attr("<!>");
        java.lang.String str27 = xmlDeclaration16.baseUri();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) str27);
        java.lang.String str29 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.lang.String str33 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("<?>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        int int13 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodes();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.attr("hi!");
        java.lang.String str19 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 1, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        org.jsoup.nodes.Node node20 = xmlDeclaration17.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration17.childNodes();
        java.lang.String str22 = xmlDeclaration17.name();
        int int23 = xmlDeclaration17.childNodeSize();
        java.lang.String str24 = xmlDeclaration17.outerHtml();
        java.lang.String str25 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str31 = xmlDeclaration29.attr("");
        java.lang.String str32 = xmlDeclaration29.outerHtml();
        java.lang.String str33 = xmlDeclaration29.getWholeDeclaration();
        java.lang.String str35 = xmlDeclaration29.absUrl("<?hi!>");
        org.jsoup.nodes.Node node36 = xmlDeclaration29.clone();
        boolean boolean37 = xmlDeclaration17.equals((java.lang.Object) node36);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) boolean37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!>" + "'", str24, "<!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Attributes attributes33 = xmlDeclaration16.attributes();
        org.jsoup.nodes.Node node34 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node35 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node36 = xmlDeclaration16.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node41 = xmlDeclaration40.parentNode();
        int int42 = xmlDeclaration40.siblingIndex();
        boolean boolean43 = node36.hasSameValue((java.lang.Object) xmlDeclaration40);
        boolean boolean44 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration40);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str16 = node14.attr("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.String str25 = xmlDeclaration20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration30.childNodes();
        java.lang.String str34 = xmlDeclaration30.getWholeDeclaration();
        java.lang.String str35 = xmlDeclaration30.toString();
        boolean boolean36 = xmlDeclaration20.equals((java.lang.Object) xmlDeclaration30);
        int int37 = xmlDeclaration20.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlDeclaration20.childNodes();
        java.lang.String str39 = xmlDeclaration20.toString();
        java.lang.String str40 = xmlDeclaration20.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlDeclaration20.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node14.after((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, 0, outputSettings16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before("<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?<?>>>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<?<?>>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodesCopy();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<!>>" + "'", str5, "<!<!>>");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "hi!", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<!>>" + "'", str5, "<!<!>>");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.lang.String str7 = xmlDeclaration5.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        boolean boolean16 = xmlDeclaration5.equals((java.lang.Object) node15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration5.outerHtmlTail(appendable17, (int) ' ', outputSettings19);
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xmlTreeBuilder0.processStartTag("<?#declaration>", attributes21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node22.attr("<?<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration11.childNodes();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.nextSibling();
        java.lang.String str16 = xmlDeclaration11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.siblingNodes();
        boolean boolean18 = node7.equals((java.lang.Object) nodeList17);
        org.jsoup.nodes.Node node19 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.attr("", "<!hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Document document23 = xmlDeclaration19.ownerDocument();
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) document23);
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node26.childNodesCopy();
        java.lang.String str29 = node26.absUrl("#declaration");
        org.jsoup.nodes.Node node30 = node26.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str31 = xmlDeclaration12.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.String str9 = xmlDeclaration3.baseUri();
        xmlDeclaration3.setBaseUri("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        int int6 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration12.outerHtmlTail(appendable22, (int) (byte) 0, outputSettings24);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration12.outerHtmlTail(appendable26, 0, outputSettings28);
        org.jsoup.nodes.Node node31 = xmlDeclaration12.removeAttr("<!>");
        org.jsoup.nodes.Node node32 = node31.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        int int11 = xmlDeclaration3.siblingIndex();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        int int33 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration16.childNodes();
        java.lang.String str36 = xmlDeclaration16.absUrl("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlDeclaration16.siblingNodes();
        org.jsoup.nodes.Node node38 = xmlDeclaration16.parentNode();
        java.lang.String str39 = xmlDeclaration16.baseUri();
        java.lang.String str41 = xmlDeclaration16.attr("<!<!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = xmlDeclaration3.toString();
        int int9 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        java.lang.String str15 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str16 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!>" + "'", str16, "<!>");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.toString();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration15.outerHtmlTail(appendable21, (int) '4', outputSettings23);
        java.lang.String str25 = xmlDeclaration15.nodeName();
        java.lang.String str26 = xmlDeclaration15.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration15.attr("#declaration");
        org.jsoup.nodes.Attributes attributes29 = xmlDeclaration15.attributes();
        boolean boolean30 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration15);
        java.lang.String str32 = xmlDeclaration3.absUrl("<?<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "<!<!>>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, 10, outputSettings12);
        int int14 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.parent();
        java.lang.String str19 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.lang.String str26 = xmlDeclaration23.outerHtml();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        xmlDeclaration23.setBaseUri("<!>");
        int int30 = xmlDeclaration23.siblingIndex();
        java.lang.String str31 = xmlDeclaration23.name();
        org.jsoup.nodes.Node node32 = xmlDeclaration23.nextSibling();
        org.jsoup.nodes.Node node35 = xmlDeclaration23.attr("<!>", "#declaration");
        java.lang.String str37 = node35.attr("#declaration");
        java.lang.String str38 = node35.baseUri();
        boolean boolean39 = xmlDeclaration3.equals((java.lang.Object) node35);
        org.jsoup.select.NodeVisitor nodeVisitor40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node35.traverse(nodeVisitor40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!>" + "'", str38, "<!>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str11 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        boolean boolean8 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("<!hi!>");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, (-1), outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?<!>>", "<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        int int24 = xmlDeclaration3.siblingIndex();
        java.lang.String str25 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document26 = xmlDeclaration3.ownerDocument();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration3.outerHtmlTail(appendable27, (int) '#', outputSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        int int16 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.String str23 = xmlDeclaration3.absUrl("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.parentNode();
        java.lang.String str26 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node27 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node27.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, 0, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable5, (-1), outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.Object obj21 = null;
        boolean boolean22 = xmlDeclaration12.equals(obj21);
        java.lang.String str24 = xmlDeclaration12.attr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.Node node26 = xmlDeclaration12.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node26.traverse(nodeVisitor27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Document document31 = xmlDeclaration12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        java.lang.String str8 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!hi!>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        int int10 = xmlDeclaration7.siblingIndex();
        org.jsoup.nodes.Node node11 = xmlDeclaration7.nextSibling();
        java.lang.String str12 = xmlDeclaration7.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration7.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        java.lang.String str21 = xmlDeclaration17.getWholeDeclaration();
        java.lang.String str22 = xmlDeclaration17.toString();
        boolean boolean23 = xmlDeclaration7.equals((java.lang.Object) xmlDeclaration17);
        java.lang.String str24 = xmlDeclaration7.name();
        boolean boolean25 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.baseUri();
        java.lang.String str16 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str17 = xmlDeclaration3.outerHtml();
        java.lang.String str18 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "<!<!>>", false);
        java.lang.String str4 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?hi!>" + "'", str4, "<?hi!>");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.lang.String str12 = xmlDeclaration9.outerHtml();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.clone();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) node13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        int int21 = xmlDeclaration18.siblingIndex();
        java.lang.String str22 = xmlDeclaration18.toString();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        java.lang.String str28 = xmlDeclaration18.nodeName();
        java.lang.String str29 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node31 = node30.clone();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) node31);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodes();
        java.lang.String str34 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document35 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node36 = xmlDeclaration3.nextSibling();
        boolean boolean38 = xmlDeclaration3.hasAttr("<?<?hi!>>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.Object obj21 = null;
        boolean boolean22 = xmlDeclaration12.equals(obj21);
        java.lang.String str24 = xmlDeclaration12.attr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration28.childNodes();
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str38 = xmlDeclaration36.attr("");
        java.lang.String str39 = xmlDeclaration36.outerHtml();
        org.jsoup.nodes.Node node40 = xmlDeclaration36.clone();
        java.lang.String str41 = node40.baseUri();
        boolean boolean42 = xmlDeclaration28.equals((java.lang.Object) str41);
        org.jsoup.nodes.Node node45 = xmlDeclaration28.attr("hi!", "#declaration");
        org.jsoup.nodes.Node node47 = node45.removeAttr("#declaration");
        org.jsoup.nodes.Node node49 = node47.removeAttr("<!hi!>");
        boolean boolean50 = xmlDeclaration12.equals((java.lang.Object) node49);
        int int51 = xmlDeclaration12.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!>" + "'", str39, "<!>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str8 = node7.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.childNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, 100, outputSettings19);
        boolean boolean21 = node7.equals((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.Document document23 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.Node node24 = xmlDeclaration12.clone();
        int int25 = node24.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str12 = xmlDeclaration3.attr("<!<!>>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        java.lang.String str16 = xmlDeclaration3.nodeName();
        int int17 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.Node node18 = node16.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        int int25 = xmlDeclaration22.siblingIndex();
        java.lang.String str26 = xmlDeclaration22.toString();
        org.jsoup.nodes.Node node27 = xmlDeclaration22.parent();
        java.lang.String str28 = xmlDeclaration22.getWholeDeclaration();
        org.jsoup.nodes.Node node30 = xmlDeclaration22.removeAttr("hi!");
        org.jsoup.nodes.Node node31 = node30.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node16.replaceWith(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        java.lang.String str20 = xmlDeclaration16.getWholeDeclaration();
        int int21 = xmlDeclaration16.siblingIndex();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        int int23 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration16.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration16.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str32 = xmlDeclaration30.attr("");
        org.jsoup.nodes.Node node33 = xmlDeclaration30.nextSibling();
        xmlDeclaration30.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration30.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        java.lang.String str43 = xmlDeclaration40.outerHtml();
        java.lang.String str44 = xmlDeclaration40.getWholeDeclaration();
        int int45 = xmlDeclaration40.siblingIndex();
        java.lang.String str46 = xmlDeclaration40.getWholeDeclaration();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        xmlDeclaration40.outerHtmlTail(appendable47, (int) (byte) 1, outputSettings49);
        boolean boolean51 = xmlDeclaration30.hasSameValue((java.lang.Object) outputSettings49);
        boolean boolean53 = xmlDeclaration30.hasAttr("<?>");
        boolean boolean54 = xmlDeclaration16.equals((java.lang.Object) "<?>");
        org.jsoup.nodes.Attributes attributes55 = xmlDeclaration16.attributes();
        boolean boolean56 = xmlDeclaration3.hasSameValue((java.lang.Object) attributes55);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = xmlDeclaration3.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.nextSibling();
        java.lang.String str22 = xmlDeclaration3.toString();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration3.outerHtmlTail(appendable23, (int) '#', outputSettings25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.clone();
        java.lang.String str12 = node11.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        int int33 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration16.childNodes();
        java.lang.String str35 = xmlDeclaration16.toString();
        boolean boolean36 = node11.equals((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Attributes attributes37 = node11.attributes();
        java.lang.String str39 = node11.absUrl("<!hi!>");
        java.lang.String str40 = node11.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!>" + "'", str40, "<!>");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        boolean boolean26 = xmlDeclaration3.hasAttr("");
        java.lang.String str27 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str33 = xmlDeclaration31.attr("");
        java.lang.String str34 = xmlDeclaration31.outerHtml();
        org.jsoup.nodes.Node node35 = xmlDeclaration31.clone();
        java.lang.String str36 = node35.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration40.childNodes();
        org.jsoup.nodes.Node node44 = xmlDeclaration40.nextSibling();
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        xmlDeclaration40.outerHtmlTail(appendable45, 100, outputSettings47);
        boolean boolean49 = node35.equals((java.lang.Object) xmlDeclaration40);
        java.lang.String str50 = xmlDeclaration40.toString();
        java.lang.Appendable appendable51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = null;
        xmlDeclaration40.outerHtmlTail(appendable51, 1, outputSettings53);
        java.lang.String str55 = xmlDeclaration40.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!>" + "'", str50, "<!>");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#declaration" + "'", str55, "#declaration");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (-1), outputSettings14);
        java.lang.String str16 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<?<?>>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.lang.String str10 = xmlDeclaration7.outerHtml();
        java.lang.String str11 = xmlDeclaration7.getWholeDeclaration();
        int int12 = xmlDeclaration7.siblingIndex();
        java.lang.String str13 = xmlDeclaration7.getWholeDeclaration();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration7.outerHtmlTail(appendable14, (int) (byte) 1, outputSettings16);
        java.lang.String str19 = xmlDeclaration7.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration7.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        int int27 = xmlDeclaration24.siblingIndex();
        java.lang.String str29 = xmlDeclaration24.absUrl("<!>");
        org.jsoup.nodes.Document document30 = xmlDeclaration24.ownerDocument();
        boolean boolean31 = xmlDeclaration7.hasSameValue((java.lang.Object) xmlDeclaration24);
        boolean boolean33 = xmlDeclaration7.hasAttr("<!<?>>");
        boolean boolean35 = xmlDeclaration7.hasAttr("#declaration");
        org.jsoup.nodes.Node node36 = xmlDeclaration7.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("hi!");
        boolean boolean14 = xmlDeclaration3.hasAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.nextSibling();
        xmlDeclaration15.setBaseUri("<!>");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        xmlDeclaration15.outerHtmlTail(appendable21, 100, outputSettings23);
        boolean boolean26 = xmlDeclaration15.hasAttr("#declaration");
        java.lang.String str27 = xmlDeclaration15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration15.childNodes();
        boolean boolean29 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?#declaration>", "<?<!>>", true);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, 1, outputSettings13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration10.nextSibling();
        java.lang.String str15 = xmlDeclaration10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration10.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        java.lang.String str24 = xmlDeclaration20.getWholeDeclaration();
        java.lang.String str25 = xmlDeclaration20.toString();
        boolean boolean26 = xmlDeclaration10.equals((java.lang.Object) xmlDeclaration20);
        int int27 = xmlDeclaration10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration10.childNodes();
        java.lang.String str29 = xmlDeclaration10.toString();
        java.lang.String str30 = xmlDeclaration10.baseUri();
        java.lang.String str31 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean32 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration10);
        org.jsoup.nodes.Node node33 = xmlDeclaration10.clone();
        org.jsoup.nodes.Node node36 = node33.attr("<?>", "<!<?>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str8 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.absUrl("<?hi!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node15 = node14.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.before("<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.lang.String str9 = xmlDeclaration3.absUrl("<!<?>>");
        java.lang.String str10 = xmlDeclaration3.baseUri();
        int int11 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        boolean boolean8 = xmlDeclaration3.hasAttr("<?#declaration>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        int int9 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration24.nextSibling();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node37 = xmlDeclaration3.attr("<?hi!>", "");
        org.jsoup.nodes.Node node39 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node42 = node39.attr("<?#declaration>", "<?#declaration>");
        org.jsoup.nodes.Node node43 = node39.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration3.name();
        java.lang.String str21 = xmlDeclaration3.absUrl("<!hi!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration25.outerHtmlTail(appendable30, 100, outputSettings32);
        java.lang.String str34 = xmlDeclaration25.toString();
        xmlDeclaration25.setBaseUri("#declaration");
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration25.outerHtmlTail(appendable37, (int) ' ', outputSettings39);
        org.jsoup.nodes.Node node41 = xmlDeclaration25.parent();
        int int42 = xmlDeclaration25.siblingIndex();
        java.lang.String str43 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Document document44 = xmlDeclaration25.ownerDocument();
        org.jsoup.nodes.Attributes attributes45 = xmlDeclaration25.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!>" + "'", str34, "<!>");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!>" + "'", str43, "<!>");
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNotNull(attributes45);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.String str19 = xmlDeclaration14.toString();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Node node22 = xmlDeclaration14.wrap("<!>");
        java.lang.String str23 = xmlDeclaration14.toString();
        java.lang.String str24 = xmlDeclaration14.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str30 = xmlDeclaration28.attr("");
        java.lang.String str31 = xmlDeclaration28.outerHtml();
        org.jsoup.nodes.Node node32 = xmlDeclaration28.clone();
        xmlDeclaration28.setBaseUri("<!>");
        int int35 = xmlDeclaration28.siblingIndex();
        java.lang.String str36 = xmlDeclaration28.name();
        org.jsoup.nodes.Attributes attributes37 = xmlDeclaration28.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str43 = xmlDeclaration41.attr("");
        org.jsoup.nodes.Node node44 = xmlDeclaration41.nextSibling();
        xmlDeclaration41.setBaseUri("<!>");
        org.jsoup.nodes.Node node47 = xmlDeclaration41.parent();
        boolean boolean48 = xmlDeclaration28.hasSameValue((java.lang.Object) xmlDeclaration41);
        boolean boolean49 = xmlDeclaration14.hasSameValue((java.lang.Object) boolean48);
        java.lang.String str51 = xmlDeclaration14.absUrl("<!#declaration>");
        int int52 = xmlDeclaration14.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str11 = xmlDeclaration9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration9.childNodes();
        org.jsoup.nodes.Node node13 = xmlDeclaration9.nextSibling();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration9.outerHtmlTail(appendable14, 100, outputSettings16);
        org.jsoup.nodes.Node node18 = xmlDeclaration9.nextSibling();
        java.lang.String str19 = xmlDeclaration9.name();
        org.jsoup.nodes.Node node22 = xmlDeclaration9.attr("<!<?>>", "<!hi!>");
        boolean boolean23 = node5.equals((java.lang.Object) "<!<?>>");
        org.jsoup.nodes.Node node24 = node5.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node24.attr("<?<?hi!>>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes12 = node11.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        int int25 = xmlDeclaration22.siblingIndex();
        java.lang.String str26 = xmlDeclaration22.toString();
        org.jsoup.nodes.Node node27 = xmlDeclaration22.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration22.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration22.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.lang.String str36 = xmlDeclaration33.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node37.childNodes();
        boolean boolean40 = node37.hasAttr("hi!");
        org.jsoup.nodes.Node node41 = node37.clone();
        java.lang.String str42 = node41.baseUri();
        boolean boolean43 = xmlDeclaration22.hasSameValue((java.lang.Object) node41);
        boolean boolean44 = node17.hasSameValue((java.lang.Object) node41);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration48 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str50 = xmlDeclaration48.attr("");
        org.jsoup.nodes.Node node51 = xmlDeclaration48.nextSibling();
        xmlDeclaration48.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlDeclaration48.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlDeclaration48.childNodesCopy();
        org.jsoup.nodes.Node node56 = xmlDeclaration48.clone();
        java.lang.String str57 = xmlDeclaration48.name();
        int int58 = xmlDeclaration48.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration62 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str64 = xmlDeclaration62.attr("");
        org.jsoup.nodes.Node node65 = xmlDeclaration62.nextSibling();
        xmlDeclaration62.setBaseUri("<!>");
        java.lang.Appendable appendable68 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = null;
        xmlDeclaration62.outerHtmlTail(appendable68, 100, outputSettings70);
        boolean boolean72 = xmlDeclaration48.hasSameValue((java.lang.Object) appendable68);
        java.lang.String str73 = xmlDeclaration48.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node74 = node17.before((org.jsoup.nodes.Node) xmlDeclaration48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        java.lang.String str15 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("<?<?>>");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", false);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, 100, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        java.lang.String str7 = node5.attr("");
        java.lang.String str9 = node5.attr("hi!");
        org.jsoup.nodes.Node node11 = node5.removeAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        int int18 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node19 = xmlDeclaration15.nextSibling();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        java.lang.String str29 = xmlDeclaration25.getWholeDeclaration();
        java.lang.String str30 = xmlDeclaration25.toString();
        boolean boolean31 = xmlDeclaration15.equals((java.lang.Object) xmlDeclaration25);
        boolean boolean33 = xmlDeclaration15.hasSameValue((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node34 = xmlDeclaration15.clone();
        boolean boolean35 = node11.hasSameValue((java.lang.Object) node34);
        org.jsoup.nodes.Node node36 = node34.parentNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("hi!", "hi!");
        java.lang.String str18 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?<?>>", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        int int11 = xmlDeclaration3.siblingIndex();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) (byte) 10, outputSettings17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        java.lang.String str15 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        int int23 = xmlDeclaration20.siblingIndex();
        java.lang.String str25 = xmlDeclaration20.absUrl("<!>");
        org.jsoup.nodes.Document document26 = xmlDeclaration20.ownerDocument();
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration20);
        boolean boolean29 = xmlDeclaration3.hasAttr("<!<?>>");
        boolean boolean31 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str32 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable33, 1, outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodesCopy();
        org.jsoup.nodes.Node node15 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node15.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) (byte) 100);
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.String str13 = xmlDeclaration3.toString();
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parentNode();
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node11.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.childNodes();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration17.outerHtmlTail(appendable22, 100, outputSettings24);
        java.lang.String str26 = xmlDeclaration17.toString();
        xmlDeclaration17.setBaseUri("#declaration");
        boolean boolean29 = node13.hasSameValue((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Attributes attributes30 = node13.attributes();
        org.jsoup.nodes.Node node32 = node13.removeAttr("<?<?>>");
        org.jsoup.nodes.Node node34 = node32.wrap("<!<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        java.lang.String str25 = xmlDeclaration21.toString();
        org.jsoup.nodes.Node node26 = xmlDeclaration21.parent();
        java.lang.String str27 = xmlDeclaration21.getWholeDeclaration();
        org.jsoup.nodes.Node node29 = xmlDeclaration21.removeAttr("hi!");
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) node29);
        java.lang.String str31 = xmlDeclaration12.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        int int14 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.attr("<!>", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        java.lang.String str25 = xmlDeclaration22.outerHtml();
        boolean boolean27 = xmlDeclaration22.hasAttr("<!>");
        org.jsoup.nodes.Node node29 = xmlDeclaration22.removeAttr("#declaration");
        node29.setBaseUri("<?>");
        org.jsoup.nodes.Node node32 = node29.parent();
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!>" + "'", str25, "<!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.attr("<?<!>>", "<?<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("<!>", "<!>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.toString();
        java.lang.String str15 = xmlDeclaration3.toString();
        boolean boolean17 = xmlDeclaration3.hasAttr("#declaration");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.absUrl("<?hi!>");
        java.lang.String str10 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Attributes attributes33 = xmlDeclaration16.attributes();
        org.jsoup.nodes.Node node34 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node35 = xmlDeclaration16.previousSibling();
        org.jsoup.nodes.Node node36 = xmlDeclaration16.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node41 = xmlDeclaration40.parentNode();
        int int42 = xmlDeclaration40.siblingIndex();
        boolean boolean43 = node36.hasSameValue((java.lang.Object) xmlDeclaration40);
        boolean boolean44 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration40);
        org.jsoup.nodes.Node node45 = xmlDeclaration40.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str18 = xmlDeclaration3.absUrl("<!hi!>");
        java.lang.String str19 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        int int8 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.nextSibling();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Document document13 = xmlDeclaration5.ownerDocument();
        java.lang.String str14 = xmlDeclaration5.toString();
        java.lang.String str15 = xmlDeclaration5.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        java.lang.String str24 = xmlDeclaration19.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration19.siblingNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration19.attr("#declaration", "");
        org.jsoup.nodes.Attributes attributes29 = node28.attributes();
        boolean boolean30 = xmlDeclaration5.hasSameValue((java.lang.Object) attributes29);
        int int31 = xmlDeclaration5.childNodeSize();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        xmlDeclaration5.outerHtmlTail(appendable32, (int) '#', outputSettings34);
        org.jsoup.nodes.Attributes attributes36 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = xmlTreeBuilder0.processStartTag("<!hi!>", attributes36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str10 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (byte) 1, outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        xmlDeclaration3.outerHtmlTail(appendable16, 10, outputSettings18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        int int4 = xmlDeclaration3.childNodeSize();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration21.childNodes();
        java.lang.String str25 = xmlDeclaration21.nodeName();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration21.outerHtmlTail(appendable26, (int) (short) 100, outputSettings28);
        java.lang.String str30 = xmlDeclaration21.getWholeDeclaration();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        xmlDeclaration21.outerHtmlTail(appendable31, (int) '4', outputSettings33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration21.siblingNodes();
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList35);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str42 = xmlDeclaration40.attr("");
        int int43 = xmlDeclaration40.siblingIndex();
        org.jsoup.nodes.Node node44 = xmlDeclaration40.nextSibling();
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        xmlDeclaration40.outerHtmlTail(appendable45, (-1), outputSettings47);
        java.lang.String str49 = xmlDeclaration40.name();
        boolean boolean51 = xmlDeclaration40.hasAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<!>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        int int15 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!>" + "'", str11, "<!>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str13 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("<?hi!>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node9 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str20 = xmlDeclaration18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodes();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.nextSibling();
        org.jsoup.nodes.Document document23 = xmlDeclaration18.ownerDocument();
        xmlDeclaration18.setBaseUri("hi!");
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration18);
        java.lang.String str28 = xmlDeclaration18.absUrl("<!<!>>");
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration18.outerHtmlTail(appendable29, 10, outputSettings31);
        int int33 = xmlDeclaration18.siblingIndex();
        java.lang.String str35 = xmlDeclaration18.absUrl("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration24.outerHtmlTail(appendable29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration24.nextSibling();
        boolean boolean34 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node37 = xmlDeclaration3.attr("<?hi!>", "");
        org.jsoup.nodes.Node node39 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.Node node40 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node40.wrap("<!<?<?hi!>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        int int34 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        int int41 = xmlDeclaration38.siblingIndex();
        org.jsoup.nodes.Node node42 = xmlDeclaration38.nextSibling();
        org.jsoup.nodes.Node node43 = xmlDeclaration38.parentNode();
        java.lang.String str45 = xmlDeclaration38.absUrl("hi!");
        java.lang.String str46 = xmlDeclaration38.getWholeDeclaration();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        xmlDeclaration38.outerHtmlTail(appendable47, (int) (byte) 0, outputSettings49);
        boolean boolean51 = xmlDeclaration3.equals((java.lang.Object) outputSettings49);
        java.lang.String str53 = xmlDeclaration3.absUrl("<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        xmlDeclaration3.setBaseUri("<!<!>>");
        org.jsoup.nodes.Node node31 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.absUrl("<!>");
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!>" + "'", str9, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.absUrl("<?>");
        xmlDeclaration3.setBaseUri("<!hi!>");
        int int18 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration3.outerHtmlTail(appendable19, (int) (byte) 0, outputSettings21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<?<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document11 = xmlDeclaration3.ownerDocument();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        java.lang.String str10 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.attr("#declaration", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration27.childNodes();
        java.lang.String str31 = xmlDeclaration27.getWholeDeclaration();
        java.lang.String str32 = xmlDeclaration27.toString();
        boolean boolean33 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration27);
        int int34 = xmlDeclaration17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration17.childNodes();
        java.lang.String str36 = xmlDeclaration17.toString();
        java.lang.String str37 = xmlDeclaration17.baseUri();
        java.lang.String str38 = xmlDeclaration17.getWholeDeclaration();
        org.jsoup.nodes.Node node39 = xmlDeclaration17.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!>" + "'", str32, "<!>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.String str12 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.lang.String str12 = node10.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        java.lang.String str19 = xmlDeclaration16.outerHtml();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.clone();
        java.lang.String str21 = node20.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration25.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration25.outerHtmlTail(appendable30, 100, outputSettings32);
        boolean boolean34 = node20.equals((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str40 = xmlDeclaration38.attr("");
        java.lang.String str41 = xmlDeclaration38.outerHtml();
        org.jsoup.nodes.Node node42 = xmlDeclaration38.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = node42.childNodes();
        boolean boolean45 = node42.hasAttr("hi!");
        boolean boolean46 = xmlDeclaration25.equals((java.lang.Object) "hi!");
        java.lang.String str47 = xmlDeclaration25.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = node10.before((org.jsoup.nodes.Node) xmlDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!>" + "'", str19, "<!>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.absUrl("#declaration");
        java.lang.String str18 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parentNode();
        java.lang.String str21 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<!<?<?hi!>>>");
        java.lang.String str25 = xmlDeclaration3.absUrl("<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) '4', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        java.lang.String str22 = xmlDeclaration3.toString();
        java.lang.String str23 = xmlDeclaration3.baseUri();
        java.lang.String str24 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node26 = xmlDeclaration3.removeAttr("<!<!>>");
        java.lang.String str28 = xmlDeclaration3.attr("<?<!>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str18 = xmlDeclaration12.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        java.lang.String str14 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node15 = xmlDeclaration11.clone();
        java.lang.String str16 = node15.baseUri();
        boolean boolean17 = xmlDeclaration3.equals((java.lang.Object) str16);
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("hi!", "#declaration");
        org.jsoup.nodes.Node node22 = node20.removeAttr("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            node22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document25 = xmlDeclaration3.ownerDocument();
        java.lang.String str26 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.siblingNodes();
        java.lang.String str28 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("<!<!>>");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.Object obj13 = null;
        boolean boolean14 = node12.hasSameValue(obj13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        boolean boolean29 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration23);
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Node node31 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node32 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node33 = xmlDeclaration13.clone();
        int int34 = xmlDeclaration13.siblingIndex();
        java.lang.String str35 = xmlDeclaration13.toString();
        org.jsoup.nodes.Document document36 = xmlDeclaration13.ownerDocument();
        java.lang.String str37 = xmlDeclaration13.toString();
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        java.lang.Class<?> wildcardClass39 = xmlDeclaration3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!>" + "'", str37, "<!>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!hi!>" + "'", str9, "<!hi!>");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!hi!>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?<?hi!>>");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        java.lang.String str17 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, (int) (short) -1, outputSettings20);
        java.lang.String str22 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("<!>");
        java.lang.String str10 = xmlDeclaration3.toString();
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        int int13 = xmlDeclaration3.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!>" + "'", str10, "<!>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        boolean boolean26 = xmlDeclaration3.hasAttr("");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration3.outerHtmlTail(appendable27, (int) (byte) 0, outputSettings29);
        org.jsoup.nodes.Node node33 = xmlDeclaration3.attr("hi!", "<?<?>>");
        org.jsoup.nodes.Node node34 = node33.clone();
        java.lang.String str35 = node33.outerHtml();
        org.jsoup.nodes.Node node36 = node33.previousSibling();
        java.lang.Class<?> wildcardClass37 = node33.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!hi!>", "<?>", false);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("<?hi!>", "<?#declaration>");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = node7.attributes();
        org.jsoup.nodes.Node node10 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.attr("<?<?hi!>>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        int int20 = xmlDeclaration3.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        java.lang.String str28 = xmlDeclaration25.outerHtml();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodes();
        boolean boolean32 = node29.hasAttr("hi!");
        boolean boolean33 = xmlDeclaration3.hasSameValue((java.lang.Object) node29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str39 = xmlDeclaration37.attr("");
        org.jsoup.nodes.Node node40 = xmlDeclaration37.nextSibling();
        xmlDeclaration37.setBaseUri("<!>");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        xmlDeclaration37.outerHtmlTail(appendable43, 100, outputSettings45);
        java.lang.String str47 = xmlDeclaration37.outerHtml();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration37.attributes();
        boolean boolean49 = node29.hasSameValue((java.lang.Object) xmlDeclaration37);
        org.jsoup.nodes.Attributes attributes50 = node29.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration54 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str56 = xmlDeclaration54.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlDeclaration54.childNodes();
        org.jsoup.nodes.Node node58 = xmlDeclaration54.nextSibling();
        java.lang.Appendable appendable59 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = null;
        xmlDeclaration54.outerHtmlTail(appendable59, 100, outputSettings61);
        java.lang.String str63 = xmlDeclaration54.toString();
        int int64 = xmlDeclaration54.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlDeclaration54.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node66 = node29.after((org.jsoup.nodes.Node) xmlDeclaration54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!>" + "'", str47, "<!>");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!>" + "'", str63, "<!>");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(nodeList65);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<!>", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str13 = xmlDeclaration11.attr("");
        org.jsoup.nodes.Node node14 = xmlDeclaration11.nextSibling();
        xmlDeclaration11.setBaseUri("<!>");
        boolean boolean18 = xmlDeclaration11.hasAttr("<!>");
        org.jsoup.nodes.Node node19 = xmlDeclaration11.previousSibling();
        java.lang.String str20 = xmlDeclaration11.name();
        boolean boolean21 = xmlDeclaration3.equals((java.lang.Object) str20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 0, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.attr("#declaration");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?#declaration>", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str9 = xmlDeclaration7.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration7.childNodes();
        java.lang.String str11 = xmlDeclaration7.getWholeDeclaration();
        java.lang.String str12 = xmlDeclaration7.toString();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration7.outerHtmlTail(appendable13, (int) (short) 10, outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration7.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str23 = xmlDeclaration21.attr("");
        int int24 = xmlDeclaration21.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration21.nextSibling();
        java.lang.String str26 = xmlDeclaration21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        org.jsoup.nodes.Document document28 = xmlDeclaration21.ownerDocument();
        java.lang.String str30 = xmlDeclaration21.absUrl("<!>");
        java.lang.String str31 = xmlDeclaration21.name();
        boolean boolean32 = xmlDeclaration7.equals((java.lang.Object) xmlDeclaration21);
        xmlDeclaration7.setBaseUri("<!<!>>");
        java.lang.String str35 = xmlDeclaration7.outerHtml();
        org.jsoup.nodes.Document document36 = xmlDeclaration7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertNull(document36);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.name();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.lang.String str16 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<?>");
        int int20 = node19.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = document14.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        java.lang.String str14 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("<?#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.lang.String str5 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        int int19 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<!<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration3.childNodesCopy();
        int int23 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        org.jsoup.nodes.Attributes attributes7 = node6.attributes();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", false);
        xmlDeclaration3.setBaseUri("<!<?>>");
        java.lang.String str7 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        int int16 = xmlDeclaration13.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration13.nextSibling();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        java.lang.String str27 = xmlDeclaration23.getWholeDeclaration();
        java.lang.String str28 = xmlDeclaration23.toString();
        boolean boolean29 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration23);
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Node node31 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node32 = xmlDeclaration13.previousSibling();
        org.jsoup.nodes.Node node33 = xmlDeclaration13.clone();
        int int34 = xmlDeclaration13.siblingIndex();
        java.lang.String str35 = xmlDeclaration13.getWholeDeclaration();
        org.jsoup.nodes.Node node38 = xmlDeclaration13.attr("<?<?>>", "<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str44 = xmlDeclaration42.attr("");
        java.lang.String str45 = xmlDeclaration42.outerHtml();
        org.jsoup.nodes.Node node46 = xmlDeclaration42.clone();
        java.lang.String str47 = node46.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration51 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str53 = xmlDeclaration51.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlDeclaration51.childNodes();
        org.jsoup.nodes.Node node55 = xmlDeclaration51.nextSibling();
        java.lang.Appendable appendable56 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = null;
        xmlDeclaration51.outerHtmlTail(appendable56, 100, outputSettings58);
        boolean boolean60 = node46.equals((java.lang.Object) xmlDeclaration51);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration64 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str66 = xmlDeclaration64.attr("");
        java.lang.String str67 = xmlDeclaration64.outerHtml();
        org.jsoup.nodes.Node node68 = xmlDeclaration64.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = node68.childNodes();
        boolean boolean71 = node68.hasAttr("hi!");
        boolean boolean72 = xmlDeclaration51.equals((java.lang.Object) "hi!");
        java.lang.String str73 = xmlDeclaration51.toString();
        org.jsoup.nodes.Node node74 = xmlDeclaration51.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration78 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str80 = xmlDeclaration78.attr("");
        org.jsoup.nodes.Node node81 = xmlDeclaration78.nextSibling();
        xmlDeclaration78.setBaseUri("hi!");
        boolean boolean84 = node74.hasSameValue((java.lang.Object) xmlDeclaration78);
        org.jsoup.nodes.Node node86 = xmlDeclaration78.removeAttr("<?<?>>");
        java.lang.String str88 = xmlDeclaration78.attr("#declaration");
        boolean boolean90 = xmlDeclaration78.hasAttr("<!>");
        boolean boolean91 = node38.hasSameValue((java.lang.Object) xmlDeclaration78);
        java.lang.String str92 = xmlDeclaration78.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlDeclaration78.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node94 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!>" + "'", str28, "<!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!>" + "'", str45, "<!>");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!>" + "'", str67, "<!>");
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<!>" + "'", str73, "<!>");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "<!>" + "'", str92, "<!>");
        org.junit.Assert.assertNotNull(nodeList93);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str22 = xmlDeclaration20.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration20.childNodes();
        org.jsoup.nodes.Node node24 = xmlDeclaration20.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration20.outerHtmlTail(appendable25, 100, outputSettings27);
        org.jsoup.nodes.Node node29 = xmlDeclaration20.nextSibling();
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("<?<?hi!>>");
        java.lang.Class<?> wildcardClass34 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        xmlDeclaration14.setBaseUri("<!>");
        java.lang.String str21 = xmlDeclaration14.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes22 = xmlDeclaration14.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        int int29 = xmlDeclaration26.siblingIndex();
        org.jsoup.nodes.Node node30 = xmlDeclaration26.nextSibling();
        org.jsoup.nodes.Node node31 = xmlDeclaration26.parentNode();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.childNodesCopy();
        boolean boolean35 = xmlDeclaration14.equals((java.lang.Object) nodeList34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node10.after((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        org.jsoup.nodes.Node node17 = node13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        int int25 = xmlDeclaration22.siblingIndex();
        java.lang.String str26 = xmlDeclaration22.toString();
        org.jsoup.nodes.Node node27 = xmlDeclaration22.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration22.childNodes();
        org.jsoup.nodes.Node node29 = xmlDeclaration22.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.lang.String str36 = xmlDeclaration33.outerHtml();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node37.childNodes();
        boolean boolean40 = node37.hasAttr("hi!");
        org.jsoup.nodes.Node node41 = node37.clone();
        java.lang.String str42 = node41.baseUri();
        boolean boolean43 = xmlDeclaration22.hasSameValue((java.lang.Object) node41);
        boolean boolean44 = node17.hasSameValue((java.lang.Object) node41);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = node41.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node41.traverse(nodeVisitor46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!>" + "'", str26, "<!>");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.removeAttr("<?<?>>");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (short) 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<!<?<?>>>", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<?hi!>");
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str7 = xmlDeclaration5.attr("");
        java.lang.String str8 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration5.clone();
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration14.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean23 = node9.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        java.lang.String str30 = xmlDeclaration27.outerHtml();
        org.jsoup.nodes.Node node31 = xmlDeclaration27.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodes();
        boolean boolean34 = node31.hasAttr("hi!");
        boolean boolean35 = xmlDeclaration14.equals((java.lang.Object) "hi!");
        java.lang.String str36 = xmlDeclaration14.toString();
        org.jsoup.nodes.Node node37 = xmlDeclaration14.clone();
        org.jsoup.nodes.Attributes attributes38 = node37.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!>" + "'", str30, "<!>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!>" + "'", str36, "<!>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        int int9 = xmlDeclaration3.childNodeSize();
        java.lang.String str11 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str13 = xmlDeclaration3.absUrl("<!>");
        boolean boolean15 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node17 = node16.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.clone();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        int int19 = xmlDeclaration16.siblingIndex();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.nextSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str28 = xmlDeclaration26.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.childNodes();
        java.lang.String str30 = xmlDeclaration26.getWholeDeclaration();
        java.lang.String str31 = xmlDeclaration26.toString();
        boolean boolean32 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration26);
        int int33 = xmlDeclaration16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration16.childNodes();
        java.lang.String str35 = xmlDeclaration16.toString();
        java.lang.String str36 = xmlDeclaration16.baseUri();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        xmlDeclaration16.outerHtmlTail(appendable37, (int) (byte) -1, outputSettings39);
        java.lang.String str41 = xmlDeclaration16.toString();
        java.lang.String str42 = xmlDeclaration16.getWholeDeclaration();
        org.jsoup.nodes.Node node43 = xmlDeclaration16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!>" + "'", str31, "<!>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!>" + "'", str35, "<!>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!>" + "'", str41, "<!>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.nextSibling();
        xmlDeclaration14.setBaseUri("<!>");
        int int20 = xmlDeclaration14.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration14.attr("<!>", "<!>");
        boolean boolean24 = xmlDeclaration3.equals((java.lang.Object) "<!>");
        org.jsoup.nodes.Document document25 = xmlDeclaration3.ownerDocument();
        java.lang.String str26 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, 10, outputSettings9);
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        boolean boolean15 = node12.hasAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node23 = xmlDeclaration19.nextSibling();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parentNode();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.clone();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        int int7 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node12 = node9.attr("#declaration", "<?>");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.String str9 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        xmlDeclaration3.setBaseUri("<!>");
        int int10 = xmlDeclaration3.siblingIndex();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str18 = xmlDeclaration16.attr("");
        org.jsoup.nodes.Node node19 = xmlDeclaration16.nextSibling();
        xmlDeclaration16.setBaseUri("<!>");
        org.jsoup.nodes.Node node22 = xmlDeclaration16.parent();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str29 = xmlDeclaration27.attr("");
        org.jsoup.nodes.Node node30 = xmlDeclaration27.nextSibling();
        xmlDeclaration27.setBaseUri("<!>");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration27.outerHtmlTail(appendable33, 100, outputSettings35);
        boolean boolean38 = xmlDeclaration27.hasAttr("#declaration");
        org.jsoup.nodes.Node node39 = xmlDeclaration27.previousSibling();
        boolean boolean40 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration27);
        org.jsoup.nodes.Node node43 = xmlDeclaration3.attr("<?#declaration>", "<?<?>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean8 = xmlDeclaration3.hasSameValue((java.lang.Object) true);
        java.lang.String str9 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<!hi!>");
        org.jsoup.nodes.Node node12 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<?<?hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("<?>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = node15.clone();
        boolean boolean18 = node16.hasAttr("#declaration");
        int int19 = node16.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        boolean boolean10 = xmlDeclaration3.hasAttr("<!>");
        java.lang.String str11 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        org.jsoup.nodes.Node node15 = xmlDeclaration12.nextSibling();
        xmlDeclaration12.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        boolean boolean20 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.lang.String str27 = xmlDeclaration24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration24.childNodes();
        int int29 = xmlDeclaration24.childNodeSize();
        boolean boolean30 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration24);
        java.lang.String str31 = xmlDeclaration12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!>" + "'", str27, "<!>");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("#declaration");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str12 = xmlDeclaration10.attr("");
        int int13 = xmlDeclaration10.siblingIndex();
        java.lang.String str14 = xmlDeclaration10.toString();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.parent();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node18 = xmlDeclaration10.removeAttr("hi!");
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration3.siblingNodes();
        xmlDeclaration3.setBaseUri("<!<!>>");
        org.jsoup.nodes.Node node23 = xmlDeclaration3.parentNode();
        int int24 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after("<!<?<?>>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        java.lang.String str21 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str27 = xmlDeclaration25.attr("");
        int int28 = xmlDeclaration25.siblingIndex();
        org.jsoup.nodes.Node node29 = xmlDeclaration25.nextSibling();
        java.lang.String str30 = xmlDeclaration25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration25.childNodesCopy();
        boolean boolean32 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration25);
        java.lang.String str33 = xmlDeclaration25.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!>", "<!hi!>");
        org.jsoup.nodes.Node node16 = node13.attr("<!>", "hi!");
        int int17 = node13.siblingIndex();
        org.jsoup.nodes.Node node18 = node13.clone();
        org.jsoup.nodes.Node node19 = node18.parent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration13.childNodes();
        java.lang.String str17 = xmlDeclaration13.getWholeDeclaration();
        java.lang.String str18 = xmlDeclaration13.toString();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node21 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node24 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.clone();
        java.lang.Class<?> wildcardClass26 = node25.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "#declaration", false);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        java.lang.String str9 = xmlDeclaration3.absUrl("<?<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str15 = xmlDeclaration13.attr("");
        org.jsoup.nodes.Node node16 = xmlDeclaration13.nextSibling();
        xmlDeclaration13.setBaseUri("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.siblingNodes();
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration13.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str26 = xmlDeclaration24.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration24.childNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration24.nextSibling();
        java.lang.String str29 = xmlDeclaration24.toString();
        boolean boolean30 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node32 = xmlDeclaration24.wrap("<!>");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        xmlDeclaration24.outerHtmlTail(appendable33, (-1), outputSettings35);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!>" + "'", str29, "<!>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str14 = xmlDeclaration12.attr("");
        java.lang.String str15 = xmlDeclaration12.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration12.childNodesCopy();
        java.lang.String str17 = xmlDeclaration12.baseUri();
        boolean boolean18 = node8.equals((java.lang.Object) xmlDeclaration12);
        boolean boolean20 = xmlDeclaration12.hasAttr("#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        java.lang.String str21 = xmlDeclaration3.name();
        java.lang.String str22 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!>" + "'", str22, "<!>");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = xmlDeclaration3.hasAttr("#declaration");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str17 = xmlDeclaration15.attr("");
        org.jsoup.nodes.Node node18 = xmlDeclaration15.clone();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration15.outerHtmlTail(appendable19, 10, outputSettings21);
        java.lang.String str23 = xmlDeclaration15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node11.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<!<!>>");
        int int13 = xmlDeclaration3.childNodeSize();
        java.lang.String str14 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) '4', outputSettings11);
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node16 = node15.clone();
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        java.lang.String str18 = node16.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str24 = xmlDeclaration22.attr("");
        org.jsoup.nodes.Node node25 = xmlDeclaration22.nextSibling();
        xmlDeclaration22.setBaseUri("<!>");
        xmlDeclaration22.setBaseUri("#declaration");
        java.lang.String str30 = xmlDeclaration22.name();
        org.jsoup.nodes.Node node31 = xmlDeclaration22.previousSibling();
        java.lang.String str32 = xmlDeclaration22.name();
        boolean boolean33 = node16.equals((java.lang.Object) str32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!>" + "'", str7, "<!>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!>" + "'", str18, "<!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document20 = xmlDeclaration3.ownerDocument();
        java.lang.String str21 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("#declaration", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        boolean boolean8 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str10 = xmlDeclaration3.attr("hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        int int6 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!>");
        xmlDeclaration3.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.siblingNodes();
        java.lang.String str15 = xmlDeclaration3.name();
        java.lang.String str17 = xmlDeclaration3.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!hi!>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node4.attr("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        java.lang.String str12 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!>" + "'", str12, "<!>");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.removeAttr("<!<?>>");
        boolean boolean19 = xmlDeclaration3.hasAttr("<!hi!>");
        org.jsoup.nodes.Node node21 = xmlDeclaration3.removeAttr("<!hi!>");
        java.lang.String str22 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        boolean boolean8 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str9 = xmlDeclaration3.name();
        java.lang.String str11 = xmlDeclaration3.attr("<?<?hi!>>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "#declaration", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str10 = xmlDeclaration8.attr("");
        int int11 = xmlDeclaration8.siblingIndex();
        java.lang.String str13 = xmlDeclaration8.absUrl("<!>");
        org.jsoup.nodes.Node node14 = xmlDeclaration8.parentNode();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration8.getClass();
        boolean boolean16 = xmlDeclaration3.equals((java.lang.Object) wildcardClass15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodesCopy();
        java.lang.String str18 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node19 = xmlDeclaration3.parent();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node23 = xmlDeclaration3.attr("<!<!>>", "<!hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodes();
        java.lang.String str26 = node23.attr("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.parentNode();
        org.jsoup.nodes.Node node10 = node7.wrap("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str16 = xmlDeclaration14.attr("");
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        java.lang.String str19 = node18.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str25 = xmlDeclaration23.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration23.childNodes();
        org.jsoup.nodes.Node node27 = xmlDeclaration23.nextSibling();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        xmlDeclaration23.outerHtmlTail(appendable28, 100, outputSettings30);
        boolean boolean32 = node18.equals((java.lang.Object) xmlDeclaration23);
        java.lang.String str33 = xmlDeclaration23.toString();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        xmlDeclaration23.outerHtmlTail(appendable34, 1, outputSettings36);
        java.lang.String str38 = xmlDeclaration23.outerHtml();
        java.lang.Class<?> wildcardClass39 = xmlDeclaration23.getClass();
        boolean boolean40 = node7.hasSameValue((java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = node7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!>" + "'", str33, "<!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!>" + "'", str38, "<!>");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        boolean boolean10 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = node7.nextSibling();
        int int12 = node7.childNodeSize();
        java.lang.String str13 = node7.outerHtml();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node7.before(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!>" + "'", str13, "<!>");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        int int8 = xmlDeclaration3.siblingIndex();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        int int10 = xmlDeclaration3.childNodeSize();
        int int11 = xmlDeclaration3.childNodeSize();
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str21 = xmlDeclaration19.attr("");
        int int22 = xmlDeclaration19.siblingIndex();
        java.lang.String str23 = xmlDeclaration19.toString();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.parent();
        java.lang.String str25 = xmlDeclaration19.getWholeDeclaration();
        org.jsoup.nodes.Node node27 = xmlDeclaration19.removeAttr("hi!");
        org.jsoup.nodes.Node node29 = node27.removeAttr("#declaration");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str35 = xmlDeclaration33.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration33.childNodes();
        org.jsoup.nodes.Node node37 = xmlDeclaration33.nextSibling();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration33.outerHtmlTail(appendable38, 100, outputSettings40);
        java.lang.String str42 = xmlDeclaration33.toString();
        xmlDeclaration33.setBaseUri("#declaration");
        boolean boolean45 = node29.hasSameValue((java.lang.Object) xmlDeclaration33);
        boolean boolean46 = xmlDeclaration3.equals((java.lang.Object) node29);
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable47, (int) (byte) -1, outputSettings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!>" + "'", str6, "<!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!>" + "'", str23, "<!>");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!>" + "'", str42, "<!>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) 10, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str19 = xmlDeclaration17.attr("");
        int int20 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration17.nextSibling();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        org.jsoup.nodes.Document document24 = xmlDeclaration17.ownerDocument();
        java.lang.String str26 = xmlDeclaration17.absUrl("<!>");
        java.lang.String str27 = xmlDeclaration17.name();
        boolean boolean28 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration17);
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration17.outerHtmlTail(appendable29, (int) (short) 100, outputSettings31);
        org.jsoup.nodes.Node node33 = xmlDeclaration17.previousSibling();
        java.lang.String str35 = xmlDeclaration17.absUrl("<!<?>>");
        org.jsoup.nodes.Node node38 = xmlDeclaration17.attr("<!#declaration>", "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!>" + "'", str8, "<!>");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 100, outputSettings11);
        boolean boolean14 = xmlDeclaration3.hasAttr("#declaration");
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document16 = xmlDeclaration3.ownerDocument();
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration3.attr("<?<?hi!>>", "<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!>" + "'", str15, "<!>");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?hi!>", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!>>", "<!<?<?>>>", false);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?<!<!>>>" + "'", str5, "<?<!<!>>>");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.String str5 = xmlDeclaration3.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, 100, outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.attr("<!<?>>", "<!hi!>");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.wrap("<?hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
    }
}

