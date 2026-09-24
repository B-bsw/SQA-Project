package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.traverse(nodeVisitor15);
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
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
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable8, 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment1.attr("#comment", "");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment1.outerHtmlTail(appendable9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration10.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str9 = comment2.attr("#comment");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        // The following exception was thrown during execution in test generation
        try {
            comment11.outerHtmlHead(appendable18, (int) (byte) 10, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode(100);
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (int) (short) 1, outputSettings7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        java.lang.String str10 = comment1.baseUri();
        java.lang.String str11 = comment1.toString();
        java.lang.String str12 = comment1.baseUri();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node17 = comment14.attr("hi!", "#comment");
        java.lang.String str18 = comment14.getData();
        org.jsoup.nodes.Node node19 = comment14.root();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith(node19);
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
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable15, (int) ' ', outputSettings17);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        boolean boolean7 = node6.hasParent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node13 = comment10.attr("hi!", "#comment");
        java.lang.String str14 = comment10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node6.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment10.filter(nodeFilter15);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        int int10 = comment8.siblingIndex();
        java.lang.String str11 = comment8.baseUri();
        org.jsoup.nodes.Node node13 = comment8.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node14 = comment8.clone();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node18 = comment17.shallowClone();
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        boolean boolean20 = comment8.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node23 = comment8.attr("\n<!--hi!-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment8.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str8 = comment2.absUrl("#comment");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node4 = node3.clearAttributes();
        java.lang.Class<?> wildcardClass5 = node3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment11.outerHtmlTail(appendable12, (-1), outputSettings14);
        org.jsoup.nodes.Node node18 = comment11.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node19 = comment11.previousSibling();
        org.jsoup.nodes.Attributes attributes20 = comment11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        // The following exception was thrown during execution in test generation
        try {
            comment13.remove();
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("#comment");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Node node5 = node3.previousSibling();
        org.jsoup.nodes.Node node6 = node3.clearAttributes();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        int int10 = comment8.siblingIndex();
        java.lang.String str11 = comment8.baseUri();
        java.lang.String str12 = comment8.getData();
        boolean boolean13 = comment8.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node3.before((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.jsoup.select.NodeFilter nodeFilter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.filter(nodeFilter21);
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
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str5 = comment4.getData();
        java.lang.String str6 = comment4.nodeName();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment4.outerHtmlTail(appendable7, (int) (byte) -1, outputSettings9);
        org.jsoup.nodes.Node node11 = comment4.previousSibling();
        int int12 = comment4.childNodeSize();
        boolean boolean14 = comment4.hasAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.before((org.jsoup.nodes.Node) comment4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("#comment");
        java.lang.String str6 = comment1.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = node4.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration6.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("\n<!--hi!-->");
        java.lang.Class<?> wildcardClass7 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = document3.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        java.lang.String str8 = comment1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.after("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        boolean boolean5 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        boolean boolean9 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        int int14 = comment11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment11.childNodes();
        org.jsoup.nodes.Node node17 = comment11.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = comment11.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable3, 10, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment13.childNodesCopy();
        int int17 = comment13.childNodeSize();
        org.jsoup.nodes.Node node18 = comment13.previousSibling();
        java.lang.String str20 = comment13.attr("");
        java.lang.String str21 = comment13.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        java.lang.String str11 = comment1.getData();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, (int) (byte) 100, outputSettings14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        java.lang.String str16 = comment13.getData();
        java.lang.String str17 = comment13.toString();
        org.jsoup.nodes.Node node18 = comment13.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.before((org.jsoup.nodes.Node) comment13);
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) (short) 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        org.jsoup.nodes.Document document16 = comment8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document16.setBaseUri("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Node node4 = node3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node3.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration8.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration8.before("");
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
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.lang.Class<?> wildcardClass24 = comment15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str13 = comment1.nodeName();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        java.lang.String str17 = comment15.nodeName();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment15.outerHtmlTail(appendable18, (int) (byte) -1, outputSettings20);
        int int22 = comment15.childNodeSize();
        boolean boolean24 = comment15.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes25 = comment15.attributes();
        boolean boolean27 = comment15.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = comment15.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment1.after((org.jsoup.nodes.Node) xmlDeclaration28);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration28);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        java.lang.String str12 = comment2.getData();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment3 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str4 = comment3.getData();
        org.jsoup.nodes.Node node5 = comment3.root();
        org.jsoup.nodes.Node node7 = comment3.removeAttr("");
        org.jsoup.nodes.Node node8 = comment3.nextSibling();
        java.lang.String str10 = comment3.attr("");
        org.jsoup.nodes.Node node11 = comment3.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after((org.jsoup.nodes.Node) comment3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clearAttributes();
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.siblingNodes();
        java.lang.Class<?> wildcardClass8 = nodeList7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.filter(nodeFilter12);
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Node node11 = comment1.clone();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        java.lang.String str16 = comment13.getData();
        org.jsoup.nodes.Node node19 = comment13.attr("", "");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment13.outerHtmlTail(appendable20, (int) (short) 100, outputSettings22);
        org.jsoup.nodes.Document document24 = comment13.ownerDocument();
        org.jsoup.nodes.Node node25 = comment13.shallowClone();
        org.jsoup.nodes.Node node26 = comment13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node11.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        java.lang.String str20 = comment18.nodeName();
        boolean boolean21 = comment14.hasSameValue((java.lang.Object) str20);
        java.lang.String str22 = comment14.outerHtml();
        org.jsoup.nodes.Node node25 = comment14.attr("\n<!--hi!-->", "hi!");
        java.lang.String str26 = comment14.nodeName();
        int int27 = comment14.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment1.before((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document7 = comment6.ownerDocument();
        java.lang.String str8 = comment6.getData();
        comment6.setBaseUri("#comment");
        java.lang.String str12 = comment6.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node3.after((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        boolean boolean13 = comment9.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment9.asXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment9.previousSibling();
        java.lang.String str16 = comment9.baseUri();
        boolean boolean17 = comment9.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node6.equals((java.lang.Object) nodeList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node10 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.filter(nodeFilter11);
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.getData();
        java.lang.String str10 = comment1.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node26 = comment25.clone();
        org.jsoup.nodes.Node node28 = comment25.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node29 = comment25.shallowClone();
        boolean boolean30 = comment25.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment1.after((org.jsoup.nodes.Node) comment25);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        int int9 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Node node11 = comment1.clone();
        org.jsoup.nodes.Node node13 = comment1.wrap("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str10 = comment2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str6 = comment2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.traverse(nodeVisitor19);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable13, (int) 'a', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        boolean boolean14 = comment10.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node17 = comment10.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node18 = comment10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str3 = comment2.toString();
        java.lang.String str5 = comment2.attr("\n<!--hi!-->");
        int int6 = comment2.siblingIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str3, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean7 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        boolean boolean6 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        org.jsoup.nodes.Node node15 = xmlDeclaration14.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--#comment-->");
        org.jsoup.select.NodeFilter nodeFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = comment1.filter(nodeFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
            org.jsoup.nodes.Node node15 = comment1.after("\n<!---->");
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
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        java.lang.String str12 = comment10.nodeName();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment10.outerHtmlTail(appendable13, (int) (byte) -1, outputSettings15);
        int int17 = comment10.childNodeSize();
        java.lang.String str18 = comment10.outerHtml();
        boolean boolean20 = comment10.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node8.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str15 = node14.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        org.jsoup.nodes.Node node9 = comment1.root();
        org.jsoup.nodes.Node node10 = node9.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        boolean boolean16 = comment12.hasAttr("#comment");
        java.lang.String str18 = comment12.absUrl("\n<!---->");
        boolean boolean19 = comment12.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node10.before((org.jsoup.nodes.Node) comment12);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.after("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.String str7 = comment1.attr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        java.lang.String str12 = comment9.getData();
        java.lang.String str13 = comment9.toString();
        org.jsoup.nodes.Node node14 = comment9.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = node6.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = node7.outerHtml();
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Node node8 = node6.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean12 = comment1.hasParent();
        boolean boolean14 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.filter(nodeFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        int int9 = comment2.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--hi!-->");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        int int14 = comment12.siblingIndex();
        java.lang.String str15 = comment12.toString();
        boolean boolean16 = comment12.hasParent();
        java.lang.String str17 = comment12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) comment12);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.jsoup.nodes.Node node13 = comment7.parentNode();
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
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        int int15 = comment13.siblingIndex();
        java.lang.String str16 = comment13.baseUri();
        org.jsoup.nodes.Node node18 = comment13.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
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
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        boolean boolean8 = comment4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = comment4.attr("\n<!--hi!-->", "#comment");
        boolean boolean12 = comment2.hasSameValue((java.lang.Object) "\n<!--hi!-->");
        comment2.setBaseUri("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        java.lang.String str10 = comment1.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = document25.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--#comment-->");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        int int20 = comment18.siblingIndex();
        java.lang.String str21 = comment18.toString();
        org.jsoup.nodes.Node node22 = comment18.parentNode();
        org.jsoup.nodes.Node node24 = comment18.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment1.before((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        java.lang.Class<?> wildcardClass12 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.clone();
        boolean boolean10 = comment1.isXmlDeclaration();
        java.lang.String str11 = comment1.nodeName();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        java.lang.String str16 = comment13.getData();
        org.jsoup.nodes.Node node19 = comment13.attr("", "");
        java.lang.String str21 = comment13.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node22 = comment13.nextSibling();
        int int23 = comment13.siblingIndex();
        org.jsoup.nodes.Attributes attributes24 = comment13.attributes();
        boolean boolean25 = comment1.equals((java.lang.Object) comment13);
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str28 = comment27.getData();
        org.jsoup.nodes.Node node29 = comment27.root();
        java.lang.String str30 = comment27.getData();
        org.jsoup.nodes.Node node33 = comment27.attr("", "");
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        comment27.outerHtmlTail(appendable34, (int) (short) 100, outputSettings36);
        org.jsoup.nodes.Document document38 = comment27.ownerDocument();
        org.jsoup.nodes.Node node39 = comment27.shallowClone();
        org.jsoup.nodes.Comment comment41 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str42 = comment41.getData();
        java.lang.String str43 = comment41.nodeName();
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        comment41.outerHtmlTail(appendable44, (int) (byte) -1, outputSettings46);
        int int48 = comment41.childNodeSize();
        boolean boolean49 = comment27.equals((java.lang.Object) comment41);
        boolean boolean50 = comment41.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment41);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#comment" + "'", str43, "#comment");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        org.jsoup.nodes.Document document17 = comment1.ownerDocument();
        org.jsoup.nodes.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment1.before(node18);
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
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (int) '4', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("hi!");
        java.lang.String str19 = comment16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        org.jsoup.nodes.Node node24 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node24.parentNode();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node3 = comment1.previousSibling();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        java.lang.String str16 = comment14.nodeName();
        boolean boolean17 = comment10.hasSameValue((java.lang.Object) str16);
        comment10.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes20 = comment10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration8.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.lang.String str13 = comment1.getData();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str18 = comment16.attr("#comment");
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment21.outerHtmlTail(appendable22, (-1), outputSettings24);
        org.jsoup.nodes.Node node28 = comment21.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = comment21.asXmlDeclaration();
        boolean boolean30 = comment16.hasSameValue((java.lang.Object) comment21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment1.after((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(xmlDeclaration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
            org.jsoup.nodes.Node node11 = node10.root();
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        org.jsoup.nodes.Attributes attributes12 = comment1.attributes();
        java.lang.String str13 = comment1.getData();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str16 = comment15.getData();
        org.jsoup.nodes.Node node17 = comment15.root();
        org.jsoup.nodes.Node node19 = comment15.removeAttr("");
        org.jsoup.nodes.Node node20 = comment15.nextSibling();
        java.lang.String str22 = comment15.attr("");
        org.jsoup.nodes.Node node23 = comment15.root();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.lang.String str21 = comment1.baseUri();
        java.lang.String str22 = comment1.nodeName();
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.before(node23);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.lang.String str14 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        org.jsoup.nodes.Node node22 = comment20.root();
        org.jsoup.nodes.Node node24 = comment20.removeAttr("");
        org.jsoup.nodes.Node node25 = comment20.nextSibling();
        java.lang.String str27 = comment20.attr("");
        org.jsoup.nodes.Node node28 = comment20.shallowClone();
        org.jsoup.nodes.Node node29 = comment20.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = comment2.before((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        int int11 = comment9.siblingIndex();
        java.lang.String str12 = comment9.baseUri();
        org.jsoup.nodes.Node node14 = comment9.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node15 = comment9.clone();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node19 = comment18.shallowClone();
        org.jsoup.nodes.Node node20 = node19.nextSibling();
        boolean boolean21 = comment9.equals((java.lang.Object) node19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node7.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node15 = comment14.clone();
        org.jsoup.nodes.Node node16 = comment14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment14.childNodesCopy();
        boolean boolean19 = comment14.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.before((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.lang.String str21 = node20.outerHtml();
        org.jsoup.select.NodeFilter nodeFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node20.filter(nodeFilter22);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment6.outerHtmlTail(appendable7, (-1), outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment6.childNodes();
        java.lang.String str13 = comment6.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes14 = comment6.attributes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Node node18 = comment16.root();
        java.lang.String str19 = comment16.getData();
        org.jsoup.nodes.Node node22 = comment16.attr("", "");
        org.jsoup.nodes.Node node23 = comment16.previousSibling();
        org.jsoup.nodes.Node node24 = comment16.root();
        boolean boolean25 = comment6.hasSameValue((java.lang.Object) node24);
        int int26 = comment6.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            document3.replaceWith((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "");
        java.lang.String str11 = comment1.toString();
        int int12 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean12 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Node node20 = comment18.root();
        java.lang.String str21 = comment18.getData();
        org.jsoup.nodes.Node node24 = comment18.attr("", "");
        org.jsoup.nodes.Node node25 = comment18.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment15.outerHtmlHead(appendable28, (-1), outputSettings30);
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
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!--hi!-->-->");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.previousSibling();
        org.jsoup.nodes.Node node7 = node3.clone();
        java.lang.Class<?> wildcardClass8 = node3.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodesCopy();
        boolean boolean8 = comment1.hasAttr("");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        java.lang.String str13 = comment1.attr("\n<!---->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.String str10 = node9.outerHtml();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str16 = comment14.attr("#comment");
        org.jsoup.nodes.Node node19 = comment14.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) comment14);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("hi!");
        java.lang.String str8 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!---->");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable11, 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.jsoup.nodes.Node node20 = xmlDeclaration7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration7.after("hi!");
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
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node12 = comment1.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        node12.setBaseUri("\n<!---->");
        int int16 = node12.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment6.unwrap();
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
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.String str16 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node17 = comment1.nextSibling();
        org.jsoup.nodes.Node node18 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node24 = comment21.attr("hi!", "#comment");
        java.lang.String str25 = comment21.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.after((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--hi!-->" + "'", str25, "\n<!--hi!-->");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node10 = comment1.parentNode();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node13 = comment12.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment12.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str11 = comment10.nodeName();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment10);
        org.jsoup.nodes.Node node13 = comment10.previousSibling();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node18 = comment16.removeAttr("");
        boolean boolean20 = comment16.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node23 = comment16.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node24 = comment16.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment10.before((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str14 = comment1.attr("\n<!--hi!-->");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean7 = node5.hasSameValue((java.lang.Object) '4');
        node5.setBaseUri("#comment");
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable11, (int) (byte) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Node node12 = comment1.attr("hi!", "\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.clone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        boolean boolean14 = comment11.hasParent();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment11.isXmlDeclaration();
        boolean boolean17 = comment11.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.before((org.jsoup.nodes.Node) comment11);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean10 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.after("#comment");
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
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document15.root();
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
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment13.removeAttr("");
        java.lang.String str16 = comment13.baseUri();
        org.jsoup.nodes.Node node17 = comment13.parentNode();
        org.jsoup.nodes.Node node19 = comment13.removeAttr("");
        org.jsoup.nodes.Node node22 = comment13.attr("\n<!---->", "hi!");
        node22.setBaseUri("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node11.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        boolean boolean6 = comment1.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node9 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.lang.String str15 = comment12.baseUri();
        org.jsoup.nodes.Node node18 = comment12.attr("#comment", "#comment");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment12.outerHtmlTail(appendable19, (int) '#', outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment12);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node6 = comment1.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.lang.String str9 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        comment1.setBaseUri("hi!");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean12 = comment10.hasAttr("");
        org.jsoup.nodes.Node node13 = comment10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        org.jsoup.nodes.Node node7 = comment5.root();
        org.jsoup.nodes.Node node9 = comment5.removeAttr("");
        org.jsoup.nodes.Node node10 = comment5.clone();
        boolean boolean11 = node3.hasSameValue((java.lang.Object) node10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node3.siblingNodes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        boolean boolean7 = comment1.hasAttr("");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        int int11 = comment9.siblingIndex();
        java.lang.String str12 = comment9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment9.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        node7.setBaseUri("\n<!---->");
        boolean boolean10 = node7.hasParent();
        org.jsoup.nodes.Node node11 = node7.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.String str10 = node9.outerHtml();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = node6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.root();
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Document document9 = xmlDeclaration8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document9.setBaseUri("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.attr("#comment", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Node node13 = node12.nextSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment1.outerHtmlTail(appendable15, (int) (byte) -1, outputSettings17);
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        java.lang.String str22 = comment20.nodeName();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment20.outerHtmlTail(appendable23, (int) (byte) -1, outputSettings25);
        org.jsoup.nodes.Node node27 = comment20.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment1.before(node27);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        org.jsoup.nodes.Node node17 = node16.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.Node node10 = comment1.previousSibling();
        org.jsoup.nodes.Node node12 = comment1.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.traverse(nodeVisitor13);
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.Class<?> wildcardClass8 = xmlDeclaration7.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node16 = comment8.clone();
        boolean boolean17 = comment8.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.after((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        int int10 = xmlDeclaration8.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node6 = node5.shallowClone();
        org.jsoup.nodes.Node node7 = node5.shallowClone();
        boolean boolean8 = node7.hasParent();
        boolean boolean9 = node7.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "");
        java.lang.String str11 = comment1.toString();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        java.lang.String str16 = comment13.getData();
        org.jsoup.nodes.Node node19 = comment13.attr("", "");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment13.outerHtmlTail(appendable20, (int) (short) 100, outputSettings22);
        org.jsoup.nodes.Node node25 = comment13.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration7.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        org.jsoup.nodes.Node node21 = comment10.shallowClone();
        org.jsoup.nodes.Node node22 = node21.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.siblingNodes();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        java.lang.String str15 = comment12.getData();
        org.jsoup.nodes.Node node18 = comment12.attr("", "");
        org.jsoup.nodes.Node node19 = comment12.previousSibling();
        org.jsoup.nodes.Node node20 = comment12.root();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) node20);
        java.lang.Class<?> wildcardClass22 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.after(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        int int22 = comment20.siblingIndex();
        java.lang.String str23 = comment20.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment20.childNodesCopy();
        org.jsoup.nodes.Node node26 = comment20.removeAttr("#comment");
        org.jsoup.nodes.Document document27 = comment20.ownerDocument();
        boolean boolean28 = comment20.isXmlDeclaration();
        int int29 = comment20.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node9.before((org.jsoup.nodes.Node) comment20);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        java.lang.String str11 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration8.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("\n<!--\n<!--#comment-->-->");
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
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        int int9 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str7 = comment2.absUrl("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.toString();
        org.jsoup.nodes.Node node9 = comment1.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        org.jsoup.nodes.Node node7 = comment1.parent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        java.lang.String str11 = comment10.toString();
        boolean boolean13 = comment10.hasAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node7.equals((java.lang.Object) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str11, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        java.lang.String str11 = comment8.getData();
        org.jsoup.nodes.Node node14 = comment8.attr("", "");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment8.outerHtmlTail(appendable15, (int) (short) 100, outputSettings17);
        org.jsoup.nodes.Document document19 = comment8.ownerDocument();
        org.jsoup.nodes.Node node20 = comment8.shallowClone();
        org.jsoup.nodes.Node node21 = comment8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment1.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("\n<!---->", "\n<!--#comment-->");
        java.lang.String str11 = comment1.attr("\n<!--#comment-->");
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.parent();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment6.outerHtmlTail(appendable7, (-1), outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment6.childNodes();
        java.lang.String str13 = comment6.absUrl("\n<!--hi!-->");
        boolean boolean15 = comment6.hasAttr("\n<!--#comment-->");
        java.lang.String str17 = comment6.attr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node3.before((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.lang.String str10 = comment1.nodeName();
        java.lang.String str11 = comment1.outerHtml();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("#comment", "hi!");
        java.lang.String str16 = comment14.absUrl("\n<!--#comment-->");
        boolean boolean18 = comment14.hasAttr("\n<!---->");
        int int19 = comment14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment14);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Node node11 = comment1.parent();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Node node15 = comment13.root();
        int int16 = comment13.childNodeSize();
        java.lang.String str17 = comment13.outerHtml();
        java.lang.String str19 = comment13.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment13.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment13.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node11.after((org.jsoup.nodes.Node) xmlDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.jsoup.nodes.Node node6 = comment1.parent();
        java.lang.String str8 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        java.lang.String str11 = comment1.attr("");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node3 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node3.wrap("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
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
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        int int16 = comment15.siblingIndex();
        org.jsoup.nodes.Document document17 = comment15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.before((org.jsoup.nodes.Node) document17);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        java.lang.String str8 = comment2.absUrl("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.after(node9);
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str6 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment4 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node6 = comment4.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment4.childNodesCopy();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        boolean boolean12 = comment4.hasSameValue((java.lang.Object) comment9);
        java.lang.String str13 = comment4.nodeName();
        java.lang.String str14 = comment4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.before((org.jsoup.nodes.Node) comment4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node12 = comment11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment11.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before((org.jsoup.nodes.Node) comment11);
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
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--hi!-->", "");
        java.lang.String str11 = comment1.toString();
        int int12 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.root();
        java.lang.String str10 = node9.outerHtml();
        org.jsoup.nodes.Node node11 = node9.root();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.after(node12);
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("\n<!--#comment-->");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        java.lang.String str8 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        java.lang.String str11 = comment1.attr("");
        org.jsoup.nodes.Node node13 = comment1.wrap("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = node6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.clone();
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        boolean boolean24 = node23.hasParent();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        comment1.setBaseUri("hi!");
        java.lang.String str9 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node18 = comment17.shallowClone();
        org.jsoup.nodes.Node node19 = node18.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node18);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Document document5 = comment1.ownerDocument();
        java.lang.String str7 = comment1.absUrl("\n<!--hi!-->");
        int int8 = comment1.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable4, 1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.outerHtml();
        int int7 = comment2.siblingIndex();
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration9.remove();
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
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        comment1.setBaseUri("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node3.shallowClone();
        org.jsoup.nodes.Node node8 = node3.parent();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.nodeName();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node9 = comment7.removeAttr("");
        java.lang.String str10 = comment7.baseUri();
        org.jsoup.nodes.Node node13 = comment7.attr("#comment", "#comment");
        boolean boolean14 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment7.nextSibling();
        org.jsoup.nodes.Node node18 = comment7.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment7.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(xmlDeclaration19);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document3.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean12 = comment1.hasParent();
        boolean boolean14 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        java.lang.String str16 = comment1.getData();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        boolean boolean10 = comment1.hasAttr("");
        java.lang.String str11 = comment1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) (short) 10, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node11 = comment1.attr("hi!", "#comment");
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.filter(nodeFilter12);
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        java.lang.String str7 = comment1.absUrl("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!---->", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node4 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        org.jsoup.nodes.Node node10 = comment6.removeAttr("");
        org.jsoup.nodes.Node node11 = comment6.nextSibling();
        java.lang.String str13 = comment6.attr("");
        org.jsoup.nodes.Node node14 = comment6.shallowClone();
        org.jsoup.nodes.Node node15 = comment6.root();
        boolean boolean17 = comment6.hasAttr("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceWith((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment1.clone();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration8.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str9 = comment1.baseUri();
        java.lang.String str10 = comment1.getData();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment12.outerHtmlTail(appendable13, (int) (short) 1, outputSettings15);
        org.jsoup.nodes.Attributes attributes17 = comment12.attributes();
        org.jsoup.nodes.Node node18 = comment12.clearAttributes();
        int int19 = node18.siblingIndex();
        org.jsoup.nodes.Node node20 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment1.after(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str2 = comment1.outerHtml();
        org.jsoup.nodes.Node node3 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!---->" + "'", str2, "\n<!---->");
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        int int8 = node7.siblingIndex();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.jsoup.nodes.Node node10 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str22 = comment21.getData();
        java.lang.String str23 = comment21.nodeName();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment21.outerHtmlTail(appendable24, (int) (byte) -1, outputSettings26);
        org.jsoup.nodes.Node node28 = comment21.clearAttributes();
        java.lang.String str29 = node28.outerHtml();
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str32 = comment31.getData();
        java.lang.String str33 = comment31.nodeName();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        comment31.outerHtmlTail(appendable34, (int) (byte) -1, outputSettings36);
        int int38 = comment31.childNodeSize();
        java.lang.String str39 = comment31.outerHtml();
        boolean boolean41 = comment31.hasAttr("hi!");
        boolean boolean42 = node28.hasSameValue((java.lang.Object) boolean41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node18.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!---->" + "'", str29, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n<!--hi!-->" + "'", str39, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        java.lang.String str8 = comment1.toString();
        java.lang.String str9 = comment1.getData();
        java.lang.Class<?> wildcardClass10 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        boolean boolean19 = comment1.hasParent();
        org.jsoup.nodes.Node node20 = comment1.parentNode();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node25 = comment23.removeAttr("");
        boolean boolean27 = comment23.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = comment23.asXmlDeclaration();
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment31.outerHtmlTail(appendable32, (-1), outputSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment31.childNodes();
        java.lang.String str38 = comment31.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = comment31.asXmlDeclaration();
        boolean boolean40 = xmlDeclaration28.equals((java.lang.Object) comment31);
        org.jsoup.nodes.Node node41 = comment31.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node41);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration28);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(xmlDeclaration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Document document5 = node3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = document5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        int int10 = comment1.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.after("\n<!--\n<!--#comment-->-->");
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
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable5, 1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.String str18 = comment1.attr("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.lang.String str15 = comment1.getData();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        int int19 = comment1.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        java.lang.String str5 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) (byte) -1, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.lang.String str8 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node12 = comment10.removeAttr("");
        java.lang.String str13 = comment10.baseUri();
        org.jsoup.nodes.Node node16 = comment10.attr("#comment", "#comment");
        boolean boolean17 = comment10.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node8.before((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node8 = comment7.clone();
        org.jsoup.nodes.Node node9 = comment7.clone();
        org.jsoup.nodes.Node node10 = comment7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node7 = comment6.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment6.asXmlDeclaration();
        boolean boolean9 = comment2.equals((java.lang.Object) comment6);
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable10, (int) (byte) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = node4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        boolean boolean8 = comment2.hasAttr("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        int int15 = node14.siblingIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str10 = comment1.attr("hi!");
        org.jsoup.nodes.Node node11 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node19 = comment16.attr("hi!", "#comment");
        java.lang.String str20 = comment16.toString();
        boolean boolean21 = comment16.isXmlDeclaration();
        java.lang.String str22 = comment16.getData();
        org.jsoup.nodes.Node node25 = comment16.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        boolean boolean12 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment1.root();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node3.shallowClone();
        org.jsoup.nodes.Node node8 = node3.parent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        java.lang.String str12 = comment10.nodeName();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment10.outerHtmlTail(appendable13, (int) (byte) -1, outputSettings15);
        int int17 = comment10.childNodeSize();
        boolean boolean19 = comment10.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes20 = comment10.attributes();
        boolean boolean22 = comment10.hasAttr("hi!");
        org.jsoup.nodes.Node node23 = comment10.shallowClone();
        org.jsoup.nodes.Node node24 = comment10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node8.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document21.parentNode();
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
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        java.lang.String str10 = comment1.attr("hi!");
        org.jsoup.nodes.Node node11 = comment1.clone();
        boolean boolean12 = comment1.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        java.lang.String str12 = comment2.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        boolean boolean9 = comment1.hasAttr("");
        java.lang.String str10 = comment1.getData();
        java.lang.Class<?> wildcardClass11 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        boolean boolean4 = comment2.hasAttr("hi!");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable5, (int) (short) -1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
            node15.setBaseUri("\n<!--hi!-->");
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.root();
        org.jsoup.nodes.Node node7 = node3.shallowClone();
        org.jsoup.nodes.Node node8 = node3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node3.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("\n<!--\n<!--hi!-->-->");
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
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.lang.String str16 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node17 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.shallowClone();
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
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        java.lang.String str11 = comment1.absUrl("\n<!---->");
        boolean boolean12 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node15 = comment14.clone();
        org.jsoup.nodes.Node node16 = comment14.clone();
        org.jsoup.nodes.Node node18 = comment14.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node19 = comment14.clone();
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str11 = comment10.nodeName();
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment10);
        int int13 = comment10.childNodeSize();
        org.jsoup.nodes.Node node14 = comment10.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
            node10.remove();
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node22 = comment21.parentNode();
        java.lang.String str23 = comment21.outerHtml();
        org.jsoup.nodes.Node node24 = comment21.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node19.before((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--#comment-->" + "'", str23, "\n<!--#comment-->");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.previousSibling();
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        org.jsoup.nodes.Node node12 = comment1.attr("", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
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
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("#comment", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node3.before((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = comment1.root();
        org.jsoup.nodes.Node node9 = node8.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = node2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node2.childNodes();
        org.jsoup.nodes.Node node5 = node2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
            org.jsoup.nodes.Node node11 = node10.root();
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        boolean boolean17 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node21 = comment20.clone();
        org.jsoup.nodes.Node node22 = node21.clone();
        java.lang.String str23 = node21.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.before(node21);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--\n<!--hi!-->-->" + "'", str23, "\n<!--\n<!--hi!-->-->");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment12.childNodesCopy();
        java.lang.String str16 = comment12.toString();
        org.jsoup.nodes.Node node17 = comment12.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration10.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        int int5 = comment1.siblingIndex();
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable7, (int) (byte) 0, outputSettings9);
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        java.lang.String str3 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        java.lang.String str4 = comment1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        java.lang.String str15 = comment12.getData();
        org.jsoup.nodes.Node node18 = comment12.attr("", "");
        org.jsoup.nodes.Node node19 = comment12.previousSibling();
        org.jsoup.nodes.Node node20 = comment12.root();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) node20);
        int int22 = comment2.childNodeSize();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable23, (int) 'a', outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str10 = comment2.outerHtml();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        java.lang.String str13 = comment2.absUrl("\n<!--\n<!--hi!-->-->");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--\n<!--#comment-->-->");
        java.lang.String str13 = comment12.getData();
        boolean boolean14 = comment1.equals((java.lang.Object) str13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Attributes attributes8 = comment1.attributes();
        boolean boolean9 = comment1.hasParent();
        int int10 = comment1.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        boolean boolean10 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = comment2.clone();
        boolean boolean14 = node13.hasParent();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        java.lang.String str21 = comment19.nodeName();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment19.outerHtmlTail(appendable22, (int) (byte) -1, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment1.after((org.jsoup.nodes.Node) comment19);
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment1.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.traverse(nodeVisitor13);
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.String str17 = comment1.toString();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node21 = comment19.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        org.jsoup.nodes.Document document23 = comment19.ownerDocument();
        java.lang.String str24 = comment19.nodeName();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment19.outerHtmlTail(appendable25, (int) '4', outputSettings27);
        org.jsoup.nodes.Node node29 = comment19.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = comment1.before(node29);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        boolean boolean9 = comment1.hasAttr("");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        org.jsoup.nodes.Node node15 = comment11.removeAttr("");
        org.jsoup.nodes.Node node16 = comment11.nextSibling();
        java.lang.String str18 = comment11.attr("");
        org.jsoup.nodes.Node node19 = comment11.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment11.asXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment11.shallowClone();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment23.outerHtmlTail(appendable24, (int) (short) 1, outputSettings26);
        boolean boolean28 = comment11.equals((java.lang.Object) outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment1.before((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        org.jsoup.nodes.Node node4 = comment1.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
            org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable19, (int) (byte) 100, outputSettings21);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str14 = comment1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        java.lang.String str7 = comment1.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment1.childNodesCopy();
        java.lang.Class<?> wildcardClass9 = nodeList8.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        comment2.setBaseUri("");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node14 = comment13.clone();
        org.jsoup.nodes.Node node15 = comment13.clone();
        org.jsoup.nodes.Node node17 = comment13.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("");
        java.lang.String str9 = comment7.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str6 = comment1.attr("hi!");
        java.lang.String str7 = comment1.getData();
        java.lang.String str9 = comment1.absUrl("hi!");
        boolean boolean10 = comment1.hasParent();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.jsoup.nodes.Node node9 = comment2.shallowClone();
        org.jsoup.nodes.Node node10 = node9.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("\n<!---->", "\n<!--#comment-->");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Node node13 = comment11.root();
        org.jsoup.nodes.Node node15 = comment11.removeAttr("");
        org.jsoup.nodes.Node node16 = comment11.clone();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (short) 1, outputSettings4);
        java.lang.String str6 = comment1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable16, (int) (byte) 10, outputSettings18);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment1.childNodes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment13.clearAttributes();
        java.lang.String str16 = comment13.attr("\n<!--hi!-->");
        boolean boolean18 = comment13.hasAttr("#comment");
        org.jsoup.nodes.Node node19 = comment13.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.after((org.jsoup.nodes.Node) comment13);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        node9.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        java.lang.String str7 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) -1, outputSettings10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment1.outerHtmlTail(appendable12, 1, outputSettings14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.toString();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--\n<!--\n<!--#comment-->-->-->" + "'", str4, "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.after("\n<!--hi!-->");
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment1.replaceWith((org.jsoup.nodes.Node) comment11);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.parent();
        boolean boolean10 = comment1.hasAttr("\n<!---->");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable11, 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.jsoup.nodes.Node node15 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        int int13 = comment11.siblingIndex();
        java.lang.String str14 = comment11.baseUri();
        org.jsoup.nodes.Node node16 = comment11.removeAttr("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment11.childNodes();
        org.jsoup.nodes.Attributes attributes18 = comment11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node9.hasSameValue((java.lang.Object) attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        java.lang.String str10 = comment1.getData();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable11, (int) (short) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
            org.jsoup.nodes.Node node15 = document13.wrap("\n<!---->");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("");
        java.lang.Class<?> wildcardClass7 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable16, (int) (short) 10, outputSettings18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        boolean boolean5 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = comment1.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasSameValue((java.lang.Object) 'a');
        int int11 = comment1.siblingIndex();
        org.jsoup.nodes.Node node12 = comment1.root();
        boolean boolean13 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment15.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.childNodesCopy();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        org.jsoup.nodes.Node node22 = comment20.root();
        boolean boolean23 = comment15.hasSameValue((java.lang.Object) comment20);
        boolean boolean24 = comment20.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes25 = comment20.attributes();
        java.lang.String str26 = comment20.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment1.before((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        java.lang.String str5 = comment1.baseUri();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        boolean boolean10 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment7.nextSibling();
        org.jsoup.nodes.Node node12 = comment7.root();
        boolean boolean13 = comment7.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment1.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Node node14 = comment1.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Document document15 = comment1.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.String str15 = comment1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.before("\n<!--hi!-->");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("\n<!--#comment-->");
        boolean boolean9 = comment1.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Node node6 = node5.shallowClone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        java.lang.String str10 = comment8.nodeName();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, (int) (byte) -1, outputSettings13);
        int int15 = comment8.childNodeSize();
        boolean boolean17 = comment8.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes18 = comment8.attributes();
        boolean boolean20 = comment8.hasAttr("");
        org.jsoup.nodes.Node node21 = comment8.root();
        org.jsoup.nodes.Node node22 = comment8.root();
        org.jsoup.nodes.Node node25 = comment8.attr("\n<!--\n<!--#comment-->-->", "hi!");
        java.lang.String str26 = node25.outerHtml();
        boolean boolean27 = node5.hasSameValue((java.lang.Object) node25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node5.before("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        boolean boolean5 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment1.parent();
        org.jsoup.nodes.Node node8 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = node8.root();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
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
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        org.jsoup.nodes.Document document19 = comment17.ownerDocument();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment17.outerHtmlTail(appendable20, 0, outputSettings22);
        java.lang.String str24 = comment17.nodeName();
        boolean boolean25 = comment17.hasParent();
        java.lang.String str26 = comment17.baseUri();
        java.lang.String str28 = comment17.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node15.before((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.clone();
        org.jsoup.nodes.Node node9 = comment1.attr("hi!", "#comment");
        boolean boolean10 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodes();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        org.jsoup.nodes.Node node11 = comment7.removeAttr("");
        org.jsoup.nodes.Node node12 = comment7.nextSibling();
        java.lang.String str14 = comment7.attr("");
        org.jsoup.nodes.Node node15 = comment7.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = comment7.asXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment7.shallowClone();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment19.outerHtmlTail(appendable20, (int) (short) 1, outputSettings22);
        boolean boolean24 = comment7.equals((java.lang.Object) outputSettings22);
        boolean boolean25 = comment7.hasParent();
        java.lang.String str26 = comment7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceWith((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(xmlDeclaration16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean17 = comment15.hasAttr("");
        java.lang.String str18 = comment15.baseUri();
        org.jsoup.nodes.Node node21 = comment15.attr("#comment", "#comment");
        java.lang.String str23 = comment15.attr("hi!");
        boolean boolean24 = comment15.hasParent();
        boolean boolean25 = comment1.hasSameValue((java.lang.Object) boolean24);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable26, (int) 'a', outputSettings28);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.baseUri();
        java.lang.String str7 = comment1.attr("");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.clone();
        java.lang.String str9 = comment1.attr("\n<!---->");
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment1.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        java.lang.String str5 = comment1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.root();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Node node16 = comment14.root();
        boolean boolean17 = comment9.hasSameValue((java.lang.Object) comment14);
        boolean boolean18 = comment14.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes19 = comment14.attributes();
        java.lang.String str20 = comment14.getData();
        java.lang.String str22 = comment14.attr("\n<!--\n<!--#comment-->-->");
        boolean boolean23 = node7.hasSameValue((java.lang.Object) str22);
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node7.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment1.parent();
        org.jsoup.nodes.Node node11 = comment1.attr("\n<!--\n<!--hi!-->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--hi!-->-->");
        boolean boolean3 = comment2.hasParent();
        org.jsoup.select.NodeFilter nodeFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.filter(nodeFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        boolean boolean11 = comment1.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document16 = comment15.ownerDocument();
        org.jsoup.nodes.Node node17 = comment15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        boolean boolean5 = comment1.hasParent();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str8 = comment7.getData();
        org.jsoup.nodes.Node node9 = comment7.root();
        int int10 = comment7.childNodeSize();
        java.lang.String str11 = comment7.outerHtml();
        java.lang.String str13 = comment7.attr("\n<!--hi!-->");
        java.lang.String str15 = comment7.attr("#comment");
        org.jsoup.nodes.Node node16 = comment7.shallowClone();
        org.jsoup.nodes.Attributes attributes17 = comment7.attributes();
        org.jsoup.nodes.Node node19 = comment7.removeAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment1.before((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        org.jsoup.nodes.Attributes attributes15 = comment1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        node7.setBaseUri("\n<!---->");
        boolean boolean10 = node7.hasParent();
        org.jsoup.nodes.Node node11 = node7.shallowClone();
        org.jsoup.nodes.Node node12 = node7.nextSibling();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean17 = comment15.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.siblingNodes();
        org.jsoup.nodes.Node node19 = comment15.shallowClone();
        java.lang.String str21 = comment15.absUrl("\n<!--#comment-->");
        java.lang.String str22 = comment15.outerHtml();
        java.lang.String str23 = comment15.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node7.before((org.jsoup.nodes.Node) comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str18 = comment17.getData();
        java.lang.String str19 = comment17.nodeName();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment17.outerHtmlTail(appendable20, (int) (byte) -1, outputSettings22);
        int int24 = comment17.childNodeSize();
        boolean boolean26 = comment17.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes27 = comment17.attributes();
        boolean boolean29 = comment17.hasAttr("hi!");
        int int30 = comment17.siblingIndex();
        java.lang.String str31 = comment17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) comment17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(xmlDeclaration9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment1.nextSibling();
        java.lang.String str11 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        boolean boolean12 = comment1.hasParent();
        boolean boolean14 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodes();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable16, 0, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration5.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.root();
        org.jsoup.nodes.Node node8 = xmlDeclaration5.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, 100, outputSettings8);
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.clearAttributes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable12, (int) '#', outputSettings14);
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
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        java.lang.String str7 = comment1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment1.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        org.jsoup.nodes.Node node15 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("\n<!--hi!-->");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment6.traverse(nodeVisitor13);
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
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.filter(nodeFilter15);
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
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        boolean boolean13 = comment1.hasAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        int int7 = comment1.childNodeSize();
        java.lang.String str8 = comment1.getData();
        int int9 = comment1.childNodeSize();
        boolean boolean11 = comment1.hasAttr("");
        java.lang.String str12 = comment1.nodeName();
        java.lang.Class<?> wildcardClass13 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.wrap("\n<!--#comment-->");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node6 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.lang.Class<?> wildcardClass8 = xmlDeclaration7.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.lang.String str16 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node18 = comment1.removeAttr("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        boolean boolean16 = comment2.equals((java.lang.Object) node15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        org.jsoup.nodes.Node node2 = comment1.clone();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.lang.String str4 = comment1.baseUri();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable5, 0, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
            org.jsoup.nodes.Node node20 = node18.after("\n<!--#comment-->");
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        comment1.setBaseUri("#comment");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, 0, outputSettings6);
        java.lang.String str8 = comment1.nodeName();
        boolean boolean9 = comment1.hasParent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node13 = comment11.removeAttr("");
        java.lang.String str14 = comment11.baseUri();
        java.lang.String str16 = comment11.attr("hi!");
        org.jsoup.nodes.Node node19 = comment11.attr("#comment", "\n<!---->");
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str22 = comment21.getData();
        org.jsoup.nodes.Node node23 = comment21.root();
        int int24 = comment21.childNodeSize();
        java.lang.String str26 = comment21.attr("");
        java.lang.String str27 = comment21.toString();
        int int28 = comment21.siblingIndex();
        boolean boolean29 = comment11.hasSameValue((java.lang.Object) comment21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = comment1.after((org.jsoup.nodes.Node) comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) (short) 0, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.getData();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.jsoup.nodes.Node node16 = comment1.parentNode();
        org.jsoup.select.NodeFilter nodeFilter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment1.filter(nodeFilter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        java.lang.String str10 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node16 = comment14.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment14.childNodesCopy();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Node node21 = comment19.root();
        boolean boolean22 = comment14.hasSameValue((java.lang.Object) comment19);
        boolean boolean23 = comment19.isXmlDeclaration();
        org.jsoup.nodes.Node node24 = comment19.clearAttributes();
        boolean boolean25 = comment19.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) comment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        org.jsoup.nodes.Node node8 = comment1.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.clearAttributes();
        java.lang.String str4 = comment1.attr("\n<!--hi!-->");
        boolean boolean6 = comment1.hasAttr("#comment");
        org.jsoup.nodes.Node node7 = comment1.clearAttributes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node11 = comment9.removeAttr("");
        org.jsoup.nodes.Node node12 = comment9.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment9.asXmlDeclaration();
        boolean boolean15 = comment9.hasAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node7.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        org.jsoup.nodes.Node node5 = node3.previousSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        comment1.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node16 = comment1.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.filter(nodeFilter17);
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        java.lang.String str10 = comment1.outerHtml();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--#comment-->" + "'", str10, "\n<!--#comment-->");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) (short) 100, outputSettings10);
        org.jsoup.nodes.Document document12 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document12.before("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.clearAttributes();
        java.lang.String str9 = comment1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.String str10 = comment2.nodeName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        org.jsoup.nodes.Node node9 = comment1.shallowClone();
        java.lang.String str10 = comment1.toString();
        org.jsoup.nodes.Node node13 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        java.lang.String str14 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        boolean boolean7 = comment1.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment1.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
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
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.after(node13);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.filter(nodeFilter8);
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.hasParent();
        org.jsoup.nodes.Node node5 = comment1.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment1.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = xmlDeclaration7.previousSibling();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Node node12 = comment10.root();
        java.lang.String str13 = comment10.getData();
        org.jsoup.nodes.Node node16 = comment10.attr("", "");
        org.jsoup.nodes.Node node17 = comment10.previousSibling();
        org.jsoup.nodes.Node node18 = comment10.root();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        int int22 = comment20.siblingIndex();
        java.lang.String str23 = comment20.toString();
        org.jsoup.nodes.Node node26 = comment20.attr("\n<!--#comment-->", "#comment");
        int int27 = comment20.childNodeSize();
        boolean boolean28 = comment10.hasSameValue((java.lang.Object) int27);
        int int29 = comment10.childNodeSize();
        java.lang.String str31 = comment10.absUrl("\n<!--\n<!--hi!-->-->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = node8.hasSameValue((java.lang.Object) str31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.jsoup.nodes.Document document7 = comment1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        boolean boolean13 = comment1.hasParent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable14, 100, outputSettings16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        java.lang.String str8 = comment1.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment1.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = comment1.attributes();
        org.jsoup.nodes.Node node11 = comment1.clearAttributes();
        org.jsoup.nodes.Node node12 = node11.parent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        java.lang.String str5 = comment1.toString();
        org.jsoup.nodes.Node node6 = comment1.clone();
        java.lang.String str7 = comment1.getData();
        comment1.setBaseUri("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.unwrap();
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
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node6 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node10 = comment8.removeAttr("");
        boolean boolean12 = comment8.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment8.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.jsoup.nodes.Node node17 = node15.clone();
        org.jsoup.nodes.Node node18 = node15.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.attr("", "\n<!--#comment-->");
        java.lang.String str14 = comment2.toString();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.getData();
        java.lang.String str8 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node7 = comment1.attr("", "");
        java.lang.String str9 = comment1.absUrl("\n<!--#comment-->");
        org.jsoup.nodes.Node node10 = comment1.nextSibling();
        int int11 = comment1.childNodeSize();
        org.jsoup.nodes.Node node14 = comment1.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str17 = comment16.getData();
        int int18 = comment16.siblingIndex();
        java.lang.String str19 = comment16.toString();
        org.jsoup.nodes.Node node20 = comment16.parentNode();
        java.lang.String str22 = comment16.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment16.clearAttributes();
        boolean boolean24 = node23.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node14.before(node23);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        boolean boolean9 = comment1.hasParent();
        org.jsoup.nodes.Document document10 = comment1.ownerDocument();
        org.jsoup.nodes.Document document11 = comment1.ownerDocument();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document11.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.lang.String str13 = comment1.getData();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.lang.String str36 = comment24.nodeName();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Document document3 = comment1.ownerDocument();
        java.lang.String str5 = comment1.attr("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment1.outerHtmlTail(appendable6, (int) (byte) 100, outputSettings8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.String str14 = comment1.baseUri();
        java.lang.String str15 = comment1.outerHtml();
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment1.filter(nodeFilter16);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        comment1.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str15 = comment14.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment1.after("#comment");
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
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.Node node9 = comment1.clone();
        boolean boolean10 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Document document11 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Node node11 = comment9.root();
        java.lang.String str12 = comment9.getData();
        java.lang.String str13 = comment9.toString();
        org.jsoup.nodes.Node node14 = comment9.shallowClone();
        java.lang.String str15 = comment9.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        boolean boolean5 = comment1.hasParent();
        java.lang.String str6 = comment1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        java.lang.String str4 = comment1.getData();
        org.jsoup.nodes.Node node5 = comment1.root();
        java.lang.String str6 = comment1.toString();
        java.lang.String str7 = comment1.nodeName();
        org.jsoup.nodes.Node node10 = comment1.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        org.jsoup.nodes.Node node16 = comment12.removeAttr("");
        org.jsoup.nodes.Node node17 = comment12.nextSibling();
        java.lang.String str19 = comment12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment12.childNodesCopy();
        int int21 = comment12.childNodeSize();
        org.jsoup.nodes.Node node22 = comment12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node10.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str5 = comment1.attr("#comment");
        boolean boolean6 = comment1.isXmlDeclaration();
        java.lang.String str7 = comment1.toString();
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.childNodeSize();
        java.lang.String str5 = comment1.outerHtml();
        java.lang.String str7 = comment1.attr("\n<!--hi!-->");
        java.lang.String str9 = comment1.attr("#comment");
        org.jsoup.nodes.Node node10 = comment1.shallowClone();
        org.jsoup.nodes.Attributes attributes11 = comment1.attributes();
        org.jsoup.nodes.Node node13 = comment1.removeAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str15 = comment1.absUrl("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        boolean boolean7 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.after("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        org.jsoup.nodes.Node node14 = comment1.parentNode();
        org.jsoup.nodes.Document document15 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.String str13 = comment6.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (-1), outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("\n<!--hi!-->");
        boolean boolean11 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("");
        org.jsoup.nodes.Node node6 = comment1.nextSibling();
        org.jsoup.nodes.Attributes attributes7 = comment1.attributes();
        org.jsoup.nodes.Node node9 = comment1.wrap("\n<!--hi!-->");
        boolean boolean11 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node14 = comment1.attr("hi!", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        boolean boolean5 = comment1.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment1.wrap("\n<!--#comment-->");
        boolean boolean10 = comment1.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("#comment");
        java.lang.String str3 = comment1.absUrl("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Node node4 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        java.lang.String str14 = comment1.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment1.childNodesCopy();
        java.lang.Class<?> wildcardClass16 = nodeList15.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodes();
        java.lang.Class<?> wildcardClass6 = nodeList5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        org.jsoup.nodes.Attributes attributes25 = comment4.attributes();
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
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean17 = comment15.hasAttr("");
        java.lang.String str18 = comment15.baseUri();
        org.jsoup.nodes.Node node21 = comment15.attr("#comment", "#comment");
        java.lang.String str23 = comment15.attr("hi!");
        boolean boolean24 = comment15.hasParent();
        boolean boolean25 = comment1.hasSameValue((java.lang.Object) boolean24);
        org.jsoup.nodes.Node node26 = comment1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(xmlDeclaration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment1.previousSibling();
        int int9 = comment1.childNodeSize();
        boolean boolean10 = comment1.hasParent();
        int int11 = comment1.siblingIndex();
        java.lang.Class<?> wildcardClass12 = comment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        int int5 = comment1.childNodeSize();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        java.lang.String str8 = comment1.attr("");
        java.lang.String str9 = comment1.toString();
        org.jsoup.nodes.Node node12 = comment1.attr("#comment", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--hi!-->-->", "hi!");
        comment2.setBaseUri("\n<!--\n<!--hi!-->-->");
        java.lang.String str5 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Node node6 = comment1.root();
        org.jsoup.nodes.Node node7 = comment1.root();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment1.asXmlDeclaration();
        comment1.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        java.lang.String str11 = comment1.baseUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        org.jsoup.nodes.Node node4 = node3.clearAttributes();
        org.jsoup.nodes.Document document5 = node4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str9 = comment1.outerHtml();
        java.lang.String str10 = comment1.getData();
        java.lang.String str11 = comment1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        java.lang.String str10 = comment1.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment1.asXmlDeclaration();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable12, 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean4 = comment2.hasAttr("");
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        boolean boolean7 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Node node8 = comment6.root();
        boolean boolean9 = comment1.hasSameValue((java.lang.Object) comment6);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment1.siblingNodes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node14 = comment12.removeAttr("");
        java.lang.String str15 = comment12.baseUri();
        java.lang.String str17 = comment12.absUrl("\n<!--hi!-->");
        int int18 = comment12.siblingIndex();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str21 = comment20.getData();
        int int22 = comment20.siblingIndex();
        boolean boolean24 = comment20.hasAttr("\n<!---->");
        int int25 = comment20.childNodeSize();
        java.lang.String str27 = comment20.absUrl("hi!");
        java.lang.String str29 = comment20.attr("\n<!--hi!-->");
        boolean boolean30 = comment12.equals((java.lang.Object) str29);
        boolean boolean31 = comment1.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node32 = comment12.clearAttributes();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment12.outerHtmlHead(appendable33, (-1), outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str7 = comment6.getData();
        java.lang.String str8 = comment6.nodeName();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment6.outerHtmlTail(appendable9, (int) (byte) -1, outputSettings11);
        int int13 = comment6.childNodeSize();
        boolean boolean15 = comment6.hasSameValue((java.lang.Object) 'a');
        org.jsoup.nodes.Attributes attributes16 = comment6.attributes();
        org.jsoup.nodes.Node node19 = comment6.attr("\n<!---->", "hi!");
        java.lang.String str21 = comment6.attr("\n<!--#comment-->");
        boolean boolean23 = comment6.hasAttr("\n<!--hi!-->");
        boolean boolean25 = comment6.hasAttr("");
        org.jsoup.nodes.Node node26 = comment6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment6.childNodes();
        java.lang.String str28 = comment6.baseUri();
        java.lang.String str29 = comment6.outerHtml();
        java.lang.String str31 = comment6.attr("\n<!--\n<!--hi!-->-->");
        boolean boolean32 = comment1.equals((java.lang.Object) "\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = node4.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration10.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration10.remove();
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        org.jsoup.nodes.Node node17 = node16.previousSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        boolean boolean5 = comment1.hasAttr("\n<!---->");
        java.lang.String str7 = comment1.attr("");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment1.after("\n<!--hi!-->");
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.nodeName();
        boolean boolean8 = comment1.hasSameValue((java.lang.Object) str7);
        java.lang.String str9 = comment1.outerHtml();
        org.jsoup.nodes.Node node12 = comment1.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "");
        java.lang.String str4 = comment2.attr("#comment");
        org.jsoup.nodes.Node node7 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str45 = comment10.toString();
        org.jsoup.nodes.Document document46 = comment10.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\n<!--hi!-->" + "'", str45, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document46);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment6.childNodesCopy();
        org.jsoup.nodes.Node node15 = comment6.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment6.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        java.lang.Class<?> wildcardClass4 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = node7.root();
        java.lang.String str9 = node8.outerHtml();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str3 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node4 = comment1.clone();
        org.jsoup.nodes.Document document5 = node4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        org.jsoup.nodes.Node node3 = comment1.root();
        int int4 = comment1.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodes();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("hi!");
        java.lang.String str8 = comment1.outerHtml();
        java.lang.Object obj9 = null;
        boolean boolean10 = comment1.equals(obj9);
        boolean boolean11 = comment1.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("");
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "");
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Node node14 = comment12.root();
        boolean boolean15 = comment12.isXmlDeclaration();
        org.jsoup.nodes.Node node16 = comment12.nextSibling();
        org.jsoup.nodes.Node node17 = comment12.root();
        org.jsoup.nodes.Node node18 = comment12.root();
        java.lang.String str19 = comment12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.before((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.String str39 = comment10.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = comment10.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        org.jsoup.nodes.Node node7 = comment1.attr("\n<!--#comment-->", "#comment");
        org.jsoup.nodes.Node node9 = node7.wrap("\n<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        boolean boolean8 = comment1.hasParent();
        org.jsoup.nodes.Node node9 = comment1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment1.removeAttr("#comment");
        java.lang.String str8 = comment1.nodeName();
        org.jsoup.nodes.Node node10 = comment1.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node4 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node7 = comment1.clone();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Node node20 = comment18.root();
        org.jsoup.nodes.Node node22 = comment18.removeAttr("");
        org.jsoup.nodes.Node node23 = comment18.nextSibling();
        java.lang.String str25 = comment18.attr("");
        org.jsoup.nodes.Node node26 = comment18.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment18.asXmlDeclaration();
        org.jsoup.nodes.Node node28 = comment18.shallowClone();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!");
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment30.outerHtmlTail(appendable31, (int) (short) 1, outputSettings33);
        boolean boolean35 = comment18.equals((java.lang.Object) outputSettings33);
        boolean boolean36 = comment18.hasParent();
        java.lang.String str37 = comment18.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment1.after((org.jsoup.nodes.Node) comment18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n<!--hi!-->" + "'", str37, "\n<!--hi!-->");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Node node16 = comment14.root();
        java.lang.String str17 = comment14.getData();
        org.jsoup.nodes.Node node20 = comment14.attr("", "");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        comment14.outerHtmlTail(appendable21, (int) (short) 100, outputSettings23);
        org.jsoup.nodes.Node node26 = comment14.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node27 = comment14.shallowClone();
        boolean boolean28 = node12.hasSameValue((java.lang.Object) comment14);
        java.lang.String str29 = comment14.getData();
        java.lang.String str30 = comment14.outerHtml();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        java.lang.String str4 = comment2.getData();
        comment2.setBaseUri("#comment");
        java.lang.Class<?> wildcardClass7 = comment2.getClass();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node7 = comment1.attr("#comment", "#comment");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment1.outerHtmlTail(appendable8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = comment1.shallowClone();
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
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        java.lang.Class<?> wildcardClass21 = comment1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        java.lang.String str3 = comment1.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node6 = comment1.attr("#comment", "\n<!--\n<!--hi!-->-->");
        java.lang.String str7 = comment1.baseUri();
        org.jsoup.nodes.Node node8 = comment1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--#comment-->");
        boolean boolean6 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str9 = comment8.getData();
        org.jsoup.nodes.Node node10 = comment8.root();
        org.jsoup.nodes.Node node12 = comment8.removeAttr("");
        org.jsoup.nodes.Node node13 = comment8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment8.childNodes();
        int int15 = comment8.childNodeSize();
        org.jsoup.nodes.Node node16 = comment8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.before((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.String str14 = comment1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment1.before("\n<!--\n<!--hi!-->-->");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node5 = comment2.attr("hi!", "#comment");
        java.lang.String str6 = comment2.toString();
        boolean boolean7 = comment2.isXmlDeclaration();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--\n<!--hi!-->-->", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        java.lang.String str3 = comment1.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment1.outerHtmlTail(appendable4, (int) (byte) -1, outputSettings6);
        int int8 = comment1.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.childNodesCopy();
        org.jsoup.nodes.Node node15 = comment11.nextSibling();
        comment11.setBaseUri("#comment");
        java.lang.String str18 = comment11.toString();
        boolean boolean19 = comment11.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration9.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("");
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node3.childNodesCopy();
        org.jsoup.nodes.Node node6 = node3.previousSibling();
        org.jsoup.nodes.Node node7 = node3.clone();
        org.jsoup.nodes.Node node8 = node3.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str2 = comment1.getData();
        int int3 = comment1.siblingIndex();
        java.lang.String str4 = comment1.baseUri();
        org.jsoup.nodes.Node node6 = comment1.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
    }
}

