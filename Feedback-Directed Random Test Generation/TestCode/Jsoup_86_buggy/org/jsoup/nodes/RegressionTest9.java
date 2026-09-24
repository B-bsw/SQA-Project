package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        java.lang.String str16 = comment7.getData();
        boolean boolean17 = comment7.hasParent();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node13 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.toString();
        java.lang.String str9 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        int int11 = comment1.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Node node15 = xmlDeclaration13.shallowClone();
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
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment1.asXmlDeclaration();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment1.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment2.outerHtmlTail(appendable18, (int) (byte) 1, outputSettings20);
        org.jsoup.nodes.Node node22 = comment2.nextSibling();
        java.lang.String str23 = comment2.baseUri();
        java.lang.String str25 = comment2.attr("\n<!--hi!-->");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment2.outerHtmlTail(appendable26, (int) ' ', outputSettings28);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        org.jsoup.nodes.Node node12 = node11.root();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.toString();
        org.jsoup.nodes.Node node18 = comment14.parentNode();
        java.lang.String str20 = comment14.absUrl("\n<!--hi!-->");
        int int21 = comment14.childNodeSize();
        org.jsoup.nodes.Node node22 = comment14.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment14.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = comment14.asXmlDeclaration();
        boolean boolean25 = comment14.isXmlDeclaration();
        org.jsoup.nodes.Node node26 = comment14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node12.before(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.root();
        java.lang.String str12 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        java.lang.String str17 = comment14.baseUri();
        java.lang.String str18 = comment14.baseUri();
        java.lang.String str20 = comment14.attr("");
        org.jsoup.nodes.Node node21 = comment14.parent();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str24 = comment23.getData();
        java.lang.String str25 = comment23.nodeName();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment23.outerHtmlTail(appendable26, (int) (byte) -1, outputSettings28);
        int int30 = comment23.childNodeSize();
        boolean boolean32 = comment23.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes33 = comment23.attributes();
        org.jsoup.nodes.Node node36 = comment23.attr("\n<!---->", "hi!");
        java.lang.String str38 = comment23.attr("\n<!--#comment-->");
        boolean boolean40 = comment23.hasAttr("\n<!--hi!-->");
        boolean boolean42 = comment23.hasAttr("");
        org.jsoup.nodes.Node node43 = comment23.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = comment23.childNodes();
        java.lang.String str45 = comment23.baseUri();
        java.lang.String str46 = comment23.outerHtml();
        org.jsoup.nodes.Node node48 = comment23.removeAttr("\n<!--\n<!---->-->");
        boolean boolean49 = comment14.equals((java.lang.Object) node48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = comment1.before(node48);
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
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\n<!--hi!-->" + "'", str46, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node12 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        int int11 = comment9.siblingIndex();
        org.jsoup.nodes.Node node12 = comment9.clearAttributes();
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Node node14 = node12.clearAttributes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        java.lang.String str19 = comment16.baseUri();
        org.jsoup.nodes.Node node20 = comment16.previousSibling();
        org.jsoup.nodes.Node node21 = comment16.shallowClone();
        boolean boolean22 = node14.equals((java.lang.Object) node21);
        boolean boolean23 = comment2.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        java.lang.String str4 = comment1.nodeName();
        java.lang.String str6 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        org.jsoup.nodes.Node node11 = comment1.attr("", "\n<!---->");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, 0, outputSettings14);
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.filter(nodeFilter16);
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
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str12 = comment1.attr("");
        org.jsoup.nodes.Node node13 = comment1.previousSibling();
        java.lang.String str14 = comment1.baseUri();
        int int15 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node16 = comment15.shallowClone();
        org.jsoup.nodes.Node node17 = node16.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodesCopy();
        boolean boolean19 = comment1.equals((java.lang.Object) node17);
        boolean boolean20 = comment1.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node7 = comment6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment6.asXmlDeclaration();
        boolean boolean9 = comment2.equals((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        org.jsoup.nodes.Node node13 = comment6.attr("\n<!--\n<!--#comment-->-->", "");
        int int14 = comment6.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment6.siblingNodes();
        org.jsoup.nodes.Node node16 = comment6.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        boolean boolean14 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node4 = node3.clearAttributes();
        int int5 = node4.siblingIndex();
        node4.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment9.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        boolean boolean8 = xmlDeclaration7.hasParent();
        org.jsoup.nodes.Document document9 = xmlDeclaration7.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.toString();
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration10.siblingNodes();
        org.jsoup.nodes.Node node13 = xmlDeclaration10.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean13 = comment1.equals((java.lang.Object) "\n<!--hi!-->");
        java.lang.String str14 = comment1.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        int int19 = comment16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment16.childNodes();
        org.jsoup.nodes.Node node22 = comment16.removeAttr("hi!");
        boolean boolean23 = comment1.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Attributes attributes24 = comment16.attributes();
        org.jsoup.nodes.Node node25 = comment16.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Node node12 = node11.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str8 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.String str10 = comment2.toString();
        java.lang.String str11 = comment2.toString();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        int int7 = comment1.childNodeSize();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        node19.setBaseUri("\n<!--\n<!--#comment-->-->");
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
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        org.jsoup.nodes.Node node17 = node16.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = comment1.shallowClone();
        org.jsoup.nodes.Node node13 = comment1.root();
        node13.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment13.siblingNodes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        java.lang.String str19 = comment16.baseUri();
        org.jsoup.nodes.Node node20 = comment16.parentNode();
        org.jsoup.nodes.Node node22 = comment16.removeAttr("");
        org.jsoup.nodes.Document document23 = comment16.ownerDocument();
        boolean boolean24 = comment13.equals((java.lang.Object) document23);
        org.jsoup.nodes.Attributes attributes25 = comment13.attributes();
        org.jsoup.nodes.Node node26 = comment13.previousSibling();
        int int27 = comment13.childNodeSize();
        boolean boolean28 = xmlDeclaration11.equals((java.lang.Object) int27);
        org.jsoup.nodes.Node node29 = xmlDeclaration11.clearAttributes();
        org.jsoup.nodes.Node node30 = node29.parentNode();
        org.jsoup.select.NodeFilter nodeFilter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node29.filter(nodeFilter31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 1, outputSettings9);
        org.jsoup.nodes.Node node11 = comment2.clearAttributes();
        java.lang.String str12 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node5 = comment2.attr("\n<!--hi!-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!--\n<!--hi!-->-->");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.lang.String str6 = comment1.nodeName();
        java.lang.String str8 = comment1.attr("\n<!---->");
        java.lang.String str10 = comment1.attr("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node4 = comment1.clone();
        java.lang.String str6 = comment1.attr("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment2.asXmlDeclaration();
        java.lang.String str22 = comment2.outerHtml();
        java.lang.String str24 = comment2.attr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.after("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment8.outerHtmlTail(appendable9, (-1), outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment8.childNodes();
        java.lang.String str15 = comment8.absUrl("\n<!--hi!-->");
        boolean boolean17 = comment8.hasAttr("\n<!--#comment-->");
        boolean boolean18 = comment1.equals((java.lang.Object) "\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment1.childNodes();
        java.lang.String str21 = comment1.absUrl("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, (int) (byte) 10, outputSettings8);
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!--\n<!---->-->");
        java.lang.String str13 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        java.lang.String str14 = comment1.baseUri();
        java.lang.String str16 = comment1.attr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        java.lang.String str11 = comment1.absUrl("hi!");
        boolean boolean12 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        org.jsoup.nodes.Node node17 = comment15.root();
        org.jsoup.nodes.Node node19 = comment15.removeAttr("");
        org.jsoup.nodes.Node node20 = comment15.nextSibling();
        java.lang.String str22 = comment15.attr("");
        org.jsoup.nodes.Node node23 = comment15.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = comment15.asXmlDeclaration();
        java.lang.String str25 = comment15.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment15.asXmlDeclaration();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean31 = comment29.hasAttr("");
        java.lang.String str32 = comment29.baseUri();
        org.jsoup.nodes.Node node35 = comment29.attr("#comment", "#comment");
        java.lang.String str37 = comment29.attr("hi!");
        boolean boolean38 = comment29.hasParent();
        boolean boolean39 = comment15.hasSameValue((java.lang.Object) boolean38);
        comment15.setBaseUri("\n<!--#comment-->");
        int int42 = comment15.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.lang.String str4 = comment2.toString();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (short) 10, outputSettings7);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!---->" + "'", str4, "\n<!---->");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node5 = comment4.clone();
        org.jsoup.nodes.Node node6 = comment4.clone();
        java.lang.String str7 = comment4.baseUri();
        boolean boolean8 = comment2.equals((java.lang.Object) comment4);
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        java.lang.String str10 = comment1.attr("\n<!--hi!-->");
        java.lang.String str11 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--\n<!---->-->", "\n<!--hi!-->");
        node13.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node16 = node13.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Document document9 = comment7.ownerDocument();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment7.outerHtmlTail(appendable10, 0, outputSettings12);
        java.lang.String str14 = comment7.nodeName();
        boolean boolean15 = comment7.hasParent();
        java.lang.String str16 = comment7.baseUri();
        int int17 = comment7.childNodeSize();
        org.jsoup.nodes.Node node18 = comment7.nextSibling();
        org.jsoup.nodes.Node node19 = comment7.shallowClone();
        boolean boolean20 = node3.equals((java.lang.Object) comment7);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.toString();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        java.lang.String str8 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.clone();
        java.lang.String str6 = comment1.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        java.lang.String str6 = comment1.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodesCopy();
        boolean boolean7 = node5.hasParent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        java.lang.String str12 = comment9.baseUri();
        org.jsoup.nodes.Node node15 = comment9.attr("#comment", "#comment");
        org.jsoup.nodes.Node node16 = comment9.shallowClone();
        org.jsoup.nodes.Node node17 = node16.shallowClone();
        int int18 = node17.siblingIndex();
        boolean boolean19 = node5.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Node node11 = comment1.clone();
        int int12 = comment1.childNodeSize();
        java.lang.String str14 = comment1.absUrl("\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        java.lang.String str15 = comment1.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node4 = comment1.parent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        org.jsoup.nodes.Node node11 = comment7.removeAttr("");
        org.jsoup.nodes.Node node12 = comment7.nextSibling();
        java.lang.String str14 = comment7.attr("");
        org.jsoup.nodes.Node node15 = comment7.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment7.asXmlDeclaration();
        java.lang.String str17 = comment7.nodeName();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        java.lang.String str21 = comment19.nodeName();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment19.outerHtmlTail(appendable22, (int) (byte) -1, outputSettings24);
        int int26 = comment19.childNodeSize();
        boolean boolean28 = comment19.hasSameValue((java.lang.Object) 'a');
        int int29 = comment19.siblingIndex();
        org.jsoup.nodes.Node node30 = comment19.root();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment19.outerHtmlTail(appendable31, (int) (byte) 100, outputSettings33);
        org.jsoup.nodes.Node node35 = comment19.clone();
        boolean boolean36 = comment7.hasSameValue((java.lang.Object) comment19);
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment1.childNodesCopy();
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        java.lang.String str9 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        boolean boolean6 = comment2.hasParent();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.wrap("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--hi!-->-->", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        org.jsoup.nodes.Node node12 = node10.clone();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        int int5 = comment1.siblingIndex();
        int int6 = comment1.childNodeSize();
        java.lang.String str7 = comment1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        comment1.setBaseUri("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!---->");
        boolean boolean22 = comment1.equals((java.lang.Object) "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.hasParent();
        java.lang.String str7 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.String str9 = comment1.attr("\n<!--#comment-->");
        boolean boolean11 = comment1.hasAttr("\n<!--\n<!---->-->");
        boolean boolean12 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.lang.String str10 = comment1.attr("hi!");
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment13.childNodesCopy();
        java.lang.String str17 = comment13.toString();
        org.jsoup.nodes.Node node18 = comment13.shallowClone();
        org.jsoup.nodes.Node node19 = node18.previousSibling();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str22 = comment21.getData();
        org.jsoup.nodes.Node node23 = comment21.root();
        java.lang.String str24 = comment21.getData();
        org.jsoup.nodes.Node node27 = comment21.attr("", "");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment21.outerHtmlTail(appendable28, (int) (short) 100, outputSettings30);
        org.jsoup.nodes.Document document32 = comment21.ownerDocument();
        org.jsoup.nodes.Node node33 = comment21.shallowClone();
        org.jsoup.nodes.Node node34 = comment21.previousSibling();
        boolean boolean36 = comment21.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node37 = comment21.clone();
        org.jsoup.nodes.Node node38 = comment21.previousSibling();
        boolean boolean39 = node18.equals((java.lang.Object) comment21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = comment1.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.attr("#comment", "");
        boolean boolean16 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Document document8 = comment1.ownerDocument();
        boolean boolean9 = comment1.isXmlDeclaration();
        int int10 = comment1.childNodeSize();
        java.lang.String str11 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        java.lang.String str12 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        org.jsoup.nodes.Node node16 = comment1.clearAttributes();
        java.lang.String str17 = comment1.getData();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.jsoup.nodes.Node node12 = comment2.parent();
        java.lang.String str14 = comment2.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node8 = comment5.attr("hi!", "#comment");
        java.lang.String str9 = comment5.outerHtml();
        int int10 = comment5.siblingIndex();
        org.jsoup.nodes.Node node11 = comment5.clone();
        boolean boolean12 = comment5.isXmlDeclaration();
        boolean boolean14 = comment5.hasAttr("hi!");
        boolean boolean16 = comment5.hasAttr("\n<!--#comment-->");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment5.outerHtmlTail(appendable17, (int) (short) 10, outputSettings19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.before((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.clone();
        java.lang.String str6 = comment1.getData();
        int int7 = comment1.childNodeSize();
        boolean boolean9 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        comment1.setBaseUri("");
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        org.jsoup.nodes.Node node3 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        int int9 = comment6.childNodeSize();
        java.lang.String str10 = comment6.outerHtml();
        boolean boolean11 = comment6.hasParent();
        java.lang.String str12 = comment6.baseUri();
        org.jsoup.nodes.Attributes attributes13 = comment6.attributes();
        boolean boolean15 = comment6.hasAttr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("#comment");
        boolean boolean12 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.toString();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        java.lang.String str12 = comment10.nodeName();
        boolean boolean14 = comment10.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment10.asXmlDeclaration();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) comment10);
        int int17 = comment10.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        boolean boolean6 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--hi!-->-->");
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node4 = comment1.parent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        org.jsoup.nodes.Node node19 = comment1.nextSibling();
        boolean boolean20 = comment1.hasParent();
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        java.lang.String str6 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        java.lang.String str16 = comment1.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean18 = comment1.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        boolean boolean18 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        boolean boolean9 = comment1.hasParent();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        java.lang.String str17 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        java.lang.String str21 = comment1.baseUri();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        java.lang.String str20 = comment11.baseUri();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment23.outerHtmlTail(appendable24, (-1), outputSettings26);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment23.childNodes();
        java.lang.String str30 = comment23.absUrl("\n<!--hi!-->");
        boolean boolean32 = comment23.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node33 = comment23.root();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment23.childNodes();
        org.jsoup.nodes.Attributes attributes35 = comment23.attributes();
        java.lang.String str36 = comment23.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = comment11.before((org.jsoup.nodes.Node) comment23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        boolean boolean9 = comment1.hasAttr("\n<!--#comment-->");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.String str5 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable8, (int) (short) 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.childNodes();
        org.jsoup.nodes.Node node18 = comment1.clearAttributes();
        org.jsoup.nodes.Node node19 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Node node12 = node11.clearAttributes();
        int int13 = node11.siblingIndex();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        java.lang.String str21 = comment19.nodeName();
        boolean boolean22 = comment15.hasSameValue((java.lang.Object) str21);
        java.lang.String str23 = comment15.outerHtml();
        org.jsoup.nodes.Node node26 = comment15.attr("\n<!--hi!-->", "hi!");
        boolean boolean27 = node11.hasSameValue((java.lang.Object) comment15);
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str30 = comment29.getData();
        org.jsoup.nodes.Node node31 = comment29.root();
        java.lang.String str32 = comment29.getData();
        org.jsoup.nodes.Node node35 = comment29.attr("", "");
        org.jsoup.nodes.Node node36 = comment29.previousSibling();
        org.jsoup.nodes.Node node37 = comment29.root();
        org.jsoup.nodes.Node node38 = comment29.nextSibling();
        boolean boolean39 = comment15.hasSameValue((java.lang.Object) comment29);
        org.jsoup.nodes.Node node40 = comment29.nextSibling();
        java.lang.String str41 = comment29.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n<!--hi!-->" + "'", str41, "\n<!--hi!-->");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("#comment");
        boolean boolean6 = comment1.isXmlDeclaration();
        comment1.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        boolean boolean16 = comment12.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = comment12.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration17);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        int int11 = node10.siblingIndex();
        org.jsoup.nodes.Node node13 = node10.wrap("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        java.lang.String str12 = comment1.outerHtml();
        int int13 = comment1.siblingIndex();
        java.lang.String str14 = comment1.baseUri();
        java.lang.String str15 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        java.lang.String str24 = comment1.attr("\n<!--\n<!--#comment-->-->");
        int int25 = comment1.siblingIndex();
        org.jsoup.nodes.Node node26 = comment1.root();
        org.jsoup.nodes.Node node27 = comment1.clearAttributes();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        org.jsoup.nodes.Node node20 = comment12.attr("", "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        java.lang.String str3 = comment1.baseUri();
        java.lang.String str5 = comment1.attr("<?i?>");
        int int6 = comment1.siblingIndex();
        java.lang.String str8 = comment1.absUrl("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node2 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment1.outerHtmlTail(appendable16, 0, outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment1.childNodes();
        java.lang.String str21 = comment1.outerHtml();
        org.jsoup.nodes.Node node22 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node12 = comment1.clone();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment1.outerHtmlTail(appendable13, (int) (short) 1, outputSettings15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        boolean boolean5 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment9.outerHtmlTail(appendable10, (-1), outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment9.childNodes();
        org.jsoup.nodes.Node node15 = comment9.parentNode();
        java.lang.String str16 = comment9.getData();
        java.lang.String str17 = comment9.baseUri();
        org.jsoup.nodes.Node node18 = comment9.parent();
        boolean boolean19 = comment1.hasSameValue((java.lang.Object) comment9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node12 = comment9.attr("hi!", "#comment");
        java.lang.String str13 = comment9.getData();
        java.lang.String str14 = comment9.toString();
        org.jsoup.nodes.Node node15 = comment9.parent();
        java.lang.String str16 = comment9.nodeName();
        boolean boolean17 = comment9.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("\n<!---->");
        boolean boolean9 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        comment1.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        comment1.setBaseUri("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable15, (int) (short) 100, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("<?i?>");
        int int9 = node8.siblingIndex();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.baseUri();
        org.jsoup.nodes.Node node19 = comment14.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment14.childNodes();
        org.jsoup.nodes.Attributes attributes21 = comment14.attributes();
        boolean boolean22 = node12.hasSameValue((java.lang.Object) attributes21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node18 = comment1.previousSibling();
        java.lang.String str19 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str11 = comment10.nodeName();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment10);
        org.jsoup.nodes.Node node13 = comment10.previousSibling();
        java.lang.String str15 = comment10.absUrl("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        java.lang.String str13 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        boolean boolean9 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
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
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) (byte) 0, outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodes();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Document document11 = comment1.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration12.after("\n<!--\n<!--\n<!--hi!-->-->-->");
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
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment1.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        int int15 = comment13.siblingIndex();
        boolean boolean17 = comment13.hasAttr("\n<!---->");
        int int18 = comment13.childNodeSize();
        org.jsoup.nodes.Node node19 = comment13.previousSibling();
        org.jsoup.nodes.Node node22 = comment13.attr("\n<!---->", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment1.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        boolean boolean5 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document13 = comment12.ownerDocument();
        org.jsoup.nodes.Node node14 = comment12.nextSibling();
        java.lang.String str16 = comment12.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node17 = comment12.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node8.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.lang.String str6 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node8 = node7.clearAttributes();
        org.jsoup.nodes.Node node9 = node8.clearAttributes();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.root();
        java.lang.String str5 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--hi!-->-->-->", "\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node4 = comment1.attr("#comment", "");
        boolean boolean5 = comment1.hasParent();
        org.jsoup.nodes.Node node7 = comment1.wrap("\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.jsoup.nodes.Node node10 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parent();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        org.jsoup.nodes.Node node20 = comment1.wrap("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node21 = comment1.parent();
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
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--\n<!--hi!-->-->-->");
        boolean boolean14 = comment1.hasParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        org.jsoup.nodes.Node node15 = comment1.clone();
        java.lang.String str17 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Node node9 = comment1.root();
        boolean boolean10 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node7 = comment5.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment5.childNodesCopy();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        boolean boolean13 = comment5.hasSameValue((java.lang.Object) comment10);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment10.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodesCopy();
        boolean boolean16 = comment2.equals((java.lang.Object) comment10);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, 10, outputSettings19);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.outerHtml();
        java.lang.String str14 = comment1.baseUri();
        int int15 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node5 = comment4.clone();
        org.jsoup.nodes.Node node6 = comment4.clone();
        java.lang.String str7 = comment4.baseUri();
        boolean boolean8 = comment2.equals((java.lang.Object) comment4);
        org.jsoup.nodes.Attributes attributes9 = comment4.attributes();
        org.jsoup.nodes.Node node10 = comment4.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment4.traverse(nodeVisitor11);
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
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.siblingNodes();
        org.jsoup.nodes.Node node6 = node4.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        comment1.outerHtmlTail(appendable12, (int) (short) 1, outputSettings14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        java.lang.String str14 = comment2.getData();
        java.lang.String str15 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!--\n<!---->-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.after("hi!");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment1.siblingNodes();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment1.outerHtmlTail(appendable14, 0, outputSettings16);
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.filter(nodeFilter18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable5, (int) (byte) 1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        java.lang.String str25 = comment1.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment1.asXmlDeclaration();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.root();
        java.lang.String str8 = node7.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?i?>" + "'", str8, "<?i?>");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str6 = comment1.attr("\n<!---->");
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.Class<?> wildcardClass10 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clearAttributes();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        comment1.setBaseUri("<?i?>");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        java.lang.String str20 = comment17.baseUri();
        java.lang.String str22 = comment17.attr("hi!");
        java.lang.String str23 = comment17.getData();
        comment17.setBaseUri("#comment");
        org.jsoup.nodes.Document document26 = comment17.ownerDocument();
        boolean boolean27 = comment1.hasSameValue((java.lang.Object) comment17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment1.outerHtmlTail(appendable10, (int) (byte) 1, outputSettings12);
        int int14 = comment1.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?i?>", "\n<!---->");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        java.lang.String str8 = comment1.baseUri();
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        java.lang.String str13 = comment11.nodeName();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment11.outerHtmlTail(appendable14, (int) (byte) -1, outputSettings16);
        int int18 = comment11.childNodeSize();
        boolean boolean20 = comment11.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes21 = comment11.attributes();
        boolean boolean23 = comment11.hasAttr("");
        org.jsoup.nodes.Node node24 = comment11.root();
        org.jsoup.nodes.Node node25 = comment11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        org.jsoup.nodes.Node node15 = comment1.clearAttributes();
        java.lang.String str16 = comment1.nodeName();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.after("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Node node9 = comment2.parent();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, (int) (short) 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str17 = comment15.absUrl("\n<!---->");
        org.jsoup.nodes.Node node18 = comment15.root();
        org.jsoup.nodes.Node node19 = comment15.parent();
        org.jsoup.nodes.Node node20 = comment15.previousSibling();
        int int21 = comment15.siblingIndex();
        java.lang.String str23 = comment15.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.before((org.jsoup.nodes.Node) comment15);
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node3 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        int int10 = comment7.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment7.childNodes();
        org.jsoup.nodes.Node node13 = comment7.removeAttr("hi!");
        java.lang.String str14 = comment7.outerHtml();
        org.jsoup.nodes.Node node16 = comment7.removeAttr("");
        int int17 = node16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.String str7 = comment1.attr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        boolean boolean10 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        boolean boolean22 = comment18.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = comment18.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Document document26 = node25.ownerDocument();
        org.jsoup.nodes.Node node27 = node25.clone();
        boolean boolean28 = node5.equals((java.lang.Object) node25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        boolean boolean18 = comment1.isXmlDeclaration();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment1.asXmlDeclaration();
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
        org.junit.Assert.assertNotNull(xmlDeclaration19);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment2.clone();
        boolean boolean11 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable13, 1, outputSettings15);
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
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        java.lang.String str18 = comment10.outerHtml();
        org.jsoup.nodes.Node node19 = comment10.parentNode();
        java.lang.String str21 = comment10.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean22 = comment10.isXmlDeclaration();
        boolean boolean23 = node6.hasSameValue((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        boolean boolean7 = comment2.hasParent();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!--#comment-->", "<?i?>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        boolean boolean8 = comment4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = comment4.attr("\n<!--hi!-->", "#comment");
        boolean boolean12 = comment2.hasSameValue((java.lang.Object) "\n<!--hi!-->");
        comment2.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        org.jsoup.nodes.Node node20 = comment16.removeAttr("");
        org.jsoup.nodes.Attributes attributes21 = comment16.attributes();
        org.jsoup.nodes.Node node23 = comment16.removeAttr("");
        org.jsoup.nodes.Node node26 = comment16.attr("", "\n<!---->");
        org.jsoup.nodes.Node node27 = comment16.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment2.before(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
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
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node22 = comment20.removeAttr("");
        java.lang.String str23 = comment20.baseUri();
        java.lang.String str24 = comment20.baseUri();
        java.lang.String str26 = comment20.attr("");
        org.jsoup.nodes.Node node27 = comment20.parent();
        boolean boolean28 = node18.equals((java.lang.Object) node27);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Document document8 = comment1.ownerDocument();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        boolean boolean6 = comment1.hasAttr("hi!");
        java.lang.String str8 = comment1.attr("\n<!--#comment-->");
        boolean boolean9 = comment1.isXmlDeclaration();
        java.lang.String str11 = comment1.attr("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
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
        org.jsoup.nodes.Attributes attributes22 = comment1.attributes();
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
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        boolean boolean20 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str24 = comment23.getData();
        org.jsoup.nodes.Node node25 = comment23.root();
        org.jsoup.nodes.Node node27 = comment23.removeAttr("");
        org.jsoup.nodes.Node node28 = comment23.nextSibling();
        org.jsoup.nodes.Attributes attributes29 = comment23.attributes();
        org.jsoup.nodes.Node node31 = comment23.wrap("\n<!--hi!-->");
        boolean boolean32 = comment23.isXmlDeclaration();
        boolean boolean33 = comment23.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node21.after((org.jsoup.nodes.Node) comment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        boolean boolean22 = comment18.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment18.asXmlDeclaration();
        int int24 = xmlDeclaration23.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration23.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.before(node25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.lang.String str7 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        boolean boolean7 = comment1.hasAttr("");
        org.jsoup.nodes.Node node8 = comment1.root();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        comment12.setBaseUri("");
        java.lang.String str20 = comment12.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment12.asXmlDeclaration();
        java.lang.String str22 = xmlDeclaration21.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?i?>" + "'", str22, "<?i?>");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        java.lang.String str9 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.nextSibling();
        java.lang.String str12 = comment2.toString();
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        boolean boolean12 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes3 = comment2.attributes();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        java.lang.String str14 = comment6.absUrl("hi!");
        org.jsoup.nodes.Node node15 = comment6.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        java.util.List<org.jsoup.nodes.Node> nodeList44 = comment10.childNodesCopy();
        org.jsoup.nodes.Node node45 = comment10.shallowClone();
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        comment10.outerHtmlTail(appendable46, (int) '4', outputSettings48);
        org.jsoup.nodes.Node node50 = comment10.nextSibling();
        java.lang.String str51 = comment10.toString();
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
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\n<!--hi!-->" + "'", str51, "\n<!--hi!-->");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str6 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment10.outerHtmlTail(appendable11, (-1), outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodes();
        java.lang.String str17 = comment10.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment10.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment10.siblingNodes();
        org.jsoup.nodes.Node node22 = comment10.attr("", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.toString();
        boolean boolean16 = comment12.hasParent();
        boolean boolean17 = comment10.equals((java.lang.Object) comment12);
        java.lang.String str18 = comment10.nodeName();
        org.jsoup.nodes.Node node19 = comment10.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasAttr("");
        boolean boolean11 = comment2.hasParent();
        java.lang.String str13 = comment2.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        java.lang.String str13 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        java.lang.String str14 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        org.jsoup.nodes.Node node38 = comment2.clearAttributes();
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
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--\n<!---->-->");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.baseUri();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = comment2.clone();
        node13.setBaseUri("<?i?>");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = comment1.shallowClone();
        org.jsoup.nodes.Node node13 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration8.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        boolean boolean8 = comment1.hasParent();
        java.lang.String str9 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        int int8 = comment2.siblingIndex();
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.attr("\n<!---->");
        int int13 = comment2.childNodeSize();
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        java.lang.String str8 = comment1.attr("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        java.lang.String str8 = node7.outerHtml();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--#comment-->" + "'", str8, "\n<!--#comment-->");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
        java.lang.String str19 = comment1.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes21 = comment1.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#comment-->" + "'", str12, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "<?i?>");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean7 = comment5.hasAttr("");
        java.lang.String str8 = comment5.baseUri();
        boolean boolean9 = comment5.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment5.asXmlDeclaration();
        java.lang.String str11 = comment5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.after((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.attr("");
        boolean boolean11 = comment2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.shallowClone();
        org.jsoup.nodes.Node node13 = node11.clearAttributes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        org.jsoup.nodes.Node node17 = comment15.root();
        java.lang.String str18 = comment15.getData();
        org.jsoup.nodes.Node node21 = comment15.attr("", "");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment15.outerHtmlTail(appendable22, (int) (short) 100, outputSettings24);
        org.jsoup.nodes.Document document26 = comment15.ownerDocument();
        org.jsoup.nodes.Node node27 = comment15.shallowClone();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str30 = comment29.getData();
        java.lang.String str31 = comment29.nodeName();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment29.outerHtmlTail(appendable32, (int) (byte) -1, outputSettings34);
        int int36 = comment29.childNodeSize();
        boolean boolean37 = comment15.equals((java.lang.Object) comment29);
        org.jsoup.nodes.Node node40 = comment29.attr("#comment", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = node40.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node13.before(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#comment" + "'", str31, "#comment");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        int int9 = comment1.childNodeSize();
        boolean boolean11 = comment1.hasAttr("\n<!--hi!-->");
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Node node13 = comment1.parent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment1.outerHtmlTail(appendable14, (-1), outputSettings16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        java.lang.String str28 = comment10.getData();
        java.lang.String str30 = comment10.absUrl("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            comment10.remove();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str12 = comment1.attr("");
        org.jsoup.nodes.Node node14 = comment1.removeAttr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodes();
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
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        java.lang.String str13 = comment1.nodeName();
        boolean boolean15 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.traverse(nodeVisitor16);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        boolean boolean11 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        org.jsoup.nodes.Node node13 = node12.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodes();
        org.jsoup.nodes.Node node9 = comment1.previousSibling();
        java.lang.String str10 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean13 = comment1.isXmlDeclaration();
        java.lang.String str14 = comment1.outerHtml();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        java.lang.String str19 = comment16.baseUri();
        org.jsoup.nodes.Node node22 = comment16.attr("#comment", "#comment");
        boolean boolean23 = comment16.isXmlDeclaration();
        java.lang.String str24 = comment16.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment16.asXmlDeclaration();
        boolean boolean27 = comment16.equals((java.lang.Object) (byte) 10);
        java.lang.String str28 = comment16.toString();
        boolean boolean29 = comment1.equals((java.lang.Object) comment16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(xmlDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--#comment-->" + "'", str28, "\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        int int17 = comment15.siblingIndex();
        java.lang.String str18 = comment15.toString();
        org.jsoup.nodes.Node node20 = comment15.wrap("\n<!---->");
        comment15.setBaseUri("");
        org.jsoup.nodes.Node node24 = comment15.wrap("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment15.asXmlDeclaration();
        java.lang.String str26 = comment15.baseUri();
        org.jsoup.nodes.Node node29 = comment15.attr("", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node13.before(node29);
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
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(xmlDeclaration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Object obj4 = null;
        boolean boolean5 = comment1.equals(obj4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        java.lang.String str7 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        java.lang.String str10 = comment2.attr("hi!");
        boolean boolean11 = comment2.hasParent();
        boolean boolean12 = comment2.isXmlDeclaration();
        java.lang.String str14 = comment2.attr("\n<!---->");
        java.lang.String str15 = comment2.toString();
        org.jsoup.nodes.Node node16 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--#comment-->" + "'", str15, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        org.jsoup.nodes.Node node23 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        java.lang.String str24 = comment1.baseUri();
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        comment1.setBaseUri("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        boolean boolean8 = comment1.isXmlDeclaration();
        int int9 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.parent();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        boolean boolean6 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        org.jsoup.nodes.Node node13 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before("#comment");
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment4.childNodesCopy();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        boolean boolean12 = comment4.hasSameValue((java.lang.Object) comment9);
        java.lang.String str13 = comment4.nodeName();
        org.jsoup.nodes.Node node14 = comment4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment4.childNodesCopy();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        int int19 = comment17.siblingIndex();
        boolean boolean21 = comment17.hasAttr("\n<!---->");
        int int22 = comment17.childNodeSize();
        boolean boolean23 = comment4.equals((java.lang.Object) comment17);
        boolean boolean24 = comment2.equals((java.lang.Object) comment4);
        java.lang.String str25 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.root();
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        org.jsoup.nodes.Document document44 = node43.ownerDocument();
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
        org.junit.Assert.assertNull(document44);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        java.lang.String str20 = comment1.toString();
        org.jsoup.nodes.Node node23 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        org.jsoup.nodes.Node node14 = node13.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.getData();
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasAttr("");
        java.lang.String str11 = comment2.baseUri();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, (int) 'a', outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "#comment");
        int int3 = comment2.childNodeSize();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (byte) 1, outputSettings7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean13 = comment1.equals((java.lang.Object) "\n<!--hi!-->");
        java.lang.String str14 = comment1.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        int int19 = comment16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment16.childNodes();
        org.jsoup.nodes.Node node22 = comment16.removeAttr("hi!");
        boolean boolean23 = comment1.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Attributes attributes24 = comment16.attributes();
        org.jsoup.nodes.Document document25 = comment16.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean7 = node5.hasSameValue((java.lang.Object) '4');
        org.jsoup.nodes.Node node9 = node5.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        boolean boolean11 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document15 = comment14.ownerDocument();
        org.jsoup.nodes.Node node16 = comment14.previousSibling();
        org.jsoup.nodes.Attributes attributes17 = comment14.attributes();
        java.lang.String str19 = comment14.attr("#comment");
        boolean boolean21 = comment14.hasAttr("\n<!---->");
        int int22 = comment14.siblingIndex();
        boolean boolean23 = comment1.equals((java.lang.Object) comment14);
        java.lang.String str24 = comment14.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str19, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        java.lang.String str10 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node15 = comment12.attr("hi!", "#comment");
        java.lang.String str16 = comment12.outerHtml();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment12.outerHtmlTail(appendable17, 1, outputSettings19);
        boolean boolean21 = comment2.equals((java.lang.Object) appendable17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!--hi!-->-->");
        int int26 = comment2.childNodeSize();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable27, 1, outputSettings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        int int7 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.nodeName();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        java.lang.Class<?> wildcardClass11 = comment1.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str7 = comment2.attr("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        java.lang.String str24 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment1.siblingNodes();
        java.lang.String str26 = comment1.baseUri();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str9 = comment1.outerHtml();
        java.lang.String str10 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--#comment-->" + "'", str9, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.parent();
        java.lang.String str11 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node15 = comment12.attr("hi!", "#comment");
        java.lang.String str16 = comment12.outerHtml();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment12.outerHtmlTail(appendable17, 1, outputSettings19);
        boolean boolean21 = comment2.equals((java.lang.Object) appendable17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!--hi!-->-->");
        node25.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        org.jsoup.nodes.Node node27 = comment12.attr("", "\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment12.outerHtmlTail(appendable28, 1, outputSettings30);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment12.childNodes();
        java.lang.Object obj33 = null;
        boolean boolean34 = comment12.hasSameValue(obj33);
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        boolean boolean7 = comment2.hasParent();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, 0, outputSettings10);
        int int12 = comment2.childNodeSize();
        java.lang.String str13 = comment2.nodeName();
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        java.lang.String str15 = comment2.baseUri();
        boolean boolean16 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        org.jsoup.nodes.Attributes attributes36 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment1.before("\n<!---->");
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
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        org.jsoup.nodes.Node node7 = comment5.root();
        org.jsoup.nodes.Node node9 = comment5.removeAttr("");
        org.jsoup.nodes.Node node10 = comment5.clone();
        boolean boolean11 = node3.hasSameValue((java.lang.Object) node10);
        org.jsoup.nodes.Node node12 = node10.clone();
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Node node14 = node12.shallowClone();
        org.jsoup.nodes.Node node15 = node12.root();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Node node19 = comment17.root();
        java.lang.String str20 = comment17.getData();
        java.lang.String str21 = comment17.toString();
        org.jsoup.nodes.Node node22 = comment17.nextSibling();
        java.lang.String str23 = comment17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
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
        boolean boolean15 = comment6.isXmlDeclaration();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable16, (int) (byte) 0, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?i?>", "\n<!--\n<!--#comment-->-->");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str5 = comment2.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Node node12 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node4 = comment2.clearAttributes();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str7 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        org.jsoup.nodes.Node node15 = comment7.previousSibling();
        org.jsoup.nodes.Node node16 = comment7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        int int8 = comment6.siblingIndex();
        java.lang.String str9 = comment6.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment6.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.parent();
        org.jsoup.nodes.Node node12 = xmlDeclaration10.root();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.baseUri();
        org.jsoup.nodes.Node node19 = comment14.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node20 = comment14.clone();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node24 = comment23.shallowClone();
        org.jsoup.nodes.Node node25 = node24.nextSibling();
        boolean boolean26 = comment14.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node29 = comment14.attr("\n<!--hi!-->", "");
        boolean boolean30 = node12.equals((java.lang.Object) comment14);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        boolean boolean16 = comment1.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node17 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        java.lang.String str22 = comment19.getData();
        org.jsoup.nodes.Node node25 = comment19.attr("", "");
        java.lang.String str27 = comment19.absUrl("\n<!--#comment-->");
        java.lang.String str29 = comment19.attr("\n<!--#comment-->");
        boolean boolean30 = comment19.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment19.siblingNodes();
        boolean boolean32 = comment1.hasSameValue((java.lang.Object) nodeList31);
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        java.lang.String str12 = comment1.absUrl("hi!");
        comment1.setBaseUri("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        org.jsoup.nodes.Node node15 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.Node node9 = comment1.attr("#comment", "\n<!---->");
        java.lang.String str10 = comment1.baseUri();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        java.lang.String str12 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--\n<!---->-->" + "'", str12, "\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment1.asXmlDeclaration();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.getData();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(xmlDeclaration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("#comment");
        java.lang.String str10 = comment1.baseUri();
        int int11 = comment1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
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
        org.jsoup.nodes.Node node13 = comment1.root();
        java.lang.String str15 = comment1.attr("<?i?>");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        int int19 = comment17.siblingIndex();
        java.lang.String str20 = comment17.toString();
        org.jsoup.nodes.Node node22 = comment17.wrap("\n<!---->");
        org.jsoup.nodes.Node node23 = comment17.clone();
        org.jsoup.nodes.Node node24 = comment17.root();
        org.jsoup.nodes.Node node25 = node24.shallowClone();
        boolean boolean26 = comment1.equals((java.lang.Object) node24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment11.outerHtmlTail(appendable12, (-1), outputSettings14);
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node19 = comment17.removeAttr("");
        boolean boolean21 = comment17.hasAttr("hi!");
        org.jsoup.nodes.Node node24 = comment17.attr("\n<!--hi!-->", "#comment");
        boolean boolean25 = comment11.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node26 = comment11.clearAttributes();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment29.outerHtmlTail(appendable30, (-1), outputSettings32);
        org.jsoup.nodes.Node node36 = comment29.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = comment29.asXmlDeclaration();
        java.lang.Class<?> wildcardClass38 = comment29.getClass();
        boolean boolean39 = comment11.equals((java.lang.Object) comment29);
        boolean boolean40 = comment1.hasSameValue((java.lang.Object) boolean39);
        org.jsoup.nodes.Node node41 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(xmlDeclaration37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        boolean boolean16 = comment1.isXmlDeclaration();
        java.lang.String str18 = comment1.absUrl("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment1.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(xmlDeclaration19);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
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
        org.jsoup.nodes.Node node13 = node11.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        boolean boolean9 = node8.hasParent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        java.lang.String str14 = comment11.toString();
        org.jsoup.nodes.Node node16 = comment11.wrap("\n<!---->");
        java.lang.String str18 = comment11.absUrl("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment11.childNodes();
        org.jsoup.nodes.Node node20 = comment11.clone();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        boolean boolean10 = comment1.hasAttr("#comment");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment1.outerHtmlTail(appendable11, (int) (short) -1, outputSettings13);
        org.jsoup.nodes.Node node16 = comment1.removeAttr("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, (int) (short) 100, outputSettings11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node2.childNodes();
        org.jsoup.nodes.Node node5 = node2.previousSibling();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        java.lang.String str10 = comment7.getData();
        org.jsoup.nodes.Node node13 = comment7.attr("", "");
        java.lang.String str15 = comment7.absUrl("\n<!--#comment-->");
        java.lang.String str17 = comment7.attr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        org.jsoup.nodes.Node node23 = comment19.removeAttr("");
        org.jsoup.nodes.Node node24 = comment19.nextSibling();
        org.jsoup.nodes.Attributes attributes25 = comment19.attributes();
        org.jsoup.nodes.Node node27 = comment19.wrap("\n<!--hi!-->");
        boolean boolean29 = comment19.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node32 = comment31.clone();
        org.jsoup.nodes.Node node33 = comment31.clone();
        org.jsoup.nodes.Node node34 = comment31.parent();
        java.lang.String str35 = comment31.getData();
        boolean boolean36 = comment19.equals((java.lang.Object) comment31);
        boolean boolean37 = comment7.equals((java.lang.Object) comment31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node2.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#comment" + "'", str35, "#comment");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Node node12 = node11.clearAttributes();
        int int13 = node11.siblingIndex();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        java.lang.String str21 = comment19.nodeName();
        boolean boolean22 = comment15.hasSameValue((java.lang.Object) str21);
        java.lang.String str23 = comment15.outerHtml();
        org.jsoup.nodes.Node node26 = comment15.attr("\n<!--hi!-->", "hi!");
        boolean boolean27 = node11.hasSameValue((java.lang.Object) comment15);
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str30 = comment29.getData();
        org.jsoup.nodes.Node node31 = comment29.root();
        java.lang.String str32 = comment29.getData();
        org.jsoup.nodes.Node node35 = comment29.attr("", "");
        org.jsoup.nodes.Node node36 = comment29.previousSibling();
        org.jsoup.nodes.Node node37 = comment29.root();
        org.jsoup.nodes.Node node38 = comment29.nextSibling();
        boolean boolean39 = comment15.hasSameValue((java.lang.Object) comment29);
        org.jsoup.nodes.Node node40 = comment29.nextSibling();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment29.outerHtmlHead(appendable41, (-1), outputSettings43);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.getData();
        java.lang.String str10 = comment2.baseUri();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("<?i?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node8.setBaseUri("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.toString();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean14 = comment12.hasAttr("");
        java.lang.String str15 = comment12.baseUri();
        org.jsoup.nodes.Node node18 = comment12.attr("#comment", "#comment");
        java.lang.String str20 = comment12.attr("hi!");
        boolean boolean21 = comment12.hasParent();
        boolean boolean22 = comment12.isXmlDeclaration();
        java.lang.String str24 = comment12.attr("\n<!---->");
        boolean boolean25 = comment2.equals((java.lang.Object) comment12);
        java.lang.String str26 = comment2.getData();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        node13.setBaseUri("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--\n<!--\n<!--#comment-->-->-->");
        comment2.setBaseUri("\n<!---->");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        boolean boolean10 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
        boolean boolean17 = node15.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        org.jsoup.nodes.Node node5 = node3.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = node6.parent();
        org.jsoup.nodes.Node node8 = node6.parent();
        org.jsoup.nodes.Node node9 = node6.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        org.jsoup.nodes.Node node15 = xmlDeclaration14.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        org.jsoup.nodes.Node node20 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        int int24 = comment22.siblingIndex();
        java.lang.String str25 = comment22.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment22.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment22.siblingNodes();
        org.jsoup.nodes.Attributes attributes28 = comment22.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) comment22);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        comment1.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        node13.setBaseUri("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.unwrap();
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
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        boolean boolean10 = comment1.hasAttr("");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment12.siblingNodes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        java.lang.String str18 = comment15.baseUri();
        org.jsoup.nodes.Node node19 = comment15.parentNode();
        org.jsoup.nodes.Node node21 = comment15.removeAttr("");
        org.jsoup.nodes.Document document22 = comment15.ownerDocument();
        boolean boolean23 = comment12.equals((java.lang.Object) document22);
        org.jsoup.nodes.Attributes attributes24 = comment12.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment12.siblingNodes();
        comment12.setBaseUri("");
        org.jsoup.nodes.Node node28 = comment12.shallowClone();
        java.lang.String str30 = comment12.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment1.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        org.jsoup.nodes.Node node16 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node16.setBaseUri("<?i?>");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        boolean boolean13 = comment10.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment10.nextSibling();
        org.jsoup.nodes.Node node15 = comment10.root();
        java.lang.String str17 = comment10.attr("#comment");
        boolean boolean18 = comment1.equals((java.lang.Object) str17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment1.asXmlDeclaration();
        java.lang.String str20 = xmlDeclaration19.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?i?>" + "'", str20, "<?i?>");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.siblingIndex();
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        int int8 = comment2.siblingIndex();
        java.lang.String str9 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!--\n<!--\n<!--hi!-->-->-->");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        java.lang.String str10 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.shallowClone();
        java.lang.String str13 = comment1.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node14 = comment1.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        comment1.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment1.asXmlDeclaration();
        java.lang.String str16 = comment1.toString();
        java.lang.String str17 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        boolean boolean10 = comment1.hasAttr("");
        java.lang.String str11 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        int int13 = comment1.childNodeSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Node node9 = comment2.parent();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        org.jsoup.nodes.Node node11 = comment2.previousSibling();
        java.lang.String str12 = comment2.nodeName();
        int int13 = comment2.siblingIndex();
        java.lang.String str15 = comment2.absUrl("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        org.jsoup.nodes.Document document20 = comment1.ownerDocument();
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
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        boolean boolean10 = comment1.hasParent();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Node node13 = comment1.wrap("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.shallowClone();
        org.jsoup.nodes.Node node8 = node7.clearAttributes();
        org.jsoup.nodes.Node node9 = node7.previousSibling();
        java.lang.String str10 = node7.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--#comment-->-->");
        int int3 = comment2.childNodeSize();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) '#', outputSettings6);
        java.lang.String str8 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.clone();
        boolean boolean11 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!--\n<!--hi!-->-->");
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment1.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node13 = comment1.parent();
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
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        org.jsoup.nodes.Node node17 = comment16.clearAttributes();
        java.lang.String str18 = comment16.toString();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment16);
        java.lang.String str20 = comment16.toString();
        org.jsoup.nodes.Node node22 = comment16.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodesCopy();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment25.outerHtmlTail(appendable26, (int) (short) 1, outputSettings28);
        org.jsoup.nodes.Attributes attributes30 = comment25.attributes();
        org.jsoup.nodes.Node node31 = comment25.clearAttributes();
        int int32 = node31.siblingIndex();
        org.jsoup.nodes.Node node33 = node31.clone();
        org.jsoup.nodes.Node node34 = node31.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node22.before(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!---->" + "'", str20, "\n<!---->");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        comment1.setBaseUri("#comment");
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.Node node9 = comment1.root();
        node9.setBaseUri("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node15 = comment12.attr("hi!", "#comment");
        java.lang.String str16 = comment12.outerHtml();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment12.outerHtmlTail(appendable17, 1, outputSettings19);
        boolean boolean21 = comment2.equals((java.lang.Object) appendable17);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node23 = xmlDeclaration22.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        java.lang.String str15 = comment7.baseUri();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment1.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str11 = comment10.toString();
        org.jsoup.nodes.Node node12 = comment10.nextSibling();
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) node12);
        int int14 = comment2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str11, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("\n<!---->", "<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
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
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.jsoup.nodes.Node node10 = node9.root();
        node10.setBaseUri("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node6 = comment2.root();
        java.lang.String str7 = comment2.getData();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        boolean boolean5 = comment1.hasAttr("");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node9 = comment7.removeAttr("");
        java.lang.String str10 = comment7.baseUri();
        org.jsoup.nodes.Node node11 = comment7.shallowClone();
        boolean boolean12 = comment7.hasParent();
        org.jsoup.nodes.Node node14 = comment7.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.String str15 = comment7.nodeName();
        boolean boolean16 = comment1.equals((java.lang.Object) comment7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.previousSibling();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--#comment-->-->");
        boolean boolean3 = comment2.hasParent();
        boolean boolean4 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
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
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment1.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
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
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        comment24.outerHtmlTail(appendable36, (int) (byte) 100, outputSettings38);
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
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
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
        org.jsoup.nodes.Document document13 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.clone();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str9, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node10 = comment9.clone();
        org.jsoup.nodes.Node node12 = comment9.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node13 = comment9.shallowClone();
        java.lang.String str14 = comment9.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment9.asXmlDeclaration();
        java.lang.String str16 = comment9.getData();
        boolean boolean17 = comment1.equals((java.lang.Object) comment9);
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node20 = comment19.parentNode();
        java.lang.String str21 = comment19.outerHtml();
        org.jsoup.nodes.Node node22 = comment19.root();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment19.outerHtmlTail(appendable23, (int) (byte) 0, outputSettings25);
        boolean boolean28 = comment19.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment9.replaceWith((org.jsoup.nodes.Node) comment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--#comment-->" + "'", str14, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--#comment-->" + "'", str21, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        java.lang.String str13 = comment1.nodeName();
        org.jsoup.nodes.Attributes attributes14 = comment1.attributes();
        boolean boolean16 = comment1.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.String str17 = comment1.toString();
        org.jsoup.nodes.Node node20 = comment1.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        org.jsoup.nodes.Node node26 = comment22.removeAttr("");
        org.jsoup.nodes.Attributes attributes27 = comment22.attributes();
        org.jsoup.nodes.Node node29 = comment22.removeAttr("");
        org.jsoup.nodes.Node node32 = comment22.attr("", "\n<!---->");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        comment22.outerHtmlTail(appendable33, 0, outputSettings35);
        boolean boolean37 = node20.equals((java.lang.Object) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node20.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        java.lang.String str8 = comment1.absUrl("hi!");
        boolean boolean10 = comment1.hasAttr("");
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!---->");
        java.lang.String str13 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        java.lang.String str12 = comment2.absUrl("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.clone();
        java.lang.String str12 = comment1.outerHtml();
        org.jsoup.nodes.Node node13 = comment1.parentNode();
        java.lang.String str14 = comment1.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "#comment");
        int int3 = comment2.childNodeSize();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (-1), outputSettings6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str3 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node4 = comment1.clone();
        java.lang.String str5 = node4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        java.lang.String str7 = comment1.absUrl("\n<!---->");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        comment1.setBaseUri("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        org.jsoup.nodes.Document document13 = comment9.ownerDocument();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.childNodesCopy();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        org.jsoup.nodes.Node node22 = comment20.root();
        boolean boolean23 = comment15.hasSameValue((java.lang.Object) comment20);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment20.siblingNodes();
        comment20.setBaseUri("\n<!--#comment-->");
        java.lang.String str27 = comment20.nodeName();
        boolean boolean28 = comment9.equals((java.lang.Object) str27);
        boolean boolean29 = comment1.equals((java.lang.Object) str27);
        java.lang.String str30 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("hi!");
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("#comment");
        java.lang.String str12 = comment1.getData();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        int int12 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration9.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
        java.lang.String str20 = comment11.baseUri();
        java.lang.String str21 = comment11.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("\n<!--#comment-->");
        node7.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = node7.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        java.util.List<org.jsoup.nodes.Node> nodeList44 = comment10.childNodesCopy();
        org.jsoup.nodes.Node node45 = comment10.shallowClone();
        org.jsoup.nodes.Node node47 = node45.wrap("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = node45.siblingNodes();
        java.lang.String str49 = node45.outerHtml();
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
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\n<!--hi!-->" + "'", str49, "\n<!--hi!-->");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.jsoup.nodes.Node node11 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str9, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.root();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        org.jsoup.nodes.Node node24 = comment1.removeAttr("<?i?>");
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str27 = comment26.getData();
        org.jsoup.nodes.Node node28 = comment26.root();
        int int29 = comment26.childNodeSize();
        java.lang.String str30 = comment26.outerHtml();
        java.lang.String str32 = comment26.attr("\n<!--hi!-->");
        java.lang.String str34 = comment26.attr("#comment");
        org.jsoup.nodes.Node node35 = comment26.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment26.childNodes();
        java.lang.String str38 = comment26.attr("\n<!--#comment-->");
        org.jsoup.nodes.Node node39 = comment26.root();
        boolean boolean40 = node24.equals((java.lang.Object) comment26);
        org.jsoup.nodes.Node node41 = comment26.previousSibling();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        org.jsoup.nodes.Node node26 = comment1.removeAttr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.jsoup.nodes.Document document27 = comment1.ownerDocument();
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.toString();
        java.lang.String str13 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, (int) (byte) -1, outputSettings16);
        java.lang.String str18 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        boolean boolean10 = comment1.hasParent();
        boolean boolean11 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        java.lang.String str20 = comment1.getData();
        org.jsoup.nodes.Node node22 = comment1.wrap("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
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
        java.lang.String str17 = node16.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.unwrap();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        org.jsoup.nodes.Document document22 = comment18.ownerDocument();
        java.lang.String str23 = comment18.nodeName();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment18.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        org.jsoup.nodes.Node node28 = comment18.previousSibling();
        java.lang.String str29 = comment18.outerHtml();
        org.jsoup.nodes.Node node30 = comment18.parentNode();
        java.lang.String str31 = comment18.toString();
        org.jsoup.nodes.Node node32 = comment18.nextSibling();
        comment18.setBaseUri("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment2.before((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!--hi!-->" + "'", str31, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Document document11 = comment1.ownerDocument();
        java.lang.String str13 = comment1.attr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.clearAttributes();
        boolean boolean7 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment1.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        java.lang.String str12 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node8 = comment1.root();
        org.jsoup.nodes.Node node9 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment2.outerHtmlTail(appendable18, (int) (byte) 1, outputSettings20);
        org.jsoup.nodes.Node node22 = comment2.nextSibling();
        org.jsoup.nodes.Attributes attributes23 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        boolean boolean7 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        int int17 = comment15.siblingIndex();
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node20 = comment15.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment15.asXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment15.root();
        boolean boolean23 = comment1.equals((java.lang.Object) node22);
        java.lang.String str25 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable26, (int) (short) 100, outputSettings28);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
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
        org.jsoup.nodes.Node node17 = comment1.parent();
        org.jsoup.nodes.Node node20 = comment1.attr("\n<!---->", "hi!");
        java.lang.String str22 = comment1.attr("\n<!---->");
        boolean boolean23 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.unwrap();
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!--#comment-->");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.lang.String str5 = comment2.attr("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        boolean boolean11 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.toString();
        org.jsoup.nodes.Node node19 = comment14.wrap("\n<!---->");
        org.jsoup.nodes.Node node20 = comment14.clone();
        org.jsoup.nodes.Node node21 = comment14.clone();
        boolean boolean22 = comment1.equals((java.lang.Object) node21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
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
        org.jsoup.nodes.Node node18 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node11 = comment2.clearAttributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, (int) (byte) 10, outputSettings8);
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.select.NodeFilter nodeFilter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.filter(nodeFilter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        comment1.setBaseUri("\n<!---->");
        java.lang.String str15 = comment1.absUrl("<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
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
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment11.outerHtmlTail(appendable14, 0, outputSettings16);
        java.lang.String str18 = comment11.nodeName();
        org.jsoup.nodes.Node node19 = comment11.parentNode();
        boolean boolean20 = comment11.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
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
        boolean boolean15 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment1.wrap("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        java.lang.String str9 = comment2.attr("#comment");
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        boolean boolean6 = comment1.hasAttr("hi!");
        java.lang.String str8 = comment1.attr("\n<!--#comment-->");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        boolean boolean6 = comment1.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        java.lang.String str9 = comment1.toString();
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.getData();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        java.lang.String str11 = comment2.toString();
        org.jsoup.nodes.Node node12 = comment2.previousSibling();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        org.jsoup.nodes.Node node18 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        boolean boolean6 = comment1.isXmlDeclaration();
        java.lang.String str7 = comment1.getData();
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        java.lang.String str10 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node11 = comment1.parent();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.jsoup.nodes.Node node14 = comment1.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.after("hi!");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!---->-->");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        boolean boolean6 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        org.jsoup.nodes.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment10.replaceWith(node39);
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
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.attr("\n<!--\n<!---->-->", "\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.String str7 = comment2.attr("#comment");
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str7, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        org.jsoup.nodes.Node node21 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str24 = comment23.getData();
        org.jsoup.nodes.Node node25 = comment23.root();
        org.jsoup.nodes.Node node27 = comment23.removeAttr("");
        org.jsoup.nodes.Node node28 = comment23.nextSibling();
        java.lang.String str30 = comment23.attr("");
        org.jsoup.nodes.Node node31 = comment23.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = comment23.asXmlDeclaration();
        java.lang.String str33 = comment23.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = comment23.asXmlDeclaration();
        org.jsoup.nodes.Node node35 = comment23.shallowClone();
        org.jsoup.nodes.Node node37 = comment23.removeAttr("");
        org.jsoup.nodes.Node node38 = node37.clone();
        boolean boolean39 = comment1.equals((java.lang.Object) node38);
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(xmlDeclaration32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        boolean boolean9 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        java.lang.String str9 = comment2.attr("#comment");
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        boolean boolean10 = comment1.hasAttr("");
        org.jsoup.nodes.Node node11 = comment1.parentNode();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--#comment-->");
        org.jsoup.nodes.Node node16 = comment14.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
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
        boolean boolean32 = comment1.hasAttr("");
        java.lang.String str33 = comment1.outerHtml();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n<!--hi!-->" + "'", str33, "\n<!--hi!-->");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
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
        org.jsoup.nodes.Node node15 = comment1.parent();
        boolean boolean16 = comment1.hasParent();
        java.lang.String str18 = comment1.absUrl("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node19 = comment1.shallowClone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
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
        boolean boolean16 = comment1.hasAttr("");
        java.lang.String str17 = comment1.outerHtml();
        org.jsoup.nodes.Node node19 = comment1.removeAttr("hi!");
        org.jsoup.nodes.Node node20 = comment1.clearAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        java.lang.String str13 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        java.lang.Class<?> wildcardClass18 = comment1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        java.lang.String str5 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
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
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment1.outerHtmlTail(appendable16, 0, outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment1.childNodes();
        java.lang.String str21 = comment1.outerHtml();
        org.jsoup.nodes.Node node22 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodes();
        java.lang.String str24 = node22.outerHtml();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str27 = comment26.getData();
        java.lang.String str28 = comment26.nodeName();
        org.jsoup.nodes.Node node29 = comment26.clone();
        java.lang.String str30 = comment26.toString();
        org.jsoup.nodes.Node node33 = comment26.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        boolean boolean34 = node22.hasSameValue((java.lang.Object) "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!---->" + "'", str24, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        java.lang.String str5 = comment2.attr("\n<!--hi!-->");
        java.lang.String str6 = comment2.getData();
        boolean boolean7 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--#comment-->" + "'", str6, "\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment14.childNodesCopy();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        boolean boolean22 = comment14.hasSameValue((java.lang.Object) comment19);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment19.childNodes();
        java.lang.String str24 = comment19.baseUri();
        java.lang.String str25 = comment19.outerHtml();
        boolean boolean26 = comment1.hasSameValue((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node11 = comment1.parent();
        java.lang.String str12 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = comment10.after("\n<!---->");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str3 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.wrap("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, 100, outputSettings8);
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment12.outerHtmlTail(appendable13, (-1), outputSettings15);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment18.removeAttr("");
        boolean boolean22 = comment18.hasAttr("hi!");
        org.jsoup.nodes.Node node25 = comment18.attr("\n<!--hi!-->", "#comment");
        boolean boolean26 = comment12.equals((java.lang.Object) node25);
        java.lang.String str27 = comment12.baseUri();
        org.jsoup.nodes.Node node28 = comment12.shallowClone();
        java.lang.Class<?> wildcardClass29 = node28.getClass();
        boolean boolean30 = comment1.hasSameValue((java.lang.Object) wildcardClass29);
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str33 = comment32.getData();
        org.jsoup.nodes.Node node34 = comment32.root();
        org.jsoup.nodes.Node node36 = comment32.removeAttr("");
        org.jsoup.nodes.Node node37 = comment32.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = comment32.childNodes();
        int int39 = comment32.childNodeSize();
        org.jsoup.nodes.Node node40 = comment32.clone();
        boolean boolean41 = comment32.isXmlDeclaration();
        java.lang.String str42 = comment32.nodeName();
        org.jsoup.nodes.Comment comment44 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str45 = comment44.getData();
        org.jsoup.nodes.Node node46 = comment44.root();
        java.lang.String str47 = comment44.getData();
        org.jsoup.nodes.Node node50 = comment44.attr("", "");
        java.lang.String str52 = comment44.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node53 = comment44.nextSibling();
        int int54 = comment44.siblingIndex();
        org.jsoup.nodes.Attributes attributes55 = comment44.attributes();
        boolean boolean56 = comment32.equals((java.lang.Object) comment44);
        boolean boolean57 = comment32.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = comment1.before((org.jsoup.nodes.Node) comment32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#comment" + "'", str42, "#comment");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        boolean boolean11 = comment1.hasAttr("hi!");
        java.lang.String str12 = comment1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
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
        java.lang.String str15 = node13.outerHtml();
        org.jsoup.nodes.Node node16 = node13.clone();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = node10.root();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        java.lang.String str16 = comment14.nodeName();
        java.lang.String str17 = comment14.getData();
        java.lang.String str18 = comment14.toString();
        java.lang.String str19 = comment14.outerHtml();
        boolean boolean20 = node11.hasSameValue((java.lang.Object) str19);
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        org.jsoup.nodes.Node node26 = comment22.removeAttr("");
        org.jsoup.nodes.Node node27 = comment22.clone();
        org.jsoup.nodes.Node node30 = comment22.attr("hi!", "#comment");
        org.jsoup.nodes.Node node31 = comment22.parentNode();
        org.jsoup.nodes.Node node32 = comment22.nextSibling();
        org.jsoup.nodes.Attributes attributes33 = comment22.attributes();
        boolean boolean34 = node11.equals((java.lang.Object) attributes33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        java.lang.String str15 = comment7.attr("\n<!--\n<!--hi!-->-->");
        java.lang.String str16 = comment7.nodeName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str6 = comment1.attr("");
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean13 = comment1.isXmlDeclaration();
        java.lang.String str15 = comment1.attr("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable10, (int) (byte) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) '#', outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = node8.clearAttributes();
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        java.lang.String str13 = comment1.attr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        int int12 = comment10.siblingIndex();
        java.lang.String str13 = comment10.toString();
        org.jsoup.nodes.Node node15 = comment10.wrap("\n<!---->");
        org.jsoup.nodes.Node node16 = comment10.clone();
        node16.setBaseUri("\n<!---->");
        java.lang.String str19 = node16.outerHtml();
        boolean boolean20 = comment1.hasSameValue((java.lang.Object) node16);
        comment1.setBaseUri("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        org.jsoup.nodes.Node node22 = comment1.parent();
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, (int) (short) 0, outputSettings11);
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        int int16 = comment14.siblingIndex();
        java.lang.String str17 = comment14.baseUri();
        org.jsoup.nodes.Node node19 = comment14.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment14.childNodes();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment14.outerHtmlTail(appendable21, 0, outputSettings23);
        boolean boolean25 = comment1.equals((java.lang.Object) comment14);
        java.lang.String str26 = comment14.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.String str9 = comment1.attr("\n<!--#comment-->");
        boolean boolean11 = comment1.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        java.lang.String str19 = comment17.nodeName();
        boolean boolean20 = comment13.hasSameValue((java.lang.Object) str19);
        java.lang.String str21 = comment13.outerHtml();
        org.jsoup.nodes.Node node24 = comment13.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Document document25 = comment13.ownerDocument();
        java.lang.String str26 = comment13.toString();
        java.lang.String str28 = comment13.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean29 = comment1.hasSameValue((java.lang.Object) comment13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
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
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        boolean boolean13 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--#comment-->");
        boolean boolean16 = node15.hasParent();
        org.jsoup.nodes.Node node17 = node15.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration9.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration9.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node12.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.lang.String str6 = comment1.outerHtml();
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = node7.hasSameValue(obj8);
        boolean boolean10 = node7.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        org.jsoup.nodes.Node node19 = comment2.wrap("\n<!---->");
        org.jsoup.nodes.Node node20 = comment2.parentNode();
        org.jsoup.nodes.Node node21 = comment2.clearAttributes();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean7 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        int int9 = comment1.childNodeSize();
        boolean boolean11 = comment1.hasAttr("\n<!--hi!-->");
        java.lang.String str12 = comment1.outerHtml();
        java.lang.String str14 = comment1.attr("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment1.outerHtmlTail(appendable15, (int) ' ', outputSettings17);
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment1.outerHtmlTail(appendable19, (int) (byte) 1, outputSettings21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.clearAttributes();
        java.lang.String str7 = comment1.getData();
        org.jsoup.nodes.Node node8 = comment1.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--#comment-->");
        comment2.setBaseUri("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.lang.String str7 = comment1.toString();
        java.lang.String str8 = comment1.toString();
        org.jsoup.nodes.Node node11 = comment1.attr("hi!", "\n<!--hi!-->");
        java.lang.String str12 = comment1.nodeName();
        org.jsoup.nodes.Attributes attributes13 = comment1.attributes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        java.lang.String str18 = comment15.baseUri();
        org.jsoup.nodes.Node node21 = comment15.attr("#comment", "#comment");
        org.jsoup.nodes.Node node22 = comment15.shallowClone();
        int int23 = node22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node22.childNodesCopy();
        boolean boolean25 = comment1.equals((java.lang.Object) nodeList24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str4 = comment1.attr("\n<!--hi!-->");
        int int5 = comment1.siblingIndex();
        java.lang.String str6 = comment1.toString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!---->" + "'", str6, "\n<!---->");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Node node3 = node2.clearAttributes();
        int int4 = node3.siblingIndex();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
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
        org.jsoup.nodes.Node node17 = comment1.parent();
        org.jsoup.nodes.Node node19 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Node node24 = comment22.root();
        org.jsoup.nodes.Node node26 = comment22.removeAttr("");
        org.jsoup.nodes.Node node27 = comment22.nextSibling();
        org.jsoup.nodes.Node node28 = comment22.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration20.after(node28);
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Node node4 = comment1.clone();
        boolean boolean6 = comment1.hasAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "");
        java.lang.String str3 = comment2.nodeName();
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment5.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        boolean boolean19 = comment8.hasAttr("\n<!--\n<!--\n<!--hi!-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
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
        java.lang.String str15 = comment1.nodeName();
        comment1.setBaseUri("");
        java.lang.String str18 = comment1.getData();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        org.jsoup.nodes.Attributes attributes14 = comment1.attributes();
        org.jsoup.nodes.Node node17 = comment1.attr("", "<?i?>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node3 = comment1.parent();
        java.lang.String str4 = comment1.nodeName();
        java.lang.String str5 = comment1.outerHtml();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment9.shallowClone();
        org.jsoup.nodes.Node node11 = node10.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        boolean boolean13 = comment1.hasSameValue((java.lang.Object) nodeList12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node9 = node7.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node15 = comment12.attr("hi!", "#comment");
        org.jsoup.nodes.Node node16 = comment12.previousSibling();
        boolean boolean17 = node7.equals((java.lang.Object) node16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = node16.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        java.lang.String str7 = comment1.absUrl("\n<!--\n<!---->-->");
        java.lang.String str9 = comment1.attr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        java.lang.String str8 = comment1.getData();
        org.jsoup.nodes.Document document9 = comment1.ownerDocument();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        boolean boolean18 = comment14.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node21 = comment14.attr("\n<!--#comment-->", "");
        java.lang.String str22 = comment14.toString();
        boolean boolean23 = comment1.hasSameValue((java.lang.Object) str22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        java.lang.String str25 = comment1.nodeName();
        java.lang.Class<?> wildcardClass26 = comment1.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.String str10 = comment2.outerHtml();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--#comment-->" + "'", str10, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment1.asXmlDeclaration();
        java.lang.String str16 = comment1.attr("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.siblingNodes();
        org.jsoup.nodes.Node node11 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.lang.String str16 = comment13.baseUri();
        org.jsoup.nodes.Node node18 = comment13.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node19 = node18.parent();
        boolean boolean20 = comment1.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node21 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        boolean boolean8 = comment1.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node9 = comment1.parentNode();
        java.lang.String str10 = comment1.getData();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        int int12 = comment1.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        boolean boolean16 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node18 = comment1.removeAttr("<?i?>");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        java.lang.String str22 = comment20.nodeName();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment20.outerHtmlTail(appendable23, (int) (byte) -1, outputSettings25);
        int int27 = comment20.childNodeSize();
        java.lang.String str29 = comment20.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment20.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node18.replaceWith((org.jsoup.nodes.Node) comment20);
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(xmlDeclaration30);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        java.lang.String str4 = comment1.absUrl("hi!");
        java.lang.Object obj5 = null;
        boolean boolean6 = comment1.hasSameValue(obj5);
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node2.childNodes();
        org.jsoup.nodes.Node node5 = node2.clearAttributes();
        org.jsoup.nodes.Node node6 = node5.root();
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.wrap("\n<!--#comment-->");
        java.lang.String str10 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        boolean boolean12 = comment1.hasParent();
        org.jsoup.nodes.Node node13 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        int int13 = comment1.siblingIndex();
        java.lang.String str14 = comment1.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        java.lang.String str16 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node17 = comment1.clearAttributes();
        org.jsoup.nodes.Node node18 = node17.parent();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        boolean boolean17 = comment1.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.String str18 = comment1.toString();
        java.lang.String str19 = comment1.getData();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        java.lang.String str11 = comment1.absUrl("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment1.childNodes();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document16 = comment15.ownerDocument();
        org.jsoup.nodes.Node node17 = comment15.previousSibling();
        org.jsoup.nodes.Attributes attributes18 = comment15.attributes();
        java.lang.String str20 = comment15.attr("#comment");
        boolean boolean21 = comment1.equals((java.lang.Object) str20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment1.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str20, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasAttr("");
        java.lang.String str11 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.after("\n<!--\n<!--\n<!--hi!-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
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
        org.jsoup.nodes.Node node17 = comment16.clearAttributes();
        java.lang.String str18 = comment16.toString();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment16);
        java.lang.String str20 = comment16.toString();
        org.jsoup.nodes.Node node22 = comment16.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodesCopy();
        org.jsoup.nodes.Node node24 = node22.clone();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean29 = comment27.hasAttr("hi!");
        java.lang.String str31 = comment27.absUrl("#comment");
        comment27.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node22.before((org.jsoup.nodes.Node) comment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!---->" + "'", str20, "\n<!---->");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.wrap("hi!");
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
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.siblingNodes();
        org.jsoup.nodes.Node node9 = comment1.clone();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment1.outerHtmlTail(appendable11, (int) (short) 1, outputSettings13);
        comment1.setBaseUri("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment6.siblingNodes();
        comment6.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = comment6.clearAttributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean7 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        boolean boolean9 = node8.hasParent();
        int int10 = node8.siblingIndex();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) 10, outputSettings13);
        org.jsoup.nodes.Node node16 = comment2.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        boolean boolean8 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        boolean boolean8 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = comment1.clone();
        java.lang.String str10 = comment1.getData();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node16 = comment14.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node19 = comment14.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node21 = comment14.removeAttr("");
        java.lang.String str22 = comment14.outerHtml();
        comment14.setBaseUri("\n<!--hi!-->");
        boolean boolean25 = node11.hasSameValue((java.lang.Object) comment14);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--#comment-->" + "'", str22, "\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
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
        java.lang.String str15 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        java.lang.String str12 = comment1.attr("");
        org.jsoup.nodes.Node node14 = comment1.removeAttr("\n<!--hi!-->");
        boolean boolean16 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.before("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        java.lang.String str6 = comment2.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        int int11 = comment9.siblingIndex();
        boolean boolean13 = comment9.hasAttr("\n<!---->");
        int int14 = comment9.childNodeSize();
        java.lang.String str16 = comment9.absUrl("hi!");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean21 = comment19.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.siblingNodes();
        org.jsoup.nodes.Node node23 = comment19.shallowClone();
        boolean boolean24 = comment9.equals((java.lang.Object) node23);
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment9.outerHtmlTail(appendable25, (int) (short) 100, outputSettings27);
        org.jsoup.nodes.Document document29 = comment9.ownerDocument();
        boolean boolean30 = comment2.equals((java.lang.Object) comment9);
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node33 = comment32.parentNode();
        java.lang.String str34 = comment32.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = comment32.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment32.childNodes();
        boolean boolean37 = comment9.equals((java.lang.Object) comment32);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n<!--#comment-->" + "'", str34, "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(xmlDeclaration35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodes();
        org.jsoup.nodes.Node node10 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        org.jsoup.nodes.Node node16 = comment12.removeAttr("");
        org.jsoup.nodes.Node node17 = comment12.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment12.childNodes();
        int int19 = comment12.childNodeSize();
        org.jsoup.nodes.Node node20 = comment12.clone();
        boolean boolean21 = comment12.isXmlDeclaration();
        int int22 = comment12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment12.siblingNodes();
        java.lang.String str25 = comment12.attr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment12.asXmlDeclaration();
        java.lang.String str28 = comment12.absUrl("#comment");
        boolean boolean29 = node10.hasSameValue((java.lang.Object) "#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Node node9 = comment1.attr("", "#comment");
        java.lang.String str10 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        boolean boolean10 = comment1.hasAttr("\n<!---->");
        boolean boolean12 = comment1.hasAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        org.jsoup.nodes.Node node17 = comment7.parent();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.Node node9 = comment1.removeAttr("<?i?>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        java.lang.String str9 = comment2.attr("#comment");
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        int int11 = comment2.childNodeSize();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--#comment-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean25 = comment23.hasAttr("");
        java.lang.String str26 = comment23.baseUri();
        org.jsoup.nodes.Node node29 = comment23.attr("#comment", "#comment");
        org.jsoup.nodes.Node node30 = comment23.parent();
        int int31 = comment23.siblingIndex();
        boolean boolean32 = comment1.hasSameValue((java.lang.Object) comment23);
        org.jsoup.nodes.Document document33 = comment1.ownerDocument();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(document33);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        java.lang.String str8 = comment1.outerHtml();
        java.lang.String str9 = comment1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node5 = comment4.clone();
        org.jsoup.nodes.Node node6 = comment4.clone();
        java.lang.String str7 = comment4.baseUri();
        boolean boolean8 = comment2.equals((java.lang.Object) comment4);
        org.jsoup.nodes.Attributes attributes9 = comment4.attributes();
        org.jsoup.nodes.Node node11 = comment4.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Document document15 = comment13.ownerDocument();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment13.outerHtmlTail(appendable16, 0, outputSettings18);
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean24 = comment22.hasAttr("");
        boolean boolean26 = comment22.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment22.asXmlDeclaration();
        org.jsoup.nodes.Node node28 = comment22.nextSibling();
        boolean boolean29 = comment13.equals((java.lang.Object) node28);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = comment13.childNodes();
        boolean boolean31 = comment4.equals((java.lang.Object) comment13);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment1.siblingNodes();
        org.jsoup.nodes.Node node19 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.outerHtml();
        org.jsoup.nodes.Node node4 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--\n<!--hi!-->-->");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable7, (int) (short) -1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#comment-->" + "'", str3, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        boolean boolean8 = comment1.isXmlDeclaration();
        boolean boolean9 = comment1.isXmlDeclaration();
        int int10 = comment1.siblingIndex();
        org.jsoup.nodes.Node node11 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.before("");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
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
        boolean boolean17 = comment1.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        int int18 = comment1.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

