package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.lang.String str11 = comment1.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        org.jsoup.nodes.Node node14 = comment1.root();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment1.outerHtmlTail(appendable15, (int) (byte) 0, outputSettings17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        org.jsoup.nodes.Node node14 = comment1.wrap("\n<!--hi!-->");
        boolean boolean16 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node17 = comment1.root();
        org.jsoup.nodes.Node node18 = comment1.previousSibling();
        boolean boolean20 = comment1.hasAttr("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        int int9 = comment7.siblingIndex();
        java.lang.String str10 = comment7.baseUri();
        org.jsoup.nodes.Node node12 = comment7.removeAttr("\n<!---->");
        boolean boolean13 = comment7.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment7.asXmlDeclaration();
        boolean boolean15 = comment1.hasSameValue((java.lang.Object) comment7);
        boolean boolean17 = comment7.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.parent();
        org.jsoup.nodes.Node node4 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodesCopy();
        java.lang.String str6 = node4.outerHtml();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!---->" + "'", str6, "\n<!---->");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        int int5 = comment1.childNodeSize();
        java.lang.String str6 = comment1.outerHtml();
        java.lang.String str7 = comment1.baseUri();
        java.lang.String str8 = comment1.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        java.lang.String str8 = comment1.attr("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.nodeName();
        int int14 = comment1.childNodeSize();
        boolean boolean15 = comment1.isXmlDeclaration();
        boolean boolean16 = comment1.hasParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        comment2.setBaseUri("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        int int8 = comment1.siblingIndex();
        boolean boolean9 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = node2.shallowClone();
        org.jsoup.nodes.Node node4 = node3.parentNode();
        org.jsoup.nodes.Node node5 = node3.root();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.nodeName();
        int int14 = comment1.childNodeSize();
        boolean boolean16 = comment1.hasAttr("\n<!---->");
        comment1.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node19 = comment1.clone();
        org.jsoup.nodes.Node node20 = node19.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node12 = comment1.attr("hi!", "\n<!--#comment-->");
        comment1.setBaseUri("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--#comment-->");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.isXmlDeclaration();
        int int7 = comment1.childNodeSize();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node10 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node14 = comment13.clone();
        org.jsoup.nodes.Node node15 = comment13.clone();
        org.jsoup.nodes.Node node16 = comment13.parent();
        java.lang.String str17 = comment13.getData();
        boolean boolean18 = comment1.equals((java.lang.Object) comment13);
        java.lang.String str20 = comment1.attr("\n<!---->");
        boolean boolean21 = comment1.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        java.lang.String str10 = comment2.toString();
        java.lang.String str11 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        java.lang.String str14 = comment1.attr("hi!");
        boolean boolean15 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        int int9 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Node node11 = comment1.clone();
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        java.lang.String str13 = comment1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.nodeName();
        int int14 = comment1.childNodeSize();
        boolean boolean16 = comment1.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node17 = comment1.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        int int5 = comment1.childNodeSize();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.lang.String str8 = comment1.attr("");
        java.lang.String str9 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodes();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Node node12 = comment1.clone();
        java.lang.String str13 = comment1.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.getData();
        int int10 = comment2.siblingIndex();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment14.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = xmlDeclaration18.clone();
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) wildcardClass20);
        org.jsoup.nodes.Node node22 = comment2.root();
        boolean boolean24 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.String str6 = comment2.absUrl("#comment");
        java.lang.String str7 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        java.lang.String str13 = comment6.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean14 = comment6.hasParent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        java.lang.String str19 = comment16.baseUri();
        java.lang.String str21 = comment16.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment16.asXmlDeclaration();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str26 = comment25.nodeName();
        boolean boolean27 = comment16.hasSameValue((java.lang.Object) comment25);
        int int28 = comment25.childNodeSize();
        boolean boolean29 = comment6.hasSameValue((java.lang.Object) comment25);
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment25.outerHtmlTail(appendable30, (int) 'a', outputSettings32);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(xmlDeclaration22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str16 = comment1.attr("\n<!--#comment-->");
        java.lang.String str18 = comment1.attr("\n<!--#comment-->");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable19, 10, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.clone();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean16 = comment14.hasAttr("hi!");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node19 = comment18.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment18.asXmlDeclaration();
        boolean boolean21 = comment14.equals((java.lang.Object) comment18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment18.siblingNodes();
        org.jsoup.nodes.Node node25 = comment18.attr("\n<!--\n<!--#comment-->-->", "");
        java.lang.String str26 = comment18.getData();
        boolean boolean27 = node11.hasSameValue((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.isXmlDeclaration();
        int int7 = comment1.childNodeSize();
        org.jsoup.nodes.Node node8 = comment1.root();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        boolean boolean9 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node6 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.hasParent();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        org.jsoup.nodes.Node node14 = comment10.removeAttr("");
        org.jsoup.nodes.Node node15 = comment10.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment10.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment10.siblingNodes();
        comment10.setBaseUri("\n<!--\n<!--#comment-->-->");
        comment10.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node22 = comment10.parent();
        boolean boolean23 = comment1.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node24 = comment10.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment1.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node14 = comment1.removeAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "#comment");
        int int3 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = comment1.root();
        java.lang.String str15 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node16 = comment1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        org.jsoup.nodes.Node node4 = comment2.shallowClone();
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node11 = comment10.shallowClone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        boolean boolean13 = comment1.equals((java.lang.Object) node11);
        org.jsoup.nodes.Node node16 = comment1.attr("\n<!--hi!-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment19.outerHtmlTail(appendable20, (int) (short) 1, outputSettings22);
        boolean boolean24 = comment1.hasSameValue((java.lang.Object) appendable20);
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment1.outerHtmlTail(appendable25, (-1), outputSettings27);
        java.lang.String str29 = comment1.getData();
        org.jsoup.nodes.Node node32 = comment1.attr("", "");
        int int33 = node32.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "#comment");
        boolean boolean3 = comment2.hasParent();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str5 = comment4.getData();
        java.lang.String str6 = comment4.nodeName();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment4.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        int int11 = comment4.childNodeSize();
        boolean boolean13 = comment4.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes14 = comment4.attributes();
        boolean boolean16 = comment4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment4.childNodesCopy();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        org.jsoup.nodes.Node node23 = comment19.removeAttr("");
        org.jsoup.nodes.Node node24 = comment19.clone();
        org.jsoup.nodes.Node node27 = comment19.attr("hi!", "#comment");
        org.jsoup.nodes.Node node28 = comment19.clone();
        org.jsoup.nodes.Node node29 = node28.root();
        org.jsoup.nodes.Node node30 = node29.clearAttributes();
        boolean boolean31 = comment4.hasSameValue((java.lang.Object) node30);
        org.jsoup.nodes.Node node32 = node30.parentNode();
        org.jsoup.nodes.Node node33 = node30.root();
        boolean boolean34 = comment2.equals((java.lang.Object) node33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node33.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        int int10 = comment1.siblingIndex();
        java.lang.String str11 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) (byte) 10, outputSettings5);
        java.lang.String str8 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.String str11 = comment2.absUrl("\n<!--\n<!---->-->");
        java.lang.String str12 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node12 = xmlDeclaration11.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration11.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.before("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.lang.String str8 = comment1.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node15 = comment13.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node18 = comment13.attr("\n<!--\n<!--#comment-->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        boolean boolean11 = comment2.hasParent();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        java.lang.String str15 = comment2.attr("\n<!--\n<!--hi!-->-->");
        java.lang.Class<?> wildcardClass16 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "");
        java.lang.String str11 = comment1.toString();
        int int12 = comment1.siblingIndex();
        org.jsoup.nodes.Node node13 = comment1.clearAttributes();
        java.lang.String str14 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = comment1.root();
        org.jsoup.nodes.Node node14 = node13.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment10.asXmlDeclaration();
        boolean boolean19 = xmlDeclaration7.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str22 = comment21.getData();
        java.lang.String str23 = comment21.nodeName();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment21.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        int int28 = comment21.childNodeSize();
        boolean boolean30 = comment21.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes31 = comment21.attributes();
        org.jsoup.nodes.Node node34 = comment21.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node36 = comment21.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node37 = node36.shallowClone();
        boolean boolean38 = comment10.hasSameValue((java.lang.Object) node37);
        boolean boolean40 = comment10.hasAttr("");
        java.lang.String str41 = comment10.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = comment10.childNodes();
        org.jsoup.nodes.Node node43 = comment10.shallowClone();
        org.jsoup.nodes.Comment comment45 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str46 = comment45.getData();
        org.jsoup.nodes.Node node47 = comment45.root();
        int int48 = comment45.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = comment45.childNodesCopy();
        org.jsoup.nodes.Node node52 = comment45.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = comment45.siblingNodes();
        boolean boolean55 = comment45.hasAttr("\n<!--\n<!--#comment-->-->");
        boolean boolean56 = node43.equals((java.lang.Object) comment45);
        java.lang.Appendable appendable57 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = null;
        comment45.outerHtmlTail(appendable57, (int) '#', outputSettings59);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        int int14 = comment11.childNodeSize();
        java.lang.String str16 = comment11.attr("");
        java.lang.String str17 = comment11.toString();
        int int18 = comment11.siblingIndex();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) comment11);
        java.lang.String str20 = comment11.toString();
        int int21 = comment11.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        int int15 = comment12.childNodeSize();
        java.lang.String str16 = comment12.outerHtml();
        java.lang.String str18 = comment12.attr("\n<!--hi!-->");
        java.lang.String str20 = comment12.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment12.asXmlDeclaration();
        boolean boolean22 = comment1.equals((java.lang.Object) comment12);
        boolean boolean24 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node25 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        java.lang.String str7 = comment2.getData();
        java.lang.String str9 = comment2.attr("");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        java.lang.String str14 = comment11.toString();
        org.jsoup.nodes.Node node16 = comment11.wrap("\n<!---->");
        org.jsoup.nodes.Node node17 = comment11.clone();
        org.jsoup.nodes.Node node18 = comment11.root();
        org.jsoup.nodes.Node node19 = node18.shallowClone();
        boolean boolean20 = comment2.equals((java.lang.Object) node19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str15 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment1.childNodes();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable17, (int) (byte) 10, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment1.wrap("\n<!--#comment-->");
        int int13 = comment1.childNodeSize();
        java.lang.String str14 = comment1.nodeName();
        org.jsoup.nodes.Node node15 = comment1.clone();
        java.lang.String str16 = comment1.getData();
        org.jsoup.nodes.Node node18 = comment1.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        java.lang.String str10 = comment1.baseUri();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Node node12 = node11.clearAttributes();
        org.jsoup.nodes.Node node13 = node11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node13.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        int int16 = comment1.childNodeSize();
        java.lang.String str17 = comment1.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment1.siblingNodes();
        org.jsoup.nodes.Node node19 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        node7.setBaseUri("\n<!---->");
        boolean boolean10 = node7.hasParent();
        org.jsoup.nodes.Node node11 = node7.shallowClone();
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        org.jsoup.nodes.Node node13 = node11.clearAttributes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        java.lang.String str17 = comment15.nodeName();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment15.outerHtmlTail(appendable18, (int) (byte) -1, outputSettings20);
        int int22 = comment15.childNodeSize();
        boolean boolean24 = comment15.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes25 = comment15.attributes();
        boolean boolean27 = comment15.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment15.childNodesCopy();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str31 = comment30.getData();
        org.jsoup.nodes.Node node32 = comment30.root();
        org.jsoup.nodes.Node node34 = comment30.removeAttr("");
        org.jsoup.nodes.Node node35 = comment30.clone();
        org.jsoup.nodes.Node node38 = comment30.attr("hi!", "#comment");
        org.jsoup.nodes.Node node39 = comment30.clone();
        org.jsoup.nodes.Node node40 = node39.root();
        org.jsoup.nodes.Node node41 = node40.clearAttributes();
        boolean boolean42 = comment15.hasSameValue((java.lang.Object) node41);
        org.jsoup.nodes.Node node44 = comment15.removeAttr("\n<!--hi!-->");
        java.lang.Class<?> wildcardClass45 = node44.getClass();
        boolean boolean46 = node11.equals((java.lang.Object) wildcardClass45);
        int int47 = node11.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.lang.String str17 = comment13.attr("#comment");
        org.jsoup.nodes.Node node18 = comment13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.jsoup.nodes.Node node16 = comment1.attr("", "\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str3 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--#comment-->");
        org.jsoup.nodes.Node node16 = comment2.attr("<?i?>", "<?i?>");
        boolean boolean17 = comment2.isXmlDeclaration();
        java.lang.String str18 = comment2.getData();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.attr("hi!");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, 100, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        java.lang.String str11 = comment1.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean12 = comment1.hasParent();
        java.lang.String str14 = comment1.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment10.asXmlDeclaration();
        boolean boolean19 = xmlDeclaration7.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node23 = comment21.removeAttr("");
        org.jsoup.nodes.Node node24 = comment21.shallowClone();
        org.jsoup.nodes.Node node25 = comment21.parent();
        org.jsoup.nodes.Node node26 = comment21.clearAttributes();
        boolean boolean27 = comment10.hasSameValue((java.lang.Object) comment21);
        org.jsoup.nodes.Node node30 = comment10.attr("", "");
        org.jsoup.nodes.Node node31 = node30.clone();
        node30.setBaseUri("\n<!--\n<!--hi!-->-->");
        node30.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str12 = comment1.attr("");
        org.jsoup.nodes.Node node14 = comment1.removeAttr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        java.lang.Object obj9 = null;
        boolean boolean10 = comment1.equals(obj9);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable11, (int) (byte) 10, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        org.jsoup.nodes.Node node12 = comment1.root();
        org.jsoup.nodes.Node node13 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.outerHtml();
        java.lang.String str12 = comment1.toString();
        boolean boolean13 = comment1.hasParent();
        int int14 = comment1.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.getData();
        boolean boolean13 = comment1.hasParent();
        org.jsoup.nodes.Node node14 = comment1.clearAttributes();
        org.jsoup.nodes.Node node16 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Node node21 = comment16.clone();
        org.jsoup.nodes.Node node24 = comment16.attr("hi!", "#comment");
        org.jsoup.nodes.Node node25 = comment16.clone();
        org.jsoup.nodes.Node node26 = node25.root();
        org.jsoup.nodes.Node node27 = node26.clearAttributes();
        boolean boolean28 = comment1.hasSameValue((java.lang.Object) node27);
        org.jsoup.nodes.Node node29 = comment1.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.filter(nodeFilter30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean12 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node4 = comment2.clearAttributes();
        java.lang.String str5 = comment2.toString();
        java.lang.String str6 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        boolean boolean13 = node11.equals((java.lang.Object) (-1L));
        org.jsoup.nodes.Node node14 = node11.clone();
        org.jsoup.nodes.Node node15 = node11.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        boolean boolean11 = comment2.hasParent();
        boolean boolean12 = comment2.isXmlDeclaration();
        java.lang.String str14 = comment2.attr("\n<!---->");
        java.lang.String str15 = comment2.toString();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment2.outerHtmlTail(appendable16, 100, outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--#comment-->" + "'", str15, "\n<!--#comment-->");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        boolean boolean16 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment1.previousSibling();
        java.lang.String str19 = comment1.attr("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        boolean boolean11 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment1.root();
        int int15 = comment1.childNodeSize();
        boolean boolean17 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, (int) '4', outputSettings19);
        boolean boolean21 = comment2.isXmlDeclaration();
        java.lang.String str22 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.getData();
        java.lang.String str10 = comment2.baseUri();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("<?i?>");
        boolean boolean14 = comment2.hasAttr("hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        boolean boolean11 = comment2.hasParent();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        java.lang.String str9 = comment1.toString();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.jsoup.nodes.Node node13 = node11.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean10 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        int int13 = comment2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        org.jsoup.nodes.Node node16 = comment12.removeAttr("");
        org.jsoup.nodes.Node node17 = comment12.nextSibling();
        java.lang.String str19 = comment12.attr("");
        org.jsoup.nodes.Node node20 = comment12.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment12.asXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment12.shallowClone();
        boolean boolean23 = node10.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node25 = comment12.removeAttr("\n<!--#comment-->");
        java.lang.String str26 = comment12.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str16 = comment1.attr("\n<!--#comment-->");
        java.lang.String str17 = comment1.getData();
        org.jsoup.nodes.Node node19 = comment1.removeAttr("<?i?>");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment1.outerHtmlTail(appendable20, 0, outputSettings22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.hasParent();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.lang.Class<?> wildcardClass11 = node10.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        org.jsoup.nodes.Node node9 = comment1.clearAttributes();
        java.lang.String str10 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node4 = comment1.clone();
        boolean boolean6 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable8, (int) (byte) 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment1.shallowClone();
        boolean boolean16 = comment1.hasAttr("\n<!---->");
        int int17 = comment1.siblingIndex();
        org.jsoup.nodes.Node node18 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Node node11 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment1.asXmlDeclaration();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment1.outerHtmlTail(appendable14, (int) 'a', outputSettings16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes3 = comment2.attributes();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        boolean boolean10 = node8.hasSameValue((java.lang.Object) (-1));
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.clearAttributes();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!--#comment-->-->", "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.outerHtml();
        java.lang.String str13 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable15, 100, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node11 = comment9.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node14 = comment9.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment9.removeAttr("");
        java.lang.String str17 = comment9.outerHtml();
        java.lang.String str18 = comment9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node6.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--#comment-->" + "'", str17, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str3 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment1.attr("#comment", "\n<!--\n<!--hi!-->-->");
        java.lang.String str7 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        comment6.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->");
        boolean boolean16 = comment14.hasAttr("\n<!--hi!-->");
        java.lang.String str18 = comment14.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        boolean boolean19 = comment6.equals((java.lang.Object) comment14);
        org.jsoup.nodes.Node node20 = comment14.shallowClone();
        java.lang.String str22 = comment14.attr("<?i?>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        java.lang.String str10 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.toString();
        org.jsoup.nodes.Node node17 = comment12.wrap("\n<!---->");
        org.jsoup.nodes.Node node18 = comment12.clone();
        org.jsoup.nodes.Node node19 = comment12.root();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        boolean boolean21 = comment1.equals((java.lang.Object) node19);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment1.outerHtmlTail(appendable22, (int) (short) 10, outputSettings24);
        int int26 = comment1.siblingIndex();
        org.jsoup.nodes.Node node28 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node29 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.lang.String str7 = comment1.toString();
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.getData();
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        int int8 = xmlDeclaration7.siblingIndex();
        org.jsoup.nodes.Node node9 = xmlDeclaration7.parent();
        boolean boolean10 = xmlDeclaration7.hasParent();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.getData();
        boolean boolean13 = comment1.hasParent();
        org.jsoup.nodes.Node node14 = comment1.clearAttributes();
        int int15 = comment1.childNodeSize();
        int int16 = comment1.childNodeSize();
        org.jsoup.nodes.Node node17 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--hi!-->");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        comment1.setBaseUri("");
        int int12 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        int int9 = comment7.siblingIndex();
        java.lang.String str10 = comment7.baseUri();
        org.jsoup.nodes.Node node12 = comment7.removeAttr("\n<!---->");
        boolean boolean13 = comment7.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment7.asXmlDeclaration();
        boolean boolean15 = comment1.hasSameValue((java.lang.Object) comment7);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment7.asXmlDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        boolean boolean6 = comment1.isXmlDeclaration();
        java.lang.String str7 = comment1.getData();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "<?i?>");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment1.outerHtmlTail(appendable11, (int) (short) 0, outputSettings13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.outerHtml();
        boolean boolean11 = comment1.hasParent();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment13.childNodesCopy();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Node node20 = comment18.root();
        boolean boolean21 = comment13.hasSameValue((java.lang.Object) comment18);
        java.lang.String str22 = comment13.nodeName();
        java.lang.String str23 = comment13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment13.siblingNodes();
        org.jsoup.nodes.Node node25 = comment13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment13.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment1.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean5 = comment1.hasAttr("");
        boolean boolean6 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.getData();
        org.jsoup.nodes.Node node13 = comment1.clone();
        java.lang.String str14 = comment1.getData();
        java.lang.String str15 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.lang.String str7 = comment4.baseUri();
        org.jsoup.nodes.Node node8 = comment4.parentNode();
        org.jsoup.nodes.Node node10 = comment4.removeAttr("");
        org.jsoup.nodes.Document document11 = comment4.ownerDocument();
        boolean boolean12 = comment1.equals((java.lang.Object) document11);
        int int13 = comment1.childNodeSize();
        java.lang.String str14 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment1.parent();
        int int15 = comment1.childNodeSize();
        org.jsoup.nodes.Node node16 = comment1.root();
        node16.setBaseUri("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        boolean boolean5 = comment1.hasParent();
        java.lang.String str6 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        java.lang.String str8 = comment1.outerHtml();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("\n<!--#comment-->");
        java.lang.String str12 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        boolean boolean6 = comment1.hasParent();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        boolean boolean11 = comment8.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment8.nextSibling();
        org.jsoup.nodes.Node node13 = comment8.root();
        org.jsoup.nodes.Node node14 = comment8.root();
        boolean boolean15 = comment8.hasParent();
        boolean boolean16 = comment1.equals((java.lang.Object) comment8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node7 = comment2.root();
        java.lang.String str8 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        java.lang.String str18 = comment2.nodeName();
        org.jsoup.nodes.Node node19 = comment2.parent();
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        java.lang.String str22 = comment2.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        java.lang.String str5 = comment2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodesCopy();
        java.lang.Class<?> wildcardClass7 = nodeList6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--#comment-->" + "'", str5, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node7 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean12 = comment1.isXmlDeclaration();
        java.lang.String str13 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        boolean boolean5 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment1.parent();
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        org.jsoup.nodes.Node node4 = comment2.shallowClone();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        java.lang.String str9 = comment1.absUrl("hi!");
        java.lang.String str11 = comment1.attr("#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) 1, outputSettings6);
        java.lang.String str8 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) (byte) 10, outputSettings5);
        java.lang.String str7 = comment2.outerHtml();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!---->" + "'", str7, "\n<!---->");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "");
        java.lang.String str11 = comment1.baseUri();
        java.lang.String str13 = comment1.absUrl("\n<!--\n<!---->-->");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment1.outerHtmlTail(appendable14, 0, outputSettings16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        org.jsoup.nodes.Node node14 = comment1.wrap("\n<!--hi!-->");
        boolean boolean16 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node17 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.jsoup.nodes.Node node13 = comment1.previousSibling();
        java.lang.String str15 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node16 = comment1.clone();
        org.jsoup.nodes.Node node17 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.siblingNodes();
        boolean boolean8 = comment1.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        boolean boolean10 = comment1.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.lang.String str13 = comment1.baseUri();
        comment1.setBaseUri("");
        int int16 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        java.lang.String str18 = comment2.nodeName();
        java.lang.String str19 = comment2.getData();
        java.lang.String str20 = comment2.baseUri();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, (int) '4', outputSettings19);
        boolean boolean21 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment2.clearAttributes();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.String str6 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node7 = comment2.root();
        java.lang.String str8 = comment2.baseUri();
        java.lang.String str9 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node11 = comment1.parent();
        boolean boolean12 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment1.parent();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        org.jsoup.nodes.Node node17 = comment15.root();
        int int18 = comment15.childNodeSize();
        java.lang.String str19 = comment15.outerHtml();
        java.lang.String str21 = comment15.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment15.childNodes();
        org.jsoup.nodes.Node node23 = comment15.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = comment15.asXmlDeclaration();
        int int25 = comment15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = node13.equals((java.lang.Object) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.removeAttr("<?i?>");
        java.lang.String str11 = comment1.attr("<?i?>");
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.lang.String str7 = comment4.baseUri();
        org.jsoup.nodes.Node node8 = comment4.parentNode();
        org.jsoup.nodes.Node node10 = comment4.removeAttr("");
        org.jsoup.nodes.Document document11 = comment4.ownerDocument();
        boolean boolean12 = comment1.equals((java.lang.Object) document11);
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        int int15 = comment1.childNodeSize();
        java.lang.String str16 = comment1.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        comment2.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Node node13 = comment2.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = node14.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        java.lang.String str10 = comment2.toString();
        java.lang.String str11 = comment2.toString();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("<?i?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration14.filter(nodeFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.toString();
        boolean boolean13 = comment2.hasAttr("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str14 = comment1.attr("\n<!--hi!-->");
        int int15 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        java.lang.String str20 = comment17.baseUri();
        java.lang.String str22 = comment17.attr("hi!");
        java.lang.String str23 = comment17.getData();
        org.jsoup.nodes.Node node24 = comment17.clone();
        boolean boolean25 = comment17.isXmlDeclaration();
        boolean boolean26 = comment1.equals((java.lang.Object) comment17);
        org.jsoup.nodes.Node node27 = comment17.previousSibling();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node31 = comment29.removeAttr("");
        java.lang.String str32 = comment29.baseUri();
        org.jsoup.nodes.Node node35 = comment29.attr("#comment", "#comment");
        boolean boolean36 = comment29.hasParent();
        org.jsoup.nodes.Node node37 = comment29.parent();
        org.jsoup.nodes.Attributes attributes38 = comment29.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node27.after((org.jsoup.nodes.Node) comment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration5.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        java.lang.String str11 = comment1.baseUri();
        java.lang.String str12 = comment1.outerHtml();
        java.lang.String str13 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodesCopy();
        boolean boolean16 = comment1.hasAttr("");
        java.lang.String str17 = comment1.baseUri();
        org.jsoup.nodes.Node node18 = comment1.root();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#comment-->" + "'", str12, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--#comment-->" + "'", str13, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration10.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        org.jsoup.nodes.Node node12 = comment1.root();
        int int13 = comment1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        java.lang.String str9 = node8.outerHtml();
        boolean boolean10 = node8.hasParent();
        org.jsoup.nodes.Node node11 = node8.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        java.lang.String str5 = comment1.absUrl("<?i?>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node13 = comment10.attr("hi!", "#comment");
        java.lang.String str14 = comment10.toString();
        boolean boolean15 = comment10.isXmlDeclaration();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        boolean boolean22 = comment18.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment18.asXmlDeclaration();
        boolean boolean24 = comment18.isXmlDeclaration();
        boolean boolean25 = comment18.hasParent();
        boolean boolean26 = comment10.hasSameValue((java.lang.Object) boolean25);
        java.lang.String str27 = comment10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment10.siblingNodes();
        boolean boolean29 = comment1.equals((java.lang.Object) comment10);
        comment10.setBaseUri("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = comment1.equals(obj6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        boolean boolean12 = comment1.hasParent();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Node node16 = comment14.root();
        org.jsoup.nodes.Node node18 = comment14.removeAttr("");
        org.jsoup.nodes.Node node19 = comment14.nextSibling();
        java.lang.String str21 = comment14.attr("");
        org.jsoup.nodes.Node node22 = comment14.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment14.asXmlDeclaration();
        java.lang.String str24 = comment14.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment14.asXmlDeclaration();
        org.jsoup.nodes.Node node26 = comment14.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment1.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str14 = comment1.attr("\n<!--hi!-->");
        java.lang.String str15 = comment1.nodeName();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment1.outerHtmlTail(appendable16, 100, outputSettings18);
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment1.outerHtmlTail(appendable20, (int) '4', outputSettings22);
        java.lang.String str24 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Document document13 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document13.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = comment1.equals(obj6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--hi!-->-->");
        boolean boolean12 = comment1.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        java.lang.Class<?> wildcardClass12 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.removeAttr("<?i?>");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        boolean boolean15 = comment11.hasAttr("\n<!---->");
        int int16 = comment11.childNodeSize();
        java.lang.String str18 = comment11.absUrl("hi!");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment11.outerHtmlTail(appendable19, 0, outputSettings21);
        org.jsoup.nodes.Node node23 = comment11.root();
        boolean boolean24 = node9.equals((java.lang.Object) comment11);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("");
        org.jsoup.nodes.Node node14 = comment1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Document document13 = comment1.ownerDocument();
        java.lang.String str14 = comment1.toString();
        java.lang.String str16 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str18 = comment1.attr("#comment");
        java.lang.String str19 = comment1.baseUri();
        org.jsoup.nodes.Node node21 = comment1.removeAttr("");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = node6.parent();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str16 = comment1.attr("\n<!--#comment-->");
        boolean boolean18 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node19 = comment1.nextSibling();
        int int20 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        int int23 = comment1.siblingIndex();
        org.jsoup.nodes.Node node24 = comment1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.baseUri();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        int int15 = comment13.siblingIndex();
        java.lang.String str16 = comment13.toString();
        org.jsoup.nodes.Node node18 = comment13.wrap("\n<!---->");
        org.jsoup.nodes.Node node19 = comment13.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment13.siblingNodes();
        boolean boolean22 = comment13.hasAttr("#comment");
        java.lang.String str23 = comment13.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment10.asXmlDeclaration();
        boolean boolean19 = xmlDeclaration7.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node20 = comment10.previousSibling();
        int int21 = comment10.childNodeSize();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.lang.String str7 = comment1.toString();
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.Node node11 = comment1.attr("hi!", "\n<!--hi!-->");
        java.lang.String str12 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodesCopy();
        int int15 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        boolean boolean11 = comment2.hasParent();
        boolean boolean12 = comment2.isXmlDeclaration();
        java.lang.String str14 = comment2.attr("\n<!---->");
        java.lang.String str15 = comment2.toString();
        java.lang.Class<?> wildcardClass16 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--#comment-->" + "'", str15, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        org.jsoup.nodes.Node node15 = comment11.removeAttr("");
        org.jsoup.nodes.Node node16 = comment11.nextSibling();
        java.lang.String str18 = comment11.attr("");
        org.jsoup.nodes.Node node19 = comment11.shallowClone();
        org.jsoup.nodes.Node node20 = comment11.root();
        org.jsoup.nodes.Node node21 = comment11.clone();
        boolean boolean22 = xmlDeclaration9.equals((java.lang.Object) node21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node21.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        java.lang.String str10 = comment1.baseUri();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("#comment", "\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str8 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        java.lang.String str10 = comment2.getData();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.clearAttributes();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str14 = comment12.attr("#comment");
        org.jsoup.nodes.Node node17 = comment12.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node19 = comment12.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment12.siblingNodes();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        int int24 = comment22.siblingIndex();
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node26 = comment22.parent();
        boolean boolean27 = comment12.equals((java.lang.Object) comment22);
        comment22.setBaseUri("");
        java.lang.String str30 = comment22.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = comment22.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) xmlDeclaration31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration31);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--hi!-->");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.String str10 = node9.outerHtml();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        boolean boolean15 = comment11.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment11.asXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment11.clearAttributes();
        int int18 = comment11.childNodeSize();
        org.jsoup.nodes.Node node19 = comment11.root();
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) comment11);
        java.lang.String str21 = comment1.baseUri();
        org.jsoup.nodes.Attributes attributes22 = comment1.attributes();
        comment1.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        int int12 = comment1.childNodeSize();
        java.lang.String str13 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.childNodes();
        org.jsoup.nodes.Node node11 = comment6.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.hasParent();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        org.jsoup.nodes.Node node13 = comment9.removeAttr("");
        org.jsoup.nodes.Node node14 = comment9.nextSibling();
        java.lang.String str16 = comment9.attr("");
        org.jsoup.nodes.Node node17 = comment9.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment9.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = xmlDeclaration18.nextSibling();
        org.jsoup.nodes.Node node20 = xmlDeclaration18.root();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        java.lang.String str25 = comment22.getData();
        org.jsoup.nodes.Node node28 = comment22.attr("", "");
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        comment22.outerHtmlTail(appendable29, (int) (short) 100, outputSettings31);
        org.jsoup.nodes.Node node34 = comment22.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node35 = comment22.shallowClone();
        boolean boolean36 = node20.hasSameValue((java.lang.Object) comment22);
        java.lang.String str38 = comment22.attr("\n<!---->");
        boolean boolean39 = comment1.hasSameValue((java.lang.Object) comment22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment7.outerHtmlTail(appendable8, (-1), outputSettings10);
        org.jsoup.nodes.Node node14 = comment7.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment7.asXmlDeclaration();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) comment7);
        boolean boolean17 = comment7.isXmlDeclaration();
        java.lang.String str18 = comment7.nodeName();
        java.lang.String str20 = comment7.absUrl("\n<!--#comment-->");
        java.lang.String str21 = comment7.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.lang.String str7 = comment4.baseUri();
        org.jsoup.nodes.Node node8 = comment4.parentNode();
        org.jsoup.nodes.Node node10 = comment4.removeAttr("");
        org.jsoup.nodes.Document document11 = comment4.ownerDocument();
        boolean boolean12 = comment1.equals((java.lang.Object) document11);
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        java.lang.String str18 = comment16.nodeName();
        org.jsoup.nodes.Node node19 = comment16.clone();
        java.lang.String str20 = comment16.toString();
        org.jsoup.nodes.Node node21 = comment16.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        boolean boolean14 = comment10.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment10.asXmlDeclaration();
        boolean boolean16 = comment10.isXmlDeclaration();
        boolean boolean17 = comment10.hasParent();
        boolean boolean18 = comment2.hasSameValue((java.lang.Object) boolean17);
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, 0, outputSettings21);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.getData();
        org.jsoup.nodes.Node node13 = comment1.clone();
        java.lang.String str14 = comment1.getData();
        java.lang.String str15 = comment1.outerHtml();
        org.jsoup.nodes.Node node16 = comment1.clone();
        java.lang.String str17 = comment1.baseUri();
        java.lang.String str18 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        java.lang.String str10 = comment1.attr("");
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        int int4 = comment2.siblingIndex();
        org.jsoup.nodes.Node node5 = comment2.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node8 = comment7.parentNode();
        java.lang.String str9 = comment7.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment7.asXmlDeclaration();
        int int11 = comment7.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--#comment-->" + "'", str9, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment13.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        java.lang.String str11 = comment6.nodeName();
        org.jsoup.nodes.Node node13 = comment6.removeAttr("#comment");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.childNodes();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--hi!-->-->-->", "hi!");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node4 = comment1.clone();
        boolean boolean6 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node11 = comment10.shallowClone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        boolean boolean13 = comment1.equals((java.lang.Object) node11);
        org.jsoup.nodes.Node node16 = comment1.attr("\n<!--hi!-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment19.outerHtmlTail(appendable20, (int) (short) 1, outputSettings22);
        boolean boolean24 = comment1.hasSameValue((java.lang.Object) appendable20);
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment1.outerHtmlTail(appendable25, (-1), outputSettings27);
        java.lang.String str29 = comment1.getData();
        org.jsoup.nodes.Node node32 = comment1.attr("", "");
        org.jsoup.nodes.Comment comment34 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str35 = comment34.getData();
        org.jsoup.nodes.Document document36 = comment34.ownerDocument();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        comment34.outerHtmlTail(appendable37, 0, outputSettings39);
        java.lang.String str41 = comment34.nodeName();
        boolean boolean42 = comment34.hasParent();
        java.lang.String str43 = comment34.nodeName();
        org.jsoup.nodes.Node node44 = comment34.parentNode();
        boolean boolean45 = comment34.isXmlDeclaration();
        boolean boolean46 = comment34.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node32.after((org.jsoup.nodes.Node) comment34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#comment" + "'", str41, "#comment");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#comment" + "'", str43, "#comment");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        java.lang.String str14 = comment11.baseUri();
        java.lang.String str15 = comment11.baseUri();
        java.lang.String str17 = comment11.attr("\n<!---->");
        java.lang.String str19 = comment11.attr("<?i?>");
        org.jsoup.nodes.Attributes attributes20 = comment11.attributes();
        boolean boolean21 = comment1.equals((java.lang.Object) comment11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.lang.String str7 = comment1.nodeName();
        int int8 = comment1.siblingIndex();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        java.lang.String str16 = comment14.nodeName();
        boolean boolean17 = comment10.hasSameValue((java.lang.Object) str16);
        int int18 = comment10.childNodeSize();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node24 = comment21.attr("hi!", "#comment");
        java.lang.String str25 = comment21.outerHtml();
        int int26 = comment21.siblingIndex();
        org.jsoup.nodes.Node node27 = comment21.clone();
        boolean boolean28 = comment21.hasParent();
        boolean boolean29 = comment10.hasSameValue((java.lang.Object) boolean28);
        java.lang.String str31 = comment10.attr("#comment");
        boolean boolean32 = comment1.hasSameValue((java.lang.Object) "#comment");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        java.lang.String str9 = node8.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        boolean boolean5 = comment1.hasParent();
        java.lang.String str6 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        boolean boolean12 = comment6.hasParent();
        java.lang.String str14 = comment6.absUrl("\n<!--#comment-->");
        java.lang.String str16 = comment6.absUrl("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 1, outputSettings9);
        org.jsoup.nodes.Node node11 = comment2.clearAttributes();
        java.lang.String str12 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.shallowClone();
        java.lang.String str10 = comment2.baseUri();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.lang.String str7 = comment4.baseUri();
        org.jsoup.nodes.Node node8 = comment4.parentNode();
        org.jsoup.nodes.Node node10 = comment4.removeAttr("");
        org.jsoup.nodes.Document document11 = comment4.ownerDocument();
        boolean boolean12 = comment1.equals((java.lang.Object) document11);
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        int int15 = comment1.childNodeSize();
        boolean boolean16 = comment1.hasParent();
        org.jsoup.nodes.Attributes attributes17 = comment1.attributes();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str16 = comment1.attr("\n<!--#comment-->");
        java.lang.String str18 = comment1.attr("\n<!--#comment-->");
        java.lang.String str20 = comment1.absUrl("\n<!--#comment-->");
        int int21 = comment1.childNodeSize();
        int int22 = comment1.childNodeSize();
        boolean boolean23 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment1.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.clearAttributes();
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        boolean boolean17 = comment2.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str13 = comment1.attr("\n<!--\n<!--hi!-->-->");
        java.lang.Class<?> wildcardClass14 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.siblingNodes();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, 1, outputSettings8);
        boolean boolean10 = comment1.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        java.lang.String str17 = comment15.nodeName();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment15.outerHtmlTail(appendable18, (int) (byte) -1, outputSettings20);
        int int22 = comment15.childNodeSize();
        boolean boolean23 = comment1.equals((java.lang.Object) comment15);
        org.jsoup.nodes.Node node26 = comment15.attr("#comment", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment15.childNodesCopy();
        java.lang.String str28 = comment15.outerHtml();
        org.jsoup.nodes.Document document29 = comment15.ownerDocument();
        java.lang.String str30 = comment15.baseUri();
        org.jsoup.nodes.Node node31 = comment15.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--\n<!---->-->" + "'", str28, "\n<!--\n<!---->-->");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Node node11 = node10.clearAttributes();
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        org.jsoup.nodes.Node node13 = node11.clearAttributes();
        org.jsoup.nodes.Node node14 = node11.clearAttributes();
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = comment1.equals(obj6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment1.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        java.lang.String str17 = comment15.nodeName();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment15.outerHtmlTail(appendable18, (int) (byte) -1, outputSettings20);
        int int22 = comment15.childNodeSize();
        boolean boolean23 = comment1.equals((java.lang.Object) comment15);
        java.lang.String str24 = comment15.getData();
        org.jsoup.nodes.Node node25 = comment15.parent();
        org.jsoup.nodes.Node node27 = comment15.removeAttr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        java.lang.String str9 = node8.outerHtml();
        boolean boolean10 = node8.hasParent();
        org.jsoup.nodes.Node node11 = node8.root();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        java.lang.String str9 = comment1.getData();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        java.lang.String str14 = comment11.getData();
        org.jsoup.nodes.Node node17 = comment11.attr("", "");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment11.outerHtmlTail(appendable18, (int) (short) 100, outputSettings20);
        org.jsoup.nodes.Document document22 = comment11.ownerDocument();
        org.jsoup.nodes.Node node23 = comment11.shallowClone();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str26 = comment25.getData();
        java.lang.String str27 = comment25.nodeName();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment25.outerHtmlTail(appendable28, (int) (byte) -1, outputSettings30);
        int int32 = comment25.childNodeSize();
        boolean boolean33 = comment11.equals((java.lang.Object) comment25);
        java.lang.String str34 = comment25.nodeName();
        boolean boolean35 = comment1.equals((java.lang.Object) str34);
        java.lang.String str37 = comment1.absUrl("\n<!---->");
        int int38 = comment1.siblingIndex();
        org.jsoup.nodes.Document document39 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = document39.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(document39);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment10.asXmlDeclaration();
        boolean boolean19 = xmlDeclaration7.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str22 = comment21.getData();
        java.lang.String str23 = comment21.nodeName();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment21.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        int int28 = comment21.childNodeSize();
        boolean boolean30 = comment21.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes31 = comment21.attributes();
        org.jsoup.nodes.Node node34 = comment21.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node36 = comment21.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node37 = node36.shallowClone();
        boolean boolean38 = comment10.hasSameValue((java.lang.Object) node37);
        org.jsoup.nodes.Node node39 = comment10.parentNode();
        java.lang.String str40 = comment10.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = comment10.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str3 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        int int10 = comment7.childNodeSize();
        java.lang.String str11 = comment7.outerHtml();
        java.lang.String str13 = comment7.attr("\n<!--hi!-->");
        java.lang.String str15 = comment7.attr("#comment");
        org.jsoup.nodes.Node node16 = comment7.shallowClone();
        int int17 = node16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration11.attributes();
        org.jsoup.nodes.Node node13 = xmlDeclaration11.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        org.jsoup.nodes.Attributes attributes4 = comment2.attributes();
        boolean boolean5 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.siblingNodes();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment1.isXmlDeclaration();
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Node node13 = comment1.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#comment-->" + "'", str12, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node10 = comment9.parentNode();
        java.lang.String str11 = comment9.outerHtml();
        org.jsoup.nodes.Node node12 = comment9.parent();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment9.outerHtmlTail(appendable13, (-1), outputSettings15);
        org.jsoup.nodes.Node node17 = comment9.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = comment9.attributes();
        org.jsoup.nodes.Node node19 = comment9.root();
        org.jsoup.nodes.Node node20 = comment9.clearAttributes();
        java.lang.String str21 = comment9.outerHtml();
        boolean boolean22 = comment1.equals((java.lang.Object) comment9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--#comment-->" + "'", str11, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment13.outerHtmlTail(appendable14, (int) (short) 1, outputSettings16);
        boolean boolean18 = comment1.equals((java.lang.Object) outputSettings16);
        java.lang.String str19 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.outerHtml();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str6 = comment2.toString();
        java.lang.String str7 = comment2.toString();
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--#comment-->" + "'", str7, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.siblingNodes();
        boolean boolean13 = comment1.hasParent();
        java.lang.String str15 = comment1.absUrl("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!---->-->");
        boolean boolean12 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        java.lang.String str9 = node8.outerHtml();
        int int10 = node8.siblingIndex();
        org.jsoup.nodes.Node node11 = node8.parent();
        boolean boolean12 = node8.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node8.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("\n<!---->", "\n<!--#comment-->");
        java.lang.String str11 = comment1.attr("\n<!--#comment-->");
        java.lang.String str12 = comment1.toString();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        java.lang.String str9 = comment1.absUrl("hi!");
        boolean boolean10 = comment1.hasParent();
        int int11 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodes();
        java.lang.String str13 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Node node14 = comment1.removeAttr("");
        int int15 = comment1.siblingIndex();
        org.jsoup.nodes.Node node17 = comment1.removeAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        java.lang.String str14 = comment11.toString();
        org.jsoup.nodes.Node node17 = comment11.attr("\n<!--#comment-->", "#comment");
        int int18 = comment11.childNodeSize();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) int18);
        int int20 = comment1.childNodeSize();
        java.lang.String str22 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node23 = comment1.root();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node27 = comment25.removeAttr("");
        org.jsoup.nodes.Node node28 = comment25.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = comment25.asXmlDeclaration();
        boolean boolean31 = comment25.hasAttr("\n<!---->");
        boolean boolean32 = comment1.equals((java.lang.Object) comment25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(xmlDeclaration29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.siblingNodes();
        org.jsoup.nodes.Node node13 = comment1.clone();
        org.jsoup.nodes.Node node14 = node13.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        java.lang.String str18 = comment16.nodeName();
        boolean boolean20 = comment16.hasAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node13.after((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        boolean boolean11 = comment1.hasParent();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!---->", "\n<!--\n<!---->-->");
        java.lang.String str16 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        java.lang.String str20 = comment18.nodeName();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment18.outerHtmlTail(appendable21, (int) (byte) -1, outputSettings23);
        org.jsoup.nodes.Node node27 = comment18.attr("\n<!--hi!-->", "");
        java.lang.String str28 = comment18.toString();
        int int29 = comment18.siblingIndex();
        org.jsoup.nodes.Node node32 = comment18.attr("\n<!--\n<!---->-->", "\n<!--\n<!---->-->");
        boolean boolean33 = comment1.equals((java.lang.Object) comment18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--hi!-->" + "'", str28, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str10 = comment2.outerHtml();
        boolean boolean11 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment2.attr("", "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        boolean boolean15 = comment12.hasParent();
        org.jsoup.nodes.Node node16 = comment12.parent();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        boolean boolean19 = comment12.hasAttr("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node10 = comment9.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment9.siblingNodes();
        org.jsoup.nodes.Node node12 = comment9.clearAttributes();
        java.lang.String str13 = comment9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node6.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        java.lang.String str13 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean18 = comment16.hasAttr("");
        boolean boolean20 = comment16.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment16.asXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment16.nextSibling();
        org.jsoup.nodes.Node node23 = comment16.shallowClone();
        boolean boolean24 = comment1.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node25 = comment16.parent();
        org.jsoup.nodes.Node node27 = comment16.removeAttr("\n<!--hi!-->");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment16.outerHtmlHead(appendable28, (int) (byte) -1, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 0, outputSettings11);
        org.jsoup.nodes.Node node13 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        java.lang.String str10 = comment7.getData();
        org.jsoup.nodes.Node node11 = comment7.root();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment7);
        org.jsoup.nodes.Node node13 = comment7.previousSibling();
        int int14 = comment7.childNodeSize();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        int int17 = comment16.siblingIndex();
        org.jsoup.nodes.Node node18 = comment16.parent();
        java.lang.String str19 = comment16.nodeName();
        java.lang.String str21 = comment16.attr("");
        org.jsoup.nodes.Node node23 = comment16.removeAttr("\n<!--\n<!--#comment-->-->");
        boolean boolean24 = comment7.equals((java.lang.Object) node23);
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str27 = comment26.getData();
        int int28 = comment26.siblingIndex();
        java.lang.String str29 = comment26.toString();
        org.jsoup.nodes.Node node31 = comment26.wrap("\n<!---->");
        comment26.setBaseUri("");
        org.jsoup.nodes.Node node36 = comment26.attr("\n<!---->", "");
        org.jsoup.nodes.Node node37 = node36.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment7.before(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        int int7 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.clone();
        boolean boolean9 = comment2.isXmlDeclaration();
        boolean boolean11 = comment2.hasAttr("hi!");
        boolean boolean13 = comment2.hasAttr("\n<!--#comment-->");
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        boolean boolean7 = comment1.hasParent();
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        boolean boolean15 = comment11.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node18 = comment11.attr("\n<!--#comment-->", "");
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.baseUri();
        java.lang.String str12 = comment1.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.childNodes();
        java.lang.String str14 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node5 = comment2.removeAttr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        boolean boolean16 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment1.previousSibling();
        org.jsoup.nodes.Node node18 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment1.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.lang.String str15 = comment12.baseUri();
        org.jsoup.nodes.Node node16 = comment12.shallowClone();
        org.jsoup.nodes.Node node17 = comment12.previousSibling();
        boolean boolean18 = comment1.equals((java.lang.Object) comment12);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Node node19 = comment17.root();
        int int20 = comment17.siblingIndex();
        int int21 = comment17.siblingIndex();
        int int22 = comment17.childNodeSize();
        org.jsoup.nodes.Node node23 = comment17.parent();
        java.lang.String str24 = comment17.baseUri();
        boolean boolean25 = comment2.equals((java.lang.Object) comment17);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.jsoup.nodes.Node node13 = comment1.previousSibling();
        java.lang.String str15 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node16 = comment1.nextSibling();
        java.lang.String str17 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Node node21 = comment16.clone();
        org.jsoup.nodes.Node node24 = comment16.attr("hi!", "#comment");
        org.jsoup.nodes.Node node25 = comment16.clone();
        org.jsoup.nodes.Node node26 = node25.root();
        org.jsoup.nodes.Node node27 = node26.clearAttributes();
        boolean boolean28 = comment1.hasSameValue((java.lang.Object) node27);
        org.jsoup.nodes.Node node29 = comment1.previousSibling();
        java.lang.String str31 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.jsoup.nodes.Node node13 = comment1.previousSibling();
        java.lang.String str15 = comment1.absUrl("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.String str3 = comment2.outerHtml();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--hi!-->-->" + "'", str3, "\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        int int5 = comment1.childNodeSize();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.lang.String str8 = comment1.attr("");
        java.lang.String str9 = comment1.baseUri();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (-1), outputSettings12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.String str13 = comment1.toString();
        java.lang.String str14 = comment1.nodeName();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node21 = comment19.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str25 = comment24.getData();
        org.jsoup.nodes.Node node26 = comment24.root();
        boolean boolean27 = comment19.hasSameValue((java.lang.Object) comment24);
        java.lang.String str28 = comment19.nodeName();
        org.jsoup.nodes.Node node29 = comment19.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = comment19.childNodesCopy();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str33 = comment32.getData();
        int int34 = comment32.siblingIndex();
        boolean boolean36 = comment32.hasAttr("\n<!---->");
        int int37 = comment32.childNodeSize();
        boolean boolean38 = comment19.equals((java.lang.Object) comment32);
        boolean boolean39 = comment17.equals((java.lang.Object) comment19);
        boolean boolean40 = comment1.hasSameValue((java.lang.Object) comment17);
        org.jsoup.nodes.Node node42 = comment1.removeAttr("hi!");
        java.lang.String str43 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n<!---->" + "'", str43, "\n<!---->");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str8 = comment2.absUrl("#comment");
        int int9 = comment2.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--#comment-->", "#comment");
        java.lang.String str12 = node11.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Document document13 = comment1.ownerDocument();
        java.lang.String str14 = comment1.toString();
        org.jsoup.nodes.Node node16 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        java.lang.String str20 = comment18.nodeName();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment18.outerHtmlTail(appendable21, (int) (byte) -1, outputSettings23);
        int int25 = comment18.childNodeSize();
        boolean boolean27 = comment18.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes28 = comment18.attributes();
        boolean boolean30 = comment18.hasAttr("hi!");
        org.jsoup.nodes.Node node31 = comment18.shallowClone();
        boolean boolean33 = comment18.hasAttr("\n<!---->");
        int int34 = comment18.siblingIndex();
        boolean boolean35 = comment1.equals((java.lang.Object) comment18);
        java.lang.String str36 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment5.outerHtmlTail(appendable6, (-1), outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment5.childNodes();
        org.jsoup.nodes.Node node12 = comment5.removeAttr("#comment");
        java.lang.String str13 = node12.outerHtml();
        boolean boolean14 = node12.hasParent();
        boolean boolean15 = comment2.equals((java.lang.Object) boolean14);
        org.jsoup.nodes.Node node18 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Document document19 = comment2.ownerDocument();
        boolean boolean21 = comment2.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        comment1.setBaseUri("");
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration11.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        int int12 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("");
        java.lang.String str14 = comment1.outerHtml();
        java.lang.String str16 = comment1.absUrl("\n<!--#comment-->");
        comment1.setBaseUri("\n<!--hi!-->");
        boolean boolean19 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        int int8 = comment1.siblingIndex();
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        java.lang.String str10 = comment7.getData();
        org.jsoup.nodes.Node node11 = comment7.root();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment7);
        org.jsoup.nodes.Node node14 = comment7.removeAttr("hi!");
        java.lang.String str16 = comment7.attr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node21 = comment19.removeAttr("");
        boolean boolean23 = comment19.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node26 = comment19.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node27 = comment19.clone();
        boolean boolean28 = comment19.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment19.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = comment7.before((org.jsoup.nodes.Node) comment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        boolean boolean5 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment1.parent();
        comment1.setBaseUri("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        java.lang.String str14 = comment11.baseUri();
        java.lang.String str15 = comment11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.childNodesCopy();
        org.jsoup.nodes.Node node15 = comment11.nextSibling();
        comment11.setBaseUri("#comment");
        java.lang.String str18 = comment11.toString();
        org.jsoup.nodes.Node node19 = comment11.root();
        node19.setBaseUri("\n<!--\n<!--hi!-->-->");
        boolean boolean22 = xmlDeclaration9.equals((java.lang.Object) "\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        boolean boolean13 = comment1.hasAttr("");
        java.lang.String str14 = comment1.outerHtml();
        java.lang.String str16 = comment1.absUrl("\n<!--#comment-->");
        comment1.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment1.asXmlDeclaration();
        int int5 = comment1.siblingIndex();
        java.lang.String str6 = comment1.outerHtml();
        org.jsoup.nodes.Node node7 = comment1.parent();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        boolean boolean8 = comment1.isXmlDeclaration();
        boolean boolean9 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--\n<!--\n<!--hi!-->-->-->", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Node node16 = comment14.root();
        org.jsoup.nodes.Node node18 = comment14.removeAttr("");
        org.jsoup.nodes.Node node19 = comment14.nextSibling();
        boolean boolean21 = comment14.hasAttr("\n<!---->");
        boolean boolean22 = node12.hasSameValue((java.lang.Object) comment14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.getData();
        boolean boolean13 = comment1.hasParent();
        org.jsoup.nodes.Node node14 = comment1.clearAttributes();
        int int15 = comment1.childNodeSize();
        org.jsoup.nodes.Node node16 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("#comment", "hi!");
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) "#comment");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable21, (int) (short) -1, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.String str6 = comment2.absUrl("#comment");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        org.jsoup.nodes.Node node12 = comment8.removeAttr("");
        org.jsoup.nodes.Node node13 = comment8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment8.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment8.siblingNodes();
        comment8.setBaseUri("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment8.outerHtmlTail(appendable18, (int) '#', outputSettings20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment8.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        int int14 = comment11.childNodeSize();
        java.lang.String str16 = comment11.attr("");
        java.lang.String str17 = comment11.toString();
        int int18 = comment11.siblingIndex();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) comment11);
        boolean boolean20 = comment11.isXmlDeclaration();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        org.jsoup.nodes.Node node26 = comment22.removeAttr("");
        org.jsoup.nodes.Node node27 = comment22.nextSibling();
        java.lang.String str29 = comment22.attr("");
        org.jsoup.nodes.Node node30 = comment22.shallowClone();
        org.jsoup.nodes.Node node31 = comment22.previousSibling();
        org.jsoup.nodes.Node node32 = comment22.shallowClone();
        org.jsoup.nodes.Node node33 = comment22.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment11.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        int int7 = comment1.childNodeSize();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.String str7 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) -1, outputSettings10);
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment14.childNodesCopy();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        boolean boolean22 = comment14.hasSameValue((java.lang.Object) comment19);
        java.lang.String str23 = comment14.nodeName();
        org.jsoup.nodes.Node node24 = comment14.clone();
        java.lang.String str26 = comment14.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment14.childNodes();
        boolean boolean28 = comment1.equals((java.lang.Object) comment14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = node8.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str9, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(node10);
    }
}

