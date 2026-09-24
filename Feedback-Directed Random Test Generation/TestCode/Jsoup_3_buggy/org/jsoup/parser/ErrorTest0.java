package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = document2.siblingIndex();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.nextSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.nextSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.nextSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = document2.nextSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element10.nextSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.nextSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.nextElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        element6.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.previousElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document2.siblingNodes();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.firstElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element9.siblingElements();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.lastElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.previousElementSibling();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document2.siblingElements();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = document2.siblingIndex();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element3.firstElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        boolean boolean3 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = document2.siblingIndex();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("#root");
        java.lang.String str5 = document2.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.nextSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.nextElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.nextSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document2.nextSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element4.siblingNodes();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        java.lang.String str10 = document2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.previousElementSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.firstElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        java.lang.String str10 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element6.previousSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.firstElementSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        java.lang.String str11 = element4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.previousElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.nextElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document7.child((int) (short) 0);
        org.jsoup.nodes.Element element13 = document7.empty();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "");
        java.lang.String[] strArray20 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element17.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element25 = document2.classNames((java.util.Set<java.lang.String>) strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element25.previousSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "#document");
        java.lang.String str3 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.nextElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        org.jsoup.nodes.Element element8 = document2.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByTag("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element6.siblingNodes();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueNot("#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        boolean boolean3 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.previousSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = element4.siblingIndex();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element4.siblingIndex();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.previousElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.util.Set<java.lang.String> strSet12 = document9.classNames();
        org.jsoup.nodes.Element element13 = element4.classNames(strSet12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element4.previousElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element4.siblingElements();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.lastElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element6.hasClass("hi!");
        java.lang.String str9 = element6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.previousElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag3.isValidParent(tag5);
        boolean boolean7 = tag5.canContainBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.nodes.Element element11 = element9.toggleClass("");
        org.jsoup.nodes.Element element13 = element9.append("hi!");
        boolean boolean14 = tag1.equals((java.lang.Object) element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element13.siblingIndex();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.siblingNodes();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.lastElementSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element18.previousElementSibling();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.nextElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        java.lang.String str19 = element18.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element18.previousSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element4.siblingNodes();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document2.siblingIndex();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = element6.siblingIndex();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.nextElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.previousElementSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element8.previousSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.select("#document");
        boolean boolean7 = element4.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.siblingNodes();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.text("");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document2.siblingElements();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element4.previousSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element4.siblingNodes();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.nextElementSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        org.jsoup.nodes.Node node12 = element4.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node12.nextSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.nextElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag3.isValidParent(tag5);
        boolean boolean7 = tag5.canContainBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.nodes.Element element11 = element9.toggleClass("");
        org.jsoup.nodes.Element element13 = element9.append("hi!");
        boolean boolean14 = tag1.equals((java.lang.Object) element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag12.canContainBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = element23.append("");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element16.classNames(strSet26);
        boolean boolean28 = element8.equals((java.lang.Object) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element27.siblingNodes();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = element14.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element14.siblingIndex();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = document2.previousSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.appendElement("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.siblingNodes();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = element22.siblingElements();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = element41.nextSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element20 = element18.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element18.nextElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.firstElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element8.text("<hi!>\n<#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.jsoup.nodes.Node node4 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = node4.nextSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Attributes attributes6 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.firstElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.previousSibling();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        boolean boolean4 = tag3.preserveWhitespace();
        boolean boolean5 = tag3.isInline();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element13 = document8.prependText("#document");
        boolean boolean14 = tag3.equals((java.lang.Object) "#document");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document17.prependText("#document");
        java.lang.String str24 = document17.attr("#document");
        org.jsoup.nodes.Element element26 = document17.prependText("");
        boolean boolean27 = tag3.equals((java.lang.Object) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = element26.siblingElements();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.nodes.Element element11 = element4.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        java.lang.String str10 = element6.html();
        java.lang.String str11 = element6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.previousSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes14 = element9.attributes();
        org.jsoup.select.Elements elements17 = element9.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element9.siblingNodes();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        boolean boolean16 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = document2.siblingIndex();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.previousElementSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.text("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        java.lang.String str22 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document2.siblingNodes();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = element6.siblingIndex();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.previousSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag12.canContainBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = element23.append("");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element16.classNames(strSet26);
        boolean boolean28 = element8.equals((java.lang.Object) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element8.firstElementSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.lang.String str9 = element8.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.lastElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.child(0);
        java.lang.String str8 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.lastElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.select.Elements elements17 = document12.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element19 = document12.appendText("hi!");
        org.jsoup.nodes.Element element20 = element9.prependChild((org.jsoup.nodes.Node) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int21 = element9.siblingIndex();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("#document", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element4.siblingElements();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        boolean boolean6 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.nextSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependText("hi!#document");
        org.jsoup.nodes.Element element16 = element11.text("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        element6.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.wrap("\n<hi!>\n</hi!>");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element4.nextSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element4.previousSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.previousElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.previousElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.text("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = element13.siblingElements();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.nextSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int19 = element7.siblingIndex();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        java.lang.String str13 = element8.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.lastElementSibling();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.getElementById("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element8.previousSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) (short) 0);
        java.lang.String str10 = document2.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document2.firstElementSibling();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = element7.siblingIndex();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.previousSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueEnding("body", "hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.lastElementSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element21 = element6.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element6.wrap("\n<hi!>\n</hi!>");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element21.text("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        org.jsoup.nodes.Element element11 = element6.val("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.nextSibling();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        java.lang.String str30 = element14.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element14.previousElementSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.lang.Integer int9 = element8.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.firstElementSibling();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValue("#root", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element7.previousSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.firstElementSibling();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.nodes.Element element9 = document2.parent();
        java.lang.String str10 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = document2.siblingIndex();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttribute("#document");
        java.lang.String str16 = element4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = element4.siblingIndex();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element18.previousElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.previousElementSibling();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element11.siblingElements();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexGreaterThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element19.previousSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag14.isValidParent(tag16);
        boolean boolean18 = tag16.isBlock();
        boolean boolean20 = tag16.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag16, "#document");
        org.jsoup.nodes.Element element23 = element12.prependChild((org.jsoup.nodes.Node) element22);
        java.lang.String str24 = element23.html();
        org.jsoup.nodes.Element element26 = element23.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element23.nextSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.previousSibling();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.previousElementSibling();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = element45.previousElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element3.prependElement("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element3.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element3.firstElementSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        java.lang.String str12 = element7.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element7.siblingNodes();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str16 = tag15.toString();
        org.jsoup.parser.Tag tag17 = tag15.getImplicitParent();
        java.lang.String str18 = tag15.getName();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element24 = document22.text("hi!");
        org.jsoup.nodes.Element element26 = element24.text("hi!");
        org.jsoup.nodes.Element element28 = element24.html("#root");
        org.jsoup.select.Elements elements30 = element24.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes31 = element24.attributes();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag15, "hi!#document", attributes31);
        org.jsoup.nodes.Element element33 = document2.prependChild((org.jsoup.nodes.Node) element32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList34 = document2.siblingNodes();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.previousSibling();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int42 = element41.siblingIndex();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Attributes attributes7 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.wrap("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document2.siblingElements();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.nextElementSibling();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueContaining("hi!", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element9.text("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = document2.siblingElements();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element13.wrap("<hi!>\n<#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = document2.siblingIndex();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.firstElementSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag12.canContainBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        document19.setBaseUri("hi!");
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element25 = element23.append("");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element16.classNames(strSet26);
        boolean boolean28 = element8.equals((java.lang.Object) element27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element27.previousElementSibling();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        boolean boolean6 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element3.siblingNodes();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Element element16 = document14.empty();
        java.lang.String str17 = element16.text();
        org.jsoup.select.Elements elements19 = element16.getElementsByTag("hi!");
        org.jsoup.nodes.Element element20 = element11.prependChild((org.jsoup.nodes.Node) element16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element11.firstElementSibling();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element10 = element8.getElementById("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.previousElementSibling();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element18 = element16.append("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.lastElementSibling();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        boolean boolean7 = element6.isBlock();
        java.lang.String str8 = element6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element6.siblingElements();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.className();
        org.jsoup.nodes.Element element8 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element4.val("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element4.lastElementSibling();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element18 = element16.append("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element4.val("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element17.nextSibling();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        java.lang.String str30 = element14.html();
        org.jsoup.nodes.Attributes attributes31 = element14.attributes();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document34.childNodes();
        document34.setBaseUri("hi!");
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.nodes.Element element40 = element38.append("");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str45 = tag44.toString();
        org.jsoup.parser.Tag tag46 = tag44.getImplicitParent();
        boolean boolean47 = tag42.equals((java.lang.Object) tag44);
        boolean boolean48 = tag42.isBlock();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag42, "#root");
        boolean boolean51 = tag42.preserveWhitespace();
        boolean boolean52 = element40.equals((java.lang.Object) tag42);
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag42, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = document57.childNodes();
        org.jsoup.nodes.Element element59 = document57.empty();
        java.lang.String str60 = element59.id();
        org.jsoup.parser.Tag tag61 = element59.tag();
        org.jsoup.parser.Tag tag62 = tag61.getImplicitParent();
        boolean boolean63 = tag42.isValidParent(tag62);
        boolean boolean64 = element14.equals((java.lang.Object) tag42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node65 = element14.previousSibling();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes11 = element4.attributes();
        org.jsoup.parser.Tag tag12 = element4.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element14.nextSibling();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        java.lang.String str8 = tag1.toString();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag10.isValidParent(tag12);
        boolean boolean14 = tag1.canContain(tag10);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.select.Elements elements25 = document18.parents();
        org.jsoup.parser.Tag tag26 = document18.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str34 = tag33.toString();
        org.jsoup.parser.Tag tag35 = tag33.getImplicitParent();
        boolean boolean36 = tag31.equals((java.lang.Object) tag33);
        boolean boolean37 = tag31.isBlock();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag31, "#root");
        boolean boolean40 = tag31.preserveWhitespace();
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        org.jsoup.nodes.Attributes attributes46 = document44.attributes();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag31, "#root", attributes46);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag26, "#document", attributes46);
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag10, "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", attributes46);
        org.jsoup.nodes.Element element51 = element49.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element52 = element51.lastElementSibling();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element7.tagName();
        org.jsoup.select.Elements elements9 = element7.children();
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexGreaterThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element7.previousSibling();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element4.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.firstElementSibling();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Element element15 = document13.empty();
        java.lang.String str16 = element15.id();
        java.lang.String str17 = element15.text();
        org.jsoup.nodes.Element element19 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element6.prependChild((org.jsoup.nodes.Node) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements24 = element23.siblingElements();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.util.Set<java.lang.String> strSet12 = document9.classNames();
        org.jsoup.nodes.Element element13 = element4.classNames(strSet12);
        org.jsoup.nodes.Element element15 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element4.html("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element17.siblingElements();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element11.wrap("hi!#document");
        java.lang.String str14 = element11.toString();
        java.lang.String str15 = element11.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.previousSibling();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.parser.Tag tag17 = document14.tag();
        java.lang.String str18 = document14.nodeName();
        org.jsoup.parser.Tag tag19 = document14.tag();
        org.jsoup.nodes.Element element20 = element11.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element22 = element20.prependElement("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = element20.siblingIndex();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Element element11 = element4.prependElement("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        java.lang.String str12 = element4.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element4.previousSibling();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.text("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element23 = element21.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element21.previousElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.siblingNodes();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean29 = element28.hasText();
        org.jsoup.nodes.Element element31 = element28.prepend("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element28.previousElementSibling();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element4.siblingElements();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element8.nextElementSibling();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.previousElementSibling();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element35 = element33.val("hi!hi!");
        org.jsoup.nodes.Element element37 = element33.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = element33.previousSibling();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.previousSibling();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.nodes.Element element10 = element4.text("hi!#document");
        org.jsoup.nodes.Element element11 = element4.empty();
        boolean boolean12 = element11.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.previousElementSibling();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element14.text("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element16 = element12.prependElement("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = element12.siblingIndex();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean16 = element14.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueEnding("hi!hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements22 = element14.getElementsByAttributeValueContaining("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element14.siblingNodes();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.siblingNodes();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.select.Elements elements17 = document12.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element19 = document12.appendText("hi!");
        org.jsoup.nodes.Element element20 = element9.prependChild((org.jsoup.nodes.Node) element19);
        java.lang.Integer int21 = element20.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.lastElementSibling();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.data();
        org.jsoup.select.Elements elements12 = element6.getElementsByIndexLessThan((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element6.lastElementSibling();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements13 = element6.getElementsByIndexLessThan((-1));
        java.util.Set<java.lang.String> strSet14 = element6.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element6.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.util.Set<java.lang.String> strSet9 = element6.classNames();
        org.jsoup.nodes.Element element11 = element6.val("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.lastElementSibling();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element6.firstElementSibling();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueStarting("hi!", "#document");
        java.lang.String str8 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.firstElementSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.select.Elements elements18 = document16.getAllElements();
        java.lang.String str19 = document16.id();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
        org.jsoup.nodes.Element element24 = document16.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document27.childNodes();
        document27.setBaseUri("hi!");
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.nodes.Element element32 = document22.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element37 = document35.text("hi!");
        org.jsoup.nodes.Element element39 = element37.text("hi!");
        org.jsoup.select.Elements elements41 = element37.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element43 = element37.appendText("hi!");
        org.jsoup.nodes.Element element46 = element37.attr("#root", "#document");
        org.jsoup.nodes.Element element48 = element37.appendElement("#root");
        org.jsoup.nodes.Element element49 = element48.empty();
        org.jsoup.nodes.Attributes attributes50 = element49.attributes();
        org.jsoup.nodes.Element element52 = element49.appendElement("hi!");
        element32.replaceWith((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Element element55 = element32.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements57 = element55.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = document60.childNodes();
        document60.setBaseUri("hi!");
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element66 = document60.appendText("hi!");
        org.jsoup.select.Elements elements68 = document60.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element(tag70, "");
        java.lang.String[] strArray75 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.jsoup.nodes.Element element78 = element72.classNames((java.util.Set<java.lang.String>) strSet76);
        org.jsoup.nodes.Element element79 = document60.classNames((java.util.Set<java.lang.String>) strSet76);
        org.jsoup.nodes.Element element80 = element55.classNames((java.util.Set<java.lang.String>) strSet76);
        org.jsoup.nodes.Element element81 = element13.classNames((java.util.Set<java.lang.String>) strSet76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element82 = element81.lastElementSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document2.siblingElements();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.outerHtml();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element6.siblingIndex();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.val("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.nextElementSibling();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str18 = tag17.toString();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        boolean boolean20 = tag15.equals((java.lang.Object) tag17);
        boolean boolean21 = tag15.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag15, "#root");
        boolean boolean24 = tag15.preserveWhitespace();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes30 = document28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag15, "#root", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag10, "#document", attributes30);
        org.jsoup.nodes.Element element34 = element32.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element32.siblingNodes();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueEnding("#root", "#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element4.nextElementSibling();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = element4.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element4.siblingNodes();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element11 = element10.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.wrap("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = element4.siblingElements();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element21.lastElementSibling();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element4.lastElementSibling();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.lang.String str12 = document9.id();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document15.childNodes();
        org.jsoup.nodes.Element element17 = document9.appendChild((org.jsoup.nodes.Node) document15);
        java.lang.String str19 = document9.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document9.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean22 = element4.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element4.getElementsByAttribute("hi!#document");
        boolean boolean26 = element4.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element4.previousSibling();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        boolean boolean39 = tag1.isBlock();
        boolean boolean40 = tag1.isData();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag1, "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element42.lastElementSibling();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.removeClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.Integer int30 = element29.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int31 = element29.siblingIndex();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.nextSibling();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.firstElementSibling();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.text("html");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = document2.siblingElements();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        org.jsoup.select.Elements elements11 = element4.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element4.siblingNodes();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.previousElementSibling();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.text("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.nextElementSibling();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int27 = element26.siblingIndex();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        boolean boolean5 = document2.hasClass("");
        org.jsoup.nodes.Element element7 = document2.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.siblingNodes();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.firstElementSibling();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = element4.previousSibling();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str18 = tag17.toString();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        boolean boolean20 = tag15.equals((java.lang.Object) tag17);
        boolean boolean21 = tag15.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag15, "#root");
        boolean boolean24 = tag15.preserveWhitespace();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes30 = document28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag15, "#root", attributes30);
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag10, "#document", attributes30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = element32.previousSibling();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag24.isValidParent(tag26);
        boolean boolean28 = tag26.canContainBlock();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Element element32 = element30.toggleClass("");
        org.jsoup.nodes.Element element34 = element30.append("hi!");
        org.jsoup.select.Elements elements37 = element34.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements38 = element34.parents();
        org.jsoup.nodes.Element element39 = element22.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element41 = element22.append("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element22.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexEquals((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.lastElementSibling();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueStarting("hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element7.previousSibling();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str13 = tag12.toString();
        org.jsoup.parser.Tag tag14 = tag12.getImplicitParent();
        boolean boolean15 = tag10.equals((java.lang.Object) tag12);
        boolean boolean16 = tag10.isBlock();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag10, "#root");
        boolean boolean19 = tag10.preserveWhitespace();
        boolean boolean20 = element8.equals((java.lang.Object) tag10);
        java.util.Set<java.lang.String> strSet21 = element8.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element8.previousElementSibling();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.getElementById("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element7.firstElementSibling();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        org.jsoup.nodes.Element element10 = element4.wrap("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str14 = document13.nodeName();
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        java.lang.String str16 = document13.id();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document19.childNodes();
        org.jsoup.nodes.Element element21 = document13.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodes();
        document24.setBaseUri("hi!");
        org.jsoup.nodes.Element element28 = document24.empty();
        org.jsoup.nodes.Element element29 = document19.appendChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element34 = document32.text("hi!");
        org.jsoup.nodes.Element element36 = element34.text("hi!");
        org.jsoup.select.Elements elements38 = element34.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("hi!");
        org.jsoup.nodes.Element element43 = element34.attr("#root", "#document");
        org.jsoup.nodes.Element element45 = element34.appendElement("#root");
        org.jsoup.nodes.Element element46 = element45.empty();
        org.jsoup.nodes.Attributes attributes47 = element46.attributes();
        org.jsoup.nodes.Element element49 = element46.appendElement("hi!");
        element29.replaceWith((org.jsoup.nodes.Node) element49);
        org.jsoup.nodes.Element element52 = element29.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.jsoup.nodes.Element element68 = document55.classNames((java.util.Set<java.lang.String>) strSet66);
        org.jsoup.nodes.Element element69 = element29.classNames((java.util.Set<java.lang.String>) strSet66);
        org.jsoup.nodes.Element element70 = element4.appendChild((org.jsoup.nodes.Node) element69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element71 = element4.lastElementSibling();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.wrap("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        boolean boolean39 = tag1.isBlock();
        boolean boolean40 = tag1.isInline();
        boolean boolean41 = tag1.preserveWhitespace();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag1, "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        boolean boolean45 = element43.hasClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element43.siblingNodes();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "");
        java.lang.String[] strArray15 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element12.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element19.previousSibling();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        java.lang.String str10 = element4.attr("#root");
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document");
        org.jsoup.nodes.Element element14 = element12.append("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.previousElementSibling();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag24.isValidParent(tag26);
        boolean boolean28 = tag26.canContainBlock();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Element element32 = element30.toggleClass("");
        org.jsoup.nodes.Element element34 = element30.append("hi!");
        org.jsoup.select.Elements elements37 = element34.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements38 = element34.parents();
        org.jsoup.nodes.Element element39 = element22.prependChild((org.jsoup.nodes.Node) element34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element22.firstElementSibling();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.prependText("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element4.nextSibling();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.parent();
        org.jsoup.nodes.Element element14 = element11.prependText("hi!#document");
        org.jsoup.nodes.Element element16 = element11.text("hi!#document");
        java.lang.Integer int17 = element11.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements18 = element11.siblingElements();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.isInline();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document42.childNodes();
        org.jsoup.nodes.Element element44 = document42.empty();
        org.jsoup.select.Elements elements46 = document42.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements48 = document42.getElementsByIndexEquals((int) 'a');
        boolean boolean49 = tag39.equals((java.lang.Object) 'a');
        org.jsoup.parser.Tag tag50 = tag39.getImplicitParent();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag50, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element53 = element52.lastElementSibling();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        java.lang.String str6 = document2.attr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document2.siblingNodes();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str6 = element5.tagName();
        org.jsoup.nodes.Element element8 = element5.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element5.siblingElements();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str3 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.siblingNodes();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.nodeName();
        java.lang.String str13 = element8.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.wrap("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        java.lang.String str15 = document2.toString();
        java.lang.String str16 = document2.toString();
        org.jsoup.select.Elements elements18 = document2.getElementsByAttribute("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = document2.previousSibling();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element4.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.nextElementSibling();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.parent();
        org.jsoup.nodes.Element element8 = document2.wrap("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        org.jsoup.nodes.Element element24 = element22.text("hi!");
        org.jsoup.select.Elements elements26 = element22.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet27 = element22.classNames();
        org.jsoup.nodes.Element element28 = element17.prependChild((org.jsoup.nodes.Node) element22);
        boolean boolean29 = element28.hasText();
        org.jsoup.nodes.Element element31 = element28.prepend("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element28.firstElementSibling();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element10 = element4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.previousElementSibling();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.attr("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.previousSibling();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = element7.siblingIndex();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        java.lang.String str11 = document2.data();
        org.jsoup.nodes.Element element13 = document2.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str14 = document2.data();
        org.jsoup.nodes.Node node16 = document2.childNode(0);
        boolean boolean18 = document2.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document2.siblingNodes();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Element element19 = element17.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.previousElementSibling();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.html("hi!");
        java.lang.String str30 = element14.html();
        org.jsoup.nodes.Attributes attributes31 = element14.attributes();
        org.jsoup.select.Elements elements34 = element14.getElementsByAttributeValueContaining("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = element14.nextSibling();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("hi!");
        org.jsoup.nodes.Element element19 = element11.getElementById("#root");
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexLessThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = element20.nextSibling();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.lastElementSibling();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValue("hi!#document", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document2.siblingElements();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element7.siblingIndex();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        org.jsoup.parser.Tag tag3 = tag1.getImplicitParent();
        java.lang.String str4 = tag1.getName();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element10 = document8.text("hi!");
        org.jsoup.nodes.Element element12 = element10.text("hi!");
        org.jsoup.nodes.Element element14 = element10.html("#root");
        org.jsoup.select.Elements elements16 = element10.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Attributes attributes17 = element10.attributes();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag1, "hi!#document", attributes17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element20.nextSibling();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document2.classNames((java.util.Set<java.lang.String>) strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element15.nextSibling();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.text("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        java.lang.String str8 = element4.attr("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element4.siblingElements();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        java.lang.String str12 = element11.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element11.nextSibling();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements9 = document2.parents();
        org.jsoup.parser.Tag tag10 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.firstElementSibling();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        org.jsoup.nodes.Element element13 = element11.prependText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Element element15 = document13.empty();
        java.lang.String str16 = element15.id();
        java.lang.String str17 = element15.text();
        org.jsoup.nodes.Element element19 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element6.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag25, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element27.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element27.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element27.childNodes();
        java.util.Set<java.lang.String> strSet37 = element27.classNames();
        org.jsoup.nodes.Element element38 = element19.classNames(strSet37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element19.text("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        java.lang.String str10 = element4.data();
        boolean boolean12 = element4.hasClass("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element4.wrap("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.select.Elements elements15 = element11.getElementsByAttributeValueNot("hi!", "body");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = element11.siblingElements();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        java.lang.String str10 = element4.attr("#root");
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document");
        org.jsoup.nodes.Element element14 = element12.append("hi!hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.childNodes();
        document17.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document17.prependText("#document");
        java.lang.String str24 = document17.attr("#document");
        org.jsoup.nodes.Element element26 = document17.prependText("");
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element28 = element12.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element30 = element12.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element12.previousElementSibling();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        java.lang.String str13 = element8.text();
        org.jsoup.parser.Tag tag14 = element8.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.firstElementSibling();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str9 = element4.outerHtml();
        java.lang.String str10 = element4.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.lastElementSibling();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Attributes attributes18 = element4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element4.previousElementSibling();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements11 = element9.children();
        org.jsoup.select.Elements elements13 = element9.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.lastElementSibling();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsByAttributeValueEnding("#root", "#document");
        org.jsoup.nodes.Element element13 = element4.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.nextSibling();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "hi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element10.appendElement("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str14 = element10.absUrl("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element10.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str12 = element4.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element4.wrap("<hi!>\n<#root>\n</#root>\n</hi!>");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str6 = document5.nodeName();
        org.jsoup.select.Elements elements7 = document5.getAllElements();
        java.lang.String str8 = document5.id();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
        org.jsoup.nodes.Element element13 = document5.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.childNodes();
        document16.setBaseUri("hi!");
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Element element21 = document11.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element26 = document24.text("hi!");
        org.jsoup.nodes.Element element28 = element26.text("hi!");
        org.jsoup.select.Elements elements30 = element26.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element32 = element26.appendText("hi!");
        org.jsoup.nodes.Element element35 = element26.attr("#root", "#document");
        org.jsoup.nodes.Element element37 = element26.appendElement("#root");
        org.jsoup.nodes.Element element38 = element37.empty();
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        org.jsoup.nodes.Element element41 = element38.appendElement("hi!");
        element21.replaceWith((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str46 = document45.nodeName();
        org.jsoup.select.Elements elements47 = document45.getAllElements();
        java.util.Set<java.lang.String> strSet48 = document45.classNames();
        org.jsoup.nodes.Element element49 = element21.classNames(strSet48);
        org.jsoup.nodes.Element element50 = document2.classNames(strSet48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = document2.nextElementSibling();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element41.firstElementSibling();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        java.lang.String str16 = element4.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element4.siblingNodes();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        java.lang.String str11 = document2.data();
        org.jsoup.nodes.Element element13 = document2.val("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element15 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.nextElementSibling();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexLessThan((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document2.nextElementSibling();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Attributes attributes16 = element4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element4.previousElementSibling();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.select.Elements elements16 = element15.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element15.siblingNodes();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.wrap("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.nextElementSibling();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements15 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element4.previousElementSibling();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.toggleClass("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = element4.siblingElements();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.getElementById("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element7.siblingNodes();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        org.jsoup.nodes.Element element17 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element15.attr("<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element15.nextSibling();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str15 = document14.nodeName();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.id();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        org.jsoup.nodes.Element element22 = document14.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements26 = element24.getElementsByIndexGreaterThan(10);
        boolean boolean27 = element11.equals((java.lang.Object) 10);
        element11.setBaseUri("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element11.nextElementSibling();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        document2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document2.childNodes();
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document2.siblingNodes();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        java.lang.String str10 = element9.val();
        boolean boolean12 = element9.hasClass("<hi!>\n</hi!>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element9.nextSibling();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        boolean boolean6 = document2.hasText();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.nodes.Element element15 = element11.prepend("");
        boolean boolean16 = document2.equals((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = document2.siblingElements();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document2.nextSibling();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueNot("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>", "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element8.nextSibling();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element4.attr("#document ", "hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.wrap("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Attributes attributes14 = element12.attributes();
        org.jsoup.nodes.Element element16 = element12.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element16.text("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements19 = element18.siblingElements();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = element41.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element45 = element41.append("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements46 = element45.children();
        org.jsoup.nodes.Element element48 = element45.removeClass("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = element48.nextElementSibling();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.prependText("#root");
        java.lang.String str9 = document2.toString();
        org.jsoup.nodes.Element element11 = document2.prepend("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = element11.appendText("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.firstElementSibling();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.nextElementSibling();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int5 = element4.siblingIndex();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.nodes.Attributes attributes9 = document2.attributes();
        document2.setBaseUri("#document");
        org.jsoup.select.Elements elements13 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element15 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element15.wrap("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        boolean boolean11 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        org.jsoup.select.Elements elements14 = element6.getElementsByClass("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element6.previousSibling();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element4.firstElementSibling();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        org.jsoup.nodes.Element element14 = element12.append("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element12.siblingIndex();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element13 = element11.append("");
        org.jsoup.nodes.Element element14 = element11.empty();
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes15);
        boolean boolean17 = element16.hasText();
        org.jsoup.nodes.Element element19 = element16.html("body");
        java.lang.String str20 = element19.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.lastElementSibling();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.val();
        org.jsoup.nodes.Attributes attributes6 = element4.attributes();
        org.jsoup.select.Elements elements8 = element4.getElementsByIndexEquals((int) ' ');
        java.lang.String str9 = element4.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element4.text("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document47.childNodes();
        document47.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document47.empty();
        org.jsoup.nodes.Element element53 = element51.append("");
        org.jsoup.nodes.Element element54 = element51.empty();
        java.util.Set<java.lang.String> strSet55 = element54.classNames();
        org.jsoup.nodes.Element element56 = document44.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element56.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element18.appendChild((org.jsoup.nodes.Node) element56);
        org.jsoup.select.Elements elements62 = element18.getElementsByIndexEquals((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node63 = element18.previousSibling();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element11.children();
        java.lang.String str15 = element11.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.previousSibling();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Node node4 = document2.removeAttr("<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = node4.previousSibling();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        org.jsoup.nodes.Element element13 = element11.appendText("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.previousElementSibling();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.getElementById("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element7.toString();
        org.jsoup.nodes.Element element12 = element7.appendText("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.nextSibling();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element8.toggleClass("#root");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element13.siblingNodes();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.nextSibling();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str8 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.siblingNodes();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueEnding("hi!#document", "#root");
        org.jsoup.parser.Tag tag11 = element6.tag();
        org.jsoup.nodes.Element element13 = element6.append("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.siblingNodes();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element3.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element3.previousElementSibling();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str7 = tag6.toString();
        boolean boolean8 = tag6.isBlock();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        document12.setBaseUri("hi!");
        org.jsoup.nodes.Element element16 = document12.empty();
        org.jsoup.nodes.Element element18 = element16.append("");
        org.jsoup.nodes.Element element19 = element16.empty();
        org.jsoup.nodes.Attributes attributes20 = element19.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag6, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes20);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag1, "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements23 = element22.siblingElements();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element4.removeClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.nextSibling();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.text("< > >");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Attributes attributes18 = element4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element4.wrap("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element14.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.String str21 = element14.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element14.text("#root");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        org.jsoup.select.Elements elements10 = element4.getElementsByAttribute("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element4.childNodes();
        org.jsoup.select.Elements elements13 = element4.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element4.append("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.firstElementSibling();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.prepend("");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.parser.Tag tag11 = element4.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element4.siblingNodes();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.className();
        org.jsoup.nodes.Element element8 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node10 = element8.removeAttr("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = element8.previousSibling();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.wrap("<html> <head> </head> <body> hi! </body> </html>");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element8.toggleClass("#root");
        org.jsoup.select.Elements elements15 = element8.getElementsByClass("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.previousElementSibling();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Element element17 = element13.empty();
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element17.siblingIndex();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document30.empty();
        org.jsoup.nodes.Element element36 = document30.appendText("hi!");
        org.jsoup.nodes.Attributes attributes37 = document30.attributes();
        document30.setBaseUri("#document");
        org.jsoup.select.Elements elements41 = document30.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element43 = document30.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements44 = document30.getAllElements();
        org.jsoup.nodes.Attributes attributes45 = document30.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "#root", attributes45);
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValue("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.util.Set<java.lang.String> strSet50 = element46.classNames();
        org.jsoup.nodes.Document document53 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = document53.childNodes();
        org.jsoup.nodes.Element element55 = document53.empty();
        java.lang.String str56 = element55.id();
        java.lang.String str57 = element55.text();
        org.jsoup.nodes.Element element59 = element55.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element46.appendChild((org.jsoup.nodes.Node) element59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element62 = element60.wrap("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Node node23 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document2.firstElementSibling();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet9 = element4.classNames();
        org.jsoup.nodes.Element element11 = element4.val("");
        element4.setBaseUri("#document");
        org.jsoup.nodes.Element element15 = element4.prependElement("hi!");
        java.lang.String str16 = element4.html();
        org.jsoup.nodes.Node node18 = element4.childNode((int) (short) 0);
        org.jsoup.nodes.Element element20 = element4.toggleClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element4.siblingElements();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element11.previousElementSibling();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element4.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.previousElementSibling();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        java.lang.String str12 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.nextSibling();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = element6.previousSibling();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        java.lang.String str11 = document2.outerHtml();
        org.jsoup.select.Elements elements13 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element17 = element15.addClass("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element15.siblingNodes();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element13.prependText("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element21 = element19.html("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element19.previousSibling();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Element element9 = element7.toggleClass("");
        org.jsoup.nodes.Element element11 = element7.append("hi!");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element11.nextElementSibling();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.text("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = element4.siblingElements();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        java.lang.String str7 = element4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        java.lang.String str9 = element4.toString();
        org.jsoup.nodes.Element element11 = element4.prependElement("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element4.siblingIndex();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag20, "hi!", attributes32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.nodes.Attributes attributes44 = document37.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, "#document", attributes44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = element52.append("");
        org.jsoup.parser.Tag tag55 = element52.tag();
        boolean boolean56 = tag20.canContain(tag55);
        boolean boolean57 = tag20.preserveWhitespace();
        org.jsoup.parser.Tag tag58 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements61 = element60.getAllElements();
        org.jsoup.nodes.Element element63 = element60.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements65 = element60.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element66 = element13.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.nodes.Element element68 = element13.addClass("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList69 = element68.siblingNodes();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Element element8 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.getElementById("hi!");
        org.jsoup.nodes.Element element15 = element8.prepend(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element8.previousSibling();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element16.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str20 = element19.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element19.lastElementSibling();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Element element16 = element4.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.firstElementSibling();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.getElementById("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element4.wrap("<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        java.lang.String str9 = element8.baseUri();
        java.lang.String str10 = element8.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element8.nextElementSibling();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.parser.Tag tag13 = element10.tag();
        java.lang.String str14 = element10.tagName();
        java.lang.String str15 = element10.outerHtml();
        org.jsoup.select.Elements elements17 = element10.getElementsByTag("#root");
        org.jsoup.nodes.Element element18 = element3.prependChild((org.jsoup.nodes.Node) element10);
        java.lang.String str19 = element3.text();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.select.Elements elements24 = document22.getAllElements();
        java.lang.String str25 = document22.id();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Element element30 = document22.appendChild((org.jsoup.nodes.Node) document28);
        java.lang.String str32 = document22.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element33 = element3.appendChild((org.jsoup.nodes.Node) document22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element33.wrap("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element23 = document21.text("hi!");
        org.jsoup.nodes.Element element25 = element23.text("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.nodes.Element element32 = element23.attr("#root", "#document");
        org.jsoup.nodes.Element element34 = element23.appendElement("#root");
        org.jsoup.nodes.Element element35 = element34.empty();
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        org.jsoup.nodes.Element element38 = element35.appendElement("hi!");
        element18.replaceWith((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element41 = element18.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = document47.childNodes();
        document47.setBaseUri("hi!");
        org.jsoup.nodes.Element element51 = document47.empty();
        org.jsoup.nodes.Element element53 = element51.append("");
        org.jsoup.nodes.Element element54 = element51.empty();
        java.util.Set<java.lang.String> strSet55 = element54.classNames();
        org.jsoup.nodes.Element element56 = document44.classNames(strSet55);
        org.jsoup.nodes.Element element59 = element56.attr("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = element18.appendChild((org.jsoup.nodes.Node) element56);
        org.jsoup.select.Elements elements62 = element18.getElementsByIndexEquals((int) 'a');
        org.jsoup.nodes.Element element64 = element18.removeClass("#document ");
        org.jsoup.nodes.Document document67 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element69 = document67.text("hi!");
        org.jsoup.nodes.Element element71 = element69.text("hi!");
        org.jsoup.nodes.Element element72 = element71.empty();
        java.lang.String str73 = element72.tagName();
        org.jsoup.select.Elements elements74 = element72.children();
        org.jsoup.select.Elements elements76 = element72.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Element element77 = element18.appendChild((org.jsoup.nodes.Node) element72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element78 = element77.previousElementSibling();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        java.lang.String str17 = element16.toString();
        boolean boolean18 = element16.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.previousElementSibling();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        java.lang.String str13 = element12.baseUri();
        boolean boolean14 = element12.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element12.siblingIndex();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
        document7.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document7.child((int) (short) 0);
        org.jsoup.nodes.Element element13 = document7.empty();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "");
        java.lang.String[] strArray20 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element17.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element25 = document2.classNames((java.util.Set<java.lang.String>) strSet21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = document2.siblingIndex();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element4.removeClass("#root");
        org.jsoup.nodes.Element element22 = element21.parent();
        org.jsoup.nodes.Element element24 = element21.addClass("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element21.append("#document ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element21.nextElementSibling();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element35 = element33.prependText("hi!");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexEquals((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element35.firstElementSibling();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        java.lang.String str10 = tag3.getName();
        boolean boolean11 = tag3.isInline();
        java.lang.String str12 = tag3.getName();
        boolean boolean13 = tag3.isEmpty();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element23 = element19.removeClass("hi!");
        org.jsoup.select.Elements elements25 = element23.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element27 = element23.prepend("body");
        java.lang.String str28 = element27.baseUri();
        org.jsoup.nodes.Attributes attributes29 = element27.attributes();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag3, "<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>", attributes29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements31 = element30.siblingElements();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Element element11 = document2.prependText("");
        org.jsoup.nodes.Element element12 = element11.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.previousSibling();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByClass("hi!");
        org.jsoup.select.Elements elements11 = element7.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element13 = element7.removeClass("");
        java.lang.Integer int14 = element7.elementSiblingIndex();
        org.jsoup.parser.Tag tag15 = element7.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element7.previousElementSibling();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("hi!#document");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document9.attributes();
        org.jsoup.parser.Tag tag12 = document9.tag();
        java.lang.String str13 = document9.id();
        org.jsoup.nodes.Element element15 = document9.addClass("");
        org.jsoup.nodes.Element element17 = document9.removeClass("html");
        org.jsoup.nodes.Element element18 = document2.appendChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element9.getElementsByIndexLessThan((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element9.siblingIndex();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        java.lang.String str12 = element8.className();
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element16 = element8.prepend("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element8.previousSibling();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        org.jsoup.nodes.Element element9 = element4.addClass("");
        org.jsoup.parser.Tag tag10 = element4.tag();
        org.jsoup.nodes.Element element12 = element4.append("body");
        element4.setBaseUri("#document");
        java.lang.String str15 = element4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int16 = element4.siblingIndex();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        org.jsoup.nodes.Element element7 = document2.text("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.previousElementSibling();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.lastElementSibling();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.nodes.Element element9 = element7.prependElement("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element7.nextSibling();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        java.lang.String str5 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.nextSibling();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.siblingNodes();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements19 = element4.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element21 = element4.removeClass("#root");
        java.lang.String str22 = element21.val();
        org.jsoup.nodes.Element element24 = element21.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element21.lastElementSibling();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        boolean boolean11 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        org.jsoup.nodes.Element element14 = element6.prependText("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element6.siblingNodes();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Element element11 = document2.removeClass("hi!hi!");
        java.lang.String str12 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = document2.siblingElements();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.appendElement("#root");
        org.jsoup.select.Elements elements16 = element4.children();
        java.lang.String str17 = element4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element4.firstElementSibling();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        java.lang.String str7 = element6.html();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueEnding("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>", "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!", "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element6.wrap("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag1.canContainBlock();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.nodes.Element element10 = element8.toggleClass("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element10.siblingElements();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet16 = element11.classNames();
        java.lang.String str17 = element11.data();
        org.jsoup.select.Elements elements18 = element11.parents();
        org.jsoup.nodes.Element element19 = element6.prependChild((org.jsoup.nodes.Node) element11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.nextElementSibling();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        boolean boolean7 = tag1.isBlock();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "#root");
        boolean boolean10 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
        org.jsoup.nodes.Attributes attributes16 = document14.attributes();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "#root", attributes16);
        java.lang.String str18 = element17.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.firstElementSibling();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        java.lang.String str27 = element26.html();
        org.jsoup.nodes.Element element29 = element26.appendText("<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements30 = element29.siblingElements();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements6 = element4.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element4.siblingNodes();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element3.prepend("#document");
        java.lang.String str12 = element3.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element3.nextSibling();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        java.lang.String str11 = document2.toString();
        java.lang.String str12 = document2.toString();
        org.jsoup.nodes.Element element14 = document2.appendText("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = element14.siblingElements();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = document2.prepend("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element13.siblingElements();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag20, "hi!", attributes32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.nodes.Attributes attributes44 = document37.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, "#document", attributes44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = element52.append("");
        org.jsoup.parser.Tag tag55 = element52.tag();
        boolean boolean56 = tag20.canContain(tag55);
        boolean boolean57 = tag20.preserveWhitespace();
        org.jsoup.parser.Tag tag58 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements61 = element60.getAllElements();
        org.jsoup.nodes.Element element63 = element60.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements65 = element60.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element66 = element13.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.select.Elements elements68 = element13.getElementsByIndexLessThan((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element69 = element13.lastElementSibling();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = element4.previousSibling();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        org.jsoup.nodes.Element element8 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Element element8 = element4.removeClass("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element8.prepend("body");
        org.jsoup.select.Elements elements14 = element8.select("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element8.nextElementSibling();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("#root");
        org.jsoup.nodes.Element element8 = element4.appendText("hi!");
        org.jsoup.nodes.Element element10 = element8.removeClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str11 = element10.nodeName();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str14 = tag13.toString();
        org.jsoup.parser.Tag tag15 = tag13.getImplicitParent();
        boolean boolean16 = tag15.preserveWhitespace();
        boolean boolean17 = tag15.isInline();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element25 = document20.prependText("#document");
        boolean boolean26 = tag15.equals((java.lang.Object) "#document");
        boolean boolean27 = tag15.isData();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.childNodes();
        org.jsoup.nodes.Element element33 = document31.empty();
        java.lang.String str34 = element33.val();
        org.jsoup.nodes.Attributes attributes35 = element33.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag15, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", attributes35);
        boolean boolean37 = element10.equals((java.lang.Object) attributes35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element10.lastElementSibling();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str11 = element10.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.lastElementSibling();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.nodes.Element element16 = element14.val("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int17 = element14.siblingIndex();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        java.lang.String str10 = element4.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element4.val("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexLessThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = element12.previousSibling();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.firstElementSibling();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str9 = tag8.toString();
        org.jsoup.parser.Tag tag10 = tag8.getImplicitParent();
        boolean boolean11 = tag6.equals((java.lang.Object) tag8);
        boolean boolean12 = tag6.isBlock();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag6, "#root");
        boolean boolean15 = tag6.isInline();
        boolean boolean16 = tag1.isValidParent(tag6);
        org.jsoup.parser.Tag tag17 = tag6.getImplicitParent();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag6, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str20 = element19.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element19.siblingElements();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "hi!#document");
        boolean boolean10 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.previousElementSibling();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByClass("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        org.jsoup.select.Elements elements11 = document9.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element12 = element4.prependChild((org.jsoup.nodes.Node) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element4.siblingNodes();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.prepend("<html>\n<head>\n</head>\n<body>\n hi!#document\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Node node23 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.parser.Tag tag33 = element30.tag();
        java.lang.String str35 = element30.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements37 = element30.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Element element38 = document2.appendChild((org.jsoup.nodes.Node) element30);
        java.lang.Integer int39 = document2.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = document2.firstElementSibling();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = element17.attr("#root", "#document");
        org.jsoup.nodes.Element element22 = element17.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element17.text(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        boolean boolean9 = document2.isBlock();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.select.Elements elements14 = document12.getAllElements();
        java.lang.String str15 = document12.id();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        org.jsoup.nodes.Element element20 = document12.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document23.childNodes();
        document23.setBaseUri("hi!");
        org.jsoup.nodes.Element element27 = document23.empty();
        org.jsoup.nodes.Element element28 = document18.appendChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element33 = document31.text("hi!");
        org.jsoup.nodes.Element element35 = element33.text("hi!");
        org.jsoup.select.Elements elements37 = element33.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element39 = element33.appendText("hi!");
        org.jsoup.nodes.Element element42 = element33.attr("#root", "#document");
        org.jsoup.nodes.Element element44 = element33.appendElement("#root");
        org.jsoup.nodes.Element element45 = element44.empty();
        org.jsoup.nodes.Attributes attributes46 = element45.attributes();
        org.jsoup.nodes.Element element48 = element45.appendElement("hi!");
        element28.replaceWith((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element51 = element28.append("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#root");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>", "hi!hi!", "#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "#root", "<hi!>\n<#root>\n</#root>\n</hi!>", "<hi!>\n<#root>\n</#root>\n</hi!>", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.jsoup.nodes.Element element67 = document54.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.nodes.Element element68 = element28.classNames((java.util.Set<java.lang.String>) strSet65);
        org.jsoup.parser.Tag tag69 = element28.tag();
        org.jsoup.parser.Tag tag70 = tag69.getImplicitParent();
        boolean boolean71 = document2.equals((java.lang.Object) tag69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int72 = document2.siblingIndex();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.nodes.Element element8 = document2.html("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan(1);
        org.jsoup.select.Elements elements11 = document2.getAllElements();
        org.jsoup.nodes.Element element13 = document2.toggleClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document2.siblingNodes();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.isBlock();
        boolean boolean7 = tag3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag3, "#document");
        org.jsoup.select.Elements elements11 = element9.select("#document");
        java.lang.String str13 = element9.attr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element9.nextSibling();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        java.lang.String str11 = element9.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = element9.siblingElements();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("");
        org.jsoup.nodes.Node node11 = document2.removeAttr("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node11.previousSibling();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<hi!>\n<#root>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.nodes.Element element16 = element14.val("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element14.nextSibling();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        org.jsoup.nodes.Element element17 = element15.addClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element15.previousElementSibling();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        org.jsoup.select.Elements elements10 = element4.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element12 = element4.val("#root");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexEquals((int) '4');
        java.lang.String str15 = element12.tagName();
        java.lang.String str16 = element12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element12.nextElementSibling();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        java.lang.String str11 = element6.text();
        java.lang.String str12 = element6.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element6.previousSibling();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        java.lang.String str8 = element4.absUrl("#root");
        java.lang.String str10 = element4.attr("#root");
        org.jsoup.nodes.Element element12 = element4.toggleClass("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.wrap("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "#document");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.data();
        org.jsoup.select.Elements elements10 = element6.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        org.jsoup.nodes.Element element15 = document13.empty();
        java.lang.String str16 = element15.id();
        java.lang.String str17 = element15.text();
        org.jsoup.nodes.Element element19 = element15.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = element6.prependChild((org.jsoup.nodes.Node) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = element23.nextSibling();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = document5.appendText("hi!");
        org.jsoup.nodes.Attributes attributes12 = document5.attributes();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValue("hi!#document\n<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html><#root class=\"\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>", "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element13.nextSibling();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexLessThan(1);
        org.jsoup.nodes.Element element18 = element12.append("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element17 = document15.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element18 = element9.prependChild((org.jsoup.nodes.Node) element17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str3 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.lastElementSibling();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.toggleClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.className();
        org.jsoup.nodes.Element element8 = document2.html("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Node node10 = element8.removeAttr("#document");
        org.jsoup.nodes.Element element11 = element8.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element11.text("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        boolean boolean5 = element4.isBlock();
        boolean boolean6 = element4.hasText();
        org.jsoup.parser.Tag tag7 = element4.tag();
        element4.setBaseUri("#root");
        org.jsoup.nodes.Element element11 = element4.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element4.appendText("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("hi!#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        boolean boolean19 = element13.hasAttr("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element13.prepend("hi!#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element21.siblingNodes();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        java.lang.String str6 = element4.text();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element11 = document9.text("hi!");
        org.jsoup.nodes.Element element13 = element11.text("hi!");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element17 = element11.appendText("hi!");
        org.jsoup.nodes.Element element19 = element11.getElementById("#root");
        org.jsoup.nodes.Element element20 = element4.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element22 = element20.val("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.html("\n<hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = element22.nextSibling();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.firstElementSibling();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        org.jsoup.nodes.Element element11 = element6.toggleClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.removeClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element16 = element13.attr("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.previousSibling();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        document8.setBaseUri("hi!");
        org.jsoup.nodes.Element element12 = document8.empty();
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element14.append("");
        java.lang.String str18 = element14.className();
        java.lang.String str19 = element14.text();
        org.jsoup.parser.Tag tag20 = element14.tag();
        org.jsoup.nodes.Element element21 = element4.prependChild((org.jsoup.nodes.Node) element14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element4.previousSibling();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "body");
        org.jsoup.nodes.Element element3 = document2.empty();
        org.jsoup.nodes.Element element5 = element3.html("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        boolean boolean7 = element3.hasClass("hi!#document");
        java.lang.Integer int8 = element3.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element3.siblingNodes();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        boolean boolean11 = element6.hasText();
        org.jsoup.select.Elements elements12 = element6.getAllElements();
        org.jsoup.select.Elements elements14 = element6.getElementsByClass("#document hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int15 = element6.siblingIndex();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element5 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int6 = element5.siblingIndex();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.siblingNodes();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.select.Elements elements17 = document12.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element19 = document12.appendText("hi!");
        org.jsoup.nodes.Element element20 = element9.prependChild((org.jsoup.nodes.Node) element19);
        java.lang.Integer int21 = element20.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.previousElementSibling();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str4 = tag3.toString();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        boolean boolean6 = tag1.equals((java.lang.Object) tag3);
        java.lang.String str7 = tag1.toString();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag9.isValidParent(tag11);
        boolean boolean13 = tag1.canContain(tag11);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = document20.childNodes();
        document20.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = document20.empty();
        org.jsoup.nodes.Element element26 = document20.appendText("hi!");
        org.jsoup.nodes.Attributes attributes27 = document20.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag15, "hi!", attributes27);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = document32.childNodes();
        document32.setBaseUri("hi!");
        org.jsoup.nodes.Element element36 = document32.empty();
        org.jsoup.nodes.Element element38 = document32.appendText("hi!");
        org.jsoup.nodes.Attributes attributes39 = document32.attributes();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag15, "#document", attributes39);
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element45 = document43.text("hi!");
        java.lang.String str46 = document43.outerHtml();
        java.lang.String str47 = document43.data();
        boolean boolean48 = tag15.equals((java.lang.Object) document43);
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element53 = document51.text("hi!");
        org.jsoup.nodes.Element element55 = element53.text("hi!");
        org.jsoup.nodes.Element element57 = element53.prepend("");
        boolean boolean58 = tag15.equals((java.lang.Object) "");
        boolean boolean59 = tag11.isValidParent(tag15);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag11, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!<#root>\n</#root>");
        org.jsoup.select.Elements elements64 = element61.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root><#root class=\"\">\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        org.jsoup.nodes.Element element65 = element61.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList66 = element65.siblingNodes();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((-1));
        boolean boolean16 = element13.hasText();
        org.jsoup.nodes.Node node18 = element13.removeAttr("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.childNodes();
        document25.setBaseUri("hi!");
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.nodes.Element element31 = document25.appendText("hi!");
        org.jsoup.nodes.Attributes attributes32 = document25.attributes();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag20, "hi!", attributes32);
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = document37.childNodes();
        document37.setBaseUri("hi!");
        org.jsoup.nodes.Element element41 = document37.empty();
        org.jsoup.nodes.Element element43 = document37.appendText("hi!");
        org.jsoup.nodes.Attributes attributes44 = document37.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, "#document", attributes44);
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        document48.setBaseUri("hi!");
        org.jsoup.nodes.Element element52 = document48.empty();
        org.jsoup.nodes.Element element54 = element52.append("");
        org.jsoup.parser.Tag tag55 = element52.tag();
        boolean boolean56 = tag20.canContain(tag55);
        boolean boolean57 = tag20.preserveWhitespace();
        org.jsoup.parser.Tag tag58 = tag20.getImplicitParent();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements61 = element60.getAllElements();
        org.jsoup.nodes.Element element63 = element60.appendElement("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements65 = element60.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element66 = element13.prependChild((org.jsoup.nodes.Node) element60);
        org.jsoup.select.Elements elements68 = element13.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element70 = element13.html(" <html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements71 = element70.siblingElements();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        java.lang.String str11 = element8.absUrl("<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.text("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.prependText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = document2.attributes();
        org.jsoup.parser.Tag tag5 = document2.tag();
        java.lang.String str6 = document2.nodeName();
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str12 = tag11.toString();
        org.jsoup.parser.Tag tag13 = tag11.getImplicitParent();
        boolean boolean14 = tag9.equals((java.lang.Object) tag11);
        java.lang.String str15 = tag9.toString();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag17.isValidParent(tag19);
        boolean boolean21 = tag9.canContain(tag19);
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        document28.setBaseUri("hi!");
        org.jsoup.nodes.Element element32 = document28.empty();
        org.jsoup.nodes.Element element34 = document28.appendText("hi!");
        org.jsoup.nodes.Attributes attributes35 = document28.attributes();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag23, "hi!", attributes35);
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = document40.childNodes();
        document40.setBaseUri("hi!");
        org.jsoup.nodes.Element element44 = document40.empty();
        org.jsoup.nodes.Element element46 = document40.appendText("hi!");
        org.jsoup.nodes.Attributes attributes47 = document40.attributes();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag23, "#document", attributes47);
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element53 = document51.text("hi!");
        java.lang.String str54 = document51.outerHtml();
        java.lang.String str55 = document51.data();
        boolean boolean56 = tag23.equals((java.lang.Object) document51);
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element61 = document59.text("hi!");
        org.jsoup.nodes.Element element63 = element61.text("hi!");
        org.jsoup.nodes.Element element65 = element61.prepend("");
        boolean boolean66 = tag23.equals((java.lang.Object) "");
        boolean boolean67 = tag19.isValidParent(tag23);
        boolean boolean68 = tag7.isValidParent(tag23);
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag7, "<hi!>\n<#root>\n</#root><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html><#root>\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element72 = element70.prependElement("<hi!>\n</hi!><#root>\n<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements75 = element70.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;&lt;#root&gt; &lt;/#root&gt;&lt;#root class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>&lt;hi!&gt; &lt;#root&gt; &lt;/#root&gt; &lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int76 = element70.siblingIndex();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.addClass("body");
        java.lang.String str5 = element4.className();
        java.lang.String str6 = element4.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = element4.siblingIndex();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        boolean boolean18 = element14.hasClass("#document");
        boolean boolean19 = element14.hasText();
        org.jsoup.nodes.Element element21 = element14.text("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element24 = element14.text("");
        element24.remove();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int26 = element24.siblingIndex();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.select.Elements elements17 = document2.parents();
        java.lang.String str19 = document2.absUrl("\n<hi!>\n</hi!>");
        java.lang.String str20 = document2.val();
        java.lang.String str21 = document2.nodeName();
        org.jsoup.parser.Tag tag22 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = document2.firstElementSibling();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        org.jsoup.nodes.Element element11 = element9.text("hi!");
        org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = element9.appendText("hi!");
        org.jsoup.nodes.Element element17 = element15.text("");
        boolean boolean18 = tag1.equals((java.lang.Object) element17);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        java.lang.String str6 = document2.val();
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("#document");
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element12 = document2.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.lastElementSibling();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Node node11 = document2.removeAttr("<hi!>\n<#root>\n</#root>\n</hi!>");
        org.jsoup.nodes.Element element13 = document2.prepend("hi!#document");
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = document2.toggleClass("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element17.nextSibling();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag1, "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = element3.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element3.getElementsByAttributeValueNot("hi!", "<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        org.jsoup.nodes.Element element14 = element3.addClass("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("hi!#document<#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.firstElementSibling();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "hi!hi!");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueContaining("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements9 = document2.siblingElements();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        java.lang.String str22 = document2.tagName();
        java.util.Set<java.lang.String> strSet23 = document2.classNames();
        java.lang.String str24 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = document2.nextSibling();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.isInline();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document42.childNodes();
        org.jsoup.nodes.Element element44 = document42.empty();
        org.jsoup.select.Elements elements46 = document42.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements48 = document42.getElementsByIndexEquals((int) 'a');
        boolean boolean49 = tag39.equals((java.lang.Object) 'a');
        org.jsoup.parser.Tag tag50 = tag39.getImplicitParent();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag50, "");
        boolean boolean53 = tag50.canContainBlock();
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList57 = document56.childNodes();
        org.jsoup.nodes.Element element58 = document56.empty();
        java.lang.String str59 = element58.id();
        org.jsoup.parser.Tag tag60 = element58.tag();
        org.jsoup.parser.Tag tag61 = tag60.getImplicitParent();
        boolean boolean62 = tag61.isBlock();
        boolean boolean63 = tag50.isValidParent(tag61);
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag50, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>html");
        org.jsoup.nodes.Element element67 = element65.prependElement("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element68 = element65.previousElementSibling();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!#document", "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element5 = document2.attr("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.firstElementSibling();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        boolean boolean15 = tag1.canContainBlock();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag1, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.previousElementSibling();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        org.jsoup.nodes.Element element29 = element14.removeClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.Integer int30 = element29.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element29.nextElementSibling();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str5 = tag4.toString();
        org.jsoup.parser.Tag tag6 = tag4.getImplicitParent();
        boolean boolean7 = tag6.preserveWhitespace();
        boolean boolean8 = tag6.isInline();
        java.lang.String str9 = tag6.toString();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "<hi!>\n<#root>\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>\n</hi!>");
        boolean boolean12 = tag1.isValidParent(tag6);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str18 = tag17.toString();
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        boolean boolean20 = tag15.equals((java.lang.Object) tag17);
        boolean boolean21 = tag15.isBlock();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag15, "#root");
        boolean boolean24 = tag15.preserveWhitespace();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = document28.childNodes();
        org.jsoup.nodes.Attributes attributes30 = document28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag15, "#root", attributes30);
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag33.isValidParent(tag35);
        boolean boolean37 = tag35.isBlock();
        boolean boolean39 = tag35.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str43 = document42.nodeName();
        org.jsoup.select.Elements elements44 = document42.getAllElements();
        java.lang.String str45 = document42.id();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = document48.childNodes();
        org.jsoup.nodes.Element element50 = document42.appendChild((org.jsoup.nodes.Node) document48);
        org.jsoup.select.Elements elements53 = document48.getElementsByAttributeValueStarting("hi!", "#document");
        org.jsoup.nodes.Element element55 = document48.addClass("hi!hi!");
        boolean boolean56 = tag35.equals((java.lang.Object) document48);
        boolean boolean57 = tag35.isInline();
        boolean boolean58 = tag15.canContain(tag35);
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList63 = document62.childNodes();
        document62.setBaseUri("hi!");
        org.jsoup.nodes.Element element66 = document62.empty();
        org.jsoup.nodes.Attributes attributes67 = document62.attributes();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag35, "#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes67);
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag6, "&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!", attributes67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int70 = element69.siblingIndex();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element19 = document17.text("hi!");
        org.jsoup.nodes.Element element21 = element19.text("hi!");
        org.jsoup.select.Elements elements23 = element19.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet24 = element19.classNames();
        java.lang.String str25 = element19.data();
        org.jsoup.select.Elements elements26 = element19.parents();
        boolean boolean27 = element14.equals((java.lang.Object) element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int28 = element19.siblingIndex();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.child((int) (short) 0);
        java.lang.String str9 = document2.attr("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodes();
        org.jsoup.nodes.Element element14 = document12.empty();
        java.lang.String str15 = element14.val();
        org.jsoup.nodes.Element element16 = document2.prependChild((org.jsoup.nodes.Node) element14);
        java.lang.String str17 = element16.toString();
        boolean boolean18 = element16.isBlock();
        org.jsoup.nodes.Element element20 = element16.removeClass("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.previousElementSibling();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element8.append("");
        org.jsoup.nodes.Element element13 = element8.toggleClass("#root");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element13.nextElementSibling();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element6.hasClass("hi!");
        java.lang.String str9 = element6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element6.previousSibling();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        org.jsoup.nodes.Element element11 = element9.text("hi!");
        org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = element9.appendText("hi!");
        org.jsoup.nodes.Element element17 = element15.text("");
        boolean boolean18 = tag1.equals((java.lang.Object) element17);
        org.jsoup.select.Elements elements19 = element17.parents();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = document26.appendText("hi!");
        org.jsoup.nodes.Attributes attributes33 = document26.attributes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag21, "hi!", attributes33);
        boolean boolean35 = tag21.canContainBlock();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag21, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = element17.appendChild((org.jsoup.nodes.Node) element37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements39 = element38.siblingElements();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        org.jsoup.nodes.Element element15 = element4.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.previousElementSibling();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prependText("#document");
        org.jsoup.nodes.Element element9 = element7.prependElement("#document");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element14 = document12.text("hi!");
        org.jsoup.nodes.Element element16 = element14.text("hi!");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element20 = element14.appendText("hi!");
        org.jsoup.nodes.Element element23 = element14.attr("#root", "#document");
        org.jsoup.select.Elements elements25 = element14.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element26 = element7.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element28 = element26.appendText("hi!hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element28.siblingNodes();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document30.childNodes();
        document30.setBaseUri("hi!");
        org.jsoup.nodes.Element element34 = document30.empty();
        org.jsoup.nodes.Element element36 = document30.appendText("hi!");
        org.jsoup.nodes.Attributes attributes37 = document30.attributes();
        document30.setBaseUri("#document");
        org.jsoup.select.Elements elements41 = document30.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element43 = document30.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements44 = document30.getAllElements();
        org.jsoup.nodes.Attributes attributes45 = document30.attributes();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag1, "#root", attributes45);
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValue("<hi! class=\"#document \" #document=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n#root#document\n</hi!>", "#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements50 = element46.siblingElements();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Node node15 = element4.childNode((int) (byte) 1);
        org.jsoup.nodes.Element element17 = element4.append("");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element22 = document20.text("hi!");
        boolean boolean23 = element22.isBlock();
        org.jsoup.parser.Tag tag24 = element22.tag();
        java.lang.String str25 = tag24.toString();
        java.lang.String str26 = tag24.toString();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element32 = document30.text("hi!");
        org.jsoup.nodes.Attributes attributes33 = element32.attributes();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag24, "hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", attributes33);
        org.jsoup.nodes.Element element35 = element4.prependChild((org.jsoup.nodes.Node) element34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element4.lastElementSibling();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Node node23 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document2.val("html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = element25.nextSibling();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        java.lang.String str43 = element41.tagName();
        java.lang.String str44 = element41.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element41.lastElementSibling();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Element element22 = element20.text("hi!");
        org.jsoup.select.Elements elements24 = element20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element26 = element20.appendText("hi!");
        org.jsoup.nodes.Element element29 = element20.attr("#root", "#document");
        org.jsoup.nodes.Node node31 = element20.childNode((int) (byte) 1);
        org.jsoup.select.Elements elements32 = element20.parents();
        org.jsoup.nodes.Element element33 = element14.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element35 = element33.val("hi!hi!");
        org.jsoup.nodes.Element element37 = element33.html("");
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int40 = element37.siblingIndex();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        boolean boolean8 = element4.hasClass("#document");
        boolean boolean9 = element4.hasText();
        org.jsoup.select.Elements elements12 = element4.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "hi!");
        java.lang.String str13 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element4.siblingElements();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        java.lang.String str12 = document2.absUrl("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        org.jsoup.nodes.Element element17 = element14.prepend("#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        java.lang.String str18 = element17.tagName();
        java.lang.String str19 = element17.baseUri();
        org.jsoup.select.Elements elements20 = element17.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element17.wrap("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.nodes.Element element12 = element9.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element9.previousSibling();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Element element16 = element14.removeClass("< > >");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element16.nextSibling();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "hi!#document");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.addClass("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element8.wrap("\n<html>\n</html>");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element13 = element4.attr("#root", "#document");
        org.jsoup.nodes.Element element15 = element4.removeClass("#document");
        boolean boolean16 = element4.hasText();
        boolean boolean17 = element4.hasText();
        org.jsoup.nodes.Element element19 = element4.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = element4.previousSibling();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "html");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.addClass("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.getElementById("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element7.toString();
        org.jsoup.nodes.Element element12 = element7.addClass("#root\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = element7.attr("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html><#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element7.firstElementSibling();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodes();
        document5.setBaseUri("hi!");
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.nodes.Element element11 = element9.append("");
        org.jsoup.nodes.Element element12 = element9.empty();
        java.util.Set<java.lang.String> strSet13 = element12.classNames();
        org.jsoup.nodes.Element element14 = document2.classNames(strSet13);
        org.jsoup.nodes.Element element15 = element14.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.previousElementSibling();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.val("#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttribute("<#document>\n</#document>#document\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html><#root #root=\"#document\">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.firstElementSibling();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.nodeName();
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        java.lang.String str10 = element9.baseUri();
        org.jsoup.nodes.Element element12 = element9.getElementById("<html>\n<head>\n</head>\n<body>\n #root &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = element9.siblingIndex();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        org.jsoup.nodes.Element element14 = element12.append("");
        java.lang.Integer int15 = element14.elementSiblingIndex();
        org.jsoup.select.Elements elements17 = element14.getElementsByIndexGreaterThan((int) (byte) 10);
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan((int) (short) 1);
        java.lang.String str20 = element14.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element14.nextElementSibling();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.lastElementSibling();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<hi!>\n<#root>\n</#root>\n</hi!>", "body");
        java.lang.String str3 = document2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = document2.siblingIndex();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.parser.Tag tag9 = element6.tag();
        java.lang.String str10 = element6.tagName();
        org.jsoup.nodes.Element element11 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element12 = document2.appendText("#document");
        boolean boolean14 = document2.hasClass("hi!");
        java.lang.String str15 = document2.toString();
        java.lang.String str16 = document2.toString();
        java.lang.String str17 = document2.html();
        java.lang.String str18 = document2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document2.nextElementSibling();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag1.isValidParent(tag3);
        boolean boolean5 = tag3.canContainBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodes();
        document10.setBaseUri("hi!");
        org.jsoup.nodes.Element element14 = document10.empty();
        org.jsoup.nodes.Element element16 = element14.append("");
        java.util.Set<java.lang.String> strSet17 = element14.classNames();
        org.jsoup.nodes.Element element18 = element7.classNames(strSet17);
        org.jsoup.nodes.Element element20 = element18.appendText("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = element18.siblingNodes();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = document2.appendText("hi!");
        org.jsoup.select.Elements elements10 = document2.getElementsByAttribute("#document");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "#document", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = element14.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document2.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Node node23 = document2.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = document26.childNodes();
        document26.setBaseUri("hi!");
        org.jsoup.nodes.Element element30 = document26.empty();
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.parser.Tag tag33 = element30.tag();
        java.lang.String str35 = element30.attr("hi!\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements37 = element30.getElementsByAttribute("hi!hi!");
        org.jsoup.nodes.Element element38 = document2.appendChild((org.jsoup.nodes.Node) element30);
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element43 = document41.text("hi!");
        org.jsoup.nodes.Element element45 = element43.text("hi!");
        org.jsoup.select.Elements elements47 = element43.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element49 = element43.appendText("hi!");
        org.jsoup.nodes.Element element52 = element43.attr("#root", "#document");
        org.jsoup.nodes.Element element54 = element43.removeClass("#document");
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element59 = document57.text("hi!");
        org.jsoup.nodes.Element element61 = element59.text("hi!");
        org.jsoup.select.Elements elements63 = element59.getElementsByAttribute("hi!");
        java.util.Set<java.lang.String> strSet64 = element59.classNames();
        org.jsoup.nodes.Element element65 = element43.classNames(strSet64);
        org.jsoup.nodes.Element element66 = document2.classNames(strSet64);
        org.jsoup.select.Elements elements69 = element66.getElementsByAttributeValue("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;#root");
        org.jsoup.select.Elements elements71 = element66.getElementsByAttribute("&lt;&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt; &lt;/&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element73 = element66.text(" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.jsoup.nodes.Element element8 = element6.append("");
        org.jsoup.nodes.Element element9 = element6.empty();
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValueContaining("hi!", "#root");
        org.jsoup.nodes.Attributes attributes14 = element9.attributes();
        org.jsoup.nodes.Element element16 = element9.appendText("#document");
        org.jsoup.nodes.Element element18 = element16.appendText("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("#document", "body");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element4.firstElementSibling();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.id();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
        org.jsoup.nodes.Element element10 = document2.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
        document13.setBaseUri("hi!");
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document8.appendChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Elements elements19 = element17.children();
        org.jsoup.select.Elements elements21 = element17.getElementsByIndexGreaterThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element17.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.childNodes();
        document6.setBaseUri("hi!");
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Element element12 = document6.appendText("hi!");
        org.jsoup.nodes.Attributes attributes13 = document6.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "hi!", attributes13);
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
        document18.setBaseUri("hi!");
        org.jsoup.nodes.Element element22 = document18.empty();
        org.jsoup.nodes.Element element24 = document18.appendText("hi!");
        org.jsoup.nodes.Attributes attributes25 = document18.attributes();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag1, "#document", attributes25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document29.childNodes();
        document29.setBaseUri("hi!");
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.nodes.Element element35 = element33.append("");
        org.jsoup.parser.Tag tag36 = element33.tag();
        boolean boolean37 = tag1.canContain(tag36);
        boolean boolean38 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag39 = tag1.getImplicitParent();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag39, "<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element41.previousElementSibling();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements7 = element4.parents();
        org.jsoup.nodes.Element element9 = element4.toggleClass("#root");
        java.lang.String str10 = element4.baseUri();
        java.util.Set<java.lang.String> strSet11 = element4.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int12 = element4.siblingIndex();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        document2.setBaseUri("hi!");
        org.jsoup.nodes.Element element7 = document2.prepend("#root");
        java.lang.String str8 = document2.tagName();
        boolean boolean9 = document2.isBlock();
        org.jsoup.select.Elements elements11 = document2.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document2.previousElementSibling();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element4 = document2.empty();
        java.lang.String str5 = element4.id();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.select.Elements elements11 = document9.getAllElements();
        java.util.Set<java.lang.String> strSet12 = document9.classNames();
        org.jsoup.nodes.Element element13 = element4.classNames(strSet12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.nodes.Element element8 = element4.html("#root");
        boolean boolean10 = element8.hasAttr("<hi> &lt;#root&gt; \n<html> \n <head> \n </head> \n <body>\n   hi!    \n </body>\n</html>\n</hi>#root\n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element8.text("\n <html>\n  <head>\n  </head>\n  <body>\n   hi!\n  </body>\n </html>");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi!", "");
        org.jsoup.nodes.Element element4 = document2.text("hi!");
        org.jsoup.nodes.Element element6 = element4.text("hi!");
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = element4.appendText("hi!");
        org.jsoup.nodes.Element element12 = element10.text("");
        org.jsoup.nodes.Element element14 = element12.append("<html>\n <head>\n </head>\n <body>\n  hi! \n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.children();
        boolean boolean17 = element14.hasClass("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html><<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>\n</<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element14.firstElementSibling();
    }
}

