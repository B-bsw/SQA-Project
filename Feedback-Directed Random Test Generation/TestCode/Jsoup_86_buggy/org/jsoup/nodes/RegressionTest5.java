package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        java.lang.String str7 = comment1.attr("");
        java.lang.String str8 = comment1.nodeName();
        java.lang.String str9 = comment1.baseUri();
        java.lang.String str11 = comment1.absUrl("\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable12, (int) (byte) 10, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.lang.String str14 = comment7.baseUri();
        java.lang.String str15 = comment7.nodeName();
        org.jsoup.nodes.Node node16 = comment7.nextSibling();
        org.jsoup.nodes.Node node17 = comment7.root();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        org.jsoup.nodes.Node node23 = comment19.removeAttr("");
        org.jsoup.nodes.Node node24 = comment19.nextSibling();
        java.lang.String str26 = comment19.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment19.childNodesCopy();
        int int28 = comment19.childNodeSize();
        org.jsoup.nodes.Node node29 = comment19.shallowClone();
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.jsoup.nodes.Node node15 = comment1.root();
        org.jsoup.nodes.Node node18 = comment1.attr("\n<!--\n<!--#comment-->-->", "hi!");
        java.lang.String str19 = node18.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node18.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.toString();
        java.lang.String str8 = comment1.absUrl("\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        int int16 = comment13.childNodeSize();
        java.lang.String str18 = comment13.attr("");
        java.lang.String str19 = comment13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.before((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str24 = comment23.getData();
        org.jsoup.nodes.Node node25 = comment23.root();
        boolean boolean26 = comment18.hasSameValue((java.lang.Object) comment23);
        org.jsoup.nodes.Node node29 = comment18.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Node node30 = node29.shallowClone();
        boolean boolean31 = node15.hasSameValue((java.lang.Object) node30);
        org.jsoup.nodes.Node node32 = node30.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node32.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodesCopy();
        boolean boolean13 = comment1.equals((java.lang.Object) comment11);
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        java.lang.String str6 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        int int12 = comment9.childNodeSize();
        java.lang.String str13 = comment9.outerHtml();
        java.lang.String str15 = comment9.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment9.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        org.jsoup.nodes.Node node12 = comment1.attr("", "#comment");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.baseUri();
        java.lang.String str18 = comment14.getData();
        boolean boolean19 = comment14.isXmlDeclaration();
        java.lang.String str20 = comment14.getData();
        org.jsoup.nodes.Node node21 = comment14.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node12.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str5 = comment4.getData();
        int int6 = comment4.siblingIndex();
        java.lang.String str7 = comment4.toString();
        boolean boolean8 = comment4.hasParent();
        boolean boolean9 = comment2.equals((java.lang.Object) comment4);
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        java.lang.String str11 = comment9.nodeName();
        boolean boolean13 = comment9.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment9.asXmlDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration14.parent();
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
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
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--#comment-->-->");
        java.lang.String str15 = comment1.attr("#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.root();
        org.jsoup.nodes.Node node12 = comment1.shallowClone();
        boolean boolean14 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node16 = xmlDeclaration15.nextSibling();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration12.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clearAttributes();
        org.jsoup.nodes.Node node12 = xmlDeclaration10.shallowClone();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment14.siblingNodes();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        java.lang.String str20 = comment17.baseUri();
        org.jsoup.nodes.Node node21 = comment17.parentNode();
        org.jsoup.nodes.Node node23 = comment17.removeAttr("");
        org.jsoup.nodes.Document document24 = comment17.ownerDocument();
        boolean boolean25 = comment14.equals((java.lang.Object) document24);
        org.jsoup.nodes.Attributes attributes26 = comment14.attributes();
        org.jsoup.nodes.Node node27 = comment14.previousSibling();
        org.jsoup.nodes.Node node28 = comment14.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment14.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration10.before((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes15 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str9 = comment1.outerHtml();
        java.lang.String str11 = comment1.attr("");
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        comment1.setBaseUri("");
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean16 = comment14.hasAttr("");
        boolean boolean18 = comment14.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment14.asXmlDeclaration();
        org.jsoup.nodes.Node node20 = comment14.clearAttributes();
        int int21 = comment14.childNodeSize();
        boolean boolean22 = comment1.equals((java.lang.Object) int21);
        java.lang.String str24 = comment1.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--#comment-->");
        boolean boolean15 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment14.outerHtmlTail(appendable15, (int) (short) 1, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = comment14.attributes();
        org.jsoup.nodes.Node node20 = comment14.clearAttributes();
        int int21 = node20.siblingIndex();
        org.jsoup.nodes.Node node22 = node20.clone();
        org.jsoup.nodes.Node node23 = node22.clone();
        boolean boolean24 = node12.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str27 = comment26.getData();
        int int28 = comment26.siblingIndex();
        java.lang.String str29 = comment26.toString();
        org.jsoup.nodes.Node node31 = comment26.wrap("\n<!---->");
        org.jsoup.nodes.Node node32 = comment26.clone();
        java.lang.String str33 = node32.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node12.after(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n<!--hi!-->" + "'", str33, "\n<!--hi!-->");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment13.outerHtmlTail(appendable14, (-1), outputSettings16);
        java.lang.Class<?> wildcardClass18 = comment13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node10.equals((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.lang.String str6 = comment1.baseUri();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.hasParent();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable10, (int) 'a', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        int int8 = node7.siblingIndex();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.jsoup.nodes.Node node10 = node7.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--#comment-->-->");
        int int3 = comment2.childNodeSize();
        java.lang.String str5 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        boolean boolean5 = comment1.hasParent();
        java.lang.String str7 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.nodeName();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        boolean boolean8 = comment1.hasParent();
        int int9 = comment1.childNodeSize();
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        java.lang.String str14 = comment12.nodeName();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment12.outerHtmlTail(appendable15, (int) (byte) -1, outputSettings17);
        int int19 = comment12.childNodeSize();
        java.lang.String str21 = comment12.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment12.asXmlDeclaration();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment24.siblingNodes();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node29 = comment27.removeAttr("");
        java.lang.String str30 = comment27.baseUri();
        org.jsoup.nodes.Node node31 = comment27.parentNode();
        org.jsoup.nodes.Node node33 = comment27.removeAttr("");
        org.jsoup.nodes.Document document34 = comment27.ownerDocument();
        boolean boolean35 = comment24.equals((java.lang.Object) document34);
        org.jsoup.nodes.Attributes attributes36 = comment24.attributes();
        org.jsoup.nodes.Node node37 = comment24.previousSibling();
        int int38 = comment24.childNodeSize();
        boolean boolean39 = xmlDeclaration22.equals((java.lang.Object) int38);
        org.jsoup.nodes.Node node40 = xmlDeclaration22.clearAttributes();
        org.jsoup.nodes.Node node41 = node40.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = comment1.before(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(xmlDeclaration22);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        org.jsoup.nodes.Node node17 = comment1.clone();
        java.lang.String str18 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("\n<!---->");
        boolean boolean9 = comment1.isXmlDeclaration();
        boolean boolean10 = comment1.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Node node12 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment1.root();
        java.lang.String str12 = comment1.getData();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.clone();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        int int9 = comment7.siblingIndex();
        java.lang.String str10 = comment7.baseUri();
        java.lang.String str11 = comment7.getData();
        org.jsoup.nodes.Node node12 = comment7.previousSibling();
        org.jsoup.nodes.Node node13 = comment7.root();
        org.jsoup.nodes.Node node14 = comment7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node7 = comment1.attr("\n<!--#comment-->", "#comment");
        int int8 = comment1.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 0, outputSettings11);
        org.jsoup.nodes.Node node14 = comment1.removeAttr("hi!");
        java.lang.String str15 = comment1.baseUri();
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.attr("#comment", "");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Document document18 = comment16.ownerDocument();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment16.outerHtmlTail(appendable19, 0, outputSettings21);
        java.lang.String str23 = comment16.nodeName();
        org.jsoup.nodes.Node node24 = comment16.parentNode();
        int int25 = comment16.childNodeSize();
        org.jsoup.nodes.Node node26 = comment16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node10 = comment6.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.childNodes();
        java.lang.Class<?> wildcardClass11 = nodeList10.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        boolean boolean8 = comment1.isXmlDeclaration();
        boolean boolean9 = comment1.isXmlDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        org.jsoup.nodes.Node node14 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment1.asXmlDeclaration();
        java.lang.String str5 = comment1.attr("\n<!--#comment-->");
        boolean boolean6 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(xmlDeclaration3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        org.jsoup.nodes.Node node29 = node27.shallowClone();
        org.jsoup.nodes.Node node30 = node27.clearAttributes();
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.lang.String str16 = comment1.attr("");
        comment1.setBaseUri("<?i?>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str12 = comment1.attr("");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        java.lang.String str17 = comment14.baseUri();
        java.lang.String str19 = comment14.attr("hi!");
        java.lang.String str20 = comment14.getData();
        comment14.setBaseUri("#comment");
        org.jsoup.nodes.Node node23 = comment14.parentNode();
        boolean boolean24 = comment1.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Node node26 = comment1.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.String str9 = comment1.attr("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        boolean boolean11 = comment1.hasParent();
        org.jsoup.nodes.Node node12 = comment1.root();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.filter(nodeFilter13);
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        boolean boolean3 = comment1.hasAttr("#comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        org.jsoup.nodes.Node node14 = comment10.removeAttr("");
        org.jsoup.nodes.Node node15 = comment10.clone();
        org.jsoup.nodes.Node node18 = comment10.attr("hi!", "#comment");
        org.jsoup.nodes.Node node19 = comment10.parentNode();
        org.jsoup.nodes.Node node20 = comment10.nextSibling();
        int int21 = comment10.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node8.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        boolean boolean7 = comment2.hasAttr("\n<!--#comment-->");
        java.lang.String str8 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node26 = comment25.clone();
        org.jsoup.nodes.Document document27 = comment25.ownerDocument();
        boolean boolean28 = node22.equals((java.lang.Object) document27);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        org.jsoup.nodes.Node node17 = comment1.attr("", "hi!");
        org.jsoup.nodes.Node node18 = node17.parent();
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        int int19 = comment16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment16.siblingNodes();
        comment16.setBaseUri("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment16.asXmlDeclaration();
        boolean boolean24 = node14.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node27 = comment16.attr("\n<!--\n<!--\n<!--hi!-->-->-->", "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        boolean boolean8 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment1.outerHtmlTail(appendable13, 10, outputSettings15);
        org.jsoup.nodes.Node node17 = comment1.root();
        org.jsoup.nodes.Node node18 = node17.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        java.lang.String str7 = comment2.toString();
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment1.asXmlDeclaration();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        org.jsoup.nodes.Node node10 = comment6.removeAttr("");
        org.jsoup.nodes.Node node11 = comment6.nextSibling();
        boolean boolean13 = comment6.hasAttr("\n<!---->");
        boolean boolean14 = comment6.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(xmlDeclaration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.jsoup.nodes.Node node15 = comment1.root();
        org.jsoup.nodes.Document document16 = comment1.ownerDocument();
        org.jsoup.nodes.Node node17 = comment1.clone();
        org.jsoup.nodes.Node node19 = comment1.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Document document20 = node19.ownerDocument();
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
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node14 = comment1.shallowClone();
        org.jsoup.nodes.Node node16 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node17 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        org.jsoup.nodes.Node node10 = comment1.clearAttributes();
        boolean boolean11 = node10.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodes();
        java.lang.String str11 = comment2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        java.lang.String str9 = comment1.attr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (-1), outputSettings12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("\n<!---->", "\n<!--#comment-->");
        java.lang.String str11 = comment1.attr("\n<!--#comment-->");
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        int int8 = comment2.siblingIndex();
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.attr("\n<!---->");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable13, 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Node node9 = comment1.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment1.clone();
        boolean boolean7 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        java.lang.String str11 = comment1.absUrl("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment1.outerHtmlTail(appendable13, 1, outputSettings15);
        org.jsoup.nodes.Attributes attributes17 = comment1.attributes();
        java.lang.String str18 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.isXmlDeclaration();
        int int7 = comment1.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable8, (int) (byte) 100, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        java.lang.String str13 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Attributes attributes14 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = comment2.nextSibling();
        java.lang.String str12 = comment2.getData();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.unwrap();
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
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.root();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.String str9 = comment1.attr("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        boolean boolean13 = comment2.hasAttr("\n<!--#comment-->");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, (-1), outputSettings16);
        org.jsoup.nodes.Node node19 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node24 = comment22.removeAttr("");
        boolean boolean26 = comment22.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment22.asXmlDeclaration();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment30.outerHtmlTail(appendable31, (-1), outputSettings33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment30.childNodes();
        java.lang.String str37 = comment30.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = comment30.asXmlDeclaration();
        boolean boolean39 = xmlDeclaration27.equals((java.lang.Object) comment30);
        org.jsoup.nodes.Node node40 = comment30.previousSibling();
        org.jsoup.nodes.Node node41 = comment30.shallowClone();
        int int42 = comment30.childNodeSize();
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        comment30.outerHtmlTail(appendable43, (int) '#', outputSettings45);
        boolean boolean47 = node19.hasSameValue((java.lang.Object) outputSettings45);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(xmlDeclaration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.String str17 = comment2.baseUri();
        org.jsoup.nodes.Node node18 = comment2.clone();
        java.lang.String str19 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        boolean boolean8 = comment1.hasParent();
        int int9 = comment1.childNodeSize();
        java.lang.String str10 = comment1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        java.lang.String str44 = comment10.getData();
        org.jsoup.nodes.Node node45 = comment10.root();
        java.lang.Class<?> wildcardClass46 = comment10.getClass();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int14 = comment1.siblingIndex();
        java.lang.String str15 = comment1.baseUri();
        org.jsoup.nodes.Node node16 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment19.outerHtmlTail(appendable20, (-1), outputSettings22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment19.childNodes();
        org.jsoup.nodes.Node node26 = comment19.removeAttr("#comment");
        org.jsoup.nodes.Node node27 = node26.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment1.before(node27);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node2.childNodes();
        org.jsoup.nodes.Node node5 = node2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        xmlDeclaration8.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document3.setBaseUri("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes3 = comment2.attributes();
        java.lang.String str4 = comment2.nodeName();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.lang.String str6 = comment2.nodeName();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        boolean boolean5 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Document document11 = comment1.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        java.lang.String str11 = comment2.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        org.jsoup.nodes.Node node7 = comment1.nextSibling();
        java.lang.String str8 = comment1.outerHtml();
        java.lang.String str10 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.toString();
        boolean boolean16 = comment12.hasParent();
        java.lang.String str18 = comment12.absUrl("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration11.attributes();
        xmlDeclaration11.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        org.jsoup.nodes.Node node10 = comment6.removeAttr("");
        org.jsoup.nodes.Node node11 = comment6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment6.childNodes();
        int int13 = comment6.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment6.childNodesCopy();
        int int15 = comment6.childNodeSize();
        boolean boolean16 = comment1.equals((java.lang.Object) comment6);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str7 = comment2.attr("#comment");
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str7, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node5 = comment2.attr("\n<!--hi!-->", "\n<!--hi!-->");
        int int6 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        int int4 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!--\n<!--hi!-->-->-->");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        java.lang.Class<?> wildcardClass6 = nodeList5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.String str5 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        java.lang.Class<?> wildcardClass8 = comment1.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("#comment");
        java.lang.String str11 = comment1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        org.jsoup.nodes.Node node57 = node43.previousSibling();
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
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        java.lang.String str9 = comment1.toString();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        java.lang.String str12 = comment1.attr("hi!");
        org.jsoup.nodes.Node node15 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node12 = comment1.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment16.outerHtmlTail(appendable17, (int) (short) 1, outputSettings19);
        org.jsoup.nodes.Attributes attributes21 = comment16.attributes();
        org.jsoup.nodes.Node node22 = comment16.clearAttributes();
        org.jsoup.nodes.Node node25 = comment16.attr("\n<!--\n<!--hi!-->-->", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("hi!");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Node node16 = comment14.root();
        boolean boolean17 = comment9.hasSameValue((java.lang.Object) comment14);
        boolean boolean18 = comment1.hasSameValue((java.lang.Object) boolean17);
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        int int22 = comment20.siblingIndex();
        boolean boolean24 = comment20.hasAttr("#comment");
        org.jsoup.nodes.Document document25 = comment20.ownerDocument();
        java.lang.String str26 = comment20.baseUri();
        org.jsoup.nodes.Node node27 = comment20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment20.childNodes();
        boolean boolean29 = comment1.equals((java.lang.Object) nodeList28);
        boolean boolean30 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        java.lang.String str9 = comment1.baseUri();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean15 = comment13.hasAttr("");
        boolean boolean17 = comment13.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment13.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment13.clearAttributes();
        int int20 = comment13.childNodeSize();
        org.jsoup.nodes.Node node21 = comment13.root();
        org.jsoup.nodes.Attributes attributes22 = comment13.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        java.lang.String str10 = comment1.baseUri();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        node11.setBaseUri("<?i?>");
        org.jsoup.nodes.Node node14 = node11.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.siblingNodes();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment1.equals((java.lang.Object) node15);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = comment1.asXmlDeclaration();
        java.lang.Class<?> wildcardClass18 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        java.lang.String str9 = node8.outerHtml();
        boolean boolean10 = node8.hasParent();
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.before("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (int) (short) 100, outputSettings7);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) (byte) 10, outputSettings5);
        java.lang.String str8 = comment2.absUrl("hi!");
        java.lang.String str10 = comment2.attr("\n<!--\n<!--hi!-->-->");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) 1, outputSettings13);
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Node node21 = comment16.nextSibling();
        java.lang.String str23 = comment16.attr("");
        org.jsoup.nodes.Node node24 = comment16.shallowClone();
        org.jsoup.nodes.Node node25 = comment16.previousSibling();
        org.jsoup.nodes.Node node27 = comment16.removeAttr("hi!");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment16.outerHtmlTail(appendable28, 10, outputSettings30);
        org.jsoup.nodes.Node node32 = comment16.root();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        comment16.outerHtmlTail(appendable33, (int) (byte) -1, outputSettings35);
        boolean boolean37 = comment2.equals((java.lang.Object) (byte) -1);
        org.jsoup.select.NodeFilter nodeFilter38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = comment2.filter(nodeFilter38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        boolean boolean8 = comment4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = comment4.attr("\n<!--hi!-->", "#comment");
        boolean boolean12 = comment2.hasSameValue((java.lang.Object) "\n<!--hi!-->");
        java.lang.String str13 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        org.jsoup.nodes.Node node14 = comment10.removeAttr("");
        org.jsoup.nodes.Attributes attributes15 = comment10.attributes();
        org.jsoup.nodes.Node node17 = comment10.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment10.siblingNodes();
        org.jsoup.nodes.Node node20 = comment10.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node8.after(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        int int5 = comment1.siblingIndex();
        int int6 = comment1.childNodeSize();
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.before("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Node node5 = comment2.parent();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parent();
        int int9 = comment2.childNodeSize();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node12 = comment2.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        int int9 = comment1.childNodeSize();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (int) (short) 10, outputSettings12);
        org.jsoup.nodes.Node node15 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        java.lang.String str3 = comment1.baseUri();
        java.lang.String str5 = comment1.attr("<?i?>");
        java.lang.String str6 = comment1.outerHtml();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node11 = comment10.parentNode();
        java.lang.String str12 = comment10.outerHtml();
        org.jsoup.nodes.Node node13 = comment10.parent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment10.outerHtmlTail(appendable14, (-1), outputSettings16);
        boolean boolean18 = comment1.equals((java.lang.Object) comment10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#comment-->" + "'", str12, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Node node12 = node11.clearAttributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node15 = comment14.parentNode();
        boolean boolean16 = node11.hasSameValue((java.lang.Object) node15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.childNode(1);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("#comment");
        java.lang.Class<?> wildcardClass6 = node5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean10 = comment8.hasAttr("");
        boolean boolean12 = comment8.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment8.asXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment8.shallowClone();
        boolean boolean16 = comment8.hasAttr("");
        java.lang.String str17 = comment8.baseUri();
        boolean boolean18 = node5.equals((java.lang.Object) comment8);
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node5.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        org.jsoup.nodes.Node node17 = comment1.attr("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("\n<!---->");
        java.lang.String str9 = comment1.toString();
        java.lang.String str11 = comment1.attr("\n<!--hi!-->");
        java.lang.String str12 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.lang.String str13 = comment1.nodeName();
        int int14 = comment1.childNodeSize();
        org.jsoup.nodes.Node node15 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes16 = comment1.attributes();
        boolean boolean17 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.String str9 = comment1.attr("");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        boolean boolean10 = comment1.hasAttr("#comment");
        boolean boolean12 = comment1.hasAttr("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        boolean boolean13 = comment1.hasAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.siblingNodes();
        java.lang.String str16 = comment1.attr("<?i?>");
        java.lang.String str17 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node7 = comment1.attr("\n<!--#comment-->", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        java.lang.String str18 = comment1.toString();
        org.jsoup.nodes.Node node19 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        boolean boolean11 = comment1.hasAttr("#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        int int16 = comment1.siblingIndex();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment1.outerHtmlTail(appendable17, 100, outputSettings19);
        org.jsoup.nodes.Node node21 = comment1.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        comment1.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        java.lang.Class<?> wildcardClass10 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        // The following exception was thrown during execution in test generation
        try {
            node30.remove();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        boolean boolean5 = comment1.hasAttr("");
        java.lang.String str6 = comment1.nodeName();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "#comment");
        java.lang.String str3 = comment2.outerHtml();
        java.lang.String str4 = comment2.toString();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (byte) -1, outputSettings7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!---->" + "'", str4, "\n<!---->");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node9 = comment7.removeAttr("");
        java.lang.String str10 = comment7.baseUri();
        org.jsoup.nodes.Node node13 = comment7.attr("#comment", "#comment");
        org.jsoup.nodes.Node node14 = comment7.shallowClone();
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Node node19 = comment17.root();
        org.jsoup.nodes.Node node21 = comment17.removeAttr("");
        org.jsoup.nodes.Node node22 = comment17.nextSibling();
        java.lang.String str24 = comment17.attr("");
        org.jsoup.nodes.Node node25 = comment17.shallowClone();
        org.jsoup.nodes.Node node26 = comment17.root();
        boolean boolean27 = node15.equals((java.lang.Object) comment17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration5.after(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        int int10 = node9.siblingIndex();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        java.lang.String str12 = comment1.attr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node19 = comment1.clone();
        org.jsoup.nodes.Node node20 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.String str23 = comment1.getData();
        org.jsoup.nodes.Node node24 = comment1.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        java.lang.String str13 = comment11.nodeName();
        java.lang.String str14 = comment11.getData();
        org.jsoup.nodes.Node node15 = comment11.clone();
        java.lang.String str16 = comment11.getData();
        boolean boolean17 = comment2.equals((java.lang.Object) comment11);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment11.outerHtmlTail(appendable18, (int) (short) 10, outputSettings20);
        org.jsoup.nodes.Node node22 = comment11.clearAttributes();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--#comment-->");
        node11.setBaseUri("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.root();
        org.jsoup.nodes.Node node9 = node8.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        java.lang.String str5 = comment2.attr("\n<!--hi!-->");
        boolean boolean7 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.jsoup.nodes.Document document13 = node11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.lang.String str8 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodesCopy();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str14 = comment1.absUrl("\n<!---->");
        boolean boolean15 = comment1.hasParent();
        boolean boolean16 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment14.outerHtmlTail(appendable15, (int) (short) 1, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = comment14.attributes();
        org.jsoup.nodes.Node node20 = comment14.clearAttributes();
        int int21 = node20.siblingIndex();
        org.jsoup.nodes.Node node22 = node20.clone();
        org.jsoup.nodes.Node node23 = node22.clone();
        boolean boolean24 = node12.hasSameValue((java.lang.Object) node23);
        java.lang.String str25 = node12.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.jsoup.nodes.Node node14 = comment1.root();
        org.jsoup.nodes.Node node16 = comment1.removeAttr("#comment");
        boolean boolean17 = comment1.hasParent();
        org.jsoup.nodes.Node node19 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        comment1.setBaseUri("\n<!---->");
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        java.lang.String str18 = comment2.outerHtml();
        org.jsoup.nodes.Node node19 = comment2.root();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment2.outerHtmlTail(appendable20, (int) (byte) 10, outputSettings22);
        org.jsoup.nodes.Node node25 = comment2.wrap("<?i?>");
        boolean boolean27 = comment2.hasAttr("#comment");
        java.lang.String str28 = comment2.getData();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        boolean boolean9 = comment1.hasParent();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 1, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        boolean boolean20 = comment1.hasAttr("");
        org.jsoup.nodes.Node node21 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        java.lang.String str23 = comment1.baseUri();
        org.jsoup.nodes.Node node25 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Node node28 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "hi!");
        boolean boolean29 = comment1.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.parent();
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--#comment-->", "#comment");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, (int) (byte) 100, outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment1.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        int int10 = comment1.siblingIndex();
        boolean boolean11 = comment1.hasParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        boolean boolean7 = comment2.hasParent();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, 0, outputSettings10);
        java.lang.Class<?> wildcardClass12 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.lang.String str6 = comment1.nodeName();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment1.outerHtmlTail(appendable7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Node node13 = comment1.parentNode();
        java.lang.String str14 = comment1.toString();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Node node21 = comment16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str11 = comment10.nodeName();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment10);
        int int13 = comment10.childNodeSize();
        org.jsoup.nodes.Node node14 = comment10.clearAttributes();
        java.lang.String str15 = comment10.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!---->" + "'", str15, "\n<!---->");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        int int6 = comment1.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str18 = comment16.absUrl("\n<!---->");
        org.jsoup.nodes.Node node19 = comment16.previousSibling();
        boolean boolean20 = node13.hasSameValue((java.lang.Object) comment16);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        boolean boolean7 = comment2.hasAttr("");
        java.lang.String str8 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        java.lang.String str11 = comment8.baseUri();
        java.lang.String str12 = comment8.baseUri();
        java.lang.String str14 = comment8.attr("");
        org.jsoup.nodes.Node node15 = comment8.clearAttributes();
        boolean boolean16 = node5.equals((java.lang.Object) node15);
        org.jsoup.nodes.Document document17 = node15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = document17.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        java.lang.String str5 = comment1.absUrl("<?i?>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        boolean boolean8 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.isXmlDeclaration();
        boolean boolean10 = comment1.hasParent();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable12, (int) '4', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        java.lang.String str6 = comment1.nodeName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        java.lang.String str21 = comment19.nodeName();
        boolean boolean22 = comment15.hasSameValue((java.lang.Object) str21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment15.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment15.siblingNodes();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith(node26);
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        org.jsoup.nodes.Node node11 = comment1.attr("", "\n<!---->");
        org.jsoup.nodes.Node node12 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        java.lang.String str10 = comment1.baseUri();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = node11.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        int int5 = comment1.siblingIndex();
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.parent();
        java.lang.String str9 = comment1.attr("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.lang.String str10 = comment1.attr("hi!");
        int int11 = comment1.childNodeSize();
        java.lang.String str13 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str14 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.baseUri();
        java.lang.String str12 = comment1.attr("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable13, (int) ' ', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        boolean boolean11 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        boolean boolean6 = node3.hasParent();
        org.jsoup.nodes.Node node7 = node3.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str9, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        int int14 = comment1.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str18 = comment17.nodeName();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) str18);
        org.jsoup.nodes.Node node20 = comment1.parent();
        java.lang.String str21 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment1.unwrap();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        java.lang.String str5 = comment2.toString();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.select.NodeFilter nodeFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.filter(nodeFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str5, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        comment1.outerHtmlTail(appendable15, (int) (short) -1, outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.after("\n<!--\n<!--\n<!--#comment-->-->-->");
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.before((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.clone();
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node14 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str19 = comment17.absUrl("\n<!--hi!-->");
        boolean boolean20 = node14.equals((java.lang.Object) comment17);
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node14.traverse(nodeVisitor21);
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.lang.String str10 = comment1.attr("hi!");
        int int11 = comment1.childNodeSize();
        java.lang.String str13 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Document document14 = comment1.ownerDocument();
        java.lang.String str15 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!---->" + "'", str15, "\n<!---->");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.isXmlDeclaration();
        boolean boolean10 = comment1.hasParent();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.String str12 = comment1.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node3.setBaseUri("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.siblingNodes();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str12 = comment11.nodeName();
        org.jsoup.nodes.Node node13 = comment11.nextSibling();
        boolean boolean14 = comment1.hasSameValue((java.lang.Object) comment11);
        java.lang.String str16 = comment11.attr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.baseUri();
        java.lang.String str16 = comment12.getData();
        org.jsoup.nodes.Node node17 = comment12.previousSibling();
        org.jsoup.nodes.Node node18 = comment12.root();
        org.jsoup.nodes.Node node19 = comment12.nextSibling();
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) comment12);
        comment12.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Node node23 = comment12.shallowClone();
        java.lang.String str24 = comment12.getData();
        boolean boolean26 = comment12.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment11.before("\n<!--#comment-->");
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
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        org.jsoup.nodes.Node node10 = comment1.parent();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment1.outerHtmlTail(appendable11, (int) (byte) 0, outputSettings13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
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
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment6.outerHtmlTail(appendable7, (-1), outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment6.childNodes();
        java.lang.String str13 = comment6.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment6.asXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment6.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node18 = node17.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node3.after(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node17 = comment1.root();
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.filter(nodeFilter18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str5 = comment4.getData();
        int int6 = comment4.siblingIndex();
        java.lang.String str7 = comment4.toString();
        boolean boolean8 = comment4.hasParent();
        boolean boolean9 = comment2.equals((java.lang.Object) comment4);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Node node11 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        boolean boolean13 = comment1.hasAttr("\n<!--#comment-->");
        java.lang.String str15 = comment1.attr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment7.outerHtmlTail(appendable8, (-1), outputSettings10);
        org.jsoup.nodes.Node node14 = comment7.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment7.asXmlDeclaration();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) comment7);
        org.jsoup.nodes.Node node17 = comment2.clone();
        java.lang.Class<?> wildcardClass18 = node17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Node node9 = node8.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        org.jsoup.nodes.Node node16 = comment1.removeAttr("\n<!--hi!-->");
        int int17 = node16.siblingIndex();
        org.jsoup.nodes.Node node18 = node16.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node16.remove();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        boolean boolean11 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        boolean boolean14 = comment10.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment10.asXmlDeclaration();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment18.outerHtmlTail(appendable19, (-1), outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment18.childNodes();
        java.lang.String str25 = comment18.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment18.asXmlDeclaration();
        boolean boolean27 = xmlDeclaration15.equals((java.lang.Object) comment18);
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str30 = comment29.getData();
        java.lang.String str31 = comment29.nodeName();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment29.outerHtmlTail(appendable32, (int) (byte) -1, outputSettings34);
        int int36 = comment29.childNodeSize();
        boolean boolean38 = comment29.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes39 = comment29.attributes();
        org.jsoup.nodes.Node node42 = comment29.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node44 = comment29.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node45 = node44.shallowClone();
        boolean boolean46 = comment18.hasSameValue((java.lang.Object) node45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = node45.siblingNodes();
        boolean boolean48 = comment1.equals((java.lang.Object) node45);
        org.jsoup.select.NodeVisitor nodeVisitor49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = comment1.traverse(nodeVisitor49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#comment" + "'", str31, "#comment");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        java.lang.String str8 = comment1.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean9 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str7 = comment2.attr("#comment");
        boolean boolean9 = comment2.hasAttr("\n<!---->");
        boolean boolean11 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str7, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.isXmlDeclaration();
        comment1.setBaseUri("hi!");
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        org.jsoup.nodes.Node node38 = comment1.clone();
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
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        comment1.setBaseUri("#comment");
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.lang.String str7 = comment4.baseUri();
        org.jsoup.nodes.Node node8 = comment4.parentNode();
        org.jsoup.nodes.Node node10 = comment4.removeAttr("");
        org.jsoup.nodes.Document document11 = comment4.ownerDocument();
        boolean boolean12 = comment1.equals((java.lang.Object) document11);
        boolean boolean14 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Document document15 = comment1.ownerDocument();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable16, (int) (short) 100, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str8 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.String str10 = comment2.toString();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        org.jsoup.nodes.Node node17 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.after("\n<!--\n<!--hi!-->-->");
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.String str18 = comment2.attr("");
        org.jsoup.nodes.Node node19 = comment2.clearAttributes();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment12.asXmlDeclaration();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str26 = comment25.getData();
        org.jsoup.nodes.Node node27 = comment25.root();
        int int28 = comment25.childNodeSize();
        java.lang.String str29 = comment25.outerHtml();
        boolean boolean30 = comment25.hasParent();
        boolean boolean31 = comment25.hasParent();
        org.jsoup.nodes.Node node33 = comment25.removeAttr("");
        org.jsoup.nodes.Document document34 = comment25.ownerDocument();
        org.jsoup.nodes.Node node35 = comment25.parent();
        // The following exception was thrown during execution in test generation
        try {
            comment12.replaceWith((org.jsoup.nodes.Node) comment25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.nodeName();
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#comment-->" + "'", str12, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--#comment-->" + "'", str13, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment11.outerHtmlTail(appendable20, (int) '4', outputSettings22);
        int int24 = comment11.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment11.childNodes();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) (byte) 10, outputSettings5);
        java.lang.String str8 = comment2.absUrl("hi!");
        java.lang.String str10 = comment2.attr("\n<!--\n<!--hi!-->-->");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) 1, outputSettings13);
        org.jsoup.nodes.Node node15 = comment2.clearAttributes();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        boolean boolean10 = comment1.hasAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.isXmlDeclaration();
        boolean boolean10 = comment1.hasParent();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.String str12 = comment1.baseUri();
        org.jsoup.nodes.Node node13 = comment1.clearAttributes();
        java.lang.String str14 = comment1.baseUri();
        int int15 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Node node19 = comment17.root();
        java.lang.String str20 = comment17.getData();
        org.jsoup.nodes.Node node23 = comment17.attr("", "");
        java.lang.String str25 = comment17.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node26 = comment17.nextSibling();
        int int27 = comment17.childNodeSize();
        java.lang.String str29 = comment17.attr("\n<!---->");
        int int30 = comment17.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        java.lang.String str10 = comment1.nodeName();
        comment1.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        org.jsoup.nodes.Node node12 = comment6.parentNode();
        java.lang.String str13 = comment6.outerHtml();
        java.lang.String str14 = comment6.getData();
        org.jsoup.nodes.Node node15 = comment6.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        java.lang.String str12 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.parent();
        java.lang.Object obj9 = null;
        boolean boolean10 = comment1.hasSameValue(obj9);
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.root();
        boolean boolean10 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.jsoup.nodes.Node node15 = comment1.attr("", "");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        java.lang.String str20 = comment17.baseUri();
        java.lang.String str22 = comment17.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment17.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = comment17.asXmlDeclaration();
        org.jsoup.nodes.Document document25 = xmlDeclaration24.ownerDocument();
        boolean boolean26 = comment1.equals((java.lang.Object) document25);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment1.outerHtmlTail(appendable27, (int) '#', outputSettings29);
        java.lang.Class<?> wildcardClass31 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        boolean boolean8 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = comment1.clone();
        java.lang.String str10 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.clone();
        java.lang.String str13 = comment1.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodes();
        org.jsoup.nodes.Node node16 = comment1.wrap("\n<!--hi!-->");
        int int17 = comment1.childNodeSize();
        java.lang.String str18 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        java.lang.String str11 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        java.lang.String str16 = comment14.nodeName();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment14.outerHtmlTail(appendable17, (int) (byte) -1, outputSettings19);
        int int21 = comment14.childNodeSize();
        java.lang.String str23 = comment14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment14.childNodesCopy();
        java.lang.String str25 = comment14.outerHtml();
        org.jsoup.nodes.Node node27 = comment14.removeAttr("");
        java.lang.String str29 = comment14.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment7.replaceWith((org.jsoup.nodes.Node) comment14);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        int int9 = comment1.childNodeSize();
        boolean boolean11 = comment1.hasAttr("\n<!--hi!-->");
        java.lang.String str13 = comment1.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.siblingNodes();
        org.jsoup.nodes.Node node15 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        int int6 = comment2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        org.jsoup.nodes.Node node14 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Node node21 = comment16.nextSibling();
        java.lang.String str23 = comment16.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment16.childNodesCopy();
        org.jsoup.nodes.Node node25 = comment16.shallowClone();
        org.jsoup.nodes.Node node26 = node25.clearAttributes();
        org.jsoup.nodes.Document document27 = node26.ownerDocument();
        org.jsoup.nodes.Node node28 = node26.clearAttributes();
        org.jsoup.nodes.Node node29 = node26.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodesCopy();
        boolean boolean31 = comment1.equals((java.lang.Object) nodeList30);
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parent();
        int int5 = comment1.childNodeSize();
        java.lang.String str6 = comment1.getData();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        java.lang.String str11 = comment9.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment9.outerHtmlTail(appendable12, (int) (byte) -1, outputSettings14);
        int int16 = comment9.childNodeSize();
        boolean boolean18 = comment9.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes19 = comment9.attributes();
        org.jsoup.nodes.Node node22 = comment9.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node24 = comment9.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment9.asXmlDeclaration();
        org.jsoup.nodes.Node node26 = comment9.root();
        java.lang.String str27 = comment9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment9.childNodesCopy();
        boolean boolean29 = comment1.equals((java.lang.Object) comment9);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = comment9.childNodesCopy();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(xmlDeclaration25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        comment2.setBaseUri("\n<!--hi!-->");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.siblingNodes();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment1.equals((java.lang.Object) node15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment1.outerHtmlTail(appendable17, (int) (short) 100, outputSettings19);
        org.jsoup.nodes.Document document21 = comment1.ownerDocument();
        java.lang.String str23 = comment1.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        int int14 = comment1.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str18 = comment17.nodeName();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) str18);
        java.lang.String str20 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodes();
        org.jsoup.nodes.Node node9 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.root();
        java.lang.String str8 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--#comment-->-->");
        int int3 = comment2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodes();
        org.jsoup.nodes.Node node6 = comment2.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = node6.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        int int14 = comment1.siblingIndex();
        java.lang.String str15 = comment1.baseUri();
        org.jsoup.nodes.Node node16 = comment1.clearAttributes();
        boolean boolean18 = comment1.hasAttr("hi!");
        java.lang.String str19 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Attributes attributes10 = comment6.attributes();
        org.jsoup.nodes.Node node11 = comment6.nextSibling();
        org.jsoup.nodes.Node node12 = comment6.shallowClone();
        java.lang.String str14 = comment6.attr("#comment");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        int int18 = comment16.siblingIndex();
        java.lang.String str19 = comment16.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment16.asXmlDeclaration();
        org.jsoup.nodes.Node node21 = xmlDeclaration20.clone();
        // The following exception was thrown during execution in test generation
        try {
            comment6.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        java.lang.String str9 = comment2.outerHtml();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node12 = comment1.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Document document16 = comment15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node12.before((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        comment1.setBaseUri("\n<!--\n<!---->-->");
        boolean boolean11 = comment1.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Node node4 = comment2.parentNode();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        int int8 = comment6.siblingIndex();
        java.lang.String str9 = comment6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment6.removeAttr("#comment");
        org.jsoup.nodes.Document document13 = comment6.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment6.childNodes();
        java.lang.String str15 = comment6.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node6 = comment2.root();
        int int7 = comment2.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.isXmlDeclaration();
        boolean boolean10 = comment1.hasParent();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.String str12 = comment1.baseUri();
        org.jsoup.nodes.Node node13 = comment1.clearAttributes();
        java.lang.String str14 = comment1.baseUri();
        int int15 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        boolean boolean21 = comment17.hasAttr("hi!");
        org.jsoup.nodes.Node node24 = comment17.attr("\n<!--hi!-->", "#comment");
        java.lang.String str25 = node24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node24.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment1.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        java.lang.String str18 = comment1.absUrl("\n<!---->");
        java.lang.String str19 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.parentNode();
        org.jsoup.nodes.Node node6 = node4.parentNode();
        java.lang.Class<?> wildcardClass7 = node4.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.lang.String str11 = comment1.nodeName();
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        int int14 = comment1.childNodeSize();
        java.lang.String str15 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node4 = node3.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment1.outerHtmlTail(appendable22, (int) 'a', outputSettings24);
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
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        boolean boolean19 = comment16.isXmlDeclaration();
        org.jsoup.nodes.Node node20 = comment16.nextSibling();
        org.jsoup.nodes.Node node21 = comment16.root();
        org.jsoup.nodes.Node node22 = comment16.root();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment16.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.before((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.siblingNodes();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment1.equals((java.lang.Object) node15);
        java.lang.String str18 = comment1.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean19 = comment1.hasParent();
        boolean boolean21 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment1.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--hi!-->-->-->");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable2, (-1), outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        boolean boolean7 = comment2.hasParent();
        boolean boolean9 = comment2.hasAttr("\n<!--\n<!--hi!-->-->");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, 0, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        boolean boolean10 = comment1.hasParent();
        java.lang.Class<?> wildcardClass11 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        java.lang.String str8 = comment1.attr("\n<!--\n<!--#comment-->-->");
        int int9 = comment1.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.String str17 = comment2.baseUri();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable18, (int) '#', outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str4 = comment1.attr("\n<!--hi!-->");
        int int5 = comment1.siblingIndex();
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str8 = comment1.attr("\n<!--\n<!--#comment-->-->");
        comment1.setBaseUri("#comment");
        boolean boolean11 = comment1.isXmlDeclaration();
        java.lang.String str12 = comment1.getData();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.jsoup.nodes.Node node10 = node9.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.lang.String str10 = comment1.attr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        java.lang.String str4 = comment1.nodeName();
        java.lang.String str6 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        java.lang.String str21 = comment18.baseUri();
        org.jsoup.nodes.Node node22 = comment18.shallowClone();
        boolean boolean23 = comment18.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment18.childNodesCopy();
        java.lang.String str25 = comment18.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration14.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--\n<!--#comment-->-->");
        java.lang.String str14 = comment2.getData();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.attr("", "\n<!---->");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        java.lang.String str11 = comment1.attr("");
        org.jsoup.nodes.Node node12 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str3 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment1.attr("#comment", "\n<!--\n<!--hi!-->-->");
        java.lang.String str7 = comment1.baseUri();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 0, outputSettings10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment1.outerHtmlTail(appendable13, 10, outputSettings15);
        org.jsoup.nodes.Node node17 = comment1.root();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable18, (int) (byte) 10, outputSettings20);
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        java.lang.String str10 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Document document8 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--\n<!---->-->");
        java.lang.String str4 = comment2.attr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        java.lang.String str9 = comment1.attr("<?i?>");
        org.jsoup.nodes.Node node11 = comment1.removeAttr("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node5 = comment4.clone();
        org.jsoup.nodes.Node node6 = comment4.clone();
        java.lang.String str7 = comment4.baseUri();
        boolean boolean8 = comment2.equals((java.lang.Object) comment4);
        org.jsoup.nodes.Attributes attributes9 = comment4.attributes();
        org.jsoup.nodes.Node node10 = comment4.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment4.before("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node4 = comment1.clearAttributes();
        org.jsoup.nodes.Node node5 = node4.parent();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean10 = comment8.hasAttr("");
        java.lang.String str11 = comment8.baseUri();
        org.jsoup.nodes.Node node14 = comment8.attr("#comment", "#comment");
        org.jsoup.nodes.Node node15 = node14.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        org.jsoup.nodes.Node node13 = node11.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Node node12 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        java.lang.String str10 = comment2.toString();
        java.lang.String str11 = comment2.toString();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("<?i?>");
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.before(node14);
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
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.root();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (int) (byte) 0, outputSettings7);
        org.jsoup.nodes.Node node9 = comment1.parent();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        org.jsoup.nodes.Node node16 = comment1.shallowClone();
        org.jsoup.nodes.Node node17 = node16.clearAttributes();
        org.jsoup.nodes.Node node19 = node17.wrap("\n<!--\n<!--hi!-->-->");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.String str16 = comment1.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node18 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.select.NodeFilter nodeFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment1.filter(nodeFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("#comment");
        org.jsoup.nodes.Document document10 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.wrap("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        java.lang.String str14 = comment7.baseUri();
        java.lang.String str15 = comment7.nodeName();
        org.jsoup.nodes.Attributes attributes16 = comment7.attributes();
        org.jsoup.nodes.Node node17 = comment7.root();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        boolean boolean7 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        boolean boolean10 = comment2.hasParent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        java.lang.String str12 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        org.jsoup.nodes.Node node15 = comment1.root();
        org.jsoup.nodes.Node node18 = comment1.attr("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        java.lang.String str22 = comment20.nodeName();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment20.outerHtmlTail(appendable23, (int) (byte) -1, outputSettings25);
        org.jsoup.nodes.Node node27 = comment20.previousSibling();
        int int28 = comment20.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment1.before((org.jsoup.nodes.Node) comment20);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment1.attr("\n<!--\n<!--\n<!--hi!-->-->-->", "\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str3 = comment1.getData();
        boolean boolean4 = comment1.hasParent();
        boolean boolean6 = comment1.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration8.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = comment1.previousSibling();
        boolean boolean15 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        java.lang.String str9 = comment1.toString();
        boolean boolean11 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Document document13 = xmlDeclaration12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.siblingNodes();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str12 = comment11.nodeName();
        org.jsoup.nodes.Node node13 = comment11.nextSibling();
        boolean boolean14 = comment1.hasSameValue((java.lang.Object) comment11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment1.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        org.jsoup.nodes.Node node15 = comment1.previousSibling();
        java.lang.String str16 = comment1.toString();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable17, (int) (short) 100, outputSettings19);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        java.lang.String str13 = comment11.nodeName();
        java.lang.String str14 = comment11.getData();
        org.jsoup.nodes.Node node15 = comment11.clone();
        java.lang.String str16 = comment11.getData();
        boolean boolean17 = comment2.equals((java.lang.Object) comment11);
        java.lang.String str18 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.siblingNodes();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment1.equals((java.lang.Object) node15);
        java.lang.String str18 = comment1.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean19 = comment1.hasParent();
        boolean boolean21 = comment1.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean25 = comment1.hasAttr("\n<!--#comment-->");
        boolean boolean26 = comment1.hasParent();
        boolean boolean27 = comment1.isXmlDeclaration();
        java.lang.String str28 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--hi!-->" + "'", str28, "\n<!--hi!-->");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.previousSibling();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 0, outputSettings6);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        java.lang.String str6 = comment1.nodeName();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        java.lang.String str11 = comment8.getData();
        org.jsoup.nodes.Node node14 = comment8.attr("", "");
        org.jsoup.nodes.Node node15 = comment8.previousSibling();
        boolean boolean16 = comment8.isXmlDeclaration();
        boolean boolean17 = comment1.equals((java.lang.Object) boolean16);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node19.setBaseUri("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = node7.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node3.shallowClone();
        org.jsoup.nodes.Node node8 = node7.root();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        java.lang.String str13 = comment10.baseUri();
        java.lang.String str15 = comment10.attr("hi!");
        java.lang.String str16 = comment10.getData();
        org.jsoup.nodes.Node node17 = comment10.clone();
        boolean boolean18 = node7.equals((java.lang.Object) node17);
        org.jsoup.nodes.Node node19 = node17.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "hi!");
        int int11 = node10.siblingIndex();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        java.lang.String str15 = comment13.nodeName();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment13.outerHtmlTail(appendable16, (int) (byte) -1, outputSettings18);
        int int20 = comment13.childNodeSize();
        boolean boolean22 = comment13.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes23 = comment13.attributes();
        org.jsoup.nodes.Node node26 = comment13.attr("\n<!---->", "hi!");
        java.lang.String str28 = comment13.attr("\n<!--#comment-->");
        boolean boolean30 = comment13.hasAttr("\n<!--hi!-->");
        boolean boolean32 = comment13.hasAttr("");
        org.jsoup.nodes.Node node33 = comment13.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = comment13.asXmlDeclaration();
        boolean boolean35 = node10.hasSameValue((java.lang.Object) comment13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(xmlDeclaration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        java.lang.String str5 = comment1.absUrl("<?i?>");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes11 = comment6.attributes();
        java.lang.String str12 = comment6.getData();
        java.lang.String str14 = comment6.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean15 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node16 = comment6.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parent();
        int int5 = comment1.childNodeSize();
        java.lang.String str6 = comment1.getData();
        java.lang.String str8 = comment1.attr("\n<!---->");
        java.lang.String str9 = comment1.toString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--#comment-->" + "'", str9, "\n<!--#comment-->");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        boolean boolean10 = comment1.hasAttr("\n<!---->");
        boolean boolean12 = comment1.hasAttr("\n<!--#comment-->");
        int int13 = comment1.childNodeSize();
        java.lang.String str14 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("#comment");
        boolean boolean6 = comment1.isXmlDeclaration();
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        java.lang.String str12 = comment9.getData();
        java.lang.String str13 = comment9.toString();
        org.jsoup.nodes.Node node14 = comment9.clone();
        java.lang.String str15 = comment9.getData();
        comment9.setBaseUri("\n<!--\n<!--#comment-->-->");
        java.lang.String str19 = comment9.absUrl("hi!");
        boolean boolean20 = comment9.hasParent();
        java.lang.String str21 = comment9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment1.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!---->");
        java.lang.String str3 = comment2.baseUri();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node6 = comment5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment5.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment5.attr("\n<!---->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parent();
        int int5 = comment1.childNodeSize();
        java.lang.String str6 = comment1.getData();
        boolean boolean7 = comment1.hasParent();
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("");
        java.lang.String str16 = comment14.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node19 = comment14.attr("#comment", "\n<!--\n<!--hi!-->-->");
        boolean boolean20 = node12.hasSameValue((java.lang.Object) "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node12.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        java.lang.String str18 = comment2.outerHtml();
        org.jsoup.nodes.Node node19 = comment2.root();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment2.outerHtmlTail(appendable20, (int) (byte) 10, outputSettings22);
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!---->-->");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.baseUri();
        java.lang.String str16 = comment12.getData();
        org.jsoup.nodes.Node node17 = comment12.previousSibling();
        org.jsoup.nodes.Node node18 = comment12.root();
        org.jsoup.nodes.Node node19 = comment12.nextSibling();
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) comment12);
        comment12.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Node node23 = comment12.shallowClone();
        java.lang.String str24 = comment12.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment2.clone();
        boolean boolean11 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        java.lang.String str14 = comment2.attr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Node node9 = comment2.shallowClone();
        org.jsoup.nodes.Node node10 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node10.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        java.lang.String str11 = comment8.getData();
        org.jsoup.nodes.Node node14 = comment8.attr("", "");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment8.outerHtmlTail(appendable15, (int) (short) 100, outputSettings17);
        org.jsoup.nodes.Node node20 = comment8.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node21 = comment8.shallowClone();
        org.jsoup.nodes.Node node23 = comment8.wrap("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment8.childNodesCopy();
        org.jsoup.nodes.Node node25 = comment8.previousSibling();
        boolean boolean26 = node6.hasSameValue((java.lang.Object) comment8);
        int int27 = comment8.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        org.jsoup.nodes.Node node16 = comment1.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        boolean boolean5 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        boolean boolean20 = comment1.hasAttr("");
        org.jsoup.nodes.Node node21 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        java.lang.String str23 = comment1.baseUri();
        java.lang.String str24 = comment1.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment1.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--#comment-->");
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        int int14 = comment1.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str18 = comment17.nodeName();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) str18);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        java.lang.String str22 = comment21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment1.after((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document5.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        int int17 = comment1.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.lang.String str15 = comment12.baseUri();
        java.lang.String str16 = comment12.baseUri();
        boolean boolean17 = comment12.isXmlDeclaration();
        java.lang.String str19 = comment12.attr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        int int12 = comment1.childNodeSize();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable13, 100, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment1.root();
        boolean boolean13 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node14 = comment1.clone();
        int int15 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.lang.String str7 = comment1.nodeName();
        int int8 = comment1.siblingIndex();
        java.lang.String str9 = comment1.getData();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node8 = comment5.attr("\n<!--hi!-->", "\n<!--hi!-->");
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment5);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clearAttributes();
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        java.lang.String str8 = comment1.baseUri();
        org.jsoup.nodes.Node node11 = comment1.attr("", "<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        int int5 = comment1.siblingIndex();
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        org.jsoup.nodes.Node node22 = comment10.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        boolean boolean26 = node22.equals((java.lang.Object) "\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            node22.remove();
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Node node4 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.clone();
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.jsoup.nodes.Node node14 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str19 = comment17.absUrl("\n<!--hi!-->");
        boolean boolean20 = node14.equals((java.lang.Object) comment17);
        org.jsoup.nodes.Node node21 = node14.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        comment1.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        java.lang.String str13 = comment1.attr("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.root();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.filter(nodeFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.clone();
        java.lang.String str13 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment1.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        java.lang.String str20 = comment17.baseUri();
        java.lang.String str21 = comment17.baseUri();
        java.lang.String str23 = comment17.attr("\n<!---->");
        org.jsoup.nodes.Node node24 = comment17.shallowClone();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node27 = comment26.parentNode();
        java.lang.String str28 = comment26.outerHtml();
        org.jsoup.nodes.Node node29 = comment26.parent();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment26.outerHtmlTail(appendable30, (-1), outputSettings32);
        boolean boolean34 = comment17.equals((java.lang.Object) comment26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment1.after((org.jsoup.nodes.Node) comment17);
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--#comment-->" + "'", str28, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.lang.String str8 = xmlDeclaration7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration7.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?i?>" + "'", str8, "<?i?>");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.toString();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node2.childNodes();
        org.jsoup.nodes.Node node5 = node2.previousSibling();
        java.lang.Object obj6 = null;
        boolean boolean7 = node2.equals(obj6);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node14 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.lang.Object obj11 = null;
        boolean boolean12 = xmlDeclaration10.equals(obj11);
        org.jsoup.nodes.Node node13 = xmlDeclaration10.clone();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.wrap("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration10.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        boolean boolean7 = comment1.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        org.jsoup.nodes.Node node13 = comment9.removeAttr("");
        org.jsoup.nodes.Node node14 = comment9.nextSibling();
        java.lang.String str16 = comment9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment9.childNodesCopy();
        int int18 = comment9.childNodeSize();
        org.jsoup.nodes.Node node19 = comment9.nextSibling();
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) comment9);
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        org.jsoup.nodes.Node node26 = comment22.removeAttr("");
        org.jsoup.nodes.Node node27 = comment22.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment22.childNodes();
        int int29 = comment22.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment22.asXmlDeclaration();
        org.jsoup.nodes.Node node31 = xmlDeclaration30.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment1.before((org.jsoup.nodes.Node) xmlDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
            org.jsoup.nodes.Node node12 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("\n<!---->", "\n<!--#comment-->");
        java.lang.String str11 = comment1.attr("\n<!--#comment-->");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, (int) (short) 0, outputSettings14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str3 = comment1.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.siblingNodes();
        java.lang.String str5 = comment1.toString();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable6, 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        java.lang.String str8 = comment2.nodeName();
        org.jsoup.nodes.Node node9 = comment2.shallowClone();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) ' ', outputSettings12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.String str17 = comment1.absUrl("hi!");
        java.lang.String str18 = comment1.outerHtml();
        java.lang.String str19 = comment1.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        org.jsoup.nodes.Node node16 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node21 = comment19.removeAttr("");
        java.lang.String str22 = comment19.baseUri();
        java.lang.String str24 = comment19.attr("hi!");
        java.lang.String str25 = comment19.toString();
        int int26 = comment19.siblingIndex();
        boolean boolean27 = comment19.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment19);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(xmlDeclaration17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasAttr("");
        java.lang.String str11 = comment2.baseUri();
        org.jsoup.nodes.Document document12 = comment2.ownerDocument();
        boolean boolean13 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        boolean boolean20 = comment1.hasAttr("");
        org.jsoup.nodes.Node node21 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        java.lang.String str23 = comment1.baseUri();
        java.lang.String str24 = comment1.outerHtml();
        java.lang.String str26 = comment1.attr("\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment1.childNodes();
        comment1.setBaseUri("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.String str6 = comment2.absUrl("#comment");
        java.lang.String str7 = comment2.nodeName();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        java.lang.String str11 = comment9.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment9.outerHtmlTail(appendable12, (int) (byte) -1, outputSettings14);
        int int16 = comment9.childNodeSize();
        boolean boolean18 = comment9.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes19 = comment9.attributes();
        boolean boolean21 = comment9.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = comment9.parent();
        java.lang.String str23 = comment9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str5 = comment4.getData();
        java.lang.String str6 = comment4.nodeName();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment4.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        int int11 = comment4.childNodeSize();
        boolean boolean13 = comment4.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes14 = comment4.attributes();
        org.jsoup.nodes.Node node17 = comment4.attr("\n<!---->", "hi!");
        java.lang.String str19 = comment4.attr("\n<!--#comment-->");
        org.jsoup.nodes.Node node20 = comment4.root();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.childNodesCopy();
        boolean boolean22 = comment1.equals((java.lang.Object) node20);
        org.jsoup.select.NodeFilter nodeFilter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node20.filter(nodeFilter23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Node node4 = comment2.parentNode();
        boolean boolean5 = comment2.hasParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node11 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node12 = comment1.parent();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.Class<?> wildcardClass10 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        boolean boolean10 = comment1.hasAttr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        org.jsoup.nodes.Node node16 = comment12.removeAttr("");
        org.jsoup.nodes.Node node17 = comment12.nextSibling();
        java.lang.String str19 = comment12.attr("");
        org.jsoup.nodes.Node node20 = comment12.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment12.asXmlDeclaration();
        org.jsoup.nodes.Node node23 = comment12.wrap("\n<!--#comment-->");
        int int24 = comment12.childNodeSize();
        java.lang.String str25 = comment12.nodeName();
        org.jsoup.nodes.Node node26 = comment12.root();
        boolean boolean28 = comment12.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment6.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.toString();
        java.lang.String str8 = comment1.absUrl("\n<!---->");
        java.lang.String str9 = comment1.toString();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node14 = comment11.clone();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--#comment-->" + "'", str9, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.root();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        java.lang.String str5 = comment1.absUrl("<?i?>");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        org.jsoup.nodes.Node node16 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node18 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.after("");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(xmlDeclaration17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment1.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node13 = node12.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.lang.String str18 = comment1.absUrl("\n<!---->");
        java.lang.String str19 = comment1.toString();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node24 = comment22.removeAttr("");
        boolean boolean26 = comment22.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment22.asXmlDeclaration();
        org.jsoup.nodes.Node node28 = comment22.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment22.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = comment1.before((org.jsoup.nodes.Node) comment22);
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node4 = comment2.clearAttributes();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str7 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        java.lang.String str8 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        org.jsoup.nodes.Node node13 = node11.wrap("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node14 = node11.clearAttributes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment16.childNodesCopy();
        int int20 = comment16.childNodeSize();
        java.lang.String str21 = comment16.outerHtml();
        java.lang.String str22 = comment16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment16.childNodesCopy();
        boolean boolean24 = node14.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node25 = comment16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        org.jsoup.nodes.Node node13 = node11.wrap("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node14 = node11.clearAttributes();
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node10 = comment2.parent();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.lang.String str15 = comment12.baseUri();
        org.jsoup.nodes.Node node16 = comment12.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str12 = comment1.outerHtml();
        int int13 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Document document12 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document12.shallowClone();
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
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        java.lang.String str17 = comment2.baseUri();
        org.jsoup.nodes.Node node18 = comment2.shallowClone();
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node6 = node5.shallowClone();
        org.jsoup.nodes.Node node7 = node5.shallowClone();
        boolean boolean8 = node7.hasParent();
        boolean boolean9 = node7.hasParent();
        boolean boolean10 = node7.hasParent();
        int int11 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        org.jsoup.nodes.Node node18 = comment1.clone();
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        org.jsoup.nodes.Node node16 = comment1.removeAttr("\n<!--\n<!--hi!-->-->");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment2.hasAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node13 = comment2.clearAttributes();
        org.jsoup.nodes.Node node14 = node13.root();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        boolean boolean20 = comment1.hasAttr("");
        org.jsoup.nodes.Node node21 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment1.childNodes();
        java.lang.String str25 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        org.jsoup.nodes.Node node21 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node25 = comment23.removeAttr("");
        org.jsoup.nodes.Node node26 = comment23.shallowClone();
        org.jsoup.nodes.Node node27 = comment23.parent();
        org.jsoup.nodes.Node node28 = comment23.parent();
        java.lang.String str30 = comment23.attr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment23.childNodesCopy();
        java.lang.String str33 = comment23.attr("");
        org.jsoup.nodes.Attributes attributes34 = comment23.attributes();
        boolean boolean35 = node21.hasSameValue((java.lang.Object) attributes34);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str10 = comment2.outerHtml();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        java.lang.String str13 = comment2.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        java.lang.String str17 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node11 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        boolean boolean18 = comment14.hasAttr("\n<!---->");
        int int19 = comment14.childNodeSize();
        boolean boolean20 = comment1.equals((java.lang.Object) comment14);
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment1.outerHtmlTail(appendable21, (int) (short) 0, outputSettings23);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        org.jsoup.nodes.Node node12 = comment8.removeAttr("");
        org.jsoup.nodes.Node node13 = comment8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment8.childNodes();
        boolean boolean15 = comment1.hasSameValue((java.lang.Object) comment8);
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node18 = comment17.clone();
        org.jsoup.nodes.Node node19 = comment17.clone();
        org.jsoup.nodes.Node node21 = comment17.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node22 = comment17.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment17.asXmlDeclaration();
        java.lang.String str25 = comment17.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment17.childNodesCopy();
        boolean boolean27 = comment8.equals((java.lang.Object) nodeList26);
        org.jsoup.nodes.Node node30 = comment8.attr("<?i?>", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node31 = comment8.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node4 = comment1.clearAttributes();
        org.jsoup.nodes.Node node5 = node4.shallowClone();
        org.jsoup.nodes.Node node6 = node4.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration10.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        java.lang.String str8 = comment1.baseUri();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment2.clone();
        boolean boolean11 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str25 = comment24.getData();
        java.lang.String str26 = comment24.nodeName();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment24.outerHtmlTail(appendable27, (int) (byte) -1, outputSettings29);
        int int31 = comment24.childNodeSize();
        boolean boolean33 = comment24.hasSameValue((java.lang.Object) 'a');
        int int34 = comment24.siblingIndex();
        boolean boolean35 = comment1.equals((java.lang.Object) comment24);
        java.lang.String str36 = comment24.getData();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment5.outerHtmlTail(appendable8, (int) (byte) -1, outputSettings10);
        int int12 = comment5.childNodeSize();
        boolean boolean14 = comment5.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes15 = comment5.attributes();
        boolean boolean17 = comment5.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = comment5.shallowClone();
        boolean boolean20 = comment5.hasAttr("\n<!---->");
        int int21 = comment5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment5.childNodesCopy();
        org.jsoup.nodes.Node node23 = comment5.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment5.outerHtmlTail(appendable24, (int) (byte) 10, outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document3.before((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        java.lang.String str11 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        java.lang.String str15 = comment2.attr("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Attributes attributes16 = comment2.attributes();
        java.lang.Class<?> wildcardClass17 = comment2.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Node node9 = comment1.root();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.clearAttributes();
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
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration8.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        java.lang.String str14 = comment11.baseUri();
        java.lang.String str16 = comment11.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = comment11.asXmlDeclaration();
        boolean boolean18 = node9.hasSameValue((java.lang.Object) comment11);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean23 = comment21.hasAttr("");
        java.lang.String str25 = comment21.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment21.childNodesCopy();
        boolean boolean27 = node9.equals((java.lang.Object) comment21);
        org.jsoup.nodes.Node node28 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node28.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(xmlDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node12 = comment1.parent();
        java.lang.String str14 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        comment1.setBaseUri("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node11 = comment1.root();
        org.jsoup.nodes.Node node12 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after("hi!");
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        org.jsoup.nodes.Node node13 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        java.lang.String str13 = comment1.absUrl("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodesCopy();
        boolean boolean7 = node5.hasParent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        java.lang.String str11 = comment9.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment9.outerHtmlTail(appendable12, (int) (byte) -1, outputSettings14);
        org.jsoup.nodes.Node node18 = comment9.attr("\n<!--hi!-->", "");
        java.lang.String str19 = comment9.toString();
        boolean boolean20 = node5.hasSameValue((java.lang.Object) comment9);
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment9.outerHtmlTail(appendable21, (int) (short) 0, outputSettings23);
        org.jsoup.nodes.Node node27 = comment9.attr("\n<!---->", "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        java.lang.Class<?> wildcardClass26 = node25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.outerHtml();
        java.lang.String str14 = comment1.nodeName();
        boolean boolean16 = comment1.hasAttr("");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.nextSibling();
        org.jsoup.nodes.Node node12 = xmlDeclaration10.root();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.lang.Object obj11 = null;
        boolean boolean12 = xmlDeclaration10.equals(obj11);
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration10.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.lang.String str7 = comment1.toString();
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.Node node11 = comment1.attr("hi!", "\n<!--hi!-->");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, (int) (short) 0, outputSettings14);
        java.lang.String str16 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Node node12 = comment1.wrap("\n<!--#comment-->");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.clone();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        boolean boolean6 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        node7.setBaseUri("\n<!---->");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node11 = node7.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        org.jsoup.nodes.Node node9 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.before(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        comment1.setBaseUri("");
        int int17 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration18);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        boolean boolean8 = comment1.isXmlDeclaration();
        boolean boolean9 = comment1.isXmlDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        org.jsoup.nodes.Node node14 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        org.jsoup.nodes.Node node15 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment1.outerHtmlTail(appendable11, (int) 'a', outputSettings13);
        java.lang.String str15 = comment1.toString();
        org.jsoup.nodes.Document document16 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        boolean boolean18 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Document document19 = comment1.ownerDocument();
        int int20 = comment1.childNodeSize();
        java.lang.String str21 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Object obj4 = null;
        boolean boolean5 = comment1.equals(obj4);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean10 = comment8.hasAttr("");
        java.lang.String str11 = comment8.baseUri();
        org.jsoup.nodes.Node node14 = comment8.attr("#comment", "#comment");
        java.lang.String str16 = comment8.attr("hi!");
        boolean boolean17 = comment1.hasSameValue((java.lang.Object) comment8);
        org.jsoup.nodes.Attributes attributes18 = comment1.attributes();
        org.jsoup.nodes.Node node19 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        comment1.setBaseUri("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        boolean boolean9 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable10, (int) (short) 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("#comment");
        java.lang.String str6 = comment1.baseUri();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.jsoup.nodes.Document document13 = node11.ownerDocument();
        org.jsoup.nodes.Node node14 = node11.root();
        java.lang.Class<?> wildcardClass15 = node11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        int int11 = comment1.siblingIndex();
        java.lang.String str12 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Document document16 = comment14.ownerDocument();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment14.outerHtmlTail(appendable17, 0, outputSettings19);
        java.lang.String str21 = comment14.nodeName();
        org.jsoup.nodes.Node node22 = comment14.parentNode();
        int int23 = comment14.childNodeSize();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str26 = comment25.getData();
        org.jsoup.nodes.Node node27 = comment25.root();
        int int28 = comment25.childNodeSize();
        java.lang.String str29 = comment25.outerHtml();
        java.lang.String str31 = comment25.attr("\n<!--hi!-->");
        java.lang.String str33 = comment25.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = comment25.asXmlDeclaration();
        boolean boolean35 = comment14.equals((java.lang.Object) comment25);
        boolean boolean37 = comment14.hasAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str38 = comment14.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node11.after((org.jsoup.nodes.Node) comment14);
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
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        boolean boolean7 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        boolean boolean10 = comment2.hasParent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration11.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean13 = comment11.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.siblingNodes();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment1.equals((java.lang.Object) node15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment1.outerHtmlTail(appendable17, (int) (short) 100, outputSettings19);
        org.jsoup.nodes.Document document21 = comment1.ownerDocument();
        java.lang.String str23 = comment1.absUrl("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        boolean boolean15 = comment1.hasAttr("");
        org.jsoup.nodes.Node node17 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str18 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        int int14 = comment1.siblingIndex();
        java.lang.String str15 = comment1.baseUri();
        boolean boolean16 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "hi!");
        boolean boolean12 = comment1.equals((java.lang.Object) (byte) 1);
        org.jsoup.nodes.Node node15 = comment1.attr("<?i?>", "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node8 = comment1.attr("hi!", "");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable9, 0, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = node14.hasSameValue(obj15);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = node7.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        java.lang.String str12 = comment10.nodeName();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment10.outerHtmlTail(appendable13, (int) (byte) -1, outputSettings15);
        org.jsoup.nodes.Node node17 = comment10.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment10.childNodesCopy();
        org.jsoup.nodes.Node node19 = comment10.clone();
        org.jsoup.nodes.Node node20 = comment10.clearAttributes();
        boolean boolean21 = node7.equals((java.lang.Object) comment10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Document document8 = comment1.ownerDocument();
        org.jsoup.nodes.Node node9 = comment1.clone();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node11 = comment10.clone();
        org.jsoup.nodes.Node node13 = comment10.wrap("\n<!--#comment-->");
        boolean boolean14 = comment1.hasSameValue((java.lang.Object) comment10);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node3.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        java.lang.String str7 = comment1.absUrl("\n<!---->");
        java.lang.String str8 = comment1.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.clone();
        boolean boolean10 = comment1.isXmlDeclaration();
        int int11 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.siblingNodes();
        java.lang.String str14 = comment1.attr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        boolean boolean10 = comment1.hasParent();
        int int11 = comment1.siblingIndex();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable12, (int) (short) -1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        org.jsoup.nodes.Node node8 = node6.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        java.lang.String str9 = comment1.absUrl("hi!");
        boolean boolean10 = comment1.hasParent();
        java.lang.String str11 = comment1.baseUri();
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment15.outerHtmlTail(appendable16, (-1), outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment15.childNodes();
        org.jsoup.nodes.Node node22 = comment15.removeAttr("#comment");
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str25 = comment24.getData();
        java.lang.String str26 = comment24.nodeName();
        java.lang.String str27 = comment24.getData();
        org.jsoup.nodes.Node node28 = comment24.clone();
        java.lang.String str29 = comment24.getData();
        boolean boolean30 = comment15.equals((java.lang.Object) comment24);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment24.outerHtmlTail(appendable31, (int) (short) 10, outputSettings33);
        org.jsoup.nodes.Node node36 = comment24.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = node12.hasSameValue((java.lang.Object) comment24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        int int4 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str6 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!---->" + "'", str6, "\n<!---->");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        boolean boolean11 = comment1.hasAttr("\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        org.jsoup.nodes.Node node15 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.wrap("");
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.String str6 = comment2.absUrl("#comment");
        java.lang.String str7 = comment2.nodeName();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean11 = comment2.hasAttr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str6 = comment2.attr("");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str10 = comment2.attr("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        java.lang.String str12 = comment2.getData();
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "hi!");
        comment2.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node4 = comment1.clearAttributes();
        org.jsoup.nodes.Node node5 = comment1.clearAttributes();
        boolean boolean7 = comment1.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node9 = comment1.removeAttr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "\n<!--\n<!--\n<!--hi!-->-->-->");
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        java.lang.String str8 = comment1.baseUri();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 100, outputSettings11);
        java.lang.Class<?> wildcardClass13 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str3 = comment2.nodeName();
        org.jsoup.nodes.Node node4 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        int int5 = comment1.childNodeSize();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }
}

